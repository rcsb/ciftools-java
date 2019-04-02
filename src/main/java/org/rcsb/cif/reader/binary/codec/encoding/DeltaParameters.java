package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.CodecParameters;

public class DeltaParameters implements CodecParameters {
    private final int origin;

    public DeltaParameters(int origin) {
        this.origin = origin;
    }

    public int getOrigin() {
        return origin;
    }
}
