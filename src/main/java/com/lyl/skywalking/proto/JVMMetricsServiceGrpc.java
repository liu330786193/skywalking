package com.lyl.skywalking.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.1)",
    comments = "Source: JVMMetricsService.proto")
public class JVMMetricsServiceGrpc {

  private JVMMetricsServiceGrpc() {}

  public static final String SERVICE_NAME = "JVMMetricsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.lyl.skywalking.proto.JVMMetrics,
      com.lyl.skywalking.proto.Downstream> METHOD_COLLECT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "JVMMetricsService", "collect"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.JVMMetrics.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.Downstream.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JVMMetricsServiceStub newStub(io.grpc.Channel channel) {
    return new JVMMetricsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JVMMetricsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JVMMetricsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static JVMMetricsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JVMMetricsServiceFutureStub(channel);
  }

  /**
   */
  public static interface JVMMetricsService {

    /**
     */
    public void collect(com.lyl.skywalking.proto.JVMMetrics request,
                        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractJVMMetricsService implements JVMMetricsService, io.grpc.BindableService {

    @Override
    public void collect(com.lyl.skywalking.proto.JVMMetrics request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COLLECT, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return JVMMetricsServiceGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface JVMMetricsServiceBlockingClient {

    /**
     */
    public com.lyl.skywalking.proto.Downstream collect(com.lyl.skywalking.proto.JVMMetrics request);
  }

  /**
   */
  public static interface JVMMetricsServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.Downstream> collect(
            com.lyl.skywalking.proto.JVMMetrics request);
  }

  public static class JVMMetricsServiceStub extends io.grpc.stub.AbstractStub<JVMMetricsServiceStub>
      implements JVMMetricsService {
    private JVMMetricsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JVMMetricsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricsServiceStub(channel, callOptions);
    }

    @Override
    public void collect(com.lyl.skywalking.proto.JVMMetrics request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COLLECT, getCallOptions()), request, responseObserver);
    }
  }

  public static class JVMMetricsServiceBlockingStub extends io.grpc.stub.AbstractStub<JVMMetricsServiceBlockingStub>
      implements JVMMetricsServiceBlockingClient {
    private JVMMetricsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JVMMetricsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricsServiceBlockingStub(channel, callOptions);
    }

    @Override
    public com.lyl.skywalking.proto.Downstream collect(com.lyl.skywalking.proto.JVMMetrics request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COLLECT, getCallOptions(), request);
    }
  }

  public static class JVMMetricsServiceFutureStub extends io.grpc.stub.AbstractStub<JVMMetricsServiceFutureStub>
      implements JVMMetricsServiceFutureClient {
    private JVMMetricsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JVMMetricsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricsServiceFutureStub(channel, callOptions);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.Downstream> collect(
        com.lyl.skywalking.proto.JVMMetrics request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COLLECT, getCallOptions()), request);
    }
  }

  private static final int METHODID_COLLECT = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JVMMetricsService serviceImpl;
    private final int methodId;

    public MethodHandlers(JVMMetricsService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT:
          serviceImpl.collect((com.lyl.skywalking.proto.JVMMetrics) request,
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
      final JVMMetricsService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_COLLECT,
          asyncUnaryCall(
            new MethodHandlers<
              com.lyl.skywalking.proto.JVMMetrics,
              com.lyl.skywalking.proto.Downstream>(
                serviceImpl, METHODID_COLLECT)))
        .build();
  }
}
