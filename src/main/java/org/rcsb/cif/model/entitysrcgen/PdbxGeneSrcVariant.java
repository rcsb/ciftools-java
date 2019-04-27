package org.rcsb.cif.model.entitysrcgen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxGeneSrcVariant extends StrColumn {
    public PdbxGeneSrcVariant(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxGeneSrcVariant(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxGeneSrcVariant(String name) {
        super(name);
    }
}
