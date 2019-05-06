package org.rcsb.cif;

import org.rcsb.cif.binary.codec.Codec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Allows to set options for CIF writing. Acquire by calling {@link CifOptions#builder()}. Pass into {@link CifIO}
 * functions. Use white- and blacklist functions to select a subset of categories and/or columns to write. If a value is
 * present in both white- and blacklist, the blacklist values will trump the whitelist.
 */
public class CifOptions {
    private final boolean gzip;
    private final boolean singleRow;
    private final String encoder;
    private final String fetchUrl;
    private final List<String> categoryWhitelist;
    private final List<String> categoryBlacklist;
    private final List<String> columnWhitelist;
    private final List<String> columnBlacklist;

    CifOptions(CifOptionsBuilder builder) {
        this.gzip = builder.gzip;
        this.singleRow = builder.singleRow;
        this.encoder = builder.encoder;
        this.fetchUrl = builder.fetchUrl;
        this.categoryWhitelist = builder.categoryWhitelist;
        this.categoryBlacklist = builder.categoryBlacklist;
        this.columnWhitelist = builder.columnWhitelist;
        this.columnBlacklist = builder.columnBlacklist;
    }

    /**
     * Allows for downstream GZIP operations.
     * @return <code>true</code> if the output should be gzipped
     */
    public boolean isGzip() {
        return gzip;
    }

    /**
     * Experimental flag to encode single row columns natively by MessagePack (rather than wrapping them with 'empty'
     * encoding information.
     * @return <code>true</code> if single rows should be MessagePacked
     */
    public boolean isSingleRow() {
        return singleRow;
    }

    /**
     * The name of the encoder which should be written to files.
     * @return a String representing the encoder name
     */
    public String getEncoder() {
        return encoder;
    }

    /**
     * The URL from which files should be fetched - must follow the pattern: <code>www.source.com/%s.cif</code>, where
     * <code>%s</code> represents the pdbId to be inserted into the URL to fetch the correct file.
     * @return the specified fetch URL
     */
    public String getFetchUrl() {
        return fetchUrl;
    }

    /**
     * Checks whether this category should be written to output files. Specify via the white- and blacklists.
     * @param categoryName the category name to check
     * @return <code>true</code> if this category should be written to output files
     * @see CifOptions.CifOptionsBuilder#categoryWhitelist(String...)
     * @see CifOptions.CifOptionsBuilder#categoryBlacklist(String...)
     */
    public boolean filterCategory(String categoryName) {
        if (categoryBlacklist.contains(categoryName)) {
            return false;
        } else return categoryWhitelist.size() <= 0 || categoryWhitelist.contains(categoryName);
    }

    /**
     * Checks whether this column should be written to output files. Specify via the white- and blacklists.
     * @param categoryName the category name to check
     * @param columnName the column name to check
     * @return <code>true</code> if this column should be written to output files
     * @see CifOptions.CifOptionsBuilder#columnWhitelist(String...)
     * @see CifOptions.CifOptionsBuilder#columnBlacklist(String...)
     */
    public boolean filterColumn(String categoryName, String columnName) {
        String fullColumnName = categoryName + "." + columnName;
        if (columnBlacklist.contains(fullColumnName)) {
            return false;
        } else return columnWhitelist.size() <= 0 || categoryWhitelist.contains(fullColumnName);
    }

    /**
     * Acquire the actual builder instance.
     * @return a {@link CifOptionsBuilder}
     */
    public static CifOptionsBuilder builder() {
        return new CifOptionsBuilder();
    }

    /**
     * Internal class to handle the option building process.
     */
    public static class CifOptionsBuilder {
        // TODO change once ready
        private static final String FETCH_URL = "https://webchem.ncbr.muni.cz/ModelServer/static/bcif/%s";

        boolean gzip = false;
        boolean singleRow = false;
        String encoder = Codec.CODEC_NAME;
        String fetchUrl = FETCH_URL;
        List<String> categoryWhitelist = new ArrayList<>();
        List<String> categoryBlacklist = new ArrayList<>();
        List<String> columnWhitelist = new ArrayList<>();
        List<String> columnBlacklist = new ArrayList<>();

        /**
         * Allows for downstream GZIP operations.
         * @param gzip <code>true</code> if the output should be gzipped
         * @return this builder instance
         */
        public CifOptionsBuilder gzip(boolean gzip) {
            this.gzip = gzip;
            return this;
        }

        /**
         * Experimental flag to encode single row columns natively by MessagePack (rather than wrapping them with
         * 'empty' encoding information.
         * @param singleRow <code>true</code> if single rows should be MessagePacked
         * @return this builder instance
         */
        public CifOptionsBuilder singleRow(boolean singleRow) {
            this.singleRow = singleRow;
            return this;
        }

        /**
         * The name of the encoder which should be written to files.
         * @param encoder String representing the encoder name
         * @return this builder instance
         */
        public CifOptionsBuilder encoder(String encoder) {
            this.encoder = encoder;
            return this;
        }

        /**
         * The URL from which files should be fetched - must follow the pattern: <code>www.source.com/%s.cif</code>,
         * where <code>%s</code> represents the pdbId to be inserted into the URL to fetch the correct file.
         * @param fetchUrl the specified fetch URL
         * @return this builder instance
         */
        public CifOptionsBuilder fetchUrl(String fetchUrl) {
            this.fetchUrl = fetchUrl;
            return this;
        }

        /**
         * Add entries to the category whitelist. If the whitelist has any entries, the category must be explicitly
         * contained for the category to appear in the output.
         * @param categoryWhitelist a collection of String values to explicitly include in the output, all other
         *                          possible entries will be implicitly excluded
         * @return
         */
        public CifOptionsBuilder categoryWhitelist(String... categoryWhitelist) {
            return categoryWhitelist(Arrays.asList(categoryWhitelist));
        }

        /**
         * Add entries to the category whitelist. If the whitelist has any entries, the category must be explicitly
         * contained for the category to appear in the output.
         * @param categoryWhitelist a collection of String values to explicitly include in the output, all other
         *                          possible entries will be implicitly excluded
         * @return this builder instance
         */
        public CifOptionsBuilder categoryWhitelist(List<String> categoryWhitelist) {
            this.categoryWhitelist.addAll(categoryWhitelist);
            return this;
        }

        /**
         * Add entries to the category blacklist. Any entries will be ignored when composing the output.
         * @param categoryBlacklist a collection of String values to explicitly exclude from the output, all other
         *                          possible entries will be implicitly included
         * @return this builder instance
         */
        public CifOptionsBuilder categoryBlacklist(String... categoryBlacklist) {
            return categoryBlacklist(Arrays.asList(categoryBlacklist));
        }

        /**
         * Add entries to the category blacklist. Any entries will be ignored when composing the output.
         * @param categoryBlacklist a collection of String values to explicitly exclude from the output, all other
         *                          possible entries will be implicitly included
         * @return this builder instance
         */
        public CifOptionsBuilder categoryBlacklist(List<String> categoryBlacklist) {
            this.categoryBlacklist.addAll(categoryBlacklist);
            return this;
        }

        /**
         * Add entries to the column whitelist. If the whitelist has any entries, the column must be explicitly
         * contained for the column to appear in the output. Names follow the pattern
         * <code>category_name.column_name</code>.
         * @param columnWhitelist a collection of String values to explicitly include in the output, all other
         *                        possible entries will be implicitly excluded
         * @return this builder instance
         */
        public CifOptionsBuilder columnWhitelist(String... columnWhitelist) {
            return columnWhitelist(Arrays.asList(columnWhitelist));
        }

        /**
         * Add entries to the column whitelist. If the whitelist has any entries, the column must be explicitly
         * contained for the column to appear in the output. Names follow the pattern
         * <code>category_name.column_name</code>.
         * @param columnWhitelist a collection of String values to explicitly include in the output, all other
         *                        possible entries will be implicitly excluded
         * @return this builder instance
         */
        public CifOptionsBuilder columnWhitelist(List<String> columnWhitelist) {
            this.columnWhitelist.addAll(columnWhitelist);
            return this;
        }

        /**
         * Add entries to the column blacklist. Any entries will be ignored when composing the output. Names follow the
         * pattern <code>category_name.column_name</code>.
         * @param columnBlacklist a collection of String values to explicitly exclude from the output, all other
         *                        possible entries will be implicitly included
         * @return this builder instance
         */
        public CifOptionsBuilder columnBlacklist(String... columnBlacklist) {
            return columnBlacklist(Arrays.asList(columnBlacklist));
        }

        /**
         * Add entries to the column blacklist. Any entries will be ignored when composing the output. Names follow the
         * pattern <code>category_name.column_name</code>.
         * @param columnBlacklist a collection of String values to explicitly exclude from the output, all other
         *                        possible entries will be implicitly included
         * @return this builder instance
         */
        public CifOptionsBuilder columnBlacklist(List<String> columnBlacklist) {
            this.columnBlacklist.addAll(columnBlacklist);
            return this;
        }

        /**
         * Exit this builder and retrive the actual, immutable {@link CifOptions} instance.
         * @return a {@link CifOptions} instance
         */
        public CifOptions build() {
            return new CifOptions(this);
        }
    }
}
