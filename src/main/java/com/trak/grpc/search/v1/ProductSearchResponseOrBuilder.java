// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/search/search_api.proto

package com.trak.grpc.search.v1;

public interface ProductSearchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trak.grpc.search.v1.ProductSearchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .trak.grpc.search.v1.SearchResult results = 1;</code>
   */
  java.util.List<com.trak.grpc.search.v1.SearchResult> 
      getResultsList();
  /**
   * <code>repeated .trak.grpc.search.v1.SearchResult results = 1;</code>
   */
  com.trak.grpc.search.v1.SearchResult getResults(int index);
  /**
   * <code>repeated .trak.grpc.search.v1.SearchResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .trak.grpc.search.v1.SearchResult results = 1;</code>
   */
  java.util.List<? extends com.trak.grpc.search.v1.SearchResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .trak.grpc.search.v1.SearchResult results = 1;</code>
   */
  com.trak.grpc.search.v1.SearchResultOrBuilder getResultsOrBuilder(
      int index);
}
