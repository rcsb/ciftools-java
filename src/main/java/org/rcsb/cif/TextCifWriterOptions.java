package org.rcsb.cif;

public class TextCifWriterOptions {
    private final boolean gzip;

    private TextCifWriterOptions(TextCifWriterOptions.Builder builder) {
        this.gzip = builder.gzip;
    }

    public boolean isGzip() {
        return gzip;
    }

    /**
     * Create a builder instance which provides access to all options.
     * @return the builder
     */
    public static TextCifWriterOptions.Builder create() {
        return new TextCifWriterOptions.Builder();
    }

    public static class Builder {
        boolean gzip = false;

        /**
         * Specify whether the file should be gzipped downstream. default: false
         * @param gzip whether to gzip the MessagePacked data
         * @return the builder
         */
        public TextCifWriterOptions.Builder setGzip(boolean gzip) {
            this.gzip = gzip;
            return this;
        }

        /**
         * Create option object.
         * @return the options
         */
        public TextCifWriterOptions build() {
            return new TextCifWriterOptions(this);
        }
    }
}
