package org.rcsb.cif.model.em3dreconstruction;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MagnificationCalibration extends SingleRowStrColumn {
    public MagnificationCalibration(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MagnificationCalibration(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MagnificationCalibration(String name) {
        super(name);
    }
}
