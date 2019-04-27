package org.rcsb.cif.model.embuffercomponent;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Concentration extends FloatColumn {
    public Concentration(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Concentration(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Concentration(String name) {
        super(name);
    }
}
