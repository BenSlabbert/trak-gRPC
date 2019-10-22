// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var src_main_proto_proto_pb = require('../../../src/main/proto/proto_pb.js');

function serialize_io_github_benslabbert_trak_grpc_AddProductRequest(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.AddProductRequest)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.AddProductRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_AddProductRequest(buffer_arg) {
  return src_main_proto_proto_pb.AddProductRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_AddProductResponse(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.AddProductResponse)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.AddProductResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_AddProductResponse(buffer_arg) {
  return src_main_proto_proto_pb.AddProductResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_BrandRequest(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.BrandRequest)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.BrandRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_BrandRequest(buffer_arg) {
  return src_main_proto_proto_pb.BrandRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_BrandResponse(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.BrandResponse)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.BrandResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_BrandResponse(buffer_arg) {
  return src_main_proto_proto_pb.BrandResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_CategoryRequest(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.CategoryRequest)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.CategoryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_CategoryRequest(buffer_arg) {
  return src_main_proto_proto_pb.CategoryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_Empty(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.Empty)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_Empty(buffer_arg) {
  return src_main_proto_proto_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_GetAllPromotionsRequest(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.GetAllPromotionsRequest)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.GetAllPromotionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_GetAllPromotionsRequest(buffer_arg) {
  return src_main_proto_proto_pb.GetAllPromotionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_GetAllPromotionsResponse(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.GetAllPromotionsResponse)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.GetAllPromotionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_GetAllPromotionsResponse(buffer_arg) {
  return src_main_proto_proto_pb.GetAllPromotionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_IngestRequest(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.IngestRequest)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.IngestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_IngestRequest(buffer_arg) {
  return src_main_proto_proto_pb.IngestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_LatestResponse(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.LatestResponse)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.LatestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_LatestResponse(buffer_arg) {
  return src_main_proto_proto_pb.LatestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_ProductRequest(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.ProductRequest)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.ProductRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_ProductRequest(buffer_arg) {
  return src_main_proto_proto_pb.ProductRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_ProductResponse(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.ProductResponse)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.ProductResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_ProductResponse(buffer_arg) {
  return src_main_proto_proto_pb.ProductResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_PromotionRequest(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.PromotionRequest)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.PromotionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_PromotionRequest(buffer_arg) {
  return src_main_proto_proto_pb.PromotionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_PromotionResponse(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.PromotionResponse)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.PromotionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_PromotionResponse(buffer_arg) {
  return src_main_proto_proto_pb.PromotionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_SearchRequest(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.SearchRequest)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.SearchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_SearchRequest(buffer_arg) {
  return src_main_proto_proto_pb.SearchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_SearchResponse(arg) {
  if (!(arg instanceof src_main_proto_proto_pb.SearchResponse)) {
    throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.SearchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_SearchResponse(buffer_arg) {
  return src_main_proto_proto_pb.SearchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var SearchServiceService = exports.SearchServiceService = {
  brandSearch: {
    path: '/io.github.benslabbert.trak.grpc.SearchService/brandSearch',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.SearchRequest,
    responseType: src_main_proto_proto_pb.SearchResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_SearchRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_SearchResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchResponse,
  },
  brandIngest: {
    path: '/io.github.benslabbert.trak.grpc.SearchService/brandIngest',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.IngestRequest,
    responseType: src_main_proto_proto_pb.Empty,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_IngestRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_IngestRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_Empty,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_Empty,
  },
  productSearch: {
    path: '/io.github.benslabbert.trak.grpc.SearchService/productSearch',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.SearchRequest,
    responseType: src_main_proto_proto_pb.SearchResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_SearchRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_SearchResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchResponse,
  },
  productIngest: {
    path: '/io.github.benslabbert.trak.grpc.SearchService/productIngest',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.IngestRequest,
    responseType: src_main_proto_proto_pb.Empty,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_IngestRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_IngestRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_Empty,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_Empty,
  },
  categorySearch: {
    path: '/io.github.benslabbert.trak.grpc.SearchService/categorySearch',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.SearchRequest,
    responseType: src_main_proto_proto_pb.SearchResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_SearchRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_SearchResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchResponse,
  },
  categoryIngest: {
    path: '/io.github.benslabbert.trak.grpc.SearchService/categoryIngest',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.IngestRequest,
    responseType: src_main_proto_proto_pb.Empty,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_IngestRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_IngestRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_Empty,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_Empty,
  },
};

exports.SearchServiceClient = grpc.makeGenericClientConstructor(SearchServiceService);
var LatestServiceService = exports.LatestServiceService = {
  latest: {
    path: '/io.github.benslabbert.trak.grpc.LatestService/latest',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.Empty,
    responseType: src_main_proto_proto_pb.LatestResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_Empty,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_Empty,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_LatestResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_LatestResponse,
  },
};

exports.LatestServiceClient = grpc.makeGenericClientConstructor(LatestServiceService);
var PromotionServiceService = exports.PromotionServiceService = {
  getPromotion: {
    path: '/io.github.benslabbert.trak.grpc.PromotionService/getPromotion',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.PromotionRequest,
    responseType: src_main_proto_proto_pb.PromotionResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_PromotionRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_PromotionRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_PromotionResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_PromotionResponse,
  },
  getAllPromotions: {
    path: '/io.github.benslabbert.trak.grpc.PromotionService/getAllPromotions',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.GetAllPromotionsRequest,
    responseType: src_main_proto_proto_pb.GetAllPromotionsResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_GetAllPromotionsRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_GetAllPromotionsRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_GetAllPromotionsResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_GetAllPromotionsResponse,
  },
};

exports.PromotionServiceClient = grpc.makeGenericClientConstructor(PromotionServiceService);
var ProductServiceService = exports.ProductServiceService = {
  product: {
    path: '/io.github.benslabbert.trak.grpc.ProductService/product',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.ProductRequest,
    responseType: src_main_proto_proto_pb.ProductResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_ProductRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_ProductRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_ProductResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_ProductResponse,
  },
  addProduct: {
    path: '/io.github.benslabbert.trak.grpc.ProductService/addProduct',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.AddProductRequest,
    responseType: src_main_proto_proto_pb.AddProductResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_AddProductRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_AddProductRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_AddProductResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_AddProductResponse,
  },
};

exports.ProductServiceClient = grpc.makeGenericClientConstructor(ProductServiceService);
var BrandServiceService = exports.BrandServiceService = {
  brand: {
    path: '/io.github.benslabbert.trak.grpc.BrandService/brand',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.BrandRequest,
    responseType: src_main_proto_proto_pb.BrandResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_BrandRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_BrandRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_BrandResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_BrandResponse,
  },
};

exports.BrandServiceClient = grpc.makeGenericClientConstructor(BrandServiceService);
var CategoryServiceService = exports.CategoryServiceService = {
  category: {
    path: '/io.github.benslabbert.trak.grpc.CategoryService/category',
    requestStream: false,
    responseStream: false,
    requestType: src_main_proto_proto_pb.CategoryRequest,
    responseType: src_main_proto_proto_pb.BrandResponse,
    requestSerialize: serialize_io_github_benslabbert_trak_grpc_CategoryRequest,
    requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_CategoryRequest,
    responseSerialize: serialize_io_github_benslabbert_trak_grpc_BrandResponse,
    responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_BrandResponse,
  },
};

exports.CategoryServiceClient = grpc.makeGenericClientConstructor(CategoryServiceService);
