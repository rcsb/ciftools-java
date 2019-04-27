package org.rcsb.cif.model.pdbxunobsorzerooccatoms;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class OccupancyFlag extends StrColumn {
    public OccupancyFlag(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public OccupancyFlag(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public OccupancyFlag(String name) {
        super(name);
    }
}
