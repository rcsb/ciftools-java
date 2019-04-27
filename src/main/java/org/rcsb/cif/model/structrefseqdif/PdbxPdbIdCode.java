package org.rcsb.cif.model.structrefseqdif;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPdbIdCode extends SingleRowStrColumn {
    public PdbxPdbIdCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxPdbIdCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxPdbIdCode(String name) {
        super(name);
    }
}
