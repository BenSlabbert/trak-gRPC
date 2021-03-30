// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/gateway/gateway_api.proto

package com.trak.grpc.gateway.v1;

public interface ProductMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trak.grpc.gateway.v1.ProductMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string product_url = 2;</code>
   */
  java.lang.String getProductUrl();
  /**
   * <code>string product_url = 2;</code>
   */
  com.google.protobuf.ByteString
      getProductUrlBytes();

  /**
   * <code>string price = 3;</code>
   */
  java.lang.String getPrice();
  /**
   * <code>string price = 3;</code>
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <code>string image_url = 4;</code>
   */
  java.lang.String getImageUrl();
  /**
   * <code>string image_url = 4;</code>
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <code>uint32 id = 5;</code>
   */
  int getId();

  /**
   * <code>.trak.grpc.gateway.v1.BrandMessage brand = 6;</code>
   */
  boolean hasBrand();
  /**
   * <code>.trak.grpc.gateway.v1.BrandMessage brand = 6;</code>
   */
  com.trak.grpc.gateway.v1.BrandMessage getBrand();
  /**
   * <code>.trak.grpc.gateway.v1.BrandMessage brand = 6;</code>
   */
  com.trak.grpc.gateway.v1.BrandMessageOrBuilder getBrandOrBuilder();

  /**
   * <code>repeated .trak.grpc.gateway.v1.CategoryMessage categories = 7;</code>
   */
  java.util.List<com.trak.grpc.gateway.v1.CategoryMessage> 
      getCategoriesList();
  /**
   * <code>repeated .trak.grpc.gateway.v1.CategoryMessage categories = 7;</code>
   */
  com.trak.grpc.gateway.v1.CategoryMessage getCategories(int index);
  /**
   * <code>repeated .trak.grpc.gateway.v1.CategoryMessage categories = 7;</code>
   */
  int getCategoriesCount();
  /**
   * <code>repeated .trak.grpc.gateway.v1.CategoryMessage categories = 7;</code>
   */
  java.util.List<? extends com.trak.grpc.gateway.v1.CategoryMessageOrBuilder> 
      getCategoriesOrBuilderList();
  /**
   * <code>repeated .trak.grpc.gateway.v1.CategoryMessage categories = 7;</code>
   */
  com.trak.grpc.gateway.v1.CategoryMessageOrBuilder getCategoriesOrBuilder(
      int index);
}