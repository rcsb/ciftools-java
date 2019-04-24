package org.rcsb.cif;

import org.rcsb.cif.binary.codec.Codec;

public class BinaryCifWriterOptions {
    private final String encoder;
    private final boolean singleRowMessagePack;
    private final boolean gzip;

    private BinaryCifWriterOptions(Builder builder) {
        this.encoder = builder.encoder;
        this.singleRowMessagePack = builder.singleRowByMessagePack;
        this.gzip = builder.gzip;
    }

    public String getEncoder() {
        return encoder;
    }

    public boolean isSingleRowMessagePack() {
        return singleRowMessagePack;
    }

    public boolean isGzip() {
        return gzip;
    }

    /**
     * Create a builder instance which provides access to all options.
     * @return the builder
     */
    public static Builder create() {
        return new Builder();
    }

    public static class Builder {
        String encoder = Codec.CODEC_NAME;
        boolean singleRowByMessagePack = false;
        boolean gzip = false;

        /**
         * Specify the encoder name to write to files. Comes in handy when checking for agreement with other files.
         * default: ciftools-java
         * @param encoder the encoder name to use
         * @return the builder
         */
        public Builder setEncoderName(String encoder) {
            this.encoder = encoder;
            return this;
        }

        /**
         * Specify whether categories with a single row should be encoded by native MessagePack (as opposed to wrapping
         * them in columns and classifying them). Should avoid overhead and result in a smaller packing size.
         * Experimental feature not supported by other decoder/encoder libraries. default: false
         * @param singleRowByMessagePack feed single row categories directly by MessagePack
         * @return the builder
         */
        public Builder setSingleRowByMessagePack(boolean singleRowByMessagePack) {
            this.singleRowByMessagePack = singleRowByMessagePack;
            return this;
        }

        /**
         * Specify whether the file should be gzipped downstream. default: false
         * @param gzip whether to gzip the MessagePacked data
         * @return the builder
         */
        public Builder setGzip(boolean gzip) {
            this.gzip = gzip;
            return this;
        }

        /**
         * Create option object.
         * @return the options
         */
        public BinaryCifWriterOptions build() {
            return new BinaryCifWriterOptions(this);
        }
    }
}
