package edu.sjsu.cmpe273.lab2;

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
public class PollGrpc {

  private static final io.grpc.stub.Method<edu.sjsu.cmpe273.lab2.PollRequest,
      edu.sjsu.cmpe273.lab2.PollResponse> METHOD_CREATE_POLL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "createPoll",
          io.grpc.proto.ProtoUtils.marshaller(edu.sjsu.cmpe273.lab2.PollRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(edu.sjsu.cmpe273.lab2.PollResponse.PARSER));

  public static PollStub newStub(io.grpc.Channel channel) {
    return new PollStub(channel, CONFIG);
  }

  public static PollBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PollBlockingStub(channel, CONFIG);
  }

  public static PollFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PollFutureStub(channel, CONFIG);
  }

  public static final PollServiceDescriptor CONFIG =
      new PollServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class PollServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<PollServiceDescriptor> {
    public final io.grpc.MethodDescriptor<edu.sjsu.cmpe273.lab2.PollRequest,
        edu.sjsu.cmpe273.lab2.PollResponse> createPoll;

    private PollServiceDescriptor() {
      createPoll = createMethodDescriptor(
          "edu.sjsu.cmpe273.lab2.Poll", METHOD_CREATE_POLL);
    }

    @SuppressWarnings("unchecked")
    private PollServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      createPoll = (io.grpc.MethodDescriptor<edu.sjsu.cmpe273.lab2.PollRequest,
          edu.sjsu.cmpe273.lab2.PollResponse>) methodMap.get(
          CONFIG.createPoll.getName());
    }

    @java.lang.Override
    protected PollServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new PollServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          createPoll);
    }
  }

  public static interface Poll {

    public void createPoll(edu.sjsu.cmpe273.lab2.PollRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cmpe273.lab2.PollResponse> responseObserver);
  }

  public static interface PollBlockingClient {

    public edu.sjsu.cmpe273.lab2.PollResponse createPoll(edu.sjsu.cmpe273.lab2.PollRequest request);
  }

  public static interface PollFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cmpe273.lab2.PollResponse> createPoll(
        edu.sjsu.cmpe273.lab2.PollRequest request);
  }

  public static class PollStub extends
      io.grpc.stub.AbstractStub<PollStub, PollServiceDescriptor>
      implements Poll {
    private PollStub(io.grpc.Channel channel,
        PollServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollStub build(io.grpc.Channel channel,
        PollServiceDescriptor config) {
      return new PollStub(channel, config);
    }

    @java.lang.Override
    public void createPoll(edu.sjsu.cmpe273.lab2.PollRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cmpe273.lab2.PollResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.createPoll), request, responseObserver);
    }
  }

  public static class PollBlockingStub extends
      io.grpc.stub.AbstractStub<PollBlockingStub, PollServiceDescriptor>
      implements PollBlockingClient {
    private PollBlockingStub(io.grpc.Channel channel,
        PollServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollBlockingStub build(io.grpc.Channel channel,
        PollServiceDescriptor config) {
      return new PollBlockingStub(channel, config);
    }

    @java.lang.Override
    public edu.sjsu.cmpe273.lab2.PollResponse createPoll(edu.sjsu.cmpe273.lab2.PollRequest request) {
      return blockingUnaryCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static class PollFutureStub extends
      io.grpc.stub.AbstractStub<PollFutureStub, PollServiceDescriptor>
      implements PollFutureClient {
    private PollFutureStub(io.grpc.Channel channel,
        PollServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollFutureStub build(io.grpc.Channel channel,
        PollServiceDescriptor config) {
      return new PollFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cmpe273.lab2.PollResponse> createPoll(
        edu.sjsu.cmpe273.lab2.PollRequest request) {
      return unaryFutureCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Poll serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("edu.sjsu.cmpe273.lab2.Poll")
      .addMethod(createMethodDefinition(
          METHOD_CREATE_POLL,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                edu.sjsu.cmpe273.lab2.PollRequest,
                edu.sjsu.cmpe273.lab2.PollResponse>() {
              @java.lang.Override
              public void invoke(
                  edu.sjsu.cmpe273.lab2.PollRequest request,
                  io.grpc.stub.StreamObserver<edu.sjsu.cmpe273.lab2.PollResponse> responseObserver) {
                serviceImpl.createPoll(request, responseObserver);
              }
            }))).build();
  }
}
