// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DiscoveryService.proto

package com.lyl.skywalking.proto;

public interface ServiceNameMappingElementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ServiceNameMappingElement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 serviceId = 1;</code>
   */
  int getServiceId();

  /**
   * <code>optional .ServiceNameElement element = 2;</code>
   */
  boolean hasElement();
  /**
   * <code>optional .ServiceNameElement element = 2;</code>
   */
  com.lyl.skywalking.proto.ServiceNameElement getElement();
  /**
   * <code>optional .ServiceNameElement element = 2;</code>
   */
  com.lyl.skywalking.proto.ServiceNameElementOrBuilder getElementOrBuilder();
}