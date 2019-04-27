package org.rcsb.cif.model.phasingmirdersite;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class OccupancyIso extends FloatColumn {
    public OccupancyIso(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public OccupancyIso(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public OccupancyIso(String name) {
        super(name);
    }
}
