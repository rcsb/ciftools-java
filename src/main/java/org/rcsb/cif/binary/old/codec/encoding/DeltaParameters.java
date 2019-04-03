package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.CodecParameters;

public class DeltaParameters implements CodecParameters {
    private final int origin;

    public DeltaParameters(int origin) {
        this.origin = origin;
    }

    public int getOrigin() {
        return origin;
    }

    @Override
    public String getKind() {
        return "Delta";
    }

    // TODO srcType
}
