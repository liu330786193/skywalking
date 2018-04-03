package com.lyl.skywalking.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *discovery service for ServiceName by Network address or application code
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.1)",
    comments = "Source: DiscoveryService.proto")
public class ServiceNameDiscoveryServiceGrpc {

  private ServiceNameDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "ServiceNameDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.lyl.skywalking.proto.ServiceNameCollection,
      com.lyl.skywalking.proto.ServiceNameMappingCollection> METHOD_DISCOVERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ServiceNameDiscoveryService", "discovery"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.ServiceNameCollection.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.ServiceNameMappingCollection.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceNameDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceNameDiscoveryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceNameDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceNameDiscoveryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceNameDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceNameDiscoveryServiceFutureStub(channel);
  }

  /**
   * <pre>
   *discovery service for ServiceName by Network address or application code
   * </pre>
   */
  public static interface ServiceNameDiscoveryService {

    /**
     */
    public void discovery(com.lyl.skywalking.proto.ServiceNameCollection request,
                          io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ServiceNameMappingCollection> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractServiceNameDiscoveryService implements ServiceNameDiscoveryService, io.grpc.BindableService {

    @Override
    public void discovery(com.lyl.skywalking.proto.ServiceNameCollection request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ServiceNameMappingCollection> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DISCOVERY, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return ServiceNameDiscoveryServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   *discovery service for ServiceName by Network address or application code
   * </pre>
   */
  public static interface ServiceNameDiscoveryServiceBlockingClient {

    /**
     */
    public com.lyl.skywalking.proto.ServiceNameMappingCollection discovery(com.lyl.skywalking.proto.ServiceNameCollection request);
  }

  /**
   * <pre>
   *discovery service for ServiceName by Network address or application code
   * </pre>
   */
  public static interface ServiceNameDiscoveryServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.ServiceNameMappingCollection> discovery(
            com.lyl.skywalking.proto.ServiceNameCollection request);
  }

  public static class ServiceNameDiscoveryServiceStub extends io.grpc.stub.AbstractStub<ServiceNameDiscoveryServiceStub>
      implements ServiceNameDiscoveryService {
    private ServiceNameDiscoveryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceNameDiscoveryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServiceNameDiscoveryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceNameDiscoveryServiceStub(channel, callOptions);
    }

    @Override
    public void discovery(com.lyl.skywalking.proto.ServiceNameCollection request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ServiceNameMappingCollection> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DISCOVERY, getCallOptions()), request, responseObserver);
    }
  }

  public static class ServiceNameDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceNameDiscoveryServiceBlockingStub>
      implements ServiceNameDiscoveryServiceBlockingClient {
    private ServiceNameDiscoveryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceNameDiscoveryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServiceNameDiscoveryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceNameDiscoveryServiceBlockingStub(channel, callOptions);
    }

    @Override
    public com.lyl.skywalking.proto.ServiceNameMappingCollection discovery(com.lyl.skywalking.proto.ServiceNameCollection request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DISCOVERY, getCallOptions(), request);
    }
  }

  public static class ServiceNameDiscoveryServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceNameDiscoveryServiceFutureStub>
      implements ServiceNameDiscoveryServiceFutureClient {
    private ServiceNameDiscoveryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceNameDiscoveryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServiceNameDiscoveryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceNameDiscoveryServiceFutureStub(channel, callOptions);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.ServiceNameMappingCollection> discovery(
        com.lyl.skywalking.proto.ServiceNameCollection request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DISCOVERY, getCallOptions()), request);
    }
  }

  private static final int METHODID_DISCOVERY = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceNameDiscoveryService serviceImpl;
    private final int methodId;

    public MethodHandlers(ServiceNameDiscoveryService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISCOVERY:
          serviceImpl.discovery((com.lyl.skywalking.proto.ServiceNameCollection) request,
              (io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ServiceNameMappingCollection>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final ServiceNameDiscoveryService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_DISCOVERY,
          asyncUnaryCall(
            new MethodHandlers<
              com.lyl.skywalking.proto.ServiceNameCollection,
              com.lyl.skywalking.proto.ServiceNameMappingCollection>(
                serviceImpl, METHODID_DISCOVERY)))
        .build();
  }
}
