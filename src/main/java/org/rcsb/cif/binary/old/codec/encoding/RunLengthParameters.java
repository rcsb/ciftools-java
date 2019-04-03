package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.CodecParameters;

class RunLengthParameters implements CodecParameters {
    @Override
    public String getKind() {
        return "RunLength";
    }

    // TODO srcSize, srcType
}
