// Code generated by protoc-gen-go. DO NOT EDIT.
// source: proto/search/search_messages.proto

package searchv1

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

// Results of the search.
type SearchResult struct {
	// id of the record.
	Id uint32 `protobuf:"varint,1,opt,name=id,proto3" json:"id,omitempty"`
	// text to describe the record.
	Text string `protobuf:"bytes,2,opt,name=text,proto3" json:"text,omitempty"`
	// an indication of the search request's correlation to this record.
	Score                float32  `protobuf:"fixed32,3,opt,name=score,proto3" json:"score,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *SearchResult) Reset()         { *m = SearchResult{} }
func (m *SearchResult) String() string { return proto.CompactTextString(m) }
func (*SearchResult) ProtoMessage()    {}
func (*SearchResult) Descriptor() ([]byte, []int) {
	return fileDescriptor_6eecaaf7c7cc872c, []int{0}
}

func (m *SearchResult) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_SearchResult.Unmarshal(m, b)
}
func (m *SearchResult) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_SearchResult.Marshal(b, m, deterministic)
}
func (m *SearchResult) XXX_Merge(src proto.Message) {
	xxx_messageInfo_SearchResult.Merge(m, src)
}
func (m *SearchResult) XXX_Size() int {
	return xxx_messageInfo_SearchResult.Size(m)
}
func (m *SearchResult) XXX_DiscardUnknown() {
	xxx_messageInfo_SearchResult.DiscardUnknown(m)
}

var xxx_messageInfo_SearchResult proto.InternalMessageInfo

func (m *SearchResult) GetId() uint32 {
	if m != nil {
		return m.Id
	}
	return 0
}

func (m *SearchResult) GetText() string {
	if m != nil {
		return m.Text
	}
	return ""
}

func (m *SearchResult) GetScore() float32 {
	if m != nil {
		return m.Score
	}
	return 0
}

func init() {
	proto.RegisterType((*SearchResult)(nil), "trak.grpc.search.v1.SearchResult")
}

func init() { proto.RegisterFile("proto/search/search_messages.proto", fileDescriptor_6eecaaf7c7cc872c) }

var fileDescriptor_6eecaaf7c7cc872c = []byte{
	// 198 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0x2a, 0x28, 0xca, 0x2f,
	0xc9, 0xd7, 0x2f, 0x4e, 0x4d, 0x2c, 0x4a, 0xce, 0x80, 0x52, 0xf1, 0xb9, 0xa9, 0xc5, 0xc5, 0x89,
	0xe9, 0xa9, 0xc5, 0x7a, 0x60, 0x49, 0x21, 0xe1, 0x92, 0xa2, 0xc4, 0x6c, 0xbd, 0xf4, 0xa2, 0x82,
	0x64, 0x3d, 0x88, 0x02, 0xbd, 0x32, 0x43, 0x25, 0x0f, 0x2e, 0x9e, 0x60, 0x30, 0x27, 0x28, 0xb5,
	0xb8, 0x34, 0xa7, 0x44, 0x88, 0x8f, 0x8b, 0x29, 0x33, 0x45, 0x82, 0x51, 0x81, 0x51, 0x83, 0x37,
	0x88, 0x29, 0x33, 0x45, 0x48, 0x88, 0x8b, 0xa5, 0x24, 0xb5, 0xa2, 0x44, 0x82, 0x49, 0x81, 0x51,
	0x83, 0x33, 0x08, 0xcc, 0x16, 0x12, 0xe1, 0x62, 0x2d, 0x4e, 0xce, 0x2f, 0x4a, 0x95, 0x60, 0x56,
	0x60, 0xd4, 0x60, 0x0a, 0x82, 0x70, 0x9c, 0x72, 0xb8, 0xc4, 0x93, 0xf3, 0x73, 0xf5, 0xb0, 0x58,
	0xe2, 0x24, 0x0c, 0xb1, 0xc2, 0x17, 0xea, 0x9e, 0x00, 0x90, 0x73, 0x02, 0x18, 0xa3, 0x38, 0x20,
	0x2a, 0xca, 0x0c, 0x17, 0x31, 0x31, 0x87, 0xb8, 0x07, 0xaf, 0x62, 0x12, 0x0e, 0x01, 0x69, 0x76,
	0x07, 0x69, 0x86, 0xe8, 0xd0, 0x0b, 0x33, 0x3c, 0x05, 0x11, 0x8d, 0x01, 0x89, 0xc6, 0x40, 0x44,
	0x63, 0xc2, 0x0c, 0x93, 0xd8, 0xc0, 0x7e, 0x32, 0x06, 0x04, 0x00, 0x00, 0xff, 0xff, 0x06, 0x35,
	0x70, 0x73, 0xf9, 0x00, 0x00, 0x00,
}
