package org.rcsb.cif.model.pdbxnmrensemblerms;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChainRangeBegin extends StrColumn {
    public ChainRangeBegin(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ChainRangeBegin(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ChainRangeBegin(String name) {
        super(name);
    }
}
