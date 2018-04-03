// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DiscoveryService.proto

package com.lyl.skywalking.proto;

/**
 * Protobuf type {@code ServiceNameMappingCollection}
 */
public  final class ServiceNameMappingCollection extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ServiceNameMappingCollection)
    ServiceNameMappingCollectionOrBuilder {
  // Use ServiceNameMappingCollection.newBuilder() to construct.
  private ServiceNameMappingCollection(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ServiceNameMappingCollection() {
    elements_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ServiceNameMappingCollection(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              elements_ = new java.util.ArrayList<com.lyl.skywalking.proto.ServiceNameMappingElement>();
              mutable_bitField0_ |= 0x00000001;
            }
            elements_.add(input.readMessage(com.lyl.skywalking.proto.ServiceNameMappingElement.parser(), extensionRegistry));
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
        elements_ = java.util.Collections.unmodifiableList(elements_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lyl.skywalking.proto.DiscoveryService.internal_static_ServiceNameMappingCollection_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lyl.skywalking.proto.DiscoveryService.internal_static_ServiceNameMappingCollection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lyl.skywalking.proto.ServiceNameMappingCollection.class, com.lyl.skywalking.proto.ServiceNameMappingCollection.Builder.class);
  }

  public static final int ELEMENTS_FIELD_NUMBER = 1;
  private java.util.List<com.lyl.skywalking.proto.ServiceNameMappingElement> elements_;
  /**
   * <code>repeated .ServiceNameMappingElement elements = 1;</code>
   */
  public java.util.List<com.lyl.skywalking.proto.ServiceNameMappingElement> getElementsList() {
    return elements_;
  }
  /**
   * <code>repeated .ServiceNameMappingElement elements = 1;</code>
   */
  public java.util.List<? extends com.lyl.skywalking.proto.ServiceNameMappingElementOrBuilder>
      getElementsOrBuilderList() {
    return elements_;
  }
  /**
   * <code>repeated .ServiceNameMappingElement elements = 1;</code>
   */
  public int getElementsCount() {
    return elements_.size();
  }
  /**
   * <code>repeated .ServiceNameMappingElement elements = 1;</code>
   */
  public com.lyl.skywalking.proto.ServiceNameMappingElement getElements(int index) {
    return elements_.get(index);
  }
  /**
   * <code>repeated .ServiceNameMappingElement elements = 1;</code>
   */
  public com.lyl.skywalking.proto.ServiceNameMappingElementOrBuilder getElementsOrBuilder(
      int index) {
    return elements_.get(index);
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
    for (int i = 0; i < elements_.size(); i++) {
      output.writeMessage(1, elements_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < elements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, elements_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.lyl.skywalking.proto.ServiceNameMappingCollection parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.lyl.skywalking.proto.ServiceNameMappingCollection prototype) {
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
   * Protobuf type {@code ServiceNameMappingCollection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceNameMappingCollection)
      com.lyl.skywalking.proto.ServiceNameMappingCollectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lyl.skywalking.proto.DiscoveryService.internal_static_ServiceNameMappingCollection_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lyl.skywalking.proto.DiscoveryService.internal_static_ServiceNameMappingCollection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lyl.skywalking.proto.ServiceNameMappingCollection.class, com.lyl.skywalking.proto.ServiceNameMappingCollection.Builder.class);
    }

    // Construct using com.lyl.skywalking.proto.ServiceNameMappingCollection.newBuilder()
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
        getElementsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (elementsBuilder_ == null) {
        elements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        elementsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lyl.skywalking.proto.DiscoveryService.internal_static_ServiceNameMappingCollection_descriptor;
    }

    public com.lyl.skywalking.proto.ServiceNameMappingCollection getDefaultInstanceForType() {
      return com.lyl.skywalking.proto.ServiceNameMappingCollection.getDefaultInstance();
    }

    public com.lyl.skywalking.proto.ServiceNameMappingCollection build() {
      com.lyl.skywalking.proto.ServiceNameMappingCollection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lyl.skywalking.proto.ServiceNameMappingCollection buildPartial() {
      com.lyl.skywalking.proto.ServiceNameMappingCollection result = new com.lyl.skywalking.proto.ServiceNameMappingCollection(this);
      int from_bitField0_ = bitField0_;
      if (elementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          elements_ = java.util.Collections.unmodifiableList(elements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.elements_ = elements_;
      } else {
        result.elements_ = elementsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lyl.skywalking.proto.ServiceNameMappingCollection) {
        return mergeFrom((com.lyl.skywalking.proto.ServiceNameMappingCollection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lyl.skywalking.proto.ServiceNameMappingCollection other) {
      if (other == com.lyl.skywalking.proto.ServiceNameMappingCollection.getDefaultInstance()) return this;
      if (elementsBuilder_ == null) {
        if (!other.elements_.isEmpty()) {
          if (elements_.isEmpty()) {
            elements_ = other.elements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureElementsIsMutable();
            elements_.addAll(other.elements_);
          }
          onChanged();
        }
      } else {
        if (!other.elements_.isEmpty()) {
          if (elementsBuilder_.isEmpty()) {
            elementsBuilder_.dispose();
            elementsBuilder_ = null;
            elements_ = other.elements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            elementsBuilder_ =
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getElementsFieldBuilder() : null;
          } else {
            elementsBuilder_.addAllMessages(other.elements_);
          }
        }
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
      com.lyl.skywalking.proto.ServiceNameMappingCollection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lyl.skywalking.proto.ServiceNameMappingCollection) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.lyl.skywalking.proto.ServiceNameMappingElement> elements_ =
      java.util.Collections.emptyList();
    private void ensureElementsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        elements_ = new java.util.ArrayList<com.lyl.skywalking.proto.ServiceNameMappingElement>(elements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.lyl.skywalking.proto.ServiceNameMappingElement, com.lyl.skywalking.proto.ServiceNameMappingElement.Builder, com.lyl.skywalking.proto.ServiceNameMappingElementOrBuilder> elementsBuilder_;

    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public java.util.List<com.lyl.skywalking.proto.ServiceNameMappingElement> getElementsList() {
      if (elementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(elements_);
      } else {
        return elementsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public int getElementsCount() {
      if (elementsBuilder_ == null) {
        return elements_.size();
      } else {
        return elementsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public com.lyl.skywalking.proto.ServiceNameMappingElement getElements(int index) {
      if (elementsBuilder_ == null) {
        return elements_.get(index);
      } else {
        return elementsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder setElements(
        int index, com.lyl.skywalking.proto.ServiceNameMappingElement value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.set(index, value);
        onChanged();
      } else {
        elementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder setElements(
        int index, com.lyl.skywalking.proto.ServiceNameMappingElement.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.set(index, builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder addElements(com.lyl.skywalking.proto.ServiceNameMappingElement value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.add(value);
        onChanged();
      } else {
        elementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder addElements(
        int index, com.lyl.skywalking.proto.ServiceNameMappingElement value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.add(index, value);
        onChanged();
      } else {
        elementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder addElements(
        com.lyl.skywalking.proto.ServiceNameMappingElement.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.add(builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder addElements(
        int index, com.lyl.skywalking.proto.ServiceNameMappingElement.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.add(index, builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder addAllElements(
        Iterable<? extends com.lyl.skywalking.proto.ServiceNameMappingElement> values) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, elements_);
        onChanged();
      } else {
        elementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder clearElements() {
      if (elementsBuilder_ == null) {
        elements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        elementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public Builder removeElements(int index) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.remove(index);
        onChanged();
      } else {
        elementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public com.lyl.skywalking.proto.ServiceNameMappingElement.Builder getElementsBuilder(
        int index) {
      return getElementsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public com.lyl.skywalking.proto.ServiceNameMappingElementOrBuilder getElementsOrBuilder(
        int index) {
      if (elementsBuilder_ == null) {
        return elements_.get(index);  } else {
        return elementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public java.util.List<? extends com.lyl.skywalking.proto.ServiceNameMappingElementOrBuilder>
         getElementsOrBuilderList() {
      if (elementsBuilder_ != null) {
        return elementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(elements_);
      }
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public com.lyl.skywalking.proto.ServiceNameMappingElement.Builder addElementsBuilder() {
      return getElementsFieldBuilder().addBuilder(
          com.lyl.skywalking.proto.ServiceNameMappingElement.getDefaultInstance());
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public com.lyl.skywalking.proto.ServiceNameMappingElement.Builder addElementsBuilder(
        int index) {
      return getElementsFieldBuilder().addBuilder(
          index, com.lyl.skywalking.proto.ServiceNameMappingElement.getDefaultInstance());
    }
    /**
     * <code>repeated .ServiceNameMappingElement elements = 1;</code>
     */
    public java.util.List<com.lyl.skywalking.proto.ServiceNameMappingElement.Builder>
         getElementsBuilderList() {
      return getElementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.lyl.skywalking.proto.ServiceNameMappingElement, com.lyl.skywalking.proto.ServiceNameMappingElement.Builder, com.lyl.skywalking.proto.ServiceNameMappingElementOrBuilder>
        getElementsFieldBuilder() {
      if (elementsBuilder_ == null) {
        elementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.lyl.skywalking.proto.ServiceNameMappingElement, com.lyl.skywalking.proto.ServiceNameMappingElement.Builder, com.lyl.skywalking.proto.ServiceNameMappingElementOrBuilder>(
                elements_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        elements_ = null;
      }
      return elementsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ServiceNameMappingCollection)
  }

  // @@protoc_insertion_point(class_scope:ServiceNameMappingCollection)
  private static final com.lyl.skywalking.proto.ServiceNameMappingCollection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lyl.skywalking.proto.ServiceNameMappingCollection();
  }

  public static com.lyl.skywalking.proto.ServiceNameMappingCollection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceNameMappingCollection>
      PARSER = new com.google.protobuf.AbstractParser<ServiceNameMappingCollection>() {
    public ServiceNameMappingCollection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ServiceNameMappingCollection(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<ServiceNameMappingCollection> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ServiceNameMappingCollection> getParserForType() {
    return PARSER;
  }

  public com.lyl.skywalking.proto.ServiceNameMappingCollection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
