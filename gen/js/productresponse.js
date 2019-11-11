/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.trak.grpc.gateway.v1.ProductResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.trak.grpc.gateway.v1.ProductMessage');
goog.require('proto.trak.grpc.gateway.v1.ProductStatsResponse');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.trak.grpc.gateway.v1.ProductResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.trak.grpc.gateway.v1.ProductResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.trak.grpc.gateway.v1.ProductResponse.displayName = 'proto.trak.grpc.gateway.v1.ProductResponse';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.trak.grpc.gateway.v1.ProductResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.trak.grpc.gateway.v1.ProductResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.trak.grpc.gateway.v1.ProductResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    product: (f = msg.getProduct()) && proto.trak.grpc.gateway.v1.ProductMessage.toObject(includeInstance, f),
    stats: (f = msg.getStats()) && proto.trak.grpc.gateway.v1.ProductStatsResponse.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.trak.grpc.gateway.v1.ProductResponse}
 */
proto.trak.grpc.gateway.v1.ProductResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.trak.grpc.gateway.v1.ProductResponse;
  return proto.trak.grpc.gateway.v1.ProductResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.trak.grpc.gateway.v1.ProductResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.trak.grpc.gateway.v1.ProductResponse}
 */
proto.trak.grpc.gateway.v1.ProductResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.trak.grpc.gateway.v1.ProductMessage;
      reader.readMessage(value,proto.trak.grpc.gateway.v1.ProductMessage.deserializeBinaryFromReader);
      msg.setProduct(value);
      break;
    case 2:
      var value = new proto.trak.grpc.gateway.v1.ProductStatsResponse;
      reader.readMessage(value,proto.trak.grpc.gateway.v1.ProductStatsResponse.deserializeBinaryFromReader);
      msg.setStats(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.trak.grpc.gateway.v1.ProductResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.trak.grpc.gateway.v1.ProductResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.trak.grpc.gateway.v1.ProductResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProduct();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.trak.grpc.gateway.v1.ProductMessage.serializeBinaryToWriter
    );
  }
  f = message.getStats();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.trak.grpc.gateway.v1.ProductStatsResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional ProductMessage product = 1;
 * @return {?proto.trak.grpc.gateway.v1.ProductMessage}
 */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.getProduct = function() {
  return /** @type{?proto.trak.grpc.gateway.v1.ProductMessage} */ (
    jspb.Message.getWrapperField(this, proto.trak.grpc.gateway.v1.ProductMessage, 1));
};


/** @param {?proto.trak.grpc.gateway.v1.ProductMessage|undefined} value */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.setProduct = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.clearProduct = function() {
  this.setProduct(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.hasProduct = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional ProductStatsResponse stats = 2;
 * @return {?proto.trak.grpc.gateway.v1.ProductStatsResponse}
 */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.getStats = function() {
  return /** @type{?proto.trak.grpc.gateway.v1.ProductStatsResponse} */ (
    jspb.Message.getWrapperField(this, proto.trak.grpc.gateway.v1.ProductStatsResponse, 2));
};


/** @param {?proto.trak.grpc.gateway.v1.ProductStatsResponse|undefined} value */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.setStats = function(value) {
  jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.clearStats = function() {
  this.setStats(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.trak.grpc.gateway.v1.ProductResponse.prototype.hasStats = function() {
  return jspb.Message.getField(this, 2) != null;
};


