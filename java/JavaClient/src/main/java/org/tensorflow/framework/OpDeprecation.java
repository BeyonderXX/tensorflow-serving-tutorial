// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/op_def.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Information about version-dependent deprecation of an op
 * </pre>
 *
 * Protobuf type {@code tensorflow.OpDeprecation}
 */
public  final class OpDeprecation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.OpDeprecation)
    OpDeprecationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpDeprecation.newBuilder() to construct.
  private OpDeprecation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpDeprecation() {
    explanation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpDeprecation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpDeprecation(
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

            version_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            explanation_ = s;
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
    return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpDeprecation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpDeprecation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.OpDeprecation.class, org.tensorflow.framework.OpDeprecation.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <pre>
   * First GraphDef version at which the op is disallowed.
   * </pre>
   *
   * <code>int32 version = 1;</code>
   * @return The version.
   */
  public int getVersion() {
    return version_;
  }

  public static final int EXPLANATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object explanation_;
  /**
   * <pre>
   * Explanation of why it was deprecated and what to use instead.
   * </pre>
   *
   * <code>string explanation = 2;</code>
   * @return The explanation.
   */
  public java.lang.String getExplanation() {
    java.lang.Object ref = explanation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      explanation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Explanation of why it was deprecated and what to use instead.
   * </pre>
   *
   * <code>string explanation = 2;</code>
   * @return The bytes for explanation.
   */
  public com.google.protobuf.ByteString
      getExplanationBytes() {
    java.lang.Object ref = explanation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      explanation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (version_ != 0) {
      output.writeInt32(1, version_);
    }
    if (!getExplanationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, explanation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, version_);
    }
    if (!getExplanationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, explanation_);
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
    if (!(obj instanceof org.tensorflow.framework.OpDeprecation)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.OpDeprecation other = (org.tensorflow.framework.OpDeprecation) obj;

    if (getVersion()
        != other.getVersion()) return false;
    if (!getExplanation()
        .equals(other.getExplanation())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + EXPLANATION_FIELD_NUMBER;
    hash = (53 * hash) + getExplanation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.OpDeprecation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.OpDeprecation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OpDeprecation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OpDeprecation parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.OpDeprecation prototype) {
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
   * Information about version-dependent deprecation of an op
   * </pre>
   *
   * Protobuf type {@code tensorflow.OpDeprecation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.OpDeprecation)
      org.tensorflow.framework.OpDeprecationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpDeprecation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpDeprecation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.OpDeprecation.class, org.tensorflow.framework.OpDeprecation.Builder.class);
    }

    // Construct using org.tensorflow.framework.OpDeprecation.newBuilder()
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
      version_ = 0;

      explanation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.OpDefProtos.internal_static_tensorflow_OpDeprecation_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.OpDeprecation getDefaultInstanceForType() {
      return org.tensorflow.framework.OpDeprecation.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.OpDeprecation build() {
      org.tensorflow.framework.OpDeprecation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.OpDeprecation buildPartial() {
      org.tensorflow.framework.OpDeprecation result = new org.tensorflow.framework.OpDeprecation(this);
      result.version_ = version_;
      result.explanation_ = explanation_;
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
      if (other instanceof org.tensorflow.framework.OpDeprecation) {
        return mergeFrom((org.tensorflow.framework.OpDeprecation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.OpDeprecation other) {
      if (other == org.tensorflow.framework.OpDeprecation.getDefaultInstance()) return this;
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (!other.getExplanation().isEmpty()) {
        explanation_ = other.explanation_;
        onChanged();
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
      org.tensorflow.framework.OpDeprecation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.OpDeprecation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int version_ ;
    /**
     * <pre>
     * First GraphDef version at which the op is disallowed.
     * </pre>
     *
     * <code>int32 version = 1;</code>
     * @return The version.
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * First GraphDef version at which the op is disallowed.
     * </pre>
     *
     * <code>int32 version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * First GraphDef version at which the op is disallowed.
     * </pre>
     *
     * <code>int32 version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object explanation_ = "";
    /**
     * <pre>
     * Explanation of why it was deprecated and what to use instead.
     * </pre>
     *
     * <code>string explanation = 2;</code>
     * @return The explanation.
     */
    public java.lang.String getExplanation() {
      java.lang.Object ref = explanation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        explanation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Explanation of why it was deprecated and what to use instead.
     * </pre>
     *
     * <code>string explanation = 2;</code>
     * @return The bytes for explanation.
     */
    public com.google.protobuf.ByteString
        getExplanationBytes() {
      java.lang.Object ref = explanation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        explanation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Explanation of why it was deprecated and what to use instead.
     * </pre>
     *
     * <code>string explanation = 2;</code>
     * @param value The explanation to set.
     * @return This builder for chaining.
     */
    public Builder setExplanation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      explanation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Explanation of why it was deprecated and what to use instead.
     * </pre>
     *
     * <code>string explanation = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExplanation() {
      
      explanation_ = getDefaultInstance().getExplanation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Explanation of why it was deprecated and what to use instead.
     * </pre>
     *
     * <code>string explanation = 2;</code>
     * @param value The bytes for explanation to set.
     * @return This builder for chaining.
     */
    public Builder setExplanationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      explanation_ = value;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.OpDeprecation)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.OpDeprecation)
  private static final org.tensorflow.framework.OpDeprecation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.OpDeprecation();
  }

  public static org.tensorflow.framework.OpDeprecation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpDeprecation>
      PARSER = new com.google.protobuf.AbstractParser<OpDeprecation>() {
    @java.lang.Override
    public OpDeprecation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpDeprecation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpDeprecation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpDeprecation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.OpDeprecation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
