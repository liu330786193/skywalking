// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JVMMetricsService.proto

package com.lyl.skywalking.proto;

/**
 * Protobuf type {@code MemoryPool}
 */
public  final class MemoryPool extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:MemoryPool)
    MemoryPoolOrBuilder {
  // Use MemoryPool.newBuilder() to construct.
  private MemoryPool(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MemoryPool() {
    type_ = 0;
    init_ = 0L;
    max_ = 0L;
    used_ = 0L;
    commited_ = 0L;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MemoryPool(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {

            init_ = input.readInt64();
            break;
          }
          case 24: {

            max_ = input.readInt64();
            break;
          }
          case 32: {

            used_ = input.readInt64();
            break;
          }
          case 40: {

            commited_ = input.readInt64();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lyl.skywalking.proto.JVMMetricsServiceOuterClass.internal_static_MemoryPool_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lyl.skywalking.proto.JVMMetricsServiceOuterClass.internal_static_MemoryPool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lyl.skywalking.proto.MemoryPool.class, com.lyl.skywalking.proto.MemoryPool.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>optional .PoolType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .PoolType type = 1;</code>
   */
  public com.lyl.skywalking.proto.PoolType getType() {
    com.lyl.skywalking.proto.PoolType result = com.lyl.skywalking.proto.PoolType.valueOf(type_);
    return result == null ? com.lyl.skywalking.proto.PoolType.UNRECOGNIZED : result;
  }

  public static final int INIT_FIELD_NUMBER = 2;
  private long init_;
  /**
   * <code>optional int64 init = 2;</code>
   */
  public long getInit() {
    return init_;
  }

  public static final int MAX_FIELD_NUMBER = 3;
  private long max_;
  /**
   * <code>optional int64 max = 3;</code>
   */
  public long getMax() {
    return max_;
  }

  public static final int USED_FIELD_NUMBER = 4;
  private long used_;
  /**
   * <code>optional int64 used = 4;</code>
   */
  public long getUsed() {
    return used_;
  }

  public static final int COMMITED_FIELD_NUMBER = 5;
  private long commited_;
  /**
   * <code>optional int64 commited = 5;</code>
   */
  public long getCommited() {
    return commited_;
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
    if (type_ != com.lyl.skywalking.proto.PoolType.CODE_CACHE_USAGE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (init_ != 0L) {
      output.writeInt64(2, init_);
    }
    if (max_ != 0L) {
      output.writeInt64(3, max_);
    }
    if (used_ != 0L) {
      output.writeInt64(4, used_);
    }
    if (commited_ != 0L) {
      output.writeInt64(5, commited_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.lyl.skywalking.proto.PoolType.CODE_CACHE_USAGE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (init_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, init_);
    }
    if (max_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, max_);
    }
    if (used_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, used_);
    }
    if (commited_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, commited_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.lyl.skywalking.proto.MemoryPool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.MemoryPool parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.lyl.skywalking.proto.MemoryPool prototype) {
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
   * Protobuf type {@code MemoryPool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MemoryPool)
      com.lyl.skywalking.proto.MemoryPoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lyl.skywalking.proto.JVMMetricsServiceOuterClass.internal_static_MemoryPool_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lyl.skywalking.proto.JVMMetricsServiceOuterClass.internal_static_MemoryPool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lyl.skywalking.proto.MemoryPool.class, com.lyl.skywalking.proto.MemoryPool.Builder.class);
    }

    // Construct using com.lyl.skywalking.proto.MemoryPool.newBuilder()
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
      type_ = 0;

      init_ = 0L;

      max_ = 0L;

      used_ = 0L;

      commited_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lyl.skywalking.proto.JVMMetricsServiceOuterClass.internal_static_MemoryPool_descriptor;
    }

    public com.lyl.skywalking.proto.MemoryPool getDefaultInstanceForType() {
      return com.lyl.skywalking.proto.MemoryPool.getDefaultInstance();
    }

    public com.lyl.skywalking.proto.MemoryPool build() {
      com.lyl.skywalking.proto.MemoryPool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lyl.skywalking.proto.MemoryPool buildPartial() {
      com.lyl.skywalking.proto.MemoryPool result = new com.lyl.skywalking.proto.MemoryPool(this);
      result.type_ = type_;
      result.init_ = init_;
      result.max_ = max_;
      result.used_ = used_;
      result.commited_ = commited_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lyl.skywalking.proto.MemoryPool) {
        return mergeFrom((com.lyl.skywalking.proto.MemoryPool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lyl.skywalking.proto.MemoryPool other) {
      if (other == com.lyl.skywalking.proto.MemoryPool.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getInit() != 0L) {
        setInit(other.getInit());
      }
      if (other.getMax() != 0L) {
        setMax(other.getMax());
      }
      if (other.getUsed() != 0L) {
        setUsed(other.getUsed());
      }
      if (other.getCommited() != 0L) {
        setCommited(other.getCommited());
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
      com.lyl.skywalking.proto.MemoryPool parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lyl.skywalking.proto.MemoryPool) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>optional .PoolType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .PoolType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .PoolType type = 1;</code>
     */
    public com.lyl.skywalking.proto.PoolType getType() {
      com.lyl.skywalking.proto.PoolType result = com.lyl.skywalking.proto.PoolType.valueOf(type_);
      return result == null ? com.lyl.skywalking.proto.PoolType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .PoolType type = 1;</code>
     */
    public Builder setType(com.lyl.skywalking.proto.PoolType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .PoolType type = 1;</code>
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private long init_ ;
    /**
     * <code>optional int64 init = 2;</code>
     */
    public long getInit() {
      return init_;
    }
    /**
     * <code>optional int64 init = 2;</code>
     */
    public Builder setInit(long value) {

      init_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 init = 2;</code>
     */
    public Builder clearInit() {

      init_ = 0L;
      onChanged();
      return this;
    }

    private long max_ ;
    /**
     * <code>optional int64 max = 3;</code>
     */
    public long getMax() {
      return max_;
    }
    /**
     * <code>optional int64 max = 3;</code>
     */
    public Builder setMax(long value) {

      max_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 max = 3;</code>
     */
    public Builder clearMax() {

      max_ = 0L;
      onChanged();
      return this;
    }

    private long used_ ;
    /**
     * <code>optional int64 used = 4;</code>
     */
    public long getUsed() {
      return used_;
    }
    /**
     * <code>optional int64 used = 4;</code>
     */
    public Builder setUsed(long value) {

      used_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 used = 4;</code>
     */
    public Builder clearUsed() {

      used_ = 0L;
      onChanged();
      return this;
    }

    private long commited_ ;
    /**
     * <code>optional int64 commited = 5;</code>
     */
    public long getCommited() {
      return commited_;
    }
    /**
     * <code>optional int64 commited = 5;</code>
     */
    public Builder setCommited(long value) {

      commited_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 commited = 5;</code>
     */
    public Builder clearCommited() {

      commited_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:MemoryPool)
  }

  // @@protoc_insertion_point(class_scope:MemoryPool)
  private static final com.lyl.skywalking.proto.MemoryPool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lyl.skywalking.proto.MemoryPool();
  }

  public static com.lyl.skywalking.proto.MemoryPool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemoryPool>
      PARSER = new com.google.protobuf.AbstractParser<MemoryPool>() {
    public MemoryPool parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new MemoryPool(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<MemoryPool> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MemoryPool> getParserForType() {
    return PARSER;
  }

  public com.lyl.skywalking.proto.MemoryPool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

