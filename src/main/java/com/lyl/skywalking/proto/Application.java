// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ApplicationRegisterService.proto

package com.lyl.skywalking.proto;

/**
 * Protobuf type {@code Application}
 */
public  final class Application extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Application)
        ApplicationOrBuilder {
  // Use Application.newBuilder() to construct.
  private Application(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Application() {
    applicationCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Application(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              applicationCode_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            applicationCode_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        applicationCode_ = applicationCode_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lyl.skywalking.proto.ApplicationRegisterServiceOuterClass.internal_static_Application_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lyl.skywalking.proto.ApplicationRegisterServiceOuterClass.internal_static_Application_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lyl.skywalking.proto.Application.class, com.lyl.skywalking.proto.Application.Builder.class);
  }

  public static final int APPLICATIONCODE_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList applicationCode_;
  /**
   * <code>repeated string applicationCode = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getApplicationCodeList() {
    return applicationCode_;
  }
  /**
   * <code>repeated string applicationCode = 1;</code>
   */
  public int getApplicationCodeCount() {
    return applicationCode_.size();
  }
  /**
   * <code>repeated string applicationCode = 1;</code>
   */
  public String getApplicationCode(int index) {
    return applicationCode_.get(index);
  }
  /**
   * <code>repeated string applicationCode = 1;</code>
   */
  public com.google.protobuf.ByteString
      getApplicationCodeBytes(int index) {
    return applicationCode_.getByteString(index);
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
    for (int i = 0; i < applicationCode_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, applicationCode_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < applicationCode_.size(); i++) {
        dataSize += computeStringSizeNoTag(applicationCode_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getApplicationCodeList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.lyl.skywalking.proto.Application parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.Application parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.Application parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.Application parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.Application parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.Application parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.Application parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.lyl.skywalking.proto.Application parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.Application parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.Application parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.lyl.skywalking.proto.Application prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Application}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Application)
      com.lyl.skywalking.proto.ApplicationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lyl.skywalking.proto.ApplicationRegisterServiceOuterClass.internal_static_Application_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lyl.skywalking.proto.ApplicationRegisterServiceOuterClass.internal_static_Application_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lyl.skywalking.proto.Application.class, com.lyl.skywalking.proto.Application.Builder.class);
    }

    // Construct using com.lyl.skywalking.proto.Application.newBuilder()
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
      applicationCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lyl.skywalking.proto.ApplicationRegisterServiceOuterClass.internal_static_Application_descriptor;
    }

    public com.lyl.skywalking.proto.Application getDefaultInstanceForType() {
      return com.lyl.skywalking.proto.Application.getDefaultInstance();
    }

    public com.lyl.skywalking.proto.Application build() {
      com.lyl.skywalking.proto.Application result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lyl.skywalking.proto.Application buildPartial() {
      com.lyl.skywalking.proto.Application result = new com.lyl.skywalking.proto.Application(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        applicationCode_ = applicationCode_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.applicationCode_ = applicationCode_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lyl.skywalking.proto.Application) {
        return mergeFrom((com.lyl.skywalking.proto.Application)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lyl.skywalking.proto.Application other) {
      if (other == com.lyl.skywalking.proto.Application.getDefaultInstance()) return this;
      if (!other.applicationCode_.isEmpty()) {
        if (applicationCode_.isEmpty()) {
          applicationCode_ = other.applicationCode_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureApplicationCodeIsMutable();
          applicationCode_.addAll(other.applicationCode_);
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
      com.lyl.skywalking.proto.Application parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lyl.skywalking.proto.Application) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList applicationCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureApplicationCodeIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        applicationCode_ = new com.google.protobuf.LazyStringArrayList(applicationCode_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getApplicationCodeList() {
      return applicationCode_.getUnmodifiableView();
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public int getApplicationCodeCount() {
      return applicationCode_.size();
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public String getApplicationCode(int index) {
      return applicationCode_.get(index);
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getApplicationCodeBytes(int index) {
      return applicationCode_.getByteString(index);
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public Builder setApplicationCode(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureApplicationCodeIsMutable();
      applicationCode_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public Builder addApplicationCode(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureApplicationCodeIsMutable();
      applicationCode_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public Builder addAllApplicationCode(
        Iterable<String> values) {
      ensureApplicationCodeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, applicationCode_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public Builder clearApplicationCode() {
      applicationCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string applicationCode = 1;</code>
     */
    public Builder addApplicationCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureApplicationCodeIsMutable();
      applicationCode_.add(value);
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


    // @@protoc_insertion_point(builder_scope:Application)
  }

  // @@protoc_insertion_point(class_scope:Application)
  private static final com.lyl.skywalking.proto.Application DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lyl.skywalking.proto.Application();
  }

  public static com.lyl.skywalking.proto.Application getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Application>
      PARSER = new com.google.protobuf.AbstractParser<Application>() {
    public Application parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Application(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Application> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Application> getParserForType() {
    return PARSER;
  }

  public com.lyl.skywalking.proto.Application getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

