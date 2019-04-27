package org.rcsb.cif.model.emvolumeselection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumVolumesExtracted extends SingleRowIntColumn {
    public NumVolumesExtracted(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumVolumesExtracted(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumVolumesExtracted(String name) {
        super(name);
    }
}
