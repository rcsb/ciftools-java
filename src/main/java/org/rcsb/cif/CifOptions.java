package org.rcsb.cif;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.rcsb.cif.binary.codec.BinaryCifCodec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * <p>Allows to set options for CIF writing. Acquire by calling {@link CifOptions#builder()}. Pass into {@link CifIO}
 * functions. Use white- and blacklist functions to select a subset of categories and/or columns to write. If a value is
 * present in both white- and blacklist, the blacklist values will trump the whitelist.</p>
 *
 * <p>For now only writer classes will respect these options. They can be passed to reader classes as well, however
 * there are currently no relevant options for CIF reading.</p>
 */
public class CifOptions {
    private final boolean gzip;
    private final String encoder;
    private final String fetchUrl;
    private final List<String> categoryWhitelist;
    private final List<String> categoryBlacklist;
    private final List<String> columnWhitelist;
    private final List<String> columnBlacklist;
    private final List<EncodingStrategyHint> encodingStrategyHints;
    private final CifOptionsBuilder.FileFormat fileFormat;

    private CifOptions(CifOptionsBuilder builder) {
        this.gzip = builder.gzip;
        this.encoder = builder.encoder;
        this.fetchUrl = builder.fetchUrl;
        this.categoryWhitelist = builder.categoryWhitelist;
        this.categoryBlacklist = builder.categoryBlacklist;
        this.columnWhitelist = builder.columnWhitelist;
        this.columnBlacklist = builder.columnBlacklist;
        this.fileFormat = builder.fileFormat;

        // ensure that column whitelist to propagated to categories
        List<String> categoriesToAdd = columnWhitelist.stream()
                .map(fullColumnName -> fullColumnName.split("\\.")[0])
                .distinct()
                .filter(categoryName -> !columnWhitelist.contains(categoryName))
                .collect(Collectors.toList());
        categoryWhitelist.addAll(categoriesToAdd);

        this.encodingStrategyHints = builder.encodingStrategyHints;
    }

    /**
     * Allows for downstream GZIP operations.
     * @return <code>true</code> if the output should be gzipped
     */
    public boolean isGzip() {
        return gzip;
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
        } else return categoryWhitelist.isEmpty() || categoryWhitelist.contains(categoryName);
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
        } else return columnWhitelist.stream().noneMatch(fcn -> fcn.split("\\.")[0].equals(categoryName)) ||
                columnWhitelist.contains(fullColumnName);
    }

    /**
     * Reports whether a particular encoding or floating-point precision is specified for this particular column.
     * @param categoryName the category name to check
     * @param columnName the column name to check
     * @return an optional wrapping an {@link EncodingStrategyHint}
     */
    public Optional<EncodingStrategyHint> getEncodingStrategyHint(String categoryName, String columnName) {
        return encodingStrategyHints.stream()
                .filter(encodingStrategyHint -> encodingStrategyHint.getCategoryName().equals(categoryName) &&
                        encodingStrategyHint.getColumnName().equals(columnName))
                .findFirst();
    }

    /**
     * Reports if the input file format was specified for reading.
     * @return the {@link CifOptionsBuilder.FileFormat} if set and <code>null</code> otherwise
     */
    public CifOptionsBuilder.FileFormat getFileFormat() {
        return fileFormat;
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
        private static final String FETCH_URL = "https://models.rcsb.org/%s.bcif";

        private boolean gzip = false;
        private String encoder = BinaryCifCodec.CODEC_NAME;
        private String fetchUrl = FETCH_URL;
        private final List<String> categoryWhitelist = new ArrayList<>();
        private final List<String> categoryBlacklist = new ArrayList<>();
        private final List<String> columnWhitelist = new ArrayList<>();
        private final List<String> columnBlacklist = new ArrayList<>();
        private final List<EncodingStrategyHint> encodingStrategyHints = new ArrayList<>();
        private FileFormat fileFormat;

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
         * @return this builder instance
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

        // Lazy initialization if no JSON is desired
        static class GsonHolder {
            static final Gson instance = new Gson();
        }

        static class ListTypeHolder {
            static final Type instance = new TypeToken<ArrayList<EncodingStrategyHint>>(){}.getType();
        }

        /**
         * Read {@link EncodingStrategyHint} data from a JSON file.
         * @param path the file to read
         * @return this builder instance
         */
        public CifOptionsBuilder encodingStrategyHint(Path path) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
                return encodingStrategyHint(bufferedReader.lines().collect(Collectors.joining()));
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        /**
         * Read {@link EncodingStrategyHint} data from a JSON string.
         * @param json the string to read
         * @return this builder instance
         */
        public CifOptionsBuilder encodingStrategyHint(String json) {
            this.encodingStrategyHints.addAll(GsonHolder.instance.fromJson(json, ListTypeHolder.instance));
            return this;
        }

        /**
         * Manually specify encoding strategy and precision for a column.
         * @param categoryName the category name
         * @param columnName the column name
         * @param encoding the encoding to employ: "pack" | "rle" | "delta" | "delta-rle"
         * @param precision the number of decimal places to keep during {@link org.rcsb.cif.binary.encoding.FixedPointEncoding}
         * @return this builder instance
         */
        public CifOptionsBuilder encodingStrategyHint(String categoryName, String columnName, String encoding, int precision) {
            this.encodingStrategyHints.add(new EncodingStrategyHint(categoryName, columnName, encoding, precision));
            return this;
        }

        /**
         * Manually specify encoding strategy and precision for a column.
         * @param encodingStrategyHints the hints to process
         * @return this builder instance
         */
        public CifOptionsBuilder encodingStrategyHint(EncodingStrategyHint... encodingStrategyHints) {
            return encodingStrategyHint(Arrays.asList(encodingStrategyHints));
        }

        /**
         * Manually specify encoding strategy and precision for a column.
         * @param encodingStrategyHints the hints to process
         * @return this builder instance
         */
        public CifOptionsBuilder encodingStrategyHint(List<EncodingStrategyHint> encodingStrategyHints) {
            this.encodingStrategyHints.addAll(encodingStrategyHints);
            return this;
        }

        /**
         * Supported file formats.
         */
        public enum FileFormat {
            /**
             * <code>.bcif</code>
             */
            BCIF_PLAIN,
            /**
             * <code>.bcif.gz</code>
             */
            BCIF_GZIPPED,
            /**
             * <code>.cif</code>
             */
            CIF_PLAIN,
            /**
             * <code>.cif.gz</code>
             */
            CIF_GZIPPED
        }

        /**
         * The library can automatically detect compression and file format. This involves some guessing and can be
         * omitted by specifying the format explicitly. This may increase performance and will improve safety when
         * malformed or unexpected files are handled.
         * @param fileFormat an instance of the supported file formats
         * @return this builder instance
         */
        public CifOptionsBuilder fileFormatHint(FileFormat fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * Exit this builder and retrieve the actual, immutable {@link CifOptions} instance.
         * @return a {@link CifOptions} instance
         */
        public CifOptions build() {
            return new CifOptions(this);
        }
    }
}
