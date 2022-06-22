// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Arith.proto

package com.belonk.proto;

/**
 * <pre>
 * 客户端发送给服务端
 * </pre>
 *
 * Protobuf type {@code arith.Param}
 */
public final class Param extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:arith.Param)
    ParamOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Param.newBuilder() to construct.
  private Param(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Param() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Param();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Param(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            a_ = input.readInt32();
            break;
          }
          case 16: {

            b_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.belonk.proto.ArithProto.internal_static_arith_Param_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.belonk.proto.ArithProto.internal_static_arith_Param_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.belonk.proto.Param.class, com.belonk.proto.Param.Builder.class);
  }

  public static final int A_FIELD_NUMBER = 1;
  private int a_;
  /**
   * <pre>
   * 每一个message的字段都有一个唯一编号，用以区分消息二进制格式，而且不能更改
   * </pre>
   *
   * <code>int32 A = 1;</code>
   * @return The a.
   */
  @java.lang.Override
  public int getA() {
    return a_;
  }

  public static final int B_FIELD_NUMBER = 2;
  private int b_;
  /**
   * <code>int32 B = 2;</code>
   * @return The b.
   */
  @java.lang.Override
  public int getB() {
    return b_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (a_ != 0) {
      output.writeInt32(1, a_);
    }
    if (b_ != 0) {
      output.writeInt32(2, b_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (a_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, a_);
    }
    if (b_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, b_);
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
    if (!(obj instanceof com.belonk.proto.Param)) {
      return super.equals(obj);
    }
    com.belonk.proto.Param other = (com.belonk.proto.Param) obj;

    if (getA()
        != other.getA()) return false;
    if (getB()
        != other.getB()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + A_FIELD_NUMBER;
    hash = (53 * hash) + getA();
    hash = (37 * hash) + B_FIELD_NUMBER;
    hash = (53 * hash) + getB();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.belonk.proto.Param parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.belonk.proto.Param parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.belonk.proto.Param parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.belonk.proto.Param parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.belonk.proto.Param parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.belonk.proto.Param parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.belonk.proto.Param parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.belonk.proto.Param parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.belonk.proto.Param parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.belonk.proto.Param parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.belonk.proto.Param parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.belonk.proto.Param parseFrom(
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
  public static Builder newBuilder(com.belonk.proto.Param prototype) {
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
   * <pre>
   * 客户端发送给服务端
   * </pre>
   *
   * Protobuf type {@code arith.Param}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:arith.Param)
      com.belonk.proto.ParamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.belonk.proto.ArithProto.internal_static_arith_Param_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.belonk.proto.ArithProto.internal_static_arith_Param_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.belonk.proto.Param.class, com.belonk.proto.Param.Builder.class);
    }

    // Construct using com.belonk.proto.Param.newBuilder()
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
      a_ = 0;

      b_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.belonk.proto.ArithProto.internal_static_arith_Param_descriptor;
    }

    @java.lang.Override
    public com.belonk.proto.Param getDefaultInstanceForType() {
      return com.belonk.proto.Param.getDefaultInstance();
    }

    @java.lang.Override
    public com.belonk.proto.Param build() {
      com.belonk.proto.Param result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.belonk.proto.Param buildPartial() {
      com.belonk.proto.Param result = new com.belonk.proto.Param(this);
      result.a_ = a_;
      result.b_ = b_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.belonk.proto.Param) {
        return mergeFrom((com.belonk.proto.Param)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.belonk.proto.Param other) {
      if (other == com.belonk.proto.Param.getDefaultInstance()) return this;
      if (other.getA() != 0) {
        setA(other.getA());
      }
      if (other.getB() != 0) {
        setB(other.getB());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.belonk.proto.Param parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.belonk.proto.Param) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int a_ ;
    /**
     * <pre>
     * 每一个message的字段都有一个唯一编号，用以区分消息二进制格式，而且不能更改
     * </pre>
     *
     * <code>int32 A = 1;</code>
     * @return The a.
     */
    @java.lang.Override
    public int getA() {
      return a_;
    }
    /**
     * <pre>
     * 每一个message的字段都有一个唯一编号，用以区分消息二进制格式，而且不能更改
     * </pre>
     *
     * <code>int32 A = 1;</code>
     * @param value The a to set.
     * @return This builder for chaining.
     */
    public Builder setA(int value) {
      
      a_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 每一个message的字段都有一个唯一编号，用以区分消息二进制格式，而且不能更改
     * </pre>
     *
     * <code>int32 A = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearA() {
      
      a_ = 0;
      onChanged();
      return this;
    }

    private int b_ ;
    /**
     * <code>int32 B = 2;</code>
     * @return The b.
     */
    @java.lang.Override
    public int getB() {
      return b_;
    }
    /**
     * <code>int32 B = 2;</code>
     * @param value The b to set.
     * @return This builder for chaining.
     */
    public Builder setB(int value) {
      
      b_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 B = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearB() {
      
      b_ = 0;
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


    // @@protoc_insertion_point(builder_scope:arith.Param)
  }

  // @@protoc_insertion_point(class_scope:arith.Param)
  private static final com.belonk.proto.Param DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.belonk.proto.Param();
  }

  public static com.belonk.proto.Param getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Param>
      PARSER = new com.google.protobuf.AbstractParser<Param>() {
    @java.lang.Override
    public Param parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Param(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Param> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Param> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.belonk.proto.Param getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

