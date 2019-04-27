package org.rcsb.cif.model.chemcomptorvalue;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Dist extends FloatColumn {
    public Dist(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Dist(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Dist(String name) {
        super(name);
    }
}
