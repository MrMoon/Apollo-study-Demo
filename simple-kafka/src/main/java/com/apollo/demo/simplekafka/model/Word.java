/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.apollo.demo.simplekafka.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Word extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -7861863837691095076L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Word\",\"namespace\":\"com.apollo.demo.simplekafka.model\",\"fields\":[{\"name\":\"word\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"string\"}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<Word> ENCODER =
            new BinaryMessageEncoder<Word>(MODEL$ , SCHEMA$);

    private static final BinaryMessageDecoder<Word> DECODER =
            new BinaryMessageDecoder<Word>(MODEL$ , SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<Word> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<Word> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<Word> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Word>(MODEL$ , SCHEMA$ , resolver);
    }

    /**
     * Serializes this Word to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a Word from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a Word instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static Word fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    private java.lang.CharSequence word;
    private java.lang.CharSequence id;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Word() {
    }

    /**
     * All-args constructor.
     * @param word The new value for word
     * @param id The new value for id
     */
    public Word(java.lang.CharSequence word , java.lang.CharSequence id) {
        this.word = word;
        this.id = id;
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return word;
            case 1:
                return id;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$ , java.lang.Object value$) {
        switch (field$) {
            case 0:
                word = (java.lang.CharSequence) value$;
                break;
            case 1:
                id = (java.lang.CharSequence) value$;
                break;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'word' field.
     * @return The value of the 'word' field.
     */
    public java.lang.CharSequence getWord() {
        return word;
    }


    /**
     * Sets the value of the 'word' field.
     * @param value the value to set.
     */
    public void setWord(java.lang.CharSequence value) {
        this.word = value;
    }

    /**
     * Gets the value of the 'id' field.
     * @return The value of the 'id' field.
     */
    public java.lang.CharSequence getId() {
        return id;
    }


    /**
     * Sets the value of the 'id' field.
     * @param value the value to set.
     */
    public void setId(java.lang.CharSequence value) {
        this.id = value;
    }

    /**
     * Creates a new Word RecordBuilder.
     * @return A new Word RecordBuilder
     */
    public static com.apollo.demo.simplekafka.model.Word.Builder newBuilder() {
        return new com.apollo.demo.simplekafka.model.Word.Builder();
    }

    /**
     * Creates a new Word RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new Word RecordBuilder
     */
    public static com.apollo.demo.simplekafka.model.Word.Builder newBuilder(com.apollo.demo.simplekafka.model.Word.Builder other) {
        if (other == null) {
            return new com.apollo.demo.simplekafka.model.Word.Builder();
        } else {
            return new com.apollo.demo.simplekafka.model.Word.Builder(other);
        }
    }

    /**
     * Creates a new Word RecordBuilder by copying an existing Word instance.
     * @param other The existing instance to copy.
     * @return A new Word RecordBuilder
     */
    public static com.apollo.demo.simplekafka.model.Word.Builder newBuilder(com.apollo.demo.simplekafka.model.Word other) {
        if (other == null) {
            return new com.apollo.demo.simplekafka.model.Word.Builder();
        } else {
            return new com.apollo.demo.simplekafka.model.Word.Builder(other);
        }
    }

    /**
     * RecordBuilder for Word instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Word>
            implements org.apache.avro.data.RecordBuilder<Word> {

        private java.lang.CharSequence word;
        private java.lang.CharSequence id;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.apollo.demo.simplekafka.model.Word.Builder other) {
            super(other);
            if (isValidValue(fields()[0] , other.word)) {
                this.word = data().deepCopy(fields()[0].schema() , other.word);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1] , other.id)) {
                this.id = data().deepCopy(fields()[1].schema() , other.id);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
        }

        /**
         * Creates a Builder by copying an existing Word instance
         * @param other The existing instance to copy.
         */
        private Builder(com.apollo.demo.simplekafka.model.Word other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0] , other.word)) {
                this.word = data().deepCopy(fields()[0].schema() , other.word);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1] , other.id)) {
                this.id = data().deepCopy(fields()[1].schema() , other.id);
                fieldSetFlags()[1] = true;
            }
        }

        /**
         * Gets the value of the 'word' field.
         * @return The value.
         */
        public java.lang.CharSequence getWord() {
            return word;
        }


        /**
         * Sets the value of the 'word' field.
         * @param value The value of 'word'.
         * @return This builder.
         */
        public com.apollo.demo.simplekafka.model.Word.Builder setWord(java.lang.CharSequence value) {
            validate(fields()[0] , value);
            this.word = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'word' field has been set.
         * @return True if the 'word' field has been set, false otherwise.
         */
        public boolean hasWord() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'word' field.
         * @return This builder.
         */
        public com.apollo.demo.simplekafka.model.Word.Builder clearWord() {
            word = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'id' field.
         * @return The value.
         */
        public java.lang.CharSequence getId() {
            return id;
        }


        /**
         * Sets the value of the 'id' field.
         * @param value The value of 'id'.
         * @return This builder.
         */
        public com.apollo.demo.simplekafka.model.Word.Builder setId(java.lang.CharSequence value) {
            validate(fields()[1] , value);
            this.id = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set.
         * @return True if the 'id' field has been set, false otherwise.
         */
        public boolean hasId() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'id' field.
         * @return This builder.
         */
        public com.apollo.demo.simplekafka.model.Word.Builder clearId() {
            id = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Word build() {
            try {
                Word record = new Word();
                record.word = fieldSetFlags()[0] ? this.word : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Word>
            WRITER$ = (org.apache.avro.io.DatumWriter<Word>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this , SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Word>
            READER$ = (org.apache.avro.io.DatumReader<Word>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this , SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeString(this.word);

        out.writeString(this.id);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.word = in.readString(this.word instanceof Utf8 ? (Utf8) this.word : null);

            this.id = in.readString(this.id instanceof Utf8 ? (Utf8) this.id : null);

        } else {
            for (int i = 0 ; i < 2 ; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.word = in.readString(this.word instanceof Utf8 ? (Utf8) this.word : null);
                        break;

                    case 1:
                        this.id = in.readString(this.id instanceof Utf8 ? (Utf8) this.id : null);
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}










