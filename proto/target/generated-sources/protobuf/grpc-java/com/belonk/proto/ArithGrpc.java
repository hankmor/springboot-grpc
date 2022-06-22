package com.belonk.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: Arith.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ArithGrpc {

  private ArithGrpc() {}

  public static final String SERVICE_NAME = "arith.Arith";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.belonk.proto.Param,
      com.belonk.proto.Int> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multiply",
      requestType = com.belonk.proto.Param.class,
      responseType = com.belonk.proto.Int.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.belonk.proto.Param,
      com.belonk.proto.Int> getMultiplyMethod() {
    io.grpc.MethodDescriptor<com.belonk.proto.Param, com.belonk.proto.Int> getMultiplyMethod;
    if ((getMultiplyMethod = ArithGrpc.getMultiplyMethod) == null) {
      synchronized (ArithGrpc.class) {
        if ((getMultiplyMethod = ArithGrpc.getMultiplyMethod) == null) {
          ArithGrpc.getMultiplyMethod = getMultiplyMethod =
              io.grpc.MethodDescriptor.<com.belonk.proto.Param, com.belonk.proto.Int>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.belonk.proto.Param.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.belonk.proto.Int.getDefaultInstance()))
              .setSchemaDescriptor(new ArithMethodDescriptorSupplier("multiply"))
              .build();
        }
      }
    }
    return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.belonk.proto.Param,
      com.belonk.proto.Quotient> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "divide",
      requestType = com.belonk.proto.Param.class,
      responseType = com.belonk.proto.Quotient.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.belonk.proto.Param,
      com.belonk.proto.Quotient> getDivideMethod() {
    io.grpc.MethodDescriptor<com.belonk.proto.Param, com.belonk.proto.Quotient> getDivideMethod;
    if ((getDivideMethod = ArithGrpc.getDivideMethod) == null) {
      synchronized (ArithGrpc.class) {
        if ((getDivideMethod = ArithGrpc.getDivideMethod) == null) {
          ArithGrpc.getDivideMethod = getDivideMethod =
              io.grpc.MethodDescriptor.<com.belonk.proto.Param, com.belonk.proto.Quotient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.belonk.proto.Param.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.belonk.proto.Quotient.getDefaultInstance()))
              .setSchemaDescriptor(new ArithMethodDescriptorSupplier("divide"))
              .build();
        }
      }
    }
    return getDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArithStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArithStub>() {
        @java.lang.Override
        public ArithStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArithStub(channel, callOptions);
        }
      };
    return ArithStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArithBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArithBlockingStub>() {
        @java.lang.Override
        public ArithBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArithBlockingStub(channel, callOptions);
        }
      };
    return ArithBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArithFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArithFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArithFutureStub>() {
        @java.lang.Override
        public ArithFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArithFutureStub(channel, callOptions);
        }
      };
    return ArithFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义服务
   * </pre>
   */
  public static abstract class ArithImplBase implements io.grpc.BindableService {

    /**
     */
    public void multiply(com.belonk.proto.Param request,
        io.grpc.stub.StreamObserver<com.belonk.proto.Int> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    /**
     */
    public void divide(com.belonk.proto.Param request,
        io.grpc.stub.StreamObserver<com.belonk.proto.Quotient> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMultiplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.belonk.proto.Param,
                com.belonk.proto.Int>(
                  this, METHODID_MULTIPLY)))
          .addMethod(
            getDivideMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.belonk.proto.Param,
                com.belonk.proto.Quotient>(
                  this, METHODID_DIVIDE)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义服务
   * </pre>
   */
  public static final class ArithStub extends io.grpc.stub.AbstractAsyncStub<ArithStub> {
    private ArithStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithStub(channel, callOptions);
    }

    /**
     */
    public void multiply(com.belonk.proto.Param request,
        io.grpc.stub.StreamObserver<com.belonk.proto.Int> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divide(com.belonk.proto.Param request,
        io.grpc.stub.StreamObserver<com.belonk.proto.Quotient> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 定义服务
   * </pre>
   */
  public static final class ArithBlockingStub extends io.grpc.stub.AbstractBlockingStub<ArithBlockingStub> {
    private ArithBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.belonk.proto.Int multiply(com.belonk.proto.Param request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.belonk.proto.Quotient divide(com.belonk.proto.Param request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义服务
   * </pre>
   */
  public static final class ArithFutureStub extends io.grpc.stub.AbstractFutureStub<ArithFutureStub> {
    private ArithFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArithFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArithFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.belonk.proto.Int> multiply(
        com.belonk.proto.Param request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.belonk.proto.Quotient> divide(
        com.belonk.proto.Param request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MULTIPLY = 0;
  private static final int METHODID_DIVIDE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArithImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArithImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MULTIPLY:
          serviceImpl.multiply((com.belonk.proto.Param) request,
              (io.grpc.stub.StreamObserver<com.belonk.proto.Int>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((com.belonk.proto.Param) request,
              (io.grpc.stub.StreamObserver<com.belonk.proto.Quotient>) responseObserver);
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

  private static abstract class ArithBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArithBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.belonk.proto.ArithProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Arith");
    }
  }

  private static final class ArithFileDescriptorSupplier
      extends ArithBaseDescriptorSupplier {
    ArithFileDescriptorSupplier() {}
  }

  private static final class ArithMethodDescriptorSupplier
      extends ArithBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArithMethodDescriptorSupplier(String methodName) {
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
      synchronized (ArithGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArithFileDescriptorSupplier())
              .addMethod(getMultiplyMethod())
              .addMethod(getDivideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
