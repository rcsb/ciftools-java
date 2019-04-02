package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.CodecParameters;

public class FixedPointParameters implements CodecParameters {
    private final int factor;

    public FixedPointParameters(int factor) {
        this.factor = factor;
    }

    public int getFactor() {
        return factor;
    }
}
