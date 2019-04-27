package org.rcsb.cif.model.pdbxentitysrcgenproteolysis;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CleavageTemperature extends FloatColumn {
    public CleavageTemperature(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CleavageTemperature(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CleavageTemperature(String name) {
        super(name);
    }
}
