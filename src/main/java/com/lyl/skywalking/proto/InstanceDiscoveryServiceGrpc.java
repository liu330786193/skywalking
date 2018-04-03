package com.lyl.skywalking.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *discovery service for application instance, this service is called when application starts
 *or http client connection switch to another collector server instance
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.1)",
    comments = "Source: DiscoveryService.proto")
public class InstanceDiscoveryServiceGrpc {

  private InstanceDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "InstanceDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.lyl.skywalking.proto.ApplicationInstance,
      com.lyl.skywalking.proto.ApplicationInstanceMapping> METHOD_REGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "InstanceDiscoveryService", "register"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.ApplicationInstance.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.ApplicationInstanceMapping.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.lyl.skywalking.proto.ApplicationInstanceHeartbeat,
      com.lyl.skywalking.proto.Downstream> METHOD_HEARTBEAT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "InstanceDiscoveryService", "heartbeat"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.ApplicationInstanceHeartbeat.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.Downstream.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.lyl.skywalking.proto.ApplicationInstanceRecover,
      com.lyl.skywalking.proto.Downstream> METHOD_REGISTER_RECOVER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "InstanceDiscoveryService", "registerRecover"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.ApplicationInstanceRecover.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.Downstream.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    return new InstanceDiscoveryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstanceDiscoveryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstanceDiscoveryServiceFutureStub(channel);
  }

  /**
   * <pre>
   *discovery service for application instance, this service is called when application starts
   *or http client connection switch to another collector server instance
   * </pre>
   */
  public static interface InstanceDiscoveryService {

    /**
     */
    public void register(com.lyl.skywalking.proto.ApplicationInstance request,
                         io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ApplicationInstanceMapping> responseObserver);

    /**
     */
    public void heartbeat(com.lyl.skywalking.proto.ApplicationInstanceHeartbeat request,
                          io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver);

    /**
     */
    public void registerRecover(com.lyl.skywalking.proto.ApplicationInstanceRecover request,
                                io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractInstanceDiscoveryService implements InstanceDiscoveryService, io.grpc.BindableService {

    @Override
    public void register(com.lyl.skywalking.proto.ApplicationInstance request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ApplicationInstanceMapping> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER, responseObserver);
    }

    @Override
    public void heartbeat(com.lyl.skywalking.proto.ApplicationInstanceHeartbeat request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HEARTBEAT, responseObserver);
    }

    @Override
    public void registerRecover(com.lyl.skywalking.proto.ApplicationInstanceRecover request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_RECOVER, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return InstanceDiscoveryServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   *discovery service for application instance, this service is called when application starts
   *or http client connection switch to another collector server instance
   * </pre>
   */
  public static interface InstanceDiscoveryServiceBlockingClient {

    /**
     */
    public com.lyl.skywalking.proto.ApplicationInstanceMapping register(com.lyl.skywalking.proto.ApplicationInstance request);

    /**
     */
    public com.lyl.skywalking.proto.Downstream heartbeat(com.lyl.skywalking.proto.ApplicationInstanceHeartbeat request);

    /**
     */
    public com.lyl.skywalking.proto.Downstream registerRecover(com.lyl.skywalking.proto.ApplicationInstanceRecover request);
  }

  /**
   * <pre>
   *discovery service for application instance, this service is called when application starts
   *or http client connection switch to another collector server instance
   * </pre>
   */
  public static interface InstanceDiscoveryServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.ApplicationInstanceMapping> register(
            com.lyl.skywalking.proto.ApplicationInstance request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.Downstream> heartbeat(
            com.lyl.skywalking.proto.ApplicationInstanceHeartbeat request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.Downstream> registerRecover(
            com.lyl.skywalking.proto.ApplicationInstanceRecover request);
  }

  public static class InstanceDiscoveryServiceStub extends io.grpc.stub.AbstractStub<InstanceDiscoveryServiceStub>
      implements InstanceDiscoveryService {
    private InstanceDiscoveryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceDiscoveryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InstanceDiscoveryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceDiscoveryServiceStub(channel, callOptions);
    }

    @Override
    public void register(com.lyl.skywalking.proto.ApplicationInstance request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ApplicationInstanceMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request, responseObserver);
    }

    @Override
    public void heartbeat(com.lyl.skywalking.proto.ApplicationInstanceHeartbeat request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HEARTBEAT, getCallOptions()), request, responseObserver);
    }

    @Override
    public void registerRecover(com.lyl.skywalking.proto.ApplicationInstanceRecover request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_RECOVER, getCallOptions()), request, responseObserver);
    }
  }

  public static class InstanceDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractStub<InstanceDiscoveryServiceBlockingStub>
      implements InstanceDiscoveryServiceBlockingClient {
    private InstanceDiscoveryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceDiscoveryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InstanceDiscoveryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceDiscoveryServiceBlockingStub(channel, callOptions);
    }

    @Override
    public com.lyl.skywalking.proto.ApplicationInstanceMapping register(com.lyl.skywalking.proto.ApplicationInstance request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER, getCallOptions(), request);
    }

    @Override
    public com.lyl.skywalking.proto.Downstream heartbeat(com.lyl.skywalking.proto.ApplicationInstanceHeartbeat request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HEARTBEAT, getCallOptions(), request);
    }

    @Override
    public com.lyl.skywalking.proto.Downstream registerRecover(com.lyl.skywalking.proto.ApplicationInstanceRecover request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_RECOVER, getCallOptions(), request);
    }
  }

  public static class InstanceDiscoveryServiceFutureStub extends io.grpc.stub.AbstractStub<InstanceDiscoveryServiceFutureStub>
      implements InstanceDiscoveryServiceFutureClient {
    private InstanceDiscoveryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceDiscoveryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InstanceDiscoveryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceDiscoveryServiceFutureStub(channel, callOptions);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.ApplicationInstanceMapping> register(
        com.lyl.skywalking.proto.ApplicationInstance request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.Downstream> heartbeat(
        com.lyl.skywalking.proto.ApplicationInstanceHeartbeat request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HEARTBEAT, getCallOptions()), request);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.Downstream> registerRecover(
        com.lyl.skywalking.proto.ApplicationInstanceRecover request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_RECOVER, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_HEARTBEAT = 1;
  private static final int METHODID_REGISTER_RECOVER = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstanceDiscoveryService serviceImpl;
    private final int methodId;

    public MethodHandlers(InstanceDiscoveryService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.lyl.skywalking.proto.ApplicationInstance) request,
              (io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ApplicationInstanceMapping>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((com.lyl.skywalking.proto.ApplicationInstanceHeartbeat) request,
              (io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream>) responseObserver);
          break;
        case METHODID_REGISTER_RECOVER:
          serviceImpl.registerRecover((com.lyl.skywalking.proto.ApplicationInstanceRecover) request,
              (io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream>) responseObserver);
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
      final InstanceDiscoveryService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_REGISTER,
          asyncUnaryCall(
            new MethodHandlers<
              com.lyl.skywalking.proto.ApplicationInstance,
              com.lyl.skywalking.proto.ApplicationInstanceMapping>(
                serviceImpl, METHODID_REGISTER)))
        .addMethod(
          METHOD_HEARTBEAT,
          asyncUnaryCall(
            new MethodHandlers<
              com.lyl.skywalking.proto.ApplicationInstanceHeartbeat,
              com.lyl.skywalking.proto.Downstream>(
                serviceImpl, METHODID_HEARTBEAT)))
        .addMethod(
          METHOD_REGISTER_RECOVER,
          asyncUnaryCall(
            new MethodHandlers<
              com.lyl.skywalking.proto.ApplicationInstanceRecover,
              com.lyl.skywalking.proto.Downstream>(
                serviceImpl, METHODID_REGISTER_RECOVER)))
        .build();
  }
}
