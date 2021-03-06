// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/gateway/gateway_api.proto

package com.trak.grpc.gateway.v1;

/**
 * <pre>
 * Promotions response.
 * </pre>
 *
 * Protobuf type {@code trak.grpc.gateway.v1.PromotionResponse}
 */
public  final class PromotionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:trak.grpc.gateway.v1.PromotionResponse)
    PromotionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PromotionResponse.newBuilder() to construct.
  private PromotionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PromotionResponse() {
    products_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PromotionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PromotionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              products_ = new java.util.ArrayList<com.trak.grpc.gateway.v1.ProductMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            products_.add(
                input.readMessage(com.trak.grpc.gateway.v1.ProductMessage.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.trak.grpc.gateway.v1.PageResponse.Builder subBuilder = null;
            if (pageResponse_ != null) {
              subBuilder = pageResponse_.toBuilder();
            }
            pageResponse_ = input.readMessage(com.trak.grpc.gateway.v1.PageResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pageResponse_);
              pageResponse_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.trak.grpc.gateway.v1.PromotionMessage.Builder subBuilder = null;
            if (promotion_ != null) {
              subBuilder = promotion_.toBuilder();
            }
            promotion_ = input.readMessage(com.trak.grpc.gateway.v1.PromotionMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(promotion_);
              promotion_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        products_ = java.util.Collections.unmodifiableList(products_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.trak.grpc.gateway.v1.GatewayApiProto.internal_static_trak_grpc_gateway_v1_PromotionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.trak.grpc.gateway.v1.GatewayApiProto.internal_static_trak_grpc_gateway_v1_PromotionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.trak.grpc.gateway.v1.PromotionResponse.class, com.trak.grpc.gateway.v1.PromotionResponse.Builder.class);
  }

  public static final int PRODUCTS_FIELD_NUMBER = 1;
  private java.util.List<com.trak.grpc.gateway.v1.ProductMessage> products_;
  /**
   * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
   */
  public java.util.List<com.trak.grpc.gateway.v1.ProductMessage> getProductsList() {
    return products_;
  }
  /**
   * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
   */
  public java.util.List<? extends com.trak.grpc.gateway.v1.ProductMessageOrBuilder> 
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
   */
  public int getProductsCount() {
    return products_.size();
  }
  /**
   * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
   */
  public com.trak.grpc.gateway.v1.ProductMessage getProducts(int index) {
    return products_.get(index);
  }
  /**
   * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
   */
  public com.trak.grpc.gateway.v1.ProductMessageOrBuilder getProductsOrBuilder(
      int index) {
    return products_.get(index);
  }

  public static final int PAGE_RESPONSE_FIELD_NUMBER = 2;
  private com.trak.grpc.gateway.v1.PageResponse pageResponse_;
  /**
   * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
   */
  public boolean hasPageResponse() {
    return pageResponse_ != null;
  }
  /**
   * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
   */
  public com.trak.grpc.gateway.v1.PageResponse getPageResponse() {
    return pageResponse_ == null ? com.trak.grpc.gateway.v1.PageResponse.getDefaultInstance() : pageResponse_;
  }
  /**
   * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
   */
  public com.trak.grpc.gateway.v1.PageResponseOrBuilder getPageResponseOrBuilder() {
    return getPageResponse();
  }

  public static final int PROMOTION_FIELD_NUMBER = 3;
  private com.trak.grpc.gateway.v1.PromotionMessage promotion_;
  /**
   * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
   */
  public boolean hasPromotion() {
    return promotion_ != null;
  }
  /**
   * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
   */
  public com.trak.grpc.gateway.v1.PromotionMessage getPromotion() {
    return promotion_ == null ? com.trak.grpc.gateway.v1.PromotionMessage.getDefaultInstance() : promotion_;
  }
  /**
   * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
   */
  public com.trak.grpc.gateway.v1.PromotionMessageOrBuilder getPromotionOrBuilder() {
    return getPromotion();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(1, products_.get(i));
    }
    if (pageResponse_ != null) {
      output.writeMessage(2, getPageResponse());
    }
    if (promotion_ != null) {
      output.writeMessage(3, getPromotion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, products_.get(i));
    }
    if (pageResponse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPageResponse());
    }
    if (promotion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPromotion());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.trak.grpc.gateway.v1.PromotionResponse)) {
      return super.equals(obj);
    }
    com.trak.grpc.gateway.v1.PromotionResponse other = (com.trak.grpc.gateway.v1.PromotionResponse) obj;

    if (!getProductsList()
        .equals(other.getProductsList())) return false;
    if (hasPageResponse() != other.hasPageResponse()) return false;
    if (hasPageResponse()) {
      if (!getPageResponse()
          .equals(other.getPageResponse())) return false;
    }
    if (hasPromotion() != other.hasPromotion()) return false;
    if (hasPromotion()) {
      if (!getPromotion()
          .equals(other.getPromotion())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    if (hasPageResponse()) {
      hash = (37 * hash) + PAGE_RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getPageResponse().hashCode();
    }
    if (hasPromotion()) {
      hash = (37 * hash) + PROMOTION_FIELD_NUMBER;
      hash = (53 * hash) + getPromotion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.trak.grpc.gateway.v1.PromotionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.trak.grpc.gateway.v1.PromotionResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Promotions response.
   * </pre>
   *
   * Protobuf type {@code trak.grpc.gateway.v1.PromotionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:trak.grpc.gateway.v1.PromotionResponse)
      com.trak.grpc.gateway.v1.PromotionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.trak.grpc.gateway.v1.GatewayApiProto.internal_static_trak_grpc_gateway_v1_PromotionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.trak.grpc.gateway.v1.GatewayApiProto.internal_static_trak_grpc_gateway_v1_PromotionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.trak.grpc.gateway.v1.PromotionResponse.class, com.trak.grpc.gateway.v1.PromotionResponse.Builder.class);
    }

    // Construct using com.trak.grpc.gateway.v1.PromotionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProductsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productsBuilder_.clear();
      }
      if (pageResponseBuilder_ == null) {
        pageResponse_ = null;
      } else {
        pageResponse_ = null;
        pageResponseBuilder_ = null;
      }
      if (promotionBuilder_ == null) {
        promotion_ = null;
      } else {
        promotion_ = null;
        promotionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.trak.grpc.gateway.v1.GatewayApiProto.internal_static_trak_grpc_gateway_v1_PromotionResponse_descriptor;
    }

    @java.lang.Override
    public com.trak.grpc.gateway.v1.PromotionResponse getDefaultInstanceForType() {
      return com.trak.grpc.gateway.v1.PromotionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.trak.grpc.gateway.v1.PromotionResponse build() {
      com.trak.grpc.gateway.v1.PromotionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.trak.grpc.gateway.v1.PromotionResponse buildPartial() {
      com.trak.grpc.gateway.v1.PromotionResponse result = new com.trak.grpc.gateway.v1.PromotionResponse(this);
      int from_bitField0_ = bitField0_;
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
      }
      if (pageResponseBuilder_ == null) {
        result.pageResponse_ = pageResponse_;
      } else {
        result.pageResponse_ = pageResponseBuilder_.build();
      }
      if (promotionBuilder_ == null) {
        result.promotion_ = promotion_;
      } else {
        result.promotion_ = promotionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.trak.grpc.gateway.v1.PromotionResponse) {
        return mergeFrom((com.trak.grpc.gateway.v1.PromotionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.trak.grpc.gateway.v1.PromotionResponse other) {
      if (other == com.trak.grpc.gateway.v1.PromotionResponse.getDefaultInstance()) return this;
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductsFieldBuilder() : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
          }
        }
      }
      if (other.hasPageResponse()) {
        mergePageResponse(other.getPageResponse());
      }
      if (other.hasPromotion()) {
        mergePromotion(other.getPromotion());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.trak.grpc.gateway.v1.PromotionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.trak.grpc.gateway.v1.PromotionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.trak.grpc.gateway.v1.ProductMessage> products_ =
      java.util.Collections.emptyList();
    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        products_ = new java.util.ArrayList<com.trak.grpc.gateway.v1.ProductMessage>(products_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.trak.grpc.gateway.v1.ProductMessage, com.trak.grpc.gateway.v1.ProductMessage.Builder, com.trak.grpc.gateway.v1.ProductMessageOrBuilder> productsBuilder_;

    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public java.util.List<com.trak.grpc.gateway.v1.ProductMessage> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public com.trak.grpc.gateway.v1.ProductMessage getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder setProducts(
        int index, com.trak.grpc.gateway.v1.ProductMessage value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder setProducts(
        int index, com.trak.grpc.gateway.v1.ProductMessage.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder addProducts(com.trak.grpc.gateway.v1.ProductMessage value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder addProducts(
        int index, com.trak.grpc.gateway.v1.ProductMessage value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder addProducts(
        com.trak.grpc.gateway.v1.ProductMessage.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder addProducts(
        int index, com.trak.grpc.gateway.v1.ProductMessage.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder addAllProducts(
        java.lang.Iterable<? extends com.trak.grpc.gateway.v1.ProductMessage> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public com.trak.grpc.gateway.v1.ProductMessage.Builder getProductsBuilder(
        int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public com.trak.grpc.gateway.v1.ProductMessageOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);  } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public java.util.List<? extends com.trak.grpc.gateway.v1.ProductMessageOrBuilder> 
         getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public com.trak.grpc.gateway.v1.ProductMessage.Builder addProductsBuilder() {
      return getProductsFieldBuilder().addBuilder(
          com.trak.grpc.gateway.v1.ProductMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public com.trak.grpc.gateway.v1.ProductMessage.Builder addProductsBuilder(
        int index) {
      return getProductsFieldBuilder().addBuilder(
          index, com.trak.grpc.gateway.v1.ProductMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .trak.grpc.gateway.v1.ProductMessage products = 1;</code>
     */
    public java.util.List<com.trak.grpc.gateway.v1.ProductMessage.Builder> 
         getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.trak.grpc.gateway.v1.ProductMessage, com.trak.grpc.gateway.v1.ProductMessage.Builder, com.trak.grpc.gateway.v1.ProductMessageOrBuilder> 
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.trak.grpc.gateway.v1.ProductMessage, com.trak.grpc.gateway.v1.ProductMessage.Builder, com.trak.grpc.gateway.v1.ProductMessageOrBuilder>(
                products_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        products_ = null;
      }
      return productsBuilder_;
    }

    private com.trak.grpc.gateway.v1.PageResponse pageResponse_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.trak.grpc.gateway.v1.PageResponse, com.trak.grpc.gateway.v1.PageResponse.Builder, com.trak.grpc.gateway.v1.PageResponseOrBuilder> pageResponseBuilder_;
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    public boolean hasPageResponse() {
      return pageResponseBuilder_ != null || pageResponse_ != null;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    public com.trak.grpc.gateway.v1.PageResponse getPageResponse() {
      if (pageResponseBuilder_ == null) {
        return pageResponse_ == null ? com.trak.grpc.gateway.v1.PageResponse.getDefaultInstance() : pageResponse_;
      } else {
        return pageResponseBuilder_.getMessage();
      }
    }
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    public Builder setPageResponse(com.trak.grpc.gateway.v1.PageResponse value) {
      if (pageResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pageResponse_ = value;
        onChanged();
      } else {
        pageResponseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    public Builder setPageResponse(
        com.trak.grpc.gateway.v1.PageResponse.Builder builderForValue) {
      if (pageResponseBuilder_ == null) {
        pageResponse_ = builderForValue.build();
        onChanged();
      } else {
        pageResponseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    public Builder mergePageResponse(com.trak.grpc.gateway.v1.PageResponse value) {
      if (pageResponseBuilder_ == null) {
        if (pageResponse_ != null) {
          pageResponse_ =
            com.trak.grpc.gateway.v1.PageResponse.newBuilder(pageResponse_).mergeFrom(value).buildPartial();
        } else {
          pageResponse_ = value;
        }
        onChanged();
      } else {
        pageResponseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    public Builder clearPageResponse() {
      if (pageResponseBuilder_ == null) {
        pageResponse_ = null;
        onChanged();
      } else {
        pageResponse_ = null;
        pageResponseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    public com.trak.grpc.gateway.v1.PageResponse.Builder getPageResponseBuilder() {
      
      onChanged();
      return getPageResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    public com.trak.grpc.gateway.v1.PageResponseOrBuilder getPageResponseOrBuilder() {
      if (pageResponseBuilder_ != null) {
        return pageResponseBuilder_.getMessageOrBuilder();
      } else {
        return pageResponse_ == null ?
            com.trak.grpc.gateway.v1.PageResponse.getDefaultInstance() : pageResponse_;
      }
    }
    /**
     * <code>.trak.grpc.gateway.v1.PageResponse page_response = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.trak.grpc.gateway.v1.PageResponse, com.trak.grpc.gateway.v1.PageResponse.Builder, com.trak.grpc.gateway.v1.PageResponseOrBuilder> 
        getPageResponseFieldBuilder() {
      if (pageResponseBuilder_ == null) {
        pageResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.trak.grpc.gateway.v1.PageResponse, com.trak.grpc.gateway.v1.PageResponse.Builder, com.trak.grpc.gateway.v1.PageResponseOrBuilder>(
                getPageResponse(),
                getParentForChildren(),
                isClean());
        pageResponse_ = null;
      }
      return pageResponseBuilder_;
    }

    private com.trak.grpc.gateway.v1.PromotionMessage promotion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.trak.grpc.gateway.v1.PromotionMessage, com.trak.grpc.gateway.v1.PromotionMessage.Builder, com.trak.grpc.gateway.v1.PromotionMessageOrBuilder> promotionBuilder_;
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    public boolean hasPromotion() {
      return promotionBuilder_ != null || promotion_ != null;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    public com.trak.grpc.gateway.v1.PromotionMessage getPromotion() {
      if (promotionBuilder_ == null) {
        return promotion_ == null ? com.trak.grpc.gateway.v1.PromotionMessage.getDefaultInstance() : promotion_;
      } else {
        return promotionBuilder_.getMessage();
      }
    }
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    public Builder setPromotion(com.trak.grpc.gateway.v1.PromotionMessage value) {
      if (promotionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        promotion_ = value;
        onChanged();
      } else {
        promotionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    public Builder setPromotion(
        com.trak.grpc.gateway.v1.PromotionMessage.Builder builderForValue) {
      if (promotionBuilder_ == null) {
        promotion_ = builderForValue.build();
        onChanged();
      } else {
        promotionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    public Builder mergePromotion(com.trak.grpc.gateway.v1.PromotionMessage value) {
      if (promotionBuilder_ == null) {
        if (promotion_ != null) {
          promotion_ =
            com.trak.grpc.gateway.v1.PromotionMessage.newBuilder(promotion_).mergeFrom(value).buildPartial();
        } else {
          promotion_ = value;
        }
        onChanged();
      } else {
        promotionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    public Builder clearPromotion() {
      if (promotionBuilder_ == null) {
        promotion_ = null;
        onChanged();
      } else {
        promotion_ = null;
        promotionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    public com.trak.grpc.gateway.v1.PromotionMessage.Builder getPromotionBuilder() {
      
      onChanged();
      return getPromotionFieldBuilder().getBuilder();
    }
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    public com.trak.grpc.gateway.v1.PromotionMessageOrBuilder getPromotionOrBuilder() {
      if (promotionBuilder_ != null) {
        return promotionBuilder_.getMessageOrBuilder();
      } else {
        return promotion_ == null ?
            com.trak.grpc.gateway.v1.PromotionMessage.getDefaultInstance() : promotion_;
      }
    }
    /**
     * <code>.trak.grpc.gateway.v1.PromotionMessage promotion = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.trak.grpc.gateway.v1.PromotionMessage, com.trak.grpc.gateway.v1.PromotionMessage.Builder, com.trak.grpc.gateway.v1.PromotionMessageOrBuilder> 
        getPromotionFieldBuilder() {
      if (promotionBuilder_ == null) {
        promotionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.trak.grpc.gateway.v1.PromotionMessage, com.trak.grpc.gateway.v1.PromotionMessage.Builder, com.trak.grpc.gateway.v1.PromotionMessageOrBuilder>(
                getPromotion(),
                getParentForChildren(),
                isClean());
        promotion_ = null;
      }
      return promotionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:trak.grpc.gateway.v1.PromotionResponse)
  }

  // @@protoc_insertion_point(class_scope:trak.grpc.gateway.v1.PromotionResponse)
  private static final com.trak.grpc.gateway.v1.PromotionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.trak.grpc.gateway.v1.PromotionResponse();
  }

  public static com.trak.grpc.gateway.v1.PromotionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PromotionResponse>
      PARSER = new com.google.protobuf.AbstractParser<PromotionResponse>() {
    @java.lang.Override
    public PromotionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PromotionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PromotionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PromotionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.trak.grpc.gateway.v1.PromotionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

