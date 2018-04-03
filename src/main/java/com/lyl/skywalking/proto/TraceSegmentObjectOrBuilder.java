// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TraceSegmentService.proto

package com.lyl.skywalking.proto;

public interface TraceSegmentObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TraceSegmentObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .UniqueId traceSegmentId = 1;</code>
   */
  boolean hasTraceSegmentId();
  /**
   * <code>optional .UniqueId traceSegmentId = 1;</code>
   */
  com.lyl.skywalking.proto.UniqueId getTraceSegmentId();
  /**
   * <code>optional .UniqueId traceSegmentId = 1;</code>
   */
  com.lyl.skywalking.proto.UniqueIdOrBuilder getTraceSegmentIdOrBuilder();

  /**
   * <code>repeated .TraceSegmentReference refs = 2;</code>
   */
  java.util.List<com.lyl.skywalking.proto.TraceSegmentReference> 
      getRefsList();
  /**
   * <code>repeated .TraceSegmentReference refs = 2;</code>
   */
  com.lyl.skywalking.proto.TraceSegmentReference getRefs(int index);
  /**
   * <code>repeated .TraceSegmentReference refs = 2;</code>
   */
  int getRefsCount();
  /**
   * <code>repeated .TraceSegmentReference refs = 2;</code>
   */
  java.util.List<? extends com.lyl.skywalking.proto.TraceSegmentReferenceOrBuilder> 
      getRefsOrBuilderList();
  /**
   * <code>repeated .TraceSegmentReference refs = 2;</code>
   */
  com.lyl.skywalking.proto.TraceSegmentReferenceOrBuilder getRefsOrBuilder(
          int index);

  /**
   * <code>repeated .SpanObject spans = 3;</code>
   */
  java.util.List<com.lyl.skywalking.proto.SpanObject>
      getSpansList();
  /**
   * <code>repeated .SpanObject spans = 3;</code>
   */
  com.lyl.skywalking.proto.SpanObject getSpans(int index);
  /**
   * <code>repeated .SpanObject spans = 3;</code>
   */
  int getSpansCount();
  /**
   * <code>repeated .SpanObject spans = 3;</code>
   */
  java.util.List<? extends com.lyl.skywalking.proto.SpanObjectOrBuilder>
      getSpansOrBuilderList();
  /**
   * <code>repeated .SpanObject spans = 3;</code>
   */
  com.lyl.skywalking.proto.SpanObjectOrBuilder getSpansOrBuilder(
          int index);

  /**
   * <code>optional int32 applicationId = 4;</code>
   */
  int getApplicationId();

  /**
   * <code>optional int32 applicationInstanceId = 5;</code>
   */
  int getApplicationInstanceId();

  /**
   * <code>optional bool isSizeLimited = 6;</code>
   */
  boolean getIsSizeLimited();
}