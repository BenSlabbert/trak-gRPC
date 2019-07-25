#!/usr/bin/env bash

protoc --go_out=plugins=grpc:. ./src/main/proto/proto.proto
mv ./src/main/proto/proto.pb.go ./src/go
