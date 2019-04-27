package org.rcsb.cif.model.emimagerecording;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AverageExposureTime extends SingleRowFloatColumn {
    public AverageExposureTime(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AverageExposureTime(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AverageExposureTime(String name) {
        super(name);
    }
}
