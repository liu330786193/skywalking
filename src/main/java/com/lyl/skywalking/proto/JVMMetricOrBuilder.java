// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JVMMetricsService.proto

package com.lyl.skywalking.proto;

public interface JVMMetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:JVMMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 time = 1;</code>
   */
  long getTime();

  /**
   * <code>optional .CPU cpu = 2;</code>
   */
  boolean hasCpu();
  /**
   * <code>optional .CPU cpu = 2;</code>
   */
  com.lyl.skywalking.proto.CPU getCpu();
  /**
   * <code>optional .CPU cpu = 2;</code>
   */
  com.lyl.skywalking.proto.CPUOrBuilder getCpuOrBuilder();

  /**
   * <code>repeated .Memory memory = 3;</code>
   */
  java.util.List<com.lyl.skywalking.proto.Memory>
      getMemoryList();
  /**
   * <code>repeated .Memory memory = 3;</code>
   */
  com.lyl.skywalking.proto.Memory getMemory(int index);
  /**
   * <code>repeated .Memory memory = 3;</code>
   */
  int getMemoryCount();
  /**
   * <code>repeated .Memory memory = 3;</code>
   */
  java.util.List<? extends MemoryOrBuilder>
      getMemoryOrBuilderList();
  /**
   * <code>repeated .Memory memory = 3;</code>
   */
  com.lyl.skywalking.proto.MemoryOrBuilder getMemoryOrBuilder(
          int index);

  /**
   * <code>repeated .MemoryPool memoryPool = 4;</code>
   */
  java.util.List<MemoryPool>
      getMemoryPoolList();
  /**
   * <code>repeated .MemoryPool memoryPool = 4;</code>
   */
  com.lyl.skywalking.proto.MemoryPool getMemoryPool(int index);
  /**
   * <code>repeated .MemoryPool memoryPool = 4;</code>
   */
  int getMemoryPoolCount();
  /**
   * <code>repeated .MemoryPool memoryPool = 4;</code>
   */
  java.util.List<? extends com.lyl.skywalking.proto.MemoryPoolOrBuilder>
      getMemoryPoolOrBuilderList();
  /**
   * <code>repeated .MemoryPool memoryPool = 4;</code>
   */
  com.lyl.skywalking.proto.MemoryPoolOrBuilder getMemoryPoolOrBuilder(
          int index);

  /**
   * <code>repeated .GC gc = 5;</code>
   */
  java.util.List<com.lyl.skywalking.proto.GC>
      getGcList();
  /**
   * <code>repeated .GC gc = 5;</code>
   */
  com.lyl.skywalking.proto.GC getGc(int index);
  /**
   * <code>repeated .GC gc = 5;</code>
   */
  int getGcCount();
  /**
   * <code>repeated .GC gc = 5;</code>
   */
  java.util.List<? extends GCOrBuilder>
      getGcOrBuilderList();
  /**
   * <code>repeated .GC gc = 5;</code>
   */
  com.lyl.skywalking.proto.GCOrBuilder getGcOrBuilder(
          int index);
}
