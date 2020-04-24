# Copyright 2016 Google Inc. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
# ==============================================================================

#!/usr/bin/env python2.7

"""
# Created : 2018/12/24
# Version : python2.7
# Author  : Wang Xiao

Implement base on google mnist example.
A client that talks to tensorflow_model_server loaded with mnist model_old.

The client queries the service with test inputs to get predictions, and calculates the inference error rate.

Typical usage example:

    python bert_client.py --num_tests=100 --server=localhost:8500
"""

from __future__ import print_function

import sys
import threading

# This is a placeholder for a Google-internal import.

import grpc
import numpy
import tensorflow as tf
import datetime

from tensorflow_serving.apis import predict_pb2
from tensorflow_serving.apis import prediction_service_pb2_grpc


tf.compat.v1.app.flags.DEFINE_integer(
    'concurrency', 1, 'maximum number of concurrent inference requests')
tf.compat.v1.app.flags.DEFINE_integer('num_tests', 10, 'Number of test images')
tf.compat.v1.app.flags.DEFINE_string('server', '127.0.0.1:8500',
                                     'PredictionService host:port')
FLAGS = tf.compat.v1.app.flags.FLAGS

seq_length = 50


class _ResultCounter(object):
  """Counter for the prediction results."""

  def __init__(self, num_tests, concurrency):
    self._num_tests = num_tests
    self._concurrency = concurrency
    self._error = 0
    self._done = 0
    self._active = 0
    self._condition = threading.Condition()

  def inc_error(self):
    with self._condition:
      self._error += 1

  def inc_done(self):
    with self._condition:
      self._done += 1
      self._condition.notify()

  def dec_active(self):
    with self._condition:
      self._active -= 1
      self._condition.notify()

  def get_error_rate(self):
    with self._condition:
      while self._done != self._num_tests:
        self._condition.wait()
      return self._error / float(self._num_tests)

  def throttle(self):
    with self._condition:
      while self._active == self._concurrency:
        self._condition.wait()
      self._active += 1


def _create_rpc_callback(label, result_counter):
  """Creates RPC callback function.

  Args:
    label: The correct label for the predicted example.
    result_counter: Counter for the prediction result.
  Returns:
    The callback function.
  """
  def _callback(result_future):
    """Callback function.

    Calculates the statistics for the prediction result.

    Args:
      result_future: Result future of the RPC.
    """
    exception = result_future.exception()
    if exception:
      result_counter.inc_error()
      print(exception)
    else:
      sys.stdout.write('.')
      sys.stdout.flush()
      response = numpy.array(
          result_future.result().outputs['probabilities'].float_val)

      for i in range(len(label)):
        if label[i] != response[i]:
          result_counter.inc_error()
    result_counter.inc_done()
    result_counter.dec_active()

  return _callback


def do_inference(hostport, concurrency, num_tests):
  """Tests PredictionService with concurrent requests.

  Args:
    hostport: Host:port address of the PredictionService.
    concurrency: Maximum number of concurrent requests.
    num_tests: Number of test images to use.

  Returns:
    The classification error rate.

  Raises:
    IOError: An error occurred processing test data set.
  """
  ids = numpy.array([range(seq_length)], dtype='int32')
  masks = numpy.ones((1, seq_length), dtype='int32')
  segment_ids = numpy.zeros((1, seq_length), dtype='int32')
  label_ids = numpy.array([[2]], dtype='int32')
  prob = numpy.array([[0.1234]], dtype='float32')

  channel = grpc.insecure_channel(hostport)
  stub = prediction_service_pb2_grpc.PredictionServiceStub(channel)
  result_counter = _ResultCounter(num_tests, concurrency)
  # inference(test_data_set, label, stub, result_counter)   # warm-up step
  start_time = datetime.datetime.now()

  for _ in range(num_tests):
    inference(ids, masks, segment_ids, label_ids, prob, stub, result_counter)
  rate = result_counter.get_error_rate()
  print("\n")
  print("Cost {0} seconds to predict {1} instance with {2} threads".format(datetime.datetime.now()-start_time, FLAGS.num_tests, FLAGS.concurrency))

  return rate


def inference(ids, masks, segment_ids, label_ids, label, stub, result_counter):
  request = predict_pb2.PredictRequest()
  request.model_spec.name = 'bert'
  request.model_spec.signature_name = 'serving_default'

  request.inputs['input_ids'].CopyFrom(
    tf.make_tensor_proto(ids, shape=[1, ids[0].size]))
  request.inputs['input_mask'].CopyFrom(
      tf.make_tensor_proto(masks, shape=[1, masks[0].size]))
  request.inputs['segment_ids'].CopyFrom(
      tf.make_tensor_proto(segment_ids, shape=[1, segment_ids[0].size]))
  request.inputs['label_ids'].CopyFrom(
    tf.make_tensor_proto(label_ids, shape=[label_ids[0].size]))

  result_counter.throttle()
  result_future = stub.Predict.future(request, 5.0)  # 5 seconds

  result_future.add_done_callback(
    _create_rpc_callback(label[0], result_counter))


def main(_):
  if FLAGS.num_tests > 10000:
    print('num_tests should not be greater than 10k')
    return
  if not FLAGS.server:
    print('please specify server host:port')
    return

  start_time = datetime.datetime.now()
  error_rate = do_inference(FLAGS.server, FLAGS.concurrency, FLAGS.num_tests)
  print('\nInference error rate: %s%%' % (error_rate * 100))
  print("Cost {0} seconds to predict {1} instance with {2} threads".
        format(datetime.datetime.now() - start_time, FLAGS.num_tests, FLAGS.concurrency))


if __name__ == '__main__':
  tf.compat.v1.app.run()
