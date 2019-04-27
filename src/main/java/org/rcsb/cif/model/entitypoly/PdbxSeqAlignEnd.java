package org.rcsb.cif.model.entitypoly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSeqAlignEnd extends IntColumn {
    public PdbxSeqAlignEnd(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxSeqAlignEnd(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxSeqAlignEnd(String name) {
        super(name);
    }
}
