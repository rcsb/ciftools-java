package org.rcsb.cif.model.pdbxremediationatomsitemapping;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PreOccupancy extends FloatColumn {
    public PreOccupancy(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PreOccupancy(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PreOccupancy(String name) {
        super(name);
    }
}
