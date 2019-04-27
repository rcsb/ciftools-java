package org.rcsb.cif.model.pdbxserialcrystallographymeasurement;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FocalSpotSize extends SingleRowFloatColumn {
    public FocalSpotSize(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FocalSpotSize(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FocalSpotSize(String name) {
        super(name);
    }
}
