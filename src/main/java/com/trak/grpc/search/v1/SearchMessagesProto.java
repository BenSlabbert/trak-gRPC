// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/search/search_messages.proto

package com.trak.grpc.search.v1;

public final class SearchMessagesProto {
  private SearchMessagesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_search_v1_SearchResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_search_v1_SearchResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"proto/search/search_messages.proto\022\023tr" +
      "ak.grpc.search.v1\"7\n\014SearchResult\022\n\n\002id\030" +
      "\001 \001(\t\022\014\n\004text\030\002 \001(\t\022\r\n\005score\030\003 \001(\002Bl\n\027co" +
      "m.trak.grpc.search.v1B\023SearchMessagesPro" +
      "toP\001Z\010searchv1\242\002\003TGS\252\002\023Trak.Grpc.Search." +
      "V1\312\002\023Trak\\Grpc\\Search\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_trak_grpc_search_v1_SearchResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_trak_grpc_search_v1_SearchResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_search_v1_SearchResult_descriptor,
        new java.lang.String[] { "Id", "Text", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}