// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/gateway/gateway_api.proto

package com.trak.grpc.gateway.v1;

public final class GatewayApiProto {
  private GatewayApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_ChartMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_ChartMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_ChartContentMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_ChartContentMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_BrandMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_BrandMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_CategoryMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_CategoryMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_ProductMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_ProductMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_PageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_PageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_LatestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_LatestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_PromotionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_PromotionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_PromotionMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_PromotionMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_ProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_ProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_ProductStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_ProductStatsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_CategoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_CategoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_BrandResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_BrandResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_GetAllPromotionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_GetAllPromotionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trak_grpc_gateway_v1_AddProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trak_grpc_gateway_v1_AddProductRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037proto/gateway/gateway_api.proto\022\024trak." +
      "grpc.gateway.v1\"\007\n\005Empty\"Z\n\014ChartMessage" +
      "\022\016\n\006labels\030\001 \003(\t\022:\n\007content\030\002 \003(\0132).trak" +
      ".grpc.gateway.v1.ChartContentMessage\"\316\001\n" +
      "\023ChartContentMessage\022\r\n\005label\030\001 \001(\t\022\022\n\nf" +
      "ill_color\030\002 \001(\t\022\024\n\014stroke_color\030\003 \001(\t\022\023\n" +
      "\013point_color\030\004 \001(\t\022\032\n\022point_stroke_color" +
      "\030\005 \001(\t\022\034\n\024point_highlight_fill\030\006 \001(\t\022\036\n\026" +
      "point_highlight_stroke\030\007 \001(\t\022\017\n\007content\030" +
      "\010 \003(\r\"(\n\014BrandMessage\022\n\n\002id\030\001 \001(\r\022\014\n\004nam" +
      "e\030\002 \001(\t\"+\n\017CategoryMessage\022\n\n\002id\030\001 \001(\r\022\014" +
      "\n\004name\030\002 \001(\t\"\317\001\n\016ProductMessage\022\014\n\004name\030" +
      "\001 \001(\t\022\023\n\013product_url\030\002 \001(\t\022\r\n\005price\030\003 \001(" +
      "\t\022\021\n\timage_url\030\004 \001(\t\022\n\n\002id\030\005 \001(\r\0221\n\005bran" +
      "d\030\006 \001(\0132\".trak.grpc.gateway.v1.BrandMess" +
      "age\0229\n\ncategories\030\007 \003(\0132%.trak.grpc.gate" +
      "way.v1.CategoryMessage\"\232\001\n\014PageResponse\022" +
      "\033\n\023current_page_number\030\001 \001(\r\022\030\n\020last_pag" +
      "e_number\030\002 \001(\r\022\023\n\013total_items\030\003 \001(\r\022\021\n\tp" +
      "age_size\030\004 \001(\r\022\024\n\014is_last_page\030\005 \001(\010\022\025\n\r" +
      "is_first_page\030\006 \001(\010\"z\n\016LatestResponse\0226\n" +
      "\010products\030\001 \003(\0132$.trak.grpc.gateway.v1.P" +
      "roductMessage\0220\n\004page\030\002 \001(\0132\".trak.grpc." +
      "gateway.v1.PageResponse\"\301\001\n\021PromotionRes" +
      "ponse\0226\n\010products\030\001 \003(\0132$.trak.grpc.gate" +
      "way.v1.ProductMessage\0229\n\rpage_response\030\002" +
      " \001(\0132\".trak.grpc.gateway.v1.PageResponse" +
      "\0229\n\tpromotion\030\003 \001(\0132&.trak.grpc.gateway." +
      "v1.PromotionMessage\"^\n\020PromotionMessage\022" +
      "\n\n\002id\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\022\024\n\014promotion_i" +
      "d\030\003 \001(\r\022\r\n\005start\030\004 \001(\r\022\013\n\003end\030\005 \001(\r\"\203\001\n\017" +
      "ProductResponse\0225\n\007product\030\001 \001(\0132$.trak." +
      "grpc.gateway.v1.ProductMessage\0229\n\005stats\030" +
      "\002 \001(\0132*.trak.grpc.gateway.v1.ProductStat" +
      "sResponse\"\203\001\n\024ProductStatsResponse\022\021\n\tmi" +
      "n_price\030\001 \001(\r\022\021\n\tmax_price\030\002 \001(\r\022\022\n\nmean" +
      "_price\030\003 \001(\001\0221\n\005chart\030\004 \001(\0132\".trak.grpc." +
      "gateway.v1.ChartMessage\"m\n\020CategoryRespo" +
      "nse\022\023\n\013category_id\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\0226" +
      "\n\010products\030\003 \003(\0132$.trak.grpc.gateway.v1." +
      "ProductMessage\"g\n\rBrandResponse\022\020\n\010brand" +
      "_id\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\0226\n\010products\030\003 \003(" +
      "\0132$.trak.grpc.gateway.v1.ProductMessage\"" +
      "\221\001\n\030GetAllPromotionsResponse\022:\n\npromotio" +
      "ns\030\001 \003(\0132&.trak.grpc.gateway.v1.Promotio" +
      "nMessage\0229\n\rpage_response\030\002 \001(\0132\".trak.g" +
      "rpc.gateway.v1.PageResponse\" \n\021AddProduc" +
      "tRequest\022\013\n\003url\030\001 \001(\tBl\n\030com.trak.grpc.g" +
      "ateway.v1B\017GatewayApiProtoP\001Z\tgatewayv1\242" +
      "\002\003TGG\252\002\024Trak.Grpc.Gateway.V1\312\002\024Trak\\Grpc" +
      "\\Gateway\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_trak_grpc_gateway_v1_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_trak_grpc_gateway_v1_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_trak_grpc_gateway_v1_ChartMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_trak_grpc_gateway_v1_ChartMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_ChartMessage_descriptor,
        new java.lang.String[] { "Labels", "Content", });
    internal_static_trak_grpc_gateway_v1_ChartContentMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_trak_grpc_gateway_v1_ChartContentMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_ChartContentMessage_descriptor,
        new java.lang.String[] { "Label", "FillColor", "StrokeColor", "PointColor", "PointStrokeColor", "PointHighlightFill", "PointHighlightStroke", "Content", });
    internal_static_trak_grpc_gateway_v1_BrandMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_trak_grpc_gateway_v1_BrandMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_BrandMessage_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_trak_grpc_gateway_v1_CategoryMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_trak_grpc_gateway_v1_CategoryMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_CategoryMessage_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_trak_grpc_gateway_v1_ProductMessage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_trak_grpc_gateway_v1_ProductMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_ProductMessage_descriptor,
        new java.lang.String[] { "Name", "ProductUrl", "Price", "ImageUrl", "Id", "Brand", "Categories", });
    internal_static_trak_grpc_gateway_v1_PageResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_trak_grpc_gateway_v1_PageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_PageResponse_descriptor,
        new java.lang.String[] { "CurrentPageNumber", "LastPageNumber", "TotalItems", "PageSize", "IsLastPage", "IsFirstPage", });
    internal_static_trak_grpc_gateway_v1_LatestResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_trak_grpc_gateway_v1_LatestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_LatestResponse_descriptor,
        new java.lang.String[] { "Products", "Page", });
    internal_static_trak_grpc_gateway_v1_PromotionResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_trak_grpc_gateway_v1_PromotionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_PromotionResponse_descriptor,
        new java.lang.String[] { "Products", "PageResponse", "Promotion", });
    internal_static_trak_grpc_gateway_v1_PromotionMessage_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_trak_grpc_gateway_v1_PromotionMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_PromotionMessage_descriptor,
        new java.lang.String[] { "Id", "Name", "PromotionId", "Start", "End", });
    internal_static_trak_grpc_gateway_v1_ProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_trak_grpc_gateway_v1_ProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_ProductResponse_descriptor,
        new java.lang.String[] { "Product", "Stats", });
    internal_static_trak_grpc_gateway_v1_ProductStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_trak_grpc_gateway_v1_ProductStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_ProductStatsResponse_descriptor,
        new java.lang.String[] { "MinPrice", "MaxPrice", "MeanPrice", "Chart", });
    internal_static_trak_grpc_gateway_v1_CategoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_trak_grpc_gateway_v1_CategoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_CategoryResponse_descriptor,
        new java.lang.String[] { "CategoryId", "Name", "Products", });
    internal_static_trak_grpc_gateway_v1_BrandResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_trak_grpc_gateway_v1_BrandResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_BrandResponse_descriptor,
        new java.lang.String[] { "BrandId", "Name", "Products", });
    internal_static_trak_grpc_gateway_v1_GetAllPromotionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_trak_grpc_gateway_v1_GetAllPromotionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_GetAllPromotionsResponse_descriptor,
        new java.lang.String[] { "Promotions", "PageResponse", });
    internal_static_trak_grpc_gateway_v1_AddProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_trak_grpc_gateway_v1_AddProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trak_grpc_gateway_v1_AddProductRequest_descriptor,
        new java.lang.String[] { "Url", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
