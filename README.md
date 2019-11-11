# Trak gRPC Protos

## New Way

Install https://github.com/uber/prototool

Run `prototool all proto` and make sure there are no errors

Run `prototool generate proto` to generate the code

You still need `protoc` installed

## This is the old way

## compile protobufs and grpc services

### js

`yarn install`

`node_modules/.bin/grpc_tools_node_protoc --js_out=import_style=commonjs,binary:src/main/proto/ --grpc_out=src/main/proto/ --plugin=protoc-gen-grpc=node_modules/.bin/grpc_tools_node_protoc_plugin src/main/proto/proto.proto`

then move grpc files to 

### java

`mvn clean install`

### Golang

`./generatepb-golang.sh`
