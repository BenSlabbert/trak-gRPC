// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/gateway/gateway_api.proto

package com.trak.grpc.gateway.v1;

public interface PageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trak.grpc.gateway.v1.PageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 current_page_number = 1;</code>
   */
  int getCurrentPageNumber();

  /**
   * <code>uint32 last_page_number = 2;</code>
   */
  int getLastPageNumber();

  /**
   * <code>uint32 total_items = 3;</code>
   */
  int getTotalItems();

  /**
   * <code>uint32 page_size = 4;</code>
   */
  int getPageSize();

  /**
   * <code>bool is_last_page = 5;</code>
   */
  boolean getIsLastPage();

  /**
   * <code>bool is_first_page = 6;</code>
   */
  boolean getIsFirstPage();
}
