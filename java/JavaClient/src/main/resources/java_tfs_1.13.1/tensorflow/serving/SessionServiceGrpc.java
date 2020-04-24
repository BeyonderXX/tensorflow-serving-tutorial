package tensorflow.serving;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * SessionService defines a service with which a client can interact to execute
 * Tensorflow model inference. The SessionService::SessionRun method is similar
 * to MasterService::RunStep of Tensorflow, except that all sessions are ready
 * to run, and you request a specific model/session with ModelSpec.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.0-SNAPSHOT)",
    comments = "Source: tensorflow_serving/apis/session_service.proto")
public final class SessionServiceGrpc {

  private SessionServiceGrpc() {}

  public static final String SERVICE_NAME = "tensorflow.serving.SessionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tensorflow.serving.SessionServiceOuterClass.SessionRunRequest,
      tensorflow.serving.SessionServiceOuterClass.SessionRunResponse> getSessionRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionRun",
      requestType = tensorflow.serving.SessionServiceOuterClass.SessionRunRequest.class,
      responseType = tensorflow.serving.SessionServiceOuterClass.SessionRunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tensorflow.serving.SessionServiceOuterClass.SessionRunRequest,
      tensorflow.serving.SessionServiceOuterClass.SessionRunResponse> getSessionRunMethod() {
    io.grpc.MethodDescriptor<tensorflow.serving.SessionServiceOuterClass.SessionRunRequest, tensorflow.serving.SessionServiceOuterClass.SessionRunResponse> getSessionRunMethod;
    if ((getSessionRunMethod = SessionServiceGrpc.getSessionRunMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getSessionRunMethod = SessionServiceGrpc.getSessionRunMethod) == null) {
          SessionServiceGrpc.getSessionRunMethod = getSessionRunMethod =
              io.grpc.MethodDescriptor.<tensorflow.serving.SessionServiceOuterClass.SessionRunRequest, tensorflow.serving.SessionServiceOuterClass.SessionRunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SessionRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.SessionServiceOuterClass.SessionRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.SessionServiceOuterClass.SessionRunResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("SessionRun"))
              .build();
        }
      }
    }
    return getSessionRunMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceStub>() {
        @java.lang.Override
        public SessionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceStub(channel, callOptions);
        }
      };
    return SessionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceBlockingStub>() {
        @java.lang.Override
        public SessionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceBlockingStub(channel, callOptions);
        }
      };
    return SessionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SessionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceFutureStub>() {
        @java.lang.Override
        public SessionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceFutureStub(channel, callOptions);
        }
      };
    return SessionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SessionService defines a service with which a client can interact to execute
   * Tensorflow model inference. The SessionService::SessionRun method is similar
   * to MasterService::RunStep of Tensorflow, except that all sessions are ready
   * to run, and you request a specific model/session with ModelSpec.
   * </pre>
   */
  public static abstract class SessionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Runs inference of a given model.
     * </pre>
     */
    public void sessionRun(tensorflow.serving.SessionServiceOuterClass.SessionRunRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.SessionServiceOuterClass.SessionRunResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSessionRunMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSessionRunMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                tensorflow.serving.SessionServiceOuterClass.SessionRunRequest,
                tensorflow.serving.SessionServiceOuterClass.SessionRunResponse>(
                  this, METHODID_SESSION_RUN)))
          .build();
    }
  }

  /**
   * <pre>
   * SessionService defines a service with which a client can interact to execute
   * Tensorflow model inference. The SessionService::SessionRun method is similar
   * to MasterService::RunStep of Tensorflow, except that all sessions are ready
   * to run, and you request a specific model/session with ModelSpec.
   * </pre>
   */
  public static final class SessionServiceStub extends io.grpc.stub.AbstractAsyncStub<SessionServiceStub> {
    private SessionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Runs inference of a given model.
     * </pre>
     */
    public void sessionRun(tensorflow.serving.SessionServiceOuterClass.SessionRunRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.SessionServiceOuterClass.SessionRunResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSessionRunMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SessionService defines a service with which a client can interact to execute
   * Tensorflow model inference. The SessionService::SessionRun method is similar
   * to MasterService::RunStep of Tensorflow, except that all sessions are ready
   * to run, and you request a specific model/session with ModelSpec.
   * </pre>
   */
  public static final class SessionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SessionServiceBlockingStub> {
    private SessionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Runs inference of a given model.
     * </pre>
     */
    public tensorflow.serving.SessionServiceOuterClass.SessionRunResponse sessionRun(tensorflow.serving.SessionServiceOuterClass.SessionRunRequest request) {
      return blockingUnaryCall(
          getChannel(), getSessionRunMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SessionService defines a service with which a client can interact to execute
   * Tensorflow model inference. The SessionService::SessionRun method is similar
   * to MasterService::RunStep of Tensorflow, except that all sessions are ready
   * to run, and you request a specific model/session with ModelSpec.
   * </pre>
   */
  public static final class SessionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SessionServiceFutureStub> {
    private SessionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Runs inference of a given model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.serving.SessionServiceOuterClass.SessionRunResponse> sessionRun(
        tensorflow.serving.SessionServiceOuterClass.SessionRunRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSessionRunMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SESSION_RUN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SESSION_RUN:
          serviceImpl.sessionRun((tensorflow.serving.SessionServiceOuterClass.SessionRunRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.serving.SessionServiceOuterClass.SessionRunResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tensorflow.serving.SessionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SessionService");
    }
  }

  private static final class SessionServiceFileDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier {
    SessionServiceFileDescriptorSupplier() {}
  }

  private static final class SessionServiceMethodDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SessionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SessionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionServiceFileDescriptorSupplier())
              .addMethod(getSessionRunMethod())
              .build();
        }
      }
    }
    return result;
  }
}
