// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TraceSegmentService.proto

package com.lyl.skywalking.proto;

/**
 * Protobuf type {@code TraceSegmentReference}
 */
public  final class TraceSegmentReference extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:TraceSegmentReference)
        TraceSegmentReferenceOrBuilder {
  // Use TraceSegmentReference.newBuilder() to construct.
  private TraceSegmentReference(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TraceSegmentReference() {
    refType_ = 0;
    parentSpanId_ = 0;
    parentApplicationInstanceId_ = 0;
    networkAddress_ = "";
    networkAddressId_ = 0;
    entryApplicationInstanceId_ = 0;
    entryServiceName_ = "";
    entryServiceId_ = 0;
    parentServiceName_ = "";
    parentServiceId_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TraceSegmentReference(
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

            refType_ = rawValue;
            break;
          }
          case 18: {
            com.lyl.skywalking.proto.UniqueId.Builder subBuilder = null;
            if (parentTraceSegmentId_ != null) {
              subBuilder = parentTraceSegmentId_.toBuilder();
            }
            parentTraceSegmentId_ = input.readMessage(com.lyl.skywalking.proto.UniqueId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(parentTraceSegmentId_);
              parentTraceSegmentId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            parentSpanId_ = input.readInt32();
            break;
          }
          case 32: {

            parentApplicationInstanceId_ = input.readInt32();
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            networkAddress_ = s;
            break;
          }
          case 48: {

            networkAddressId_ = input.readInt32();
            break;
          }
          case 56: {

            entryApplicationInstanceId_ = input.readInt32();
            break;
          }
          case 66: {
            String s = input.readStringRequireUtf8();

            entryServiceName_ = s;
            break;
          }
          case 72: {

            entryServiceId_ = input.readInt32();
            break;
          }
          case 82: {
            String s = input.readStringRequireUtf8();

            parentServiceName_ = s;
            break;
          }
          case 88: {

            parentServiceId_ = input.readInt32();
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
    return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_TraceSegmentReference_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_TraceSegmentReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lyl.skywalking.proto.TraceSegmentReference.class, com.lyl.skywalking.proto.TraceSegmentReference.Builder.class);
  }

  public static final int REFTYPE_FIELD_NUMBER = 1;
  private int refType_;
  /**
   * <code>optional .RefType refType = 1;</code>
   */
  public int getRefTypeValue() {
    return refType_;
  }
  /**
   * <code>optional .RefType refType = 1;</code>
   */
  public com.lyl.skywalking.proto.RefType getRefType() {
    com.lyl.skywalking.proto.RefType result = com.lyl.skywalking.proto.RefType.valueOf(refType_);
    return result == null ? com.lyl.skywalking.proto.RefType.UNRECOGNIZED : result;
  }

  public static final int PARENTTRACESEGMENTID_FIELD_NUMBER = 2;
  private com.lyl.skywalking.proto.UniqueId parentTraceSegmentId_;
  /**
   * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
   */
  public boolean hasParentTraceSegmentId() {
    return parentTraceSegmentId_ != null;
  }
  /**
   * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
   */
  public com.lyl.skywalking.proto.UniqueId getParentTraceSegmentId() {
    return parentTraceSegmentId_ == null ? com.lyl.skywalking.proto.UniqueId.getDefaultInstance() : parentTraceSegmentId_;
  }
  /**
   * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
   */
  public com.lyl.skywalking.proto.UniqueIdOrBuilder getParentTraceSegmentIdOrBuilder() {
    return getParentTraceSegmentId();
  }

  public static final int PARENTSPANID_FIELD_NUMBER = 3;
  private int parentSpanId_;
  /**
   * <code>optional int32 parentSpanId = 3;</code>
   */
  public int getParentSpanId() {
    return parentSpanId_;
  }

  public static final int PARENTAPPLICATIONINSTANCEID_FIELD_NUMBER = 4;
  private int parentApplicationInstanceId_;
  /**
   * <code>optional int32 parentApplicationInstanceId = 4;</code>
   */
  public int getParentApplicationInstanceId() {
    return parentApplicationInstanceId_;
  }

  public static final int NETWORKADDRESS_FIELD_NUMBER = 5;
  private volatile Object networkAddress_;
  /**
   * <code>optional string networkAddress = 5;</code>
   */
  public String getNetworkAddress() {
    Object ref = networkAddress_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      networkAddress_ = s;
      return s;
    }
  }
  /**
   * <code>optional string networkAddress = 5;</code>
   */
  public com.google.protobuf.ByteString
      getNetworkAddressBytes() {
    Object ref = networkAddress_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      networkAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NETWORKADDRESSID_FIELD_NUMBER = 6;
  private int networkAddressId_;
  /**
   * <code>optional int32 networkAddressId = 6;</code>
   */
  public int getNetworkAddressId() {
    return networkAddressId_;
  }

  public static final int ENTRYAPPLICATIONINSTANCEID_FIELD_NUMBER = 7;
  private int entryApplicationInstanceId_;
  /**
   * <code>optional int32 entryApplicationInstanceId = 7;</code>
   */
  public int getEntryApplicationInstanceId() {
    return entryApplicationInstanceId_;
  }

  public static final int ENTRYSERVICENAME_FIELD_NUMBER = 8;
  private volatile Object entryServiceName_;
  /**
   * <code>optional string entryServiceName = 8;</code>
   */
  public String getEntryServiceName() {
    Object ref = entryServiceName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      entryServiceName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string entryServiceName = 8;</code>
   */
  public com.google.protobuf.ByteString
      getEntryServiceNameBytes() {
    Object ref = entryServiceName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      entryServiceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTRYSERVICEID_FIELD_NUMBER = 9;
  private int entryServiceId_;
  /**
   * <code>optional int32 entryServiceId = 9;</code>
   */
  public int getEntryServiceId() {
    return entryServiceId_;
  }

  public static final int PARENTSERVICENAME_FIELD_NUMBER = 10;
  private volatile Object parentServiceName_;
  /**
   * <code>optional string parentServiceName = 10;</code>
   */
  public String getParentServiceName() {
    Object ref = parentServiceName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      parentServiceName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string parentServiceName = 10;</code>
   */
  public com.google.protobuf.ByteString
      getParentServiceNameBytes() {
    Object ref = parentServiceName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      parentServiceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENTSERVICEID_FIELD_NUMBER = 11;
  private int parentServiceId_;
  /**
   * <code>optional int32 parentServiceId = 11;</code>
   */
  public int getParentServiceId() {
    return parentServiceId_;
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
    if (refType_ != com.lyl.skywalking.proto.RefType.CrossProcess.getNumber()) {
      output.writeEnum(1, refType_);
    }
    if (parentTraceSegmentId_ != null) {
      output.writeMessage(2, getParentTraceSegmentId());
    }
    if (parentSpanId_ != 0) {
      output.writeInt32(3, parentSpanId_);
    }
    if (parentApplicationInstanceId_ != 0) {
      output.writeInt32(4, parentApplicationInstanceId_);
    }
    if (!getNetworkAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, networkAddress_);
    }
    if (networkAddressId_ != 0) {
      output.writeInt32(6, networkAddressId_);
    }
    if (entryApplicationInstanceId_ != 0) {
      output.writeInt32(7, entryApplicationInstanceId_);
    }
    if (!getEntryServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 8, entryServiceName_);
    }
    if (entryServiceId_ != 0) {
      output.writeInt32(9, entryServiceId_);
    }
    if (!getParentServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 10, parentServiceName_);
    }
    if (parentServiceId_ != 0) {
      output.writeInt32(11, parentServiceId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (refType_ != com.lyl.skywalking.proto.RefType.CrossProcess.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, refType_);
    }
    if (parentTraceSegmentId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParentTraceSegmentId());
    }
    if (parentSpanId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, parentSpanId_);
    }
    if (parentApplicationInstanceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, parentApplicationInstanceId_);
    }
    if (!getNetworkAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, networkAddress_);
    }
    if (networkAddressId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, networkAddressId_);
    }
    if (entryApplicationInstanceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, entryApplicationInstanceId_);
    }
    if (!getEntryServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(8, entryServiceName_);
    }
    if (entryServiceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, entryServiceId_);
    }
    if (!getParentServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(10, parentServiceName_);
    }
    if (parentServiceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, parentServiceId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.lyl.skywalking.proto.TraceSegmentReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.TraceSegmentReference parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.lyl.skywalking.proto.TraceSegmentReference prototype) {
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
   * Protobuf type {@code TraceSegmentReference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TraceSegmentReference)
      com.lyl.skywalking.proto.TraceSegmentReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_TraceSegmentReference_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_TraceSegmentReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lyl.skywalking.proto.TraceSegmentReference.class, com.lyl.skywalking.proto.TraceSegmentReference.Builder.class);
    }

    // Construct using com.lyl.skywalking.proto.TraceSegmentReference.newBuilder()
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
      refType_ = 0;

      if (parentTraceSegmentIdBuilder_ == null) {
        parentTraceSegmentId_ = null;
      } else {
        parentTraceSegmentId_ = null;
        parentTraceSegmentIdBuilder_ = null;
      }
      parentSpanId_ = 0;

      parentApplicationInstanceId_ = 0;

      networkAddress_ = "";

      networkAddressId_ = 0;

      entryApplicationInstanceId_ = 0;

      entryServiceName_ = "";

      entryServiceId_ = 0;

      parentServiceName_ = "";

      parentServiceId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lyl.skywalking.proto.TraceSegmentServiceOuterClass.internal_static_TraceSegmentReference_descriptor;
    }

    public com.lyl.skywalking.proto.TraceSegmentReference getDefaultInstanceForType() {
      return com.lyl.skywalking.proto.TraceSegmentReference.getDefaultInstance();
    }

    public com.lyl.skywalking.proto.TraceSegmentReference build() {
      com.lyl.skywalking.proto.TraceSegmentReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lyl.skywalking.proto.TraceSegmentReference buildPartial() {
      com.lyl.skywalking.proto.TraceSegmentReference result = new com.lyl.skywalking.proto.TraceSegmentReference(this);
      result.refType_ = refType_;
      if (parentTraceSegmentIdBuilder_ == null) {
        result.parentTraceSegmentId_ = parentTraceSegmentId_;
      } else {
        result.parentTraceSegmentId_ = parentTraceSegmentIdBuilder_.build();
      }
      result.parentSpanId_ = parentSpanId_;
      result.parentApplicationInstanceId_ = parentApplicationInstanceId_;
      result.networkAddress_ = networkAddress_;
      result.networkAddressId_ = networkAddressId_;
      result.entryApplicationInstanceId_ = entryApplicationInstanceId_;
      result.entryServiceName_ = entryServiceName_;
      result.entryServiceId_ = entryServiceId_;
      result.parentServiceName_ = parentServiceName_;
      result.parentServiceId_ = parentServiceId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lyl.skywalking.proto.TraceSegmentReference) {
        return mergeFrom((com.lyl.skywalking.proto.TraceSegmentReference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lyl.skywalking.proto.TraceSegmentReference other) {
      if (other == com.lyl.skywalking.proto.TraceSegmentReference.getDefaultInstance()) return this;
      if (other.refType_ != 0) {
        setRefTypeValue(other.getRefTypeValue());
      }
      if (other.hasParentTraceSegmentId()) {
        mergeParentTraceSegmentId(other.getParentTraceSegmentId());
      }
      if (other.getParentSpanId() != 0) {
        setParentSpanId(other.getParentSpanId());
      }
      if (other.getParentApplicationInstanceId() != 0) {
        setParentApplicationInstanceId(other.getParentApplicationInstanceId());
      }
      if (!other.getNetworkAddress().isEmpty()) {
        networkAddress_ = other.networkAddress_;
        onChanged();
      }
      if (other.getNetworkAddressId() != 0) {
        setNetworkAddressId(other.getNetworkAddressId());
      }
      if (other.getEntryApplicationInstanceId() != 0) {
        setEntryApplicationInstanceId(other.getEntryApplicationInstanceId());
      }
      if (!other.getEntryServiceName().isEmpty()) {
        entryServiceName_ = other.entryServiceName_;
        onChanged();
      }
      if (other.getEntryServiceId() != 0) {
        setEntryServiceId(other.getEntryServiceId());
      }
      if (!other.getParentServiceName().isEmpty()) {
        parentServiceName_ = other.parentServiceName_;
        onChanged();
      }
      if (other.getParentServiceId() != 0) {
        setParentServiceId(other.getParentServiceId());
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
      com.lyl.skywalking.proto.TraceSegmentReference parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lyl.skywalking.proto.TraceSegmentReference) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int refType_ = 0;
    /**
     * <code>optional .RefType refType = 1;</code>
     */
    public int getRefTypeValue() {
      return refType_;
    }
    /**
     * <code>optional .RefType refType = 1;</code>
     */
    public Builder setRefTypeValue(int value) {
      refType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .RefType refType = 1;</code>
     */
    public com.lyl.skywalking.proto.RefType getRefType() {
      com.lyl.skywalking.proto.RefType result = com.lyl.skywalking.proto.RefType.valueOf(refType_);
      return result == null ? com.lyl.skywalking.proto.RefType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .RefType refType = 1;</code>
     */
    public Builder setRefType(com.lyl.skywalking.proto.RefType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      refType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .RefType refType = 1;</code>
     */
    public Builder clearRefType() {

      refType_ = 0;
      onChanged();
      return this;
    }

    private com.lyl.skywalking.proto.UniqueId parentTraceSegmentId_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.lyl.skywalking.proto.UniqueId, com.lyl.skywalking.proto.UniqueId.Builder, com.lyl.skywalking.proto.UniqueIdOrBuilder> parentTraceSegmentIdBuilder_;
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    public boolean hasParentTraceSegmentId() {
      return parentTraceSegmentIdBuilder_ != null || parentTraceSegmentId_ != null;
    }
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    public com.lyl.skywalking.proto.UniqueId getParentTraceSegmentId() {
      if (parentTraceSegmentIdBuilder_ == null) {
        return parentTraceSegmentId_ == null ? com.lyl.skywalking.proto.UniqueId.getDefaultInstance() : parentTraceSegmentId_;
      } else {
        return parentTraceSegmentIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    public Builder setParentTraceSegmentId(com.lyl.skywalking.proto.UniqueId value) {
      if (parentTraceSegmentIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parentTraceSegmentId_ = value;
        onChanged();
      } else {
        parentTraceSegmentIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    public Builder setParentTraceSegmentId(
        com.lyl.skywalking.proto.UniqueId.Builder builderForValue) {
      if (parentTraceSegmentIdBuilder_ == null) {
        parentTraceSegmentId_ = builderForValue.build();
        onChanged();
      } else {
        parentTraceSegmentIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    public Builder mergeParentTraceSegmentId(com.lyl.skywalking.proto.UniqueId value) {
      if (parentTraceSegmentIdBuilder_ == null) {
        if (parentTraceSegmentId_ != null) {
          parentTraceSegmentId_ =
            com.lyl.skywalking.proto.UniqueId.newBuilder(parentTraceSegmentId_).mergeFrom(value).buildPartial();
        } else {
          parentTraceSegmentId_ = value;
        }
        onChanged();
      } else {
        parentTraceSegmentIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    public Builder clearParentTraceSegmentId() {
      if (parentTraceSegmentIdBuilder_ == null) {
        parentTraceSegmentId_ = null;
        onChanged();
      } else {
        parentTraceSegmentId_ = null;
        parentTraceSegmentIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    public com.lyl.skywalking.proto.UniqueId.Builder getParentTraceSegmentIdBuilder() {

      onChanged();
      return getParentTraceSegmentIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    public com.lyl.skywalking.proto.UniqueIdOrBuilder getParentTraceSegmentIdOrBuilder() {
      if (parentTraceSegmentIdBuilder_ != null) {
        return parentTraceSegmentIdBuilder_.getMessageOrBuilder();
      } else {
        return parentTraceSegmentId_ == null ?
            com.lyl.skywalking.proto.UniqueId.getDefaultInstance() : parentTraceSegmentId_;
      }
    }
    /**
     * <code>optional .UniqueId parentTraceSegmentId = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.lyl.skywalking.proto.UniqueId, com.lyl.skywalking.proto.UniqueId.Builder, com.lyl.skywalking.proto.UniqueIdOrBuilder>
        getParentTraceSegmentIdFieldBuilder() {
      if (parentTraceSegmentIdBuilder_ == null) {
        parentTraceSegmentIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.lyl.skywalking.proto.UniqueId, com.lyl.skywalking.proto.UniqueId.Builder, com.lyl.skywalking.proto.UniqueIdOrBuilder>(
                getParentTraceSegmentId(),
                getParentForChildren(),
                isClean());
        parentTraceSegmentId_ = null;
      }
      return parentTraceSegmentIdBuilder_;
    }

    private int parentSpanId_ ;
    /**
     * <code>optional int32 parentSpanId = 3;</code>
     */
    public int getParentSpanId() {
      return parentSpanId_;
    }
    /**
     * <code>optional int32 parentSpanId = 3;</code>
     */
    public Builder setParentSpanId(int value) {

      parentSpanId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 parentSpanId = 3;</code>
     */
    public Builder clearParentSpanId() {

      parentSpanId_ = 0;
      onChanged();
      return this;
    }

    private int parentApplicationInstanceId_ ;
    /**
     * <code>optional int32 parentApplicationInstanceId = 4;</code>
     */
    public int getParentApplicationInstanceId() {
      return parentApplicationInstanceId_;
    }
    /**
     * <code>optional int32 parentApplicationInstanceId = 4;</code>
     */
    public Builder setParentApplicationInstanceId(int value) {

      parentApplicationInstanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 parentApplicationInstanceId = 4;</code>
     */
    public Builder clearParentApplicationInstanceId() {

      parentApplicationInstanceId_ = 0;
      onChanged();
      return this;
    }

    private Object networkAddress_ = "";
    /**
     * <code>optional string networkAddress = 5;</code>
     */
    public String getNetworkAddress() {
      Object ref = networkAddress_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        networkAddress_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string networkAddress = 5;</code>
     */
    public com.google.protobuf.ByteString
        getNetworkAddressBytes() {
      Object ref = networkAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        networkAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string networkAddress = 5;</code>
     */
    public Builder setNetworkAddress(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      networkAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string networkAddress = 5;</code>
     */
    public Builder clearNetworkAddress() {

      networkAddress_ = getDefaultInstance().getNetworkAddress();
      onChanged();
      return this;
    }
    /**
     * <code>optional string networkAddress = 5;</code>
     */
    public Builder setNetworkAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      networkAddress_ = value;
      onChanged();
      return this;
    }

    private int networkAddressId_ ;
    /**
     * <code>optional int32 networkAddressId = 6;</code>
     */
    public int getNetworkAddressId() {
      return networkAddressId_;
    }
    /**
     * <code>optional int32 networkAddressId = 6;</code>
     */
    public Builder setNetworkAddressId(int value) {

      networkAddressId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 networkAddressId = 6;</code>
     */
    public Builder clearNetworkAddressId() {

      networkAddressId_ = 0;
      onChanged();
      return this;
    }

    private int entryApplicationInstanceId_ ;
    /**
     * <code>optional int32 entryApplicationInstanceId = 7;</code>
     */
    public int getEntryApplicationInstanceId() {
      return entryApplicationInstanceId_;
    }
    /**
     * <code>optional int32 entryApplicationInstanceId = 7;</code>
     */
    public Builder setEntryApplicationInstanceId(int value) {

      entryApplicationInstanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 entryApplicationInstanceId = 7;</code>
     */
    public Builder clearEntryApplicationInstanceId() {

      entryApplicationInstanceId_ = 0;
      onChanged();
      return this;
    }

    private Object entryServiceName_ = "";
    /**
     * <code>optional string entryServiceName = 8;</code>
     */
    public String getEntryServiceName() {
      Object ref = entryServiceName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        entryServiceName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string entryServiceName = 8;</code>
     */
    public com.google.protobuf.ByteString
        getEntryServiceNameBytes() {
      Object ref = entryServiceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        entryServiceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string entryServiceName = 8;</code>
     */
    public Builder setEntryServiceName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      entryServiceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string entryServiceName = 8;</code>
     */
    public Builder clearEntryServiceName() {

      entryServiceName_ = getDefaultInstance().getEntryServiceName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string entryServiceName = 8;</code>
     */
    public Builder setEntryServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      entryServiceName_ = value;
      onChanged();
      return this;
    }

    private int entryServiceId_ ;
    /**
     * <code>optional int32 entryServiceId = 9;</code>
     */
    public int getEntryServiceId() {
      return entryServiceId_;
    }
    /**
     * <code>optional int32 entryServiceId = 9;</code>
     */
    public Builder setEntryServiceId(int value) {

      entryServiceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 entryServiceId = 9;</code>
     */
    public Builder clearEntryServiceId() {

      entryServiceId_ = 0;
      onChanged();
      return this;
    }

    private Object parentServiceName_ = "";
    /**
     * <code>optional string parentServiceName = 10;</code>
     */
    public String getParentServiceName() {
      Object ref = parentServiceName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        parentServiceName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string parentServiceName = 10;</code>
     */
    public com.google.protobuf.ByteString
        getParentServiceNameBytes() {
      Object ref = parentServiceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        parentServiceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string parentServiceName = 10;</code>
     */
    public Builder setParentServiceName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      parentServiceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string parentServiceName = 10;</code>
     */
    public Builder clearParentServiceName() {

      parentServiceName_ = getDefaultInstance().getParentServiceName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string parentServiceName = 10;</code>
     */
    public Builder setParentServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      parentServiceName_ = value;
      onChanged();
      return this;
    }

    private int parentServiceId_ ;
    /**
     * <code>optional int32 parentServiceId = 11;</code>
     */
    public int getParentServiceId() {
      return parentServiceId_;
    }
    /**
     * <code>optional int32 parentServiceId = 11;</code>
     */
    public Builder setParentServiceId(int value) {

      parentServiceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 parentServiceId = 11;</code>
     */
    public Builder clearParentServiceId() {

      parentServiceId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:TraceSegmentReference)
  }

  // @@protoc_insertion_point(class_scope:TraceSegmentReference)
  private static final com.lyl.skywalking.proto.TraceSegmentReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lyl.skywalking.proto.TraceSegmentReference();
  }

  public static com.lyl.skywalking.proto.TraceSegmentReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TraceSegmentReference>
      PARSER = new com.google.protobuf.AbstractParser<TraceSegmentReference>() {
    public TraceSegmentReference parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new TraceSegmentReference(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<TraceSegmentReference> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<TraceSegmentReference> getParserForType() {
    return PARSER;
  }

  public com.lyl.skywalking.proto.TraceSegmentReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

