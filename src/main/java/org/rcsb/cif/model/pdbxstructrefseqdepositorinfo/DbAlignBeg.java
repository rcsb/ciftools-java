package org.rcsb.cif.model.pdbxstructrefseqdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DbAlignBeg extends SingleRowIntColumn {
    public DbAlignBeg(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DbAlignBeg(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DbAlignBeg(String name) {
        super(name);
    }
}
