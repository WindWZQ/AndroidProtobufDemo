// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Some.proto

package entity;

public final class SomeOuterClass {
  private SomeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface SomeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:entity.Some)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int32 a = 1;</code>
     */
    int getA();

    /**
     * <code>optional int64 b = 2;</code>
     */
    long getB();

    /**
     * <code>optional string c = 3;</code>
     */
    java.lang.String getC();
    /**
     * <code>optional string c = 3;</code>
     */
    com.google.protobuf.ByteString
        getCBytes();

    /**
     * <code>optional bytes d = 4;</code>
     */
    com.google.protobuf.ByteString getD();
  }
  /**
   * Protobuf type {@code entity.Some}
   */
  public  static final class Some extends
      com.google.protobuf.GeneratedMessageLite<
          Some, Some.Builder> implements
      // @@protoc_insertion_point(message_implements:entity.Some)
      SomeOrBuilder {
    private Some() {
      c_ = "";
      d_ = com.google.protobuf.ByteString.EMPTY;
    }
    public static final int A_FIELD_NUMBER = 1;
    private int a_;
    /**
     * <code>optional int32 a = 1;</code>
     */
    public int getA() {
      return a_;
    }
    /**
     * <code>optional int32 a = 1;</code>
     */
    private void setA(int value) {
      
      a_ = value;
    }
    /**
     * <code>optional int32 a = 1;</code>
     */
    private void clearA() {
      
      a_ = 0;
    }

    public static final int B_FIELD_NUMBER = 2;
    private long b_;
    /**
     * <code>optional int64 b = 2;</code>
     */
    public long getB() {
      return b_;
    }
    /**
     * <code>optional int64 b = 2;</code>
     */
    private void setB(long value) {
      
      b_ = value;
    }
    /**
     * <code>optional int64 b = 2;</code>
     */
    private void clearB() {
      
      b_ = 0L;
    }

    public static final int C_FIELD_NUMBER = 3;
    private java.lang.String c_;
    /**
     * <code>optional string c = 3;</code>
     */
    public java.lang.String getC() {
      return c_;
    }
    /**
     * <code>optional string c = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(c_);
    }
    /**
     * <code>optional string c = 3;</code>
     */
    private void setC(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      c_ = value;
    }
    /**
     * <code>optional string c = 3;</code>
     */
    private void clearC() {
      
      c_ = getDefaultInstance().getC();
    }
    /**
     * <code>optional string c = 3;</code>
     */
    private void setCBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      c_ = value.toStringUtf8();
    }

    public static final int D_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString d_;
    /**
     * <code>optional bytes d = 4;</code>
     */
    public com.google.protobuf.ByteString getD() {
      return d_;
    }
    /**
     * <code>optional bytes d = 4;</code>
     */
    private void setD(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      d_ = value;
    }
    /**
     * <code>optional bytes d = 4;</code>
     */
    private void clearD() {
      
      d_ = getDefaultInstance().getD();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (a_ != 0) {
        output.writeInt32(1, a_);
      }
      if (b_ != 0L) {
        output.writeInt64(2, b_);
      }
      if (!c_.isEmpty()) {
        output.writeString(3, getC());
      }
      if (!d_.isEmpty()) {
        output.writeBytes(4, d_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (a_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, a_);
      }
      if (b_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, b_);
      }
      if (!c_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getC());
      }
      if (!d_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, d_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static entity.SomeOuterClass.Some parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static entity.SomeOuterClass.Some parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static entity.SomeOuterClass.Some parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static entity.SomeOuterClass.Some parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static entity.SomeOuterClass.Some parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static entity.SomeOuterClass.Some parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static entity.SomeOuterClass.Some parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static entity.SomeOuterClass.Some parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static entity.SomeOuterClass.Some parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static entity.SomeOuterClass.Some parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(entity.SomeOuterClass.Some prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code entity.Some}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          entity.SomeOuterClass.Some, Builder> implements
        // @@protoc_insertion_point(builder_implements:entity.Some)
        entity.SomeOuterClass.SomeOrBuilder {
      // Construct using entity.SomeOuterClass.Some.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional int32 a = 1;</code>
       */
      public int getA() {
        return instance.getA();
      }
      /**
       * <code>optional int32 a = 1;</code>
       */
      public Builder setA(int value) {
        copyOnWrite();
        instance.setA(value);
        return this;
      }
      /**
       * <code>optional int32 a = 1;</code>
       */
      public Builder clearA() {
        copyOnWrite();
        instance.clearA();
        return this;
      }

      /**
       * <code>optional int64 b = 2;</code>
       */
      public long getB() {
        return instance.getB();
      }
      /**
       * <code>optional int64 b = 2;</code>
       */
      public Builder setB(long value) {
        copyOnWrite();
        instance.setB(value);
        return this;
      }
      /**
       * <code>optional int64 b = 2;</code>
       */
      public Builder clearB() {
        copyOnWrite();
        instance.clearB();
        return this;
      }

      /**
       * <code>optional string c = 3;</code>
       */
      public java.lang.String getC() {
        return instance.getC();
      }
      /**
       * <code>optional string c = 3;</code>
       */
      public com.google.protobuf.ByteString
          getCBytes() {
        return instance.getCBytes();
      }
      /**
       * <code>optional string c = 3;</code>
       */
      public Builder setC(
          java.lang.String value) {
        copyOnWrite();
        instance.setC(value);
        return this;
      }
      /**
       * <code>optional string c = 3;</code>
       */
      public Builder clearC() {
        copyOnWrite();
        instance.clearC();
        return this;
      }
      /**
       * <code>optional string c = 3;</code>
       */
      public Builder setCBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCBytes(value);
        return this;
      }

      /**
       * <code>optional bytes d = 4;</code>
       */
      public com.google.protobuf.ByteString getD() {
        return instance.getD();
      }
      /**
       * <code>optional bytes d = 4;</code>
       */
      public Builder setD(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setD(value);
        return this;
      }
      /**
       * <code>optional bytes d = 4;</code>
       */
      public Builder clearD() {
        copyOnWrite();
        instance.clearD();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:entity.Some)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new entity.SomeOuterClass.Some();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          entity.SomeOuterClass.Some other = (entity.SomeOuterClass.Some) arg1;
          a_ = visitor.visitInt(a_ != 0, a_,
              other.a_ != 0, other.a_);
          b_ = visitor.visitLong(b_ != 0L, b_,
              other.b_ != 0L, other.b_);
          c_ = visitor.visitString(!c_.isEmpty(), c_,
              !other.c_.isEmpty(), other.c_);
          d_ = visitor.visitByteString(d_ != com.google.protobuf.ByteString.EMPTY, d_,
              other.d_ != com.google.protobuf.ByteString.EMPTY, other.d_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 8: {

                  a_ = input.readInt32();
                  break;
                }
                case 16: {

                  b_ = input.readInt64();
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  c_ = s;
                  break;
                }
                case 34: {

                  d_ = input.readBytes();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (entity.SomeOuterClass.Some.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:entity.Some)
    private static final entity.SomeOuterClass.Some DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Some();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static entity.SomeOuterClass.Some getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Some> PARSER;

    public static com.google.protobuf.Parser<Some> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
