package org.rcsb.cif.model.entitysrcgen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxGeneSrcAtcc extends StrColumn {
    public PdbxGeneSrcAtcc(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxGeneSrcAtcc(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxGeneSrcAtcc(String name) {
        super(name);
    }
}
