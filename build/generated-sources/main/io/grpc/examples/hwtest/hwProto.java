// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hw.proto

package io.grpc.examples.hwtest;

public final class hwProto {
  private hwProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_example_hwtest_HelloRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_example_hwtest_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_example_hwtest_HelloResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_example_hwtest_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010hw.proto\022\023grpc.example.hwtest\"\034\n\014Hello" +
      "Request\022\014\n\004name\030\001 \001(\t\" \n\rHelloResponse\022\017" +
      "\n\007message\030\001 \001(\t2^\n\007Greeter\022S\n\010SayHello\022!" +
      ".grpc.example.hwtest.HelloRequest\032\".grpc" +
      ".example.hwtest.HelloResponse\"\000B$\n\027io.gr" +
      "pc.examples.hwtestB\007hwProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_grpc_example_hwtest_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_example_hwtest_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_example_hwtest_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_grpc_example_hwtest_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_example_hwtest_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_example_hwtest_HelloResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
