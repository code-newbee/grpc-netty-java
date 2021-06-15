package io.grpc.generate.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: proto/helloworld.proto")
public final class GreekerGrpc {

  private GreekerGrpc() {}

  public static final String SERVICE_NAME = "proto.Greeker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.generate.helloworld.HelloRequest,
      io.grpc.generate.helloworld.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = io.grpc.generate.helloworld.HelloRequest.class,
      responseType = io.grpc.generate.helloworld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.generate.helloworld.HelloRequest,
      io.grpc.generate.helloworld.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<io.grpc.generate.helloworld.HelloRequest, io.grpc.generate.helloworld.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreekerGrpc.getSayHelloMethod) == null) {
      synchronized (GreekerGrpc.class) {
        if ((getSayHelloMethod = GreekerGrpc.getSayHelloMethod) == null) {
          GreekerGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<io.grpc.generate.helloworld.HelloRequest, io.grpc.generate.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.generate.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.generate.helloworld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreekerMethodDescriptorSupplier("sayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreekerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreekerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreekerStub>() {
        @java.lang.Override
        public GreekerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreekerStub(channel, callOptions);
        }
      };
    return GreekerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreekerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreekerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreekerBlockingStub>() {
        @java.lang.Override
        public GreekerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreekerBlockingStub(channel, callOptions);
        }
      };
    return GreekerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreekerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreekerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreekerFutureStub>() {
        @java.lang.Override
        public GreekerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreekerFutureStub(channel, callOptions);
        }
      };
    return GreekerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreekerImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(io.grpc.generate.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.generate.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.generate.helloworld.HelloRequest,
                io.grpc.generate.helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class GreekerStub extends io.grpc.stub.AbstractAsyncStub<GreekerStub> {
    private GreekerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreekerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreekerStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(io.grpc.generate.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.generate.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreekerBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreekerBlockingStub> {
    private GreekerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreekerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreekerBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.generate.helloworld.HelloReply sayHello(io.grpc.generate.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreekerFutureStub extends io.grpc.stub.AbstractFutureStub<GreekerFutureStub> {
    private GreekerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreekerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreekerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.generate.helloworld.HelloReply> sayHello(
        io.grpc.generate.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreekerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreekerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.grpc.generate.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.generate.helloworld.HelloReply>) responseObserver);
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

  private static abstract class GreekerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreekerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.generate.helloworld.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeker");
    }
  }

  private static final class GreekerFileDescriptorSupplier
      extends GreekerBaseDescriptorSupplier {
    GreekerFileDescriptorSupplier() {}
  }

  private static final class GreekerMethodDescriptorSupplier
      extends GreekerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreekerMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreekerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreekerFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
