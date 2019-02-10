// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var src_main_proto_proto_pb = require('../proto/proto_pb.js');

function serialize_io_github_benslabbert_trak_grpc_Empty(arg) {
    if (!(arg instanceof src_main_proto_proto_pb.Empty)) {
        throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.Empty');
    }
    return new Buffer(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_Empty(buffer_arg) {
    return src_main_proto_proto_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_LatestResponse(arg) {
    if (!(arg instanceof src_main_proto_proto_pb.LatestResponse)) {
        throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.LatestResponse');
    }
    return new Buffer(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_LatestResponse(buffer_arg) {
    return src_main_proto_proto_pb.LatestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_ProductRequest(arg) {
    if (!(arg instanceof src_main_proto_proto_pb.ProductRequest)) {
        throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.ProductRequest');
    }
    return new Buffer(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_ProductRequest(buffer_arg) {
    return src_main_proto_proto_pb.ProductRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_ProductResponse(arg) {
    if (!(arg instanceof src_main_proto_proto_pb.ProductResponse)) {
        throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.ProductResponse');
    }
    return new Buffer(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_ProductResponse(buffer_arg) {
    return src_main_proto_proto_pb.ProductResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_SearchRequest(arg) {
    if (!(arg instanceof src_main_proto_proto_pb.SearchRequest)) {
        throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.SearchRequest');
    }
    return new Buffer(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_SearchRequest(buffer_arg) {
    return src_main_proto_proto_pb.SearchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_SearchResponse(arg) {
    if (!(arg instanceof src_main_proto_proto_pb.SearchResponse)) {
        throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.SearchResponse');
    }
    return new Buffer(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_SearchResponse(buffer_arg) {
    return src_main_proto_proto_pb.SearchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var SearchServiceService = exports.SearchServiceService = {
    product_search: {
        path: '/io.github.benslabbert.trak.grpc.SearchService/product_search',
        requestStream: false,
        responseStream: false,
        requestType: src_main_proto_proto_pb.SearchRequest,
        responseType: src_main_proto_proto_pb.SearchResponse,
        requestSerialize: serialize_io_github_benslabbert_trak_grpc_SearchRequest,
        requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchRequest,
        responseSerialize: serialize_io_github_benslabbert_trak_grpc_SearchResponse,
        responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchResponse,
    },
    brand_search: {
        path: '/io.github.benslabbert.trak.grpc.SearchService/brand_search',
        requestStream: false,
        responseStream: false,
        requestType: src_main_proto_proto_pb.SearchRequest,
        responseType: src_main_proto_proto_pb.SearchResponse,
        requestSerialize: serialize_io_github_benslabbert_trak_grpc_SearchRequest,
        requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchRequest,
        responseSerialize: serialize_io_github_benslabbert_trak_grpc_SearchResponse,
        responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchResponse,
    },
    category_search: {
        path: '/io.github.benslabbert.trak.grpc.SearchService/category_search',
        requestStream: false,
        responseStream: false,
        requestType: src_main_proto_proto_pb.SearchRequest,
        responseType: src_main_proto_proto_pb.SearchResponse,
        requestSerialize: serialize_io_github_benslabbert_trak_grpc_SearchRequest,
        requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchRequest,
        responseSerialize: serialize_io_github_benslabbert_trak_grpc_SearchResponse,
        responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_SearchResponse,
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
};

exports.ProductServiceClient = grpc.makeGenericClientConstructor(ProductServiceService);
