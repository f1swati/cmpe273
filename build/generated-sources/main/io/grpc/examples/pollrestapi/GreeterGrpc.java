package io.grpc.examples.pollrestapi;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class GreeterGrpc {

  private static final io.grpc.stub.Method<io.grpc.examples.pollrestapi.PollRequest,
      io.grpc.examples.pollrestapi.PollResponse> METHOD_SAY_POLL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "sayPoll",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.pollrestapi.PollRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.pollrestapi.PollResponse.PARSER));

  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel, CONFIG);
  }

  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel, CONFIG);
  }

  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel, CONFIG);
  }

  public static final GreeterServiceDescriptor CONFIG =
      new GreeterServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class GreeterServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<GreeterServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.examples.pollrestapi.PollRequest,
        io.grpc.examples.pollrestapi.PollResponse> sayPoll;

    private GreeterServiceDescriptor() {
      sayPoll = createMethodDescriptor(
          "grpc.example.pollrestapi.Greeter", METHOD_SAY_POLL);
    }

    @SuppressWarnings("unchecked")
    private GreeterServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      sayPoll = (io.grpc.MethodDescriptor<io.grpc.examples.pollrestapi.PollRequest,
          io.grpc.examples.pollrestapi.PollResponse>) methodMap.get(
          CONFIG.sayPoll.getName());
    }

    @java.lang.Override
    protected GreeterServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new GreeterServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          sayPoll);
    }
  }

  public static interface Greeter {

    public void sayPoll(io.grpc.examples.pollrestapi.PollRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.pollrestapi.PollResponse> responseObserver);
  }

  public static interface GreeterBlockingClient {

    public io.grpc.examples.pollrestapi.PollResponse sayPoll(io.grpc.examples.pollrestapi.PollRequest request);
  }

  public static interface GreeterFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.pollrestapi.PollResponse> sayPoll(
        io.grpc.examples.pollrestapi.PollRequest request);
  }

  public static class GreeterStub extends
      io.grpc.stub.AbstractStub<GreeterStub, GreeterServiceDescriptor>
      implements Greeter {
    private GreeterStub(io.grpc.Channel channel,
        GreeterServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        GreeterServiceDescriptor config) {
      return new GreeterStub(channel, config);
    }

    @java.lang.Override
    public void sayPoll(io.grpc.examples.pollrestapi.PollRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.pollrestapi.PollResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.sayPoll), request, responseObserver);
    }
  }

  public static class GreeterBlockingStub extends
      io.grpc.stub.AbstractStub<GreeterBlockingStub, GreeterServiceDescriptor>
      implements GreeterBlockingClient {
    private GreeterBlockingStub(io.grpc.Channel channel,
        GreeterServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        GreeterServiceDescriptor config) {
      return new GreeterBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.examples.pollrestapi.PollResponse sayPoll(io.grpc.examples.pollrestapi.PollRequest request) {
      return blockingUnaryCall(
          channel.newCall(config.sayPoll), request);
    }
  }

  public static class GreeterFutureStub extends
      io.grpc.stub.AbstractStub<GreeterFutureStub, GreeterServiceDescriptor>
      implements GreeterFutureClient {
    private GreeterFutureStub(io.grpc.Channel channel,
        GreeterServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        GreeterServiceDescriptor config) {
      return new GreeterFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.pollrestapi.PollResponse> sayPoll(
        io.grpc.examples.pollrestapi.PollRequest request) {
      return unaryFutureCall(
          channel.newCall(config.sayPoll), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Greeter serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.example.pollrestapi.Greeter")
      .addMethod(createMethodDefinition(
          METHOD_SAY_POLL,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.pollrestapi.PollRequest,
                io.grpc.examples.pollrestapi.PollResponse>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.pollrestapi.PollRequest request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.pollrestapi.PollResponse> responseObserver) {
                serviceImpl.sayPoll(request, responseObserver);
              }
            }))).build();
  }
}
