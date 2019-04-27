package org.rcsb.cif.model.emdiffractionstats;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class HighResolution extends SingleRowFloatColumn {
    public HighResolution(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public HighResolution(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public HighResolution(String name) {
        super(name);
    }
}
