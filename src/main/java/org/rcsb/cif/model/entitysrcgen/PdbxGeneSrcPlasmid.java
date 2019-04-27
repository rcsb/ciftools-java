package org.rcsb.cif.model.entitysrcgen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxGeneSrcPlasmid extends StrColumn {
    public PdbxGeneSrcPlasmid(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxGeneSrcPlasmid(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxGeneSrcPlasmid(String name) {
        super(name);
    }
}
