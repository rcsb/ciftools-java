package org.rcsb.cif;

import org.rcsb.cif.binary.codec.Codec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO doc
public class CifOptions {
    private final boolean gzip;
    private final boolean singleRow;
    private final String encoder;
    private final String fetchUrl;
    private final List<String> categoryWhitelist;
    private final List<String> categoryBlacklist;
    private final List<String> columnWhitelist;
    private final List<String> columnBlacklist;

    public CifOptions(CifOptionsBuilder builder) {
        this.gzip = builder.gzip;
        this.singleRow = builder.singleRow;
        this.encoder = builder.encoder;
        this.fetchUrl = builder.fetchUrl;
        this.categoryWhitelist = builder.categoryWhitelist;
        this.categoryBlacklist = builder.categoryBlacklist;
        this.columnWhitelist = builder.columnWhitelist;
        this.columnBlacklist = builder.columnBlacklist;
    }

    public boolean isGzip() {
        return gzip;
    }

    public boolean isSingleRow() {
        return singleRow;
    }

    public String getEncoder() {
        return encoder;
    }

    public String getFetchUrl() {
        return fetchUrl;
    }

    public boolean filterCategory(String categoryName) {
        if (categoryBlacklist.contains(categoryName)) {
            return false;
        } else return categoryWhitelist.size() <= 0 || categoryWhitelist.contains(categoryName);
    }

    public boolean filterColumn(String categoryName, String columnName) {
        String fullColumnName = categoryName + "." + columnName;
        if (columnBlacklist.contains(fullColumnName)) {
            return false;
        } else return columnWhitelist.size() <= 0 || categoryWhitelist.contains(fullColumnName);
    }

    public static CifOptionsBuilder builder() {
        return new CifOptionsBuilder();
    }

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

        public CifOptionsBuilder gzip(boolean gzip) {
            this.gzip = gzip;
            return this;
        }

        public CifOptionsBuilder singleRow(boolean singleRow) {
            this.singleRow = singleRow;
            return this;
        }

        public CifOptionsBuilder encoder(String encoder) {
            this.encoder = encoder;
            return this;
        }

        public CifOptionsBuilder fetchUrl(String fetchUrl) {
            this.fetchUrl = fetchUrl;
            return this;
        }

        public CifOptionsBuilder categoryWhitelist(String... categoryWhitelist) {
            return categoryWhitelist(Arrays.asList(categoryWhitelist));
        }

        public CifOptionsBuilder categoryWhitelist(List<String> categoryWhitelist) {
            this.categoryWhitelist.addAll(categoryWhitelist);
            return this;
        }

        public CifOptionsBuilder categoryBlacklist(String... categoryBlacklist) {
            return categoryBlacklist(Arrays.asList(categoryBlacklist));
        }

        public CifOptionsBuilder categoryBlacklist(List<String> categoryBlacklist) {
            this.categoryBlacklist.addAll(categoryBlacklist);
            return this;
        }

        public CifOptionsBuilder columnWhitelist(String... columnWhitelist) {
            return columnWhitelist(Arrays.asList(columnWhitelist));
        }

        public CifOptionsBuilder columnWhitelist(List<String> columnWhitelist) {
            this.columnWhitelist.addAll(columnWhitelist);
            return this;
        }

        public CifOptionsBuilder columnBlacklist(String... columnBlacklist) {
            return columnBlacklist(Arrays.asList(columnBlacklist));
        }

        public CifOptionsBuilder columnBlacklist(List<String> columnBlacklist) {
            this.columnBlacklist.addAll(columnBlacklist);
            return this;
        }

        public CifOptions build() {
            return new CifOptions(this);
        }
    }
}
