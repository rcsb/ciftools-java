package org.rcsb.cif;

public class CifWriterOptions {
    private final boolean gzip;

    // TODO filtering
    CifWriterOptions(CifWriterOptionsBuilder builder) {
        this.gzip = builder.gzip;
    }

    public boolean isGzip() {
        return gzip;
    }

    static class CifWriterOptionsBuilder {
        boolean gzip;
    }
}
