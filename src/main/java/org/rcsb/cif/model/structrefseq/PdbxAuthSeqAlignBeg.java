package org.rcsb.cif.model.structrefseq;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAuthSeqAlignBeg extends SingleRowStrColumn {
    public PdbxAuthSeqAlignBeg(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxAuthSeqAlignBeg(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxAuthSeqAlignBeg(String name) {
        super(name);
    }
}
