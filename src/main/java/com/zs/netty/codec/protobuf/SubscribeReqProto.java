// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubscribeReq.proto

package com.zs.netty.codec.protobuf;

public final class SubscribeReqProto {
  private SubscribeReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SubscribeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:netty.SubscribeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 subReqID = 1;</code>
     */
    boolean hasSubReqID();
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    int getSubReqID();

    /**
     * <code>required string username = 2;</code>
     */
    boolean hasUsername();
    /**
     * <code>required string username = 2;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>required string username = 2;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>required string productName = 3;</code>
     */
    boolean hasProductName();
    /**
     * <code>required string productName = 3;</code>
     */
    java.lang.String getProductName();
    /**
     * <code>required string productName = 3;</code>
     */
    com.google.protobuf.ByteString
        getProductNameBytes();

    /**
     * <code>repeated string address = 4;</code>
     */
    java.util.List<java.lang.String>
        getAddressList();
    /**
     * <code>repeated string address = 4;</code>
     */
    int getAddressCount();
    /**
     * <code>repeated string address = 4;</code>
     */
    java.lang.String getAddress(int index);
    /**
     * <code>repeated string address = 4;</code>
     */
    com.google.protobuf.ByteString
        getAddressBytes(int index);
  }
  /**
   * Protobuf type {@code netty.SubscribeReq}
   */
  public  static final class SubscribeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:netty.SubscribeReq)
      SubscribeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SubscribeReq.newBuilder() to construct.
    private SubscribeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SubscribeReq() {
      subReqID_ = 0;
      username_ = "";
      productName_ = "";
      address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SubscribeReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              subReqID_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              username_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              productName_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                address_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              address_.add(bs);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          address_ = address_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zs.netty.codec.protobuf.SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zs.netty.codec.protobuf.SubscribeReqProto.internal_static_netty_SubscribeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq.class, com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq.Builder.class);
    }

    private int bitField0_;
    public static final int SUBREQID_FIELD_NUMBER = 1;
    private int subReqID_;
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    public boolean hasSubReqID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 subReqID = 1;</code>
     */
    public int getSubReqID() {
      return subReqID_;
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object username_;
    /**
     * <code>required string username = 2;</code>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string username = 2;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRODUCTNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object productName_;
    /**
     * <code>required string productName = 3;</code>
     */
    public boolean hasProductName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string productName = 3;</code>
     */
    public java.lang.String getProductName() {
      java.lang.Object ref = productName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          productName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string productName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getProductNameBytes() {
      java.lang.Object ref = productName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDRESS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList address_;
    /**
     * <code>repeated string address = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAddressList() {
      return address_;
    }
    /**
     * <code>repeated string address = 4;</code>
     */
    public int getAddressCount() {
      return address_.size();
    }
    /**
     * <code>repeated string address = 4;</code>
     */
    public java.lang.String getAddress(int index) {
      return address_.get(index);
    }
    /**
     * <code>repeated string address = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes(int index) {
      return address_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSubReqID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUsername()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasProductName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, subReqID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, productName_);
      }
      for (int i = 0; i < address_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, address_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, subReqID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, productName_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < address_.size(); i++) {
          dataSize += computeStringSizeNoTag(address_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAddressList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq)) {
        return super.equals(obj);
      }
      com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq other = (com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq) obj;

      boolean result = true;
      result = result && (hasSubReqID() == other.hasSubReqID());
      if (hasSubReqID()) {
        result = result && (getSubReqID()
            == other.getSubReqID());
      }
      result = result && (hasUsername() == other.hasUsername());
      if (hasUsername()) {
        result = result && getUsername()
            .equals(other.getUsername());
      }
      result = result && (hasProductName() == other.hasProductName());
      if (hasProductName()) {
        result = result && getProductName()
            .equals(other.getProductName());
      }
      result = result && getAddressList()
          .equals(other.getAddressList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSubReqID()) {
        hash = (37 * hash) + SUBREQID_FIELD_NUMBER;
        hash = (53 * hash) + getSubReqID();
      }
      if (hasUsername()) {
        hash = (37 * hash) + USERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getUsername().hashCode();
      }
      if (hasProductName()) {
        hash = (37 * hash) + PRODUCTNAME_FIELD_NUMBER;
        hash = (53 * hash) + getProductName().hashCode();
      }
      if (getAddressCount() > 0) {
        hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getAddressList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code netty.SubscribeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:netty.SubscribeReq)
        com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zs.netty.codec.protobuf.SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zs.netty.codec.protobuf.SubscribeReqProto.internal_static_netty_SubscribeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq.class, com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq.Builder.class);
      }

      // Construct using com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        subReqID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        productName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zs.netty.codec.protobuf.SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
      }

      @java.lang.Override
      public com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq getDefaultInstanceForType() {
        return com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq.getDefaultInstance();
      }

      @java.lang.Override
      public com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq build() {
        com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq buildPartial() {
        com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq result = new com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.subReqID_ = subReqID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.productName_ = productName_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          address_ = address_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.address_ = address_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq) {
          return mergeFrom((com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq other) {
        if (other == com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq.getDefaultInstance()) return this;
        if (other.hasSubReqID()) {
          setSubReqID(other.getSubReqID());
        }
        if (other.hasUsername()) {
          bitField0_ |= 0x00000002;
          username_ = other.username_;
          onChanged();
        }
        if (other.hasProductName()) {
          bitField0_ |= 0x00000004;
          productName_ = other.productName_;
          onChanged();
        }
        if (!other.address_.isEmpty()) {
          if (address_.isEmpty()) {
            address_ = other.address_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureAddressIsMutable();
            address_.addAll(other.address_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSubReqID()) {
          return false;
        }
        if (!hasUsername()) {
          return false;
        }
        if (!hasProductName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int subReqID_ ;
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public boolean hasSubReqID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public int getSubReqID() {
        return subReqID_;
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public Builder setSubReqID(int value) {
        bitField0_ |= 0x00000001;
        subReqID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 subReqID = 1;</code>
       */
      public Builder clearSubReqID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        subReqID_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object username_ = "";
      /**
       * <code>required string username = 2;</code>
       */
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string username = 2;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            username_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string username = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string username = 2;</code>
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string username = 2;</code>
       */
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000002);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>required string username = 2;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        username_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object productName_ = "";
      /**
       * <code>required string productName = 3;</code>
       */
      public boolean hasProductName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string productName = 3;</code>
       */
      public java.lang.String getProductName() {
        java.lang.Object ref = productName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            productName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string productName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getProductNameBytes() {
        java.lang.Object ref = productName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          productName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string productName = 3;</code>
       */
      public Builder setProductName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        productName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string productName = 3;</code>
       */
      public Builder clearProductName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        productName_ = getDefaultInstance().getProductName();
        onChanged();
        return this;
      }
      /**
       * <code>required string productName = 3;</code>
       */
      public Builder setProductNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        productName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureAddressIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          address_ = new com.google.protobuf.LazyStringArrayList(address_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getAddressList() {
        return address_.getUnmodifiableView();
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public int getAddressCount() {
        return address_.size();
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public java.lang.String getAddress(int index) {
        return address_.get(index);
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public com.google.protobuf.ByteString
          getAddressBytes(int index) {
        return address_.getByteString(index);
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder setAddress(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressIsMutable();
        address_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder addAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressIsMutable();
        address_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder addAllAddress(
          java.lang.Iterable<java.lang.String> values) {
        ensureAddressIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, address_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder clearAddress() {
        address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder addAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressIsMutable();
        address_.add(value);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:netty.SubscribeReq)
    }

    // @@protoc_insertion_point(class_scope:netty.SubscribeReq)
    private static final com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq();
    }

    public static com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SubscribeReq>
        PARSER = new com.google.protobuf.AbstractParser<SubscribeReq>() {
      @java.lang.Override
      public SubscribeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubscribeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SubscribeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubscribeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.zs.netty.codec.protobuf.SubscribeReqProto.SubscribeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_netty_SubscribeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_netty_SubscribeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SubscribeReq.proto\022\005netty\"X\n\014Subscribe" +
      "Req\022\020\n\010subReqID\030\001 \002(\005\022\020\n\010username\030\002 \002(\t\022" +
      "\023\n\013productName\030\003 \002(\t\022\017\n\007address\030\004 \003(\tB0\n" +
      "\033com.zs.netty.codec.protobufB\021SubscribeR" +
      "eqProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_netty_SubscribeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_netty_SubscribeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_netty_SubscribeReq_descriptor,
        new java.lang.String[] { "SubReqID", "Username", "ProductName", "Address", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
