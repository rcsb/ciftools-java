package org.rcsb.cif.model.generated.emimaging;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RecordingTemperatureMaximum extends SingleRowFloatColumn {
    public RecordingTemperatureMaximum(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RecordingTemperatureMaximum(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RecordingTemperatureMaximum(String name) {
        super(name);
    }
}
