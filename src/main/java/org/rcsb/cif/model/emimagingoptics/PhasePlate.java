package org.rcsb.cif.model.emimagingoptics;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhasePlate extends SingleRowStrColumn {
    public PhasePlate(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PhasePlate(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PhasePlate(String name) {
        super(name);
    }
}
