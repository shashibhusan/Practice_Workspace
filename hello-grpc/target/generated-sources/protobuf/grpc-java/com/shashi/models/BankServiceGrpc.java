package com.shashi.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: bank-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shashi.models.BalanceCheckRequest,
      com.shashi.models.Balance> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBalance",
      requestType = com.shashi.models.BalanceCheckRequest.class,
      responseType = com.shashi.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shashi.models.BalanceCheckRequest,
      com.shashi.models.Balance> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.shashi.models.BalanceCheckRequest, com.shashi.models.Balance> getGetBalanceMethod;
    if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
          BankServiceGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<com.shashi.models.BalanceCheckRequest, com.shashi.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shashi.models.BalanceCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shashi.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shashi.models.WithdrawRequest,
      com.shashi.models.Money> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "withdraw",
      requestType = com.shashi.models.WithdrawRequest.class,
      responseType = com.shashi.models.Money.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.shashi.models.WithdrawRequest,
      com.shashi.models.Money> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.shashi.models.WithdrawRequest, com.shashi.models.Money> getWithdrawMethod;
    if ((getWithdrawMethod = BankServiceGrpc.getWithdrawMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getWithdrawMethod = BankServiceGrpc.getWithdrawMethod) == null) {
          BankServiceGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.shashi.models.WithdrawRequest, com.shashi.models.Money>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shashi.models.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shashi.models.Money.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shashi.models.DepositeRequest,
      com.shashi.models.Balance> getCashDepositeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cashDeposite",
      requestType = com.shashi.models.DepositeRequest.class,
      responseType = com.shashi.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.shashi.models.DepositeRequest,
      com.shashi.models.Balance> getCashDepositeMethod() {
    io.grpc.MethodDescriptor<com.shashi.models.DepositeRequest, com.shashi.models.Balance> getCashDepositeMethod;
    if ((getCashDepositeMethod = BankServiceGrpc.getCashDepositeMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCashDepositeMethod = BankServiceGrpc.getCashDepositeMethod) == null) {
          BankServiceGrpc.getCashDepositeMethod = getCashDepositeMethod =
              io.grpc.MethodDescriptor.<com.shashi.models.DepositeRequest, com.shashi.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cashDeposite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shashi.models.DepositeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shashi.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("cashDeposite"))
              .build();
        }
      }
    }
    return getCashDepositeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *Unary call
     * </pre>
     */
    default void getBalance(com.shashi.models.BalanceCheckRequest request,
        io.grpc.stub.StreamObserver<com.shashi.models.Balance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * server-side streaming
     * </pre>
     */
    default void withdraw(com.shashi.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.shashi.models.Money> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client side streaming example
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.shashi.models.DepositeRequest> cashDeposite(
        io.grpc.stub.StreamObserver<com.shashi.models.Balance> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCashDepositeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BankService.
   */
  public static abstract class BankServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BankServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BankService.
   */
  public static final class BankServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary call
     * </pre>
     */
    public void getBalance(com.shashi.models.BalanceCheckRequest request,
        io.grpc.stub.StreamObserver<com.shashi.models.Balance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server-side streaming
     * </pre>
     */
    public void withdraw(com.shashi.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.shashi.models.Money> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client side streaming example
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.shashi.models.DepositeRequest> cashDeposite(
        io.grpc.stub.StreamObserver<com.shashi.models.Balance> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCashDepositeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BankService.
   */
  public static final class BankServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary call
     * </pre>
     */
    public com.shashi.models.Balance getBalance(com.shashi.models.BalanceCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server-side streaming
     * </pre>
     */
    public java.util.Iterator<com.shashi.models.Money> withdraw(
        com.shashi.models.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BankService.
   */
  public static final class BankServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shashi.models.Balance> getBalance(
        com.shashi.models.BalanceCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_CASH_DEPOSITE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.shashi.models.BalanceCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.shashi.models.Balance>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.shashi.models.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.shashi.models.Money>) responseObserver);
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
        case METHODID_CASH_DEPOSITE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cashDeposite(
              (io.grpc.stub.StreamObserver<com.shashi.models.Balance>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shashi.models.BalanceCheckRequest,
              com.shashi.models.Balance>(
                service, METHODID_GET_BALANCE)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.shashi.models.WithdrawRequest,
              com.shashi.models.Money>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getCashDepositeMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.shashi.models.DepositeRequest,
              com.shashi.models.Balance>(
                service, METHODID_CASH_DEPOSITE)))
        .build();
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shashi.models.BankServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BankServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getCashDepositeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
