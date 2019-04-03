package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.CodecParameters;

public class FixedPointParameters implements CodecParameters {
    private final int factor;

    public FixedPointParameters(int factor) {
        this.factor = factor;
    }

    public int getFactor() {
        return factor;
    }

    @Override
    public String getKind() {
        return "FixedPoint";
    }

    // TODO srcType
}
