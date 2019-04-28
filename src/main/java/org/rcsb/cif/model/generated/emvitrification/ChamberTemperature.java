package org.rcsb.cif.model.generated.emvitrification;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChamberTemperature extends SingleRowFloatColumn {
    public ChamberTemperature(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ChamberTemperature(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ChamberTemperature(String name) {
        super(name);
    }
}
