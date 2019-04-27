package org.rcsb.cif.model.diffrnmeasurement;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Device extends SingleRowStrColumn {
    public Device(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Device(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Device(String name) {
        super(name);
    }
}
