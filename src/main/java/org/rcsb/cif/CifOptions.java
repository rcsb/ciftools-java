package org.rcsb.cif;

import org.rcsb.cif.binary.codec.Codec;

// TODO doc
public class CifOptions {
    private final boolean gzip;
    private final boolean singleRow;
    private final String encoder;
    private final String fetchUrl;

    // TODO filtering
    public CifOptions(CifOptionsBuilder builder) {
        this.gzip = builder.gzip;
        this.singleRow = builder.singleRow;
        this.encoder = builder.encoder;
        this.fetchUrl = builder.fetchUrl;
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

        public CifOptions build() {
            return new CifOptions(this);
        }
    }
}
