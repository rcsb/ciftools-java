package org.rcsb.cif.model.pdbxnonstandardlist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LabelSeqNum extends StrColumn {
    public LabelSeqNum(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LabelSeqNum(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LabelSeqNum(String name) {
        super(name);
    }
}
