package org.rcsb.cif.model.structrefseq;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SeqAlignBeg extends SingleRowIntColumn {
    public SeqAlignBeg(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SeqAlignBeg(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SeqAlignBeg(String name) {
        super(name);
    }
}
