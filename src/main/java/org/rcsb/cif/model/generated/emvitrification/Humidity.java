package org.rcsb.cif.model.generated.emvitrification;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Humidity extends SingleRowFloatColumn {
    public Humidity(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Humidity(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Humidity(String name) {
        super(name);
    }
}
