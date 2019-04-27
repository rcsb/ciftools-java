package org.rcsb.cif.model.chemicalformula;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Moiety extends SingleRowStrColumn {
    public Moiety(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Moiety(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Moiety(String name) {
        super(name);
    }
}
