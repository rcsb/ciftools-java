package org.rcsb.cif.model.ndbstructnabasepair;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Stagger extends FloatColumn {
    public Stagger(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Stagger(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Stagger(String name) {
        super(name);
    }
}
