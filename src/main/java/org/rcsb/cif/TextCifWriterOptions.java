package org.rcsb.cif;

public class TextCifWriterOptions extends CifWriterOptions {
    private TextCifWriterOptions(TextCifWriterOptions.TextCifWriterBuilder builder) {
        super(builder);
    }

    /**
     * Create a builder instance which provides access to all options.
     * @return the builder
     */
    public static TextCifWriterOptions.TextCifWriterBuilder create() {
        return new TextCifWriterOptions.TextCifWriterBuilder();
    }

    public static class TextCifWriterBuilder extends CifWriterOptionsBuilder {
        /**
         * Create option object.
         * @return the options
         */
        public TextCifWriterOptions build() {
            return new TextCifWriterOptions(this);
        }
    }
}
