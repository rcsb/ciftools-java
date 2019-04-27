package org.rcsb.cif.model.pdbxdccgeometry;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class BondOverallRms extends FloatColumn {
    public BondOverallRms(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public BondOverallRms(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public BondOverallRms(String name) {
        super(name);
    }
}
