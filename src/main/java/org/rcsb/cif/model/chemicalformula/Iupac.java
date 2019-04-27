package org.rcsb.cif.model.chemicalformula;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Iupac extends SingleRowStrColumn {
    public Iupac(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Iupac(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Iupac(String name) {
        super(name);
    }
}
