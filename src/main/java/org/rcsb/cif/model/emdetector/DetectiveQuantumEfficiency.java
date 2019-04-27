package org.rcsb.cif.model.emdetector;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DetectiveQuantumEfficiency extends SingleRowFloatColumn {
    public DetectiveQuantumEfficiency(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DetectiveQuantumEfficiency(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DetectiveQuantumEfficiency(String name) {
        super(name);
    }
}
