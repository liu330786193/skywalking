package com.lyl.skywalking.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.1)",
    comments = "Source: TraceSegmentService.proto")
public class TraceSegmentServiceGrpc {

  private TraceSegmentServiceGrpc() {}

  public static final String SERVICE_NAME = "TraceSegmentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.lyl.skywalking.proto.UpstreamSegment,
      com.lyl.skywalking.proto.Downstream> METHOD_COLLECT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "TraceSegmentService", "collect"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.UpstreamSegment.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.Downstream.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TraceSegmentServiceStub newStub(io.grpc.Channel channel) {
    return new TraceSegmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TraceSegmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TraceSegmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TraceSegmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TraceSegmentServiceFutureStub(channel);
  }

  /**
   */
  public static interface TraceSegmentService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.UpstreamSegment> collect(
            io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractTraceSegmentService implements TraceSegmentService, io.grpc.BindableService {

    @Override
    public io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.UpstreamSegment> collect(
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_COLLECT, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return TraceSegmentServiceGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface TraceSegmentServiceBlockingClient {
  }

  /**
   */
  public static interface TraceSegmentServiceFutureClient {
  }

  public static class TraceSegmentServiceStub extends io.grpc.stub.AbstractStub<TraceSegmentServiceStub>
      implements TraceSegmentService {
    private TraceSegmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TraceSegmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentServiceStub(channel, callOptions);
    }

    @Override
    public io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.UpstreamSegment> collect(
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_COLLECT, getCallOptions()), responseObserver);
    }
  }

  public static class TraceSegmentServiceBlockingStub extends io.grpc.stub.AbstractStub<TraceSegmentServiceBlockingStub>
      implements TraceSegmentServiceBlockingClient {
    private TraceSegmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TraceSegmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentServiceBlockingStub(channel, callOptions);
    }
  }

  public static class TraceSegmentServiceFutureStub extends io.grpc.stub.AbstractStub<TraceSegmentServiceFutureStub>
      implements TraceSegmentServiceFutureClient {
    private TraceSegmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TraceSegmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COLLECT = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TraceSegmentService serviceImpl;
    private final int methodId;

    public MethodHandlers(TraceSegmentService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.collect(
              (io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.Downstream>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final TraceSegmentService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_COLLECT,
          asyncClientStreamingCall(
            new MethodHandlers<
              com.lyl.skywalking.proto.UpstreamSegment,
              com.lyl.skywalking.proto.Downstream>(
                serviceImpl, METHODID_COLLECT)))
        .build();
  }
}
