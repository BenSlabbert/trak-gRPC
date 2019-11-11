// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var proto_search_search_api_pb = require('../../proto/search/search_api_pb.js');
var proto_search_search_messages_pb = require('../../proto/search/search_messages_pb.js');

function serialize_trak_grpc_search_v1_BrandSearchRequest(arg) {
  if (!(arg instanceof proto_search_search_api_pb.BrandSearchRequest)) {
    throw new Error('Expected argument of type trak.grpc.search.v1.BrandSearchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_trak_grpc_search_v1_BrandSearchRequest(buffer_arg) {
  return proto_search_search_api_pb.BrandSearchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_trak_grpc_search_v1_BrandSearchResponse(arg) {
  if (!(arg instanceof proto_search_search_api_pb.BrandSearchResponse)) {
    throw new Error('Expected argument of type trak.grpc.search.v1.BrandSearchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_trak_grpc_search_v1_BrandSearchResponse(buffer_arg) {
  return proto_search_search_api_pb.BrandSearchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_trak_grpc_search_v1_CategorySearchRequest(arg) {
  if (!(arg instanceof proto_search_search_api_pb.CategorySearchRequest)) {
    throw new Error('Expected argument of type trak.grpc.search.v1.CategorySearchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_trak_grpc_search_v1_CategorySearchRequest(buffer_arg) {
  return proto_search_search_api_pb.CategorySearchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_trak_grpc_search_v1_CategorySearchResponse(arg) {
  if (!(arg instanceof proto_search_search_api_pb.CategorySearchResponse)) {
    throw new Error('Expected argument of type trak.grpc.search.v1.CategorySearchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_trak_grpc_search_v1_CategorySearchResponse(buffer_arg) {
  return proto_search_search_api_pb.CategorySearchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_trak_grpc_search_v1_ProductSearchRequest(arg) {
  if (!(arg instanceof proto_search_search_api_pb.ProductSearchRequest)) {
    throw new Error('Expected argument of type trak.grpc.search.v1.ProductSearchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_trak_grpc_search_v1_ProductSearchRequest(buffer_arg) {
  return proto_search_search_api_pb.ProductSearchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_trak_grpc_search_v1_ProductSearchResponse(arg) {
  if (!(arg instanceof proto_search_search_api_pb.ProductSearchResponse)) {
    throw new Error('Expected argument of type trak.grpc.search.v1.ProductSearchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_trak_grpc_search_v1_ProductSearchResponse(buffer_arg) {
  return proto_search_search_api_pb.ProductSearchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Various RPCs for searching Brands, Products and Categories.
var SearchAPIService = exports.SearchAPIService = {
  //  Search for Brands.
  brandSearch: {
    path: '/trak.grpc.search.v1.SearchAPI/BrandSearch',
    requestStream: false,
    responseStream: false,
    requestType: proto_search_search_api_pb.BrandSearchRequest,
    responseType: proto_search_search_api_pb.BrandSearchResponse,
    requestSerialize: serialize_trak_grpc_search_v1_BrandSearchRequest,
    requestDeserialize: deserialize_trak_grpc_search_v1_BrandSearchRequest,
    responseSerialize: serialize_trak_grpc_search_v1_BrandSearchResponse,
    responseDeserialize: deserialize_trak_grpc_search_v1_BrandSearchResponse,
  },
  //  Search for Products.
  productSearch: {
    path: '/trak.grpc.search.v1.SearchAPI/ProductSearch',
    requestStream: false,
    responseStream: false,
    requestType: proto_search_search_api_pb.ProductSearchRequest,
    responseType: proto_search_search_api_pb.ProductSearchResponse,
    requestSerialize: serialize_trak_grpc_search_v1_ProductSearchRequest,
    requestDeserialize: deserialize_trak_grpc_search_v1_ProductSearchRequest,
    responseSerialize: serialize_trak_grpc_search_v1_ProductSearchResponse,
    responseDeserialize: deserialize_trak_grpc_search_v1_ProductSearchResponse,
  },
  //  Search for Categories.
  categorySearch: {
    path: '/trak.grpc.search.v1.SearchAPI/CategorySearch',
    requestStream: false,
    responseStream: false,
    requestType: proto_search_search_api_pb.CategorySearchRequest,
    responseType: proto_search_search_api_pb.CategorySearchResponse,
    requestSerialize: serialize_trak_grpc_search_v1_CategorySearchRequest,
    requestDeserialize: deserialize_trak_grpc_search_v1_CategorySearchRequest,
    responseSerialize: serialize_trak_grpc_search_v1_CategorySearchResponse,
    responseDeserialize: deserialize_trak_grpc_search_v1_CategorySearchResponse,
  },
};

exports.SearchAPIClient = grpc.makeGenericClientConstructor(SearchAPIService);
