package org.rcsb.cif.model.structrefseqdif;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxOrdinal extends SingleRowIntColumn {
    public PdbxOrdinal(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxOrdinal(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxOrdinal(String name) {
        super(name);
    }
}
