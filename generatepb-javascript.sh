#!/usr/bin/env bash

node_modules/.bin/grpc_tools_node_protoc --js_out=import_style=commonjs,binary:gen/js --grpc_out=gen/js/ --plugin=protoc-gen-grpc=node_modules/.bin/grpc_tools_node_protoc_plugin proto/gateway/gateway_api.proto
node_modules/.bin/grpc_tools_node_protoc --js_out=import_style=commonjs,binary:gen/js --grpc_out=gen/js/ --plugin=protoc-gen-grpc=node_modules/.bin/grpc_tools_node_protoc_plugin proto/search/search_api.proto proto/search/search_messages.proto
