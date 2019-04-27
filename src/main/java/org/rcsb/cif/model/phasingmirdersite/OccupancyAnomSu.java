package org.rcsb.cif.model.phasingmirdersite;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class OccupancyAnomSu extends FloatColumn {
    public OccupancyAnomSu(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public OccupancyAnomSu(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public OccupancyAnomSu(String name) {
        super(name);
    }
}
