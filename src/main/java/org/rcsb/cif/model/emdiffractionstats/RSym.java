package org.rcsb.cif.model.emdiffractionstats;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RSym extends SingleRowFloatColumn {
    public RSym(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RSym(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RSym(String name) {
        super(name);
    }
}
