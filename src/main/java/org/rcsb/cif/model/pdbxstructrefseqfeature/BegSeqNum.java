package org.rcsb.cif.model.pdbxstructrefseqfeature;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class BegSeqNum extends SingleRowStrColumn {
    public BegSeqNum(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public BegSeqNum(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public BegSeqNum(String name) {
        super(name);
    }
}
