package org.rcsb.cif.model.pdbxfeaturemonomer;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Feature extends StrColumn {
    public Feature(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Feature(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Feature(String name) {
        super(name);
    }
}
