package org.rcsb.cif.model.entitypolyseq;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Hetero extends EnumColumn {
    public Hetero(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Hetero(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Hetero(String name) {
        super(name);
    }
}
