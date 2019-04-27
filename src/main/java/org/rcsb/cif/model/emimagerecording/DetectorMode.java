package org.rcsb.cif.model.emimagerecording;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DetectorMode extends SingleRowStrColumn {
    public DetectorMode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DetectorMode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DetectorMode(String name) {
        super(name);
    }
}
