package org.rcsb.cif.model.chemicalformula;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Analytical extends SingleRowStrColumn {
    public Analytical(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Analytical(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Analytical(String name) {
        super(name);
    }
}
