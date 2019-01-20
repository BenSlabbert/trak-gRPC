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
