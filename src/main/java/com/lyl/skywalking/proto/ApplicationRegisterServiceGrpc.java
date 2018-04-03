package com.lyl.skywalking.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *register service for ApplicationCode, this service is called when service starts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.1)",
    comments = "Source: ApplicationRegisterService.proto")
public class ApplicationRegisterServiceGrpc {

  private ApplicationRegisterServiceGrpc() {}

  public static final String SERVICE_NAME = "ApplicationRegisterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.lyl.skywalking.proto.Application,
      com.lyl.skywalking.proto.ApplicationMapping> METHOD_REGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ApplicationRegisterService", "register"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.Application.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lyl.skywalking.proto.ApplicationMapping.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplicationRegisterServiceStub newStub(io.grpc.Channel channel) {
    return new ApplicationRegisterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationRegisterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApplicationRegisterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationRegisterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApplicationRegisterServiceFutureStub(channel);
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static interface ApplicationRegisterService {

    /**
     */
    public void register(com.lyl.skywalking.proto.Application request,
                         io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ApplicationMapping> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractApplicationRegisterService implements ApplicationRegisterService, io.grpc.BindableService {

    @Override
    public void register(com.lyl.skywalking.proto.Application request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ApplicationMapping> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return ApplicationRegisterServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static interface ApplicationRegisterServiceBlockingClient {

    /**
     */
    public com.lyl.skywalking.proto.ApplicationMapping register(com.lyl.skywalking.proto.Application request);
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static interface ApplicationRegisterServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.ApplicationMapping> register(
            com.lyl.skywalking.proto.Application request);
  }

  public static class ApplicationRegisterServiceStub extends io.grpc.stub.AbstractStub<ApplicationRegisterServiceStub>
      implements ApplicationRegisterService {
    private ApplicationRegisterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationRegisterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApplicationRegisterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationRegisterServiceStub(channel, callOptions);
    }

    @Override
    public void register(com.lyl.skywalking.proto.Application request,
        io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ApplicationMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request, responseObserver);
    }
  }

  public static class ApplicationRegisterServiceBlockingStub extends io.grpc.stub.AbstractStub<ApplicationRegisterServiceBlockingStub>
      implements ApplicationRegisterServiceBlockingClient {
    private ApplicationRegisterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationRegisterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApplicationRegisterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationRegisterServiceBlockingStub(channel, callOptions);
    }

    @Override
    public com.lyl.skywalking.proto.ApplicationMapping register(com.lyl.skywalking.proto.Application request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER, getCallOptions(), request);
    }
  }

  public static class ApplicationRegisterServiceFutureStub extends io.grpc.stub.AbstractStub<ApplicationRegisterServiceFutureStub>
      implements ApplicationRegisterServiceFutureClient {
    private ApplicationRegisterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationRegisterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApplicationRegisterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationRegisterServiceFutureStub(channel, callOptions);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<com.lyl.skywalking.proto.ApplicationMapping> register(
        com.lyl.skywalking.proto.Application request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApplicationRegisterService serviceImpl;
    private final int methodId;

    public MethodHandlers(ApplicationRegisterService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.lyl.skywalking.proto.Application) request,
              (io.grpc.stub.StreamObserver<com.lyl.skywalking.proto.ApplicationMapping>) responseObserver);
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
      final ApplicationRegisterService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_REGISTER,
          asyncUnaryCall(
            new MethodHandlers<
              com.lyl.skywalking.proto.Application,
              com.lyl.skywalking.proto.ApplicationMapping>(
                serviceImpl, METHODID_REGISTER)))
        .build();
  }
}
