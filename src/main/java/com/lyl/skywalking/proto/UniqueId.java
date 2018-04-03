// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TraceSegmentService.proto

package com.lyl.skywalking.proto;

/**
 * Protobuf type {@code UniqueId}
 */
public  final class UniqueId extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:UniqueId)
    UniqueIdOrBuilder {
  // Use UniqueId.newBuilder() to construct.
  private UniqueId(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UniqueId() {
    idParts_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UniqueId(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              idParts_ = new java.util.ArrayList<Long>();
              mutable_bitField0_ |= 0x00000001;
            }
            idParts_.add(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              idParts_ = new java.util.ArrayList<Long>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              idParts_.add(input.readInt64());
            }
            input.popLimit(limit);
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
        idParts_ = java.util.Collections.unmodifiableList(idParts_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_UniqueId_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_UniqueId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lyl.skywalking.proto.UniqueId.class, com.lyl.skywalking.proto.UniqueId.Builder.class);
  }

  public static final int IDPARTS_FIELD_NUMBER = 1;
  private java.util.List<Long> idParts_;
  /**
   * <code>repeated int64 idParts = 1;</code>
   */
  public java.util.List<Long>
      getIdPartsList() {
    return idParts_;
  }
  /**
   * <code>repeated int64 idParts = 1;</code>
   */
  public int getIdPartsCount() {
    return idParts_.size();
  }
  /**
   * <code>repeated int64 idParts = 1;</code>
   */
  public long getIdParts(int index) {
    return idParts_.get(index);
  }
  private int idPartsMemoizedSerializedSize = -1;

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
    if (getIdPartsList().size() > 0) {
      output.writeRawVarint32(10);
      output.writeRawVarint32(idPartsMemoizedSerializedSize);
    }
    for (int i = 0; i < idParts_.size(); i++) {
      output.writeInt64NoTag(idParts_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < idParts_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(idParts_.get(i));
      }
      size += dataSize;
      if (!getIdPartsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idPartsMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.lyl.skywalking.proto.UniqueId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.UniqueId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.UniqueId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.UniqueId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.UniqueId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.UniqueId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.UniqueId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.lyl.skywalking.proto.UniqueId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.UniqueId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.UniqueId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.lyl.skywalking.proto.UniqueId prototype) {
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
   * Protobuf type {@code UniqueId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UniqueId)
      com.lyl.skywalking.proto.UniqueIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_UniqueId_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_UniqueId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lyl.skywalking.proto.UniqueId.class, com.lyl.skywalking.proto.UniqueId.Builder.class);
    }

    // Construct using com.lyl.skywalking.proto.UniqueId.newBuilder()
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
      idParts_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_UniqueId_descriptor;
    }

    public com.lyl.skywalking.proto.UniqueId getDefaultInstanceForType() {
      return com.lyl.skywalking.proto.UniqueId.getDefaultInstance();
    }

    public com.lyl.skywalking.proto.UniqueId build() {
      com.lyl.skywalking.proto.UniqueId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lyl.skywalking.proto.UniqueId buildPartial() {
      com.lyl.skywalking.proto.UniqueId result = new com.lyl.skywalking.proto.UniqueId(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        idParts_ = java.util.Collections.unmodifiableList(idParts_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.idParts_ = idParts_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lyl.skywalking.proto.UniqueId) {
        return mergeFrom((com.lyl.skywalking.proto.UniqueId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lyl.skywalking.proto.UniqueId other) {
      if (other == com.lyl.skywalking.proto.UniqueId.getDefaultInstance()) return this;
      if (!other.idParts_.isEmpty()) {
        if (idParts_.isEmpty()) {
          idParts_ = other.idParts_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdPartsIsMutable();
          idParts_.addAll(other.idParts_);
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
      com.lyl.skywalking.proto.UniqueId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lyl.skywalking.proto.UniqueId) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Long> idParts_ = java.util.Collections.emptyList();
    private void ensureIdPartsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        idParts_ = new java.util.ArrayList<Long>(idParts_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 idParts = 1;</code>
     */
    public java.util.List<Long>
        getIdPartsList() {
      return java.util.Collections.unmodifiableList(idParts_);
    }
    /**
     * <code>repeated int64 idParts = 1;</code>
     */
    public int getIdPartsCount() {
      return idParts_.size();
    }
    /**
     * <code>repeated int64 idParts = 1;</code>
     */
    public long getIdParts(int index) {
      return idParts_.get(index);
    }
    /**
     * <code>repeated int64 idParts = 1;</code>
     */
    public Builder setIdParts(
        int index, long value) {
      ensureIdPartsIsMutable();
      idParts_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 idParts = 1;</code>
     */
    public Builder addIdParts(long value) {
      ensureIdPartsIsMutable();
      idParts_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 idParts = 1;</code>
     */
    public Builder addAllIdParts(
        Iterable<? extends Long> values) {
      ensureIdPartsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, idParts_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 idParts = 1;</code>
     */
    public Builder clearIdParts() {
      idParts_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:UniqueId)
  }

  // @@protoc_insertion_point(class_scope:UniqueId)
  private static final com.lyl.skywalking.proto.UniqueId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lyl.skywalking.proto.UniqueId();
  }

  public static com.lyl.skywalking.proto.UniqueId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UniqueId>
      PARSER = new com.google.protobuf.AbstractParser<UniqueId>() {
    public UniqueId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UniqueId(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<UniqueId> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UniqueId> getParserForType() {
    return PARSER;
  }

  public com.lyl.skywalking.proto.UniqueId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
