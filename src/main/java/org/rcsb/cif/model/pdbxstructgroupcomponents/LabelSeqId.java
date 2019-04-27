package org.rcsb.cif.model.pdbxstructgroupcomponents;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LabelSeqId extends IntColumn {
    public LabelSeqId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LabelSeqId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LabelSeqId(String name) {
        super(name);
    }
}
