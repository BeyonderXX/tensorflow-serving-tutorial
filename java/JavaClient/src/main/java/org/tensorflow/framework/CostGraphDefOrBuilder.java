// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/cost_graph.proto

package org.tensorflow.framework;

public interface CostGraphDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CostGraphDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.CostGraphDef.Node node = 1;</code>
   */
  java.util.List<org.tensorflow.framework.CostGraphDef.Node> 
      getNodeList();
  /**
   * <code>repeated .tensorflow.CostGraphDef.Node node = 1;</code>
   */
  org.tensorflow.framework.CostGraphDef.Node getNode(int index);
  /**
   * <code>repeated .tensorflow.CostGraphDef.Node node = 1;</code>
   */
  int getNodeCount();
  /**
   * <code>repeated .tensorflow.CostGraphDef.Node node = 1;</code>
   */
  java.util.List<? extends org.tensorflow.framework.CostGraphDef.NodeOrBuilder> 
      getNodeOrBuilderList();
  /**
   * <code>repeated .tensorflow.CostGraphDef.Node node = 1;</code>
   */
  org.tensorflow.framework.CostGraphDef.NodeOrBuilder getNodeOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.CostGraphDef.AggregatedCost cost = 2;</code>
   */
  java.util.List<org.tensorflow.framework.CostGraphDef.AggregatedCost> 
      getCostList();
  /**
   * <code>repeated .tensorflow.CostGraphDef.AggregatedCost cost = 2;</code>
   */
  org.tensorflow.framework.CostGraphDef.AggregatedCost getCost(int index);
  /**
   * <code>repeated .tensorflow.CostGraphDef.AggregatedCost cost = 2;</code>
   */
  int getCostCount();
  /**
   * <code>repeated .tensorflow.CostGraphDef.AggregatedCost cost = 2;</code>
   */
  java.util.List<? extends org.tensorflow.framework.CostGraphDef.AggregatedCostOrBuilder> 
      getCostOrBuilderList();
  /**
   * <code>repeated .tensorflow.CostGraphDef.AggregatedCost cost = 2;</code>
   */
  org.tensorflow.framework.CostGraphDef.AggregatedCostOrBuilder getCostOrBuilder(
      int index);
}