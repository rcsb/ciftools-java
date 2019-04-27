package org.rcsb.cif.model.pdbxpolyseqscheme;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Hetero extends StrColumn {
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
