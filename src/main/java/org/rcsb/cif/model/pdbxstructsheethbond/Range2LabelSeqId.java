package org.rcsb.cif.model.pdbxstructsheethbond;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Range2LabelSeqId extends IntColumn {
    public Range2LabelSeqId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Range2LabelSeqId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Range2LabelSeqId(String name) {
        super(name);
    }
}
