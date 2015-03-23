// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Poll.proto

package edu.sjsu.cmpe273.lab2;

/**
 * Protobuf type {@code edu.sjsu.cmpe273.lab2.PollRequest}
 *
 * <pre>
 * The request message containing the user's name.
 * </pre>
 */
public  final class PollRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:edu.sjsu.cmpe273.lab2.PollRequest)
    PollRequestOrBuilder {
  // Use PollRequest.newBuilder() to construct.
  private PollRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private PollRequest() {
    moderatorId_ = "";
    question_ = "";
    startedAt_ = "";
    expiredAt_ = "";
    choice_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PollRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            moderatorId_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            question_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();

            startedAt_ = bs;
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();

            expiredAt_ = bs;
            break;
          }
          case 42: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              choice_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            choice_.add(bs);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        choice_ = choice_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.sjsu.cmpe273.lab2.PollProto.internal_static_edu_sjsu_cmpe273_lab2_PollRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.sjsu.cmpe273.lab2.PollProto.internal_static_edu_sjsu_cmpe273_lab2_PollRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.sjsu.cmpe273.lab2.PollRequest.class, edu.sjsu.cmpe273.lab2.PollRequest.Builder.class);
  }

  public static final com.google.protobuf.Parser<PollRequest> PARSER =
      new com.google.protobuf.AbstractParser<PollRequest>() {
    public PollRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PollRequest(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<PollRequest> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int MODERATORID_FIELD_NUMBER = 1;
  private java.lang.Object moderatorId_;
  /**
   * <code>optional string moderatorId = 1;</code>
   */
  public java.lang.String getModeratorId() {
    java.lang.Object ref = moderatorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        moderatorId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string moderatorId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getModeratorIdBytes() {
    java.lang.Object ref = moderatorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      moderatorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUESTION_FIELD_NUMBER = 2;
  private java.lang.Object question_;
  /**
   * <code>optional string question = 2;</code>
   */
  public java.lang.String getQuestion() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        question_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string question = 2;</code>
   */
  public com.google.protobuf.ByteString
      getQuestionBytes() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      question_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTEDAT_FIELD_NUMBER = 3;
  private java.lang.Object startedAt_;
  /**
   * <code>optional string startedAt = 3;</code>
   */
  public java.lang.String getStartedAt() {
    java.lang.Object ref = startedAt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        startedAt_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string startedAt = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStartedAtBytes() {
    java.lang.Object ref = startedAt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startedAt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIREDAT_FIELD_NUMBER = 4;
  private java.lang.Object expiredAt_;
  /**
   * <code>optional string expiredAt = 4;</code>
   */
  public java.lang.String getExpiredAt() {
    java.lang.Object ref = expiredAt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        expiredAt_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string expiredAt = 4;</code>
   */
  public com.google.protobuf.ByteString
      getExpiredAtBytes() {
    java.lang.Object ref = expiredAt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expiredAt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHOICE_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList choice_;
  /**
   * <code>repeated string choice = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getChoiceList() {
    return choice_;
  }
  /**
   * <code>repeated string choice = 5;</code>
   */
  public int getChoiceCount() {
    return choice_.size();
  }
  /**
   * <code>repeated string choice = 5;</code>
   */
  public java.lang.String getChoice(int index) {
    return choice_.get(index);
  }
  /**
   * <code>repeated string choice = 5;</code>
   */
  public com.google.protobuf.ByteString
      getChoiceBytes(int index) {
    return choice_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!getModeratorIdBytes().isEmpty()) {
      output.writeBytes(1, getModeratorIdBytes());
    }
    if (!getQuestionBytes().isEmpty()) {
      output.writeBytes(2, getQuestionBytes());
    }
    if (!getStartedAtBytes().isEmpty()) {
      output.writeBytes(3, getStartedAtBytes());
    }
    if (!getExpiredAtBytes().isEmpty()) {
      output.writeBytes(4, getExpiredAtBytes());
    }
    for (int i = 0; i < choice_.size(); i++) {
      output.writeBytes(5, choice_.getByteString(i));
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModeratorIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getModeratorIdBytes());
    }
    if (!getQuestionBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getQuestionBytes());
    }
    if (!getStartedAtBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getStartedAtBytes());
    }
    if (!getExpiredAtBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, getExpiredAtBytes());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < choice_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(choice_.getByteString(i));
      }
      size += dataSize;
      size += 1 * getChoiceList().size();
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static edu.sjsu.cmpe273.lab2.PollRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static edu.sjsu.cmpe273.lab2.PollRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(edu.sjsu.cmpe273.lab2.PollRequest prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code edu.sjsu.cmpe273.lab2.PollRequest}
   *
   * <pre>
   * The request message containing the user's name.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:edu.sjsu.cmpe273.lab2.PollRequest)
      edu.sjsu.cmpe273.lab2.PollRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.sjsu.cmpe273.lab2.PollProto.internal_static_edu_sjsu_cmpe273_lab2_PollRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.sjsu.cmpe273.lab2.PollProto.internal_static_edu_sjsu_cmpe273_lab2_PollRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.sjsu.cmpe273.lab2.PollRequest.class, edu.sjsu.cmpe273.lab2.PollRequest.Builder.class);
    }

    // Construct using edu.sjsu.cmpe273.lab2.PollRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      moderatorId_ = "";

      question_ = "";

      startedAt_ = "";

      expiredAt_ = "";

      choice_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.sjsu.cmpe273.lab2.PollProto.internal_static_edu_sjsu_cmpe273_lab2_PollRequest_descriptor;
    }

    public edu.sjsu.cmpe273.lab2.PollRequest getDefaultInstanceForType() {
      return edu.sjsu.cmpe273.lab2.PollRequest.getDefaultInstance();
    }

    public edu.sjsu.cmpe273.lab2.PollRequest build() {
      edu.sjsu.cmpe273.lab2.PollRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public edu.sjsu.cmpe273.lab2.PollRequest buildPartial() {
      edu.sjsu.cmpe273.lab2.PollRequest result = new edu.sjsu.cmpe273.lab2.PollRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.moderatorId_ = moderatorId_;
      result.question_ = question_;
      result.startedAt_ = startedAt_;
      result.expiredAt_ = expiredAt_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        choice_ = choice_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.choice_ = choice_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof edu.sjsu.cmpe273.lab2.PollRequest) {
        return mergeFrom((edu.sjsu.cmpe273.lab2.PollRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.sjsu.cmpe273.lab2.PollRequest other) {
      if (other == edu.sjsu.cmpe273.lab2.PollRequest.getDefaultInstance()) return this;
      if (!other.getModeratorId().isEmpty()) {
        moderatorId_ = other.moderatorId_;
        onChanged();
      }
      if (!other.getQuestion().isEmpty()) {
        question_ = other.question_;
        onChanged();
      }
      if (!other.getStartedAt().isEmpty()) {
        startedAt_ = other.startedAt_;
        onChanged();
      }
      if (!other.getExpiredAt().isEmpty()) {
        expiredAt_ = other.expiredAt_;
        onChanged();
      }
      if (!other.choice_.isEmpty()) {
        if (choice_.isEmpty()) {
          choice_ = other.choice_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureChoiceIsMutable();
          choice_.addAll(other.choice_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      edu.sjsu.cmpe273.lab2.PollRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (edu.sjsu.cmpe273.lab2.PollRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object moderatorId_ = "";
    /**
     * <code>optional string moderatorId = 1;</code>
     */
    public java.lang.String getModeratorId() {
      java.lang.Object ref = moderatorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          moderatorId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string moderatorId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getModeratorIdBytes() {
      java.lang.Object ref = moderatorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moderatorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string moderatorId = 1;</code>
     */
    public Builder setModeratorId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      moderatorId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string moderatorId = 1;</code>
     */
    public Builder clearModeratorId() {
      
      moderatorId_ = getDefaultInstance().getModeratorId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string moderatorId = 1;</code>
     */
    public Builder setModeratorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      moderatorId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object question_ = "";
    /**
     * <code>optional string question = 2;</code>
     */
    public java.lang.String getQuestion() {
      java.lang.Object ref = question_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          question_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string question = 2;</code>
     */
    public com.google.protobuf.ByteString
        getQuestionBytes() {
      java.lang.Object ref = question_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        question_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string question = 2;</code>
     */
    public Builder setQuestion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      question_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string question = 2;</code>
     */
    public Builder clearQuestion() {
      
      question_ = getDefaultInstance().getQuestion();
      onChanged();
      return this;
    }
    /**
     * <code>optional string question = 2;</code>
     */
    public Builder setQuestionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      question_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object startedAt_ = "";
    /**
     * <code>optional string startedAt = 3;</code>
     */
    public java.lang.String getStartedAt() {
      java.lang.Object ref = startedAt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          startedAt_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string startedAt = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStartedAtBytes() {
      java.lang.Object ref = startedAt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startedAt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string startedAt = 3;</code>
     */
    public Builder setStartedAt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startedAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string startedAt = 3;</code>
     */
    public Builder clearStartedAt() {
      
      startedAt_ = getDefaultInstance().getStartedAt();
      onChanged();
      return this;
    }
    /**
     * <code>optional string startedAt = 3;</code>
     */
    public Builder setStartedAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startedAt_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expiredAt_ = "";
    /**
     * <code>optional string expiredAt = 4;</code>
     */
    public java.lang.String getExpiredAt() {
      java.lang.Object ref = expiredAt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          expiredAt_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string expiredAt = 4;</code>
     */
    public com.google.protobuf.ByteString
        getExpiredAtBytes() {
      java.lang.Object ref = expiredAt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expiredAt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string expiredAt = 4;</code>
     */
    public Builder setExpiredAt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expiredAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string expiredAt = 4;</code>
     */
    public Builder clearExpiredAt() {
      
      expiredAt_ = getDefaultInstance().getExpiredAt();
      onChanged();
      return this;
    }
    /**
     * <code>optional string expiredAt = 4;</code>
     */
    public Builder setExpiredAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expiredAt_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList choice_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureChoiceIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        choice_ = new com.google.protobuf.LazyStringArrayList(choice_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getChoiceList() {
      return choice_.getUnmodifiableView();
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public int getChoiceCount() {
      return choice_.size();
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public java.lang.String getChoice(int index) {
      return choice_.get(index);
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public com.google.protobuf.ByteString
        getChoiceBytes(int index) {
      return choice_.getByteString(index);
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public Builder setChoice(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureChoiceIsMutable();
      choice_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public Builder addChoice(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureChoiceIsMutable();
      choice_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public Builder addAllChoice(
        java.lang.Iterable<java.lang.String> values) {
      ensureChoiceIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, choice_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public Builder clearChoice() {
      choice_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string choice = 5;</code>
     */
    public Builder addChoiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureChoiceIsMutable();
      choice_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:edu.sjsu.cmpe273.lab2.PollRequest)
  }

  // @@protoc_insertion_point(class_scope:edu.sjsu.cmpe273.lab2.PollRequest)
  private static final edu.sjsu.cmpe273.lab2.PollRequest defaultInstance;static {
    defaultInstance = new edu.sjsu.cmpe273.lab2.PollRequest();
  }

  public static edu.sjsu.cmpe273.lab2.PollRequest getDefaultInstance() {
    return defaultInstance;
  }

  public edu.sjsu.cmpe273.lab2.PollRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

}

