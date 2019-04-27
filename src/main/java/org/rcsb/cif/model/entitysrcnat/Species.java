package org.rcsb.cif.model.entitysrcnat;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Species extends StrColumn {
    public Species(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Species(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Species(String name) {
        super(name);
    }
}
