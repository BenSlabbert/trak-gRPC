// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/gateway/gateway_api.proto

package com.trak.grpc.gateway.v1;

public interface ChartContentMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trak.grpc.gateway.v1.ChartContentMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string label = 1;</code>
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 1;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>string fill_color = 2;</code>
   */
  java.lang.String getFillColor();
  /**
   * <code>string fill_color = 2;</code>
   */
  com.google.protobuf.ByteString
      getFillColorBytes();

  /**
   * <code>string stroke_color = 3;</code>
   */
  java.lang.String getStrokeColor();
  /**
   * <code>string stroke_color = 3;</code>
   */
  com.google.protobuf.ByteString
      getStrokeColorBytes();

  /**
   * <code>string point_color = 4;</code>
   */
  java.lang.String getPointColor();
  /**
   * <code>string point_color = 4;</code>
   */
  com.google.protobuf.ByteString
      getPointColorBytes();

  /**
   * <code>string point_stroke_color = 5;</code>
   */
  java.lang.String getPointStrokeColor();
  /**
   * <code>string point_stroke_color = 5;</code>
   */
  com.google.protobuf.ByteString
      getPointStrokeColorBytes();

  /**
   * <code>string point_highlight_fill = 6;</code>
   */
  java.lang.String getPointHighlightFill();
  /**
   * <code>string point_highlight_fill = 6;</code>
   */
  com.google.protobuf.ByteString
      getPointHighlightFillBytes();

  /**
   * <code>string point_highlight_stroke = 7;</code>
   */
  java.lang.String getPointHighlightStroke();
  /**
   * <code>string point_highlight_stroke = 7;</code>
   */
  com.google.protobuf.ByteString
      getPointHighlightStrokeBytes();

  /**
   * <code>repeated uint32 content = 8;</code>
   */
  java.util.List<java.lang.Integer> getContentList();
  /**
   * <code>repeated uint32 content = 8;</code>
   */
  int getContentCount();
  /**
   * <code>repeated uint32 content = 8;</code>
   */
  int getContent(int index);
}
