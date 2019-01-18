// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var src_main_proto_proto_pb = require('../proto/proto_pb.js');

function serialize_io_github_benslabbert_trak_grpc_HelloRequest(arg) {
    if (!(arg instanceof src_main_proto_proto_pb.HelloRequest)) {
        throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.HelloRequest');
    }
    return new Buffer(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_HelloRequest(buffer_arg) {
    return src_main_proto_proto_pb.HelloRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_io_github_benslabbert_trak_grpc_HelloResponse(arg) {
    if (!(arg instanceof src_main_proto_proto_pb.HelloResponse)) {
        throw new Error('Expected argument of type io.github.benslabbert.trak.grpc.HelloResponse');
    }
    return new Buffer(arg.serializeBinary());
}

function deserialize_io_github_benslabbert_trak_grpc_HelloResponse(buffer_arg) {
    return src_main_proto_proto_pb.HelloResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var HelloServiceService = exports.HelloServiceService = {
    hello: {
        path: '/io.github.benslabbert.trak.grpc.HelloService/hello',
        requestStream: false,
        responseStream: false,
        requestType: src_main_proto_proto_pb.HelloRequest,
        responseType: src_main_proto_proto_pb.HelloResponse,
        requestSerialize: serialize_io_github_benslabbert_trak_grpc_HelloRequest,
        requestDeserialize: deserialize_io_github_benslabbert_trak_grpc_HelloRequest,
        responseSerialize: serialize_io_github_benslabbert_trak_grpc_HelloResponse,
        responseDeserialize: deserialize_io_github_benslabbert_trak_grpc_HelloResponse,
    },
};

exports.HelloServiceClient = grpc.makeGenericClientConstructor(HelloServiceService);
