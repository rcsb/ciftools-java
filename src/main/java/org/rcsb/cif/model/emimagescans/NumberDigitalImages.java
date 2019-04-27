package org.rcsb.cif.model.emimagescans;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumberDigitalImages extends SingleRowIntColumn {
    public NumberDigitalImages(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumberDigitalImages(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumberDigitalImages(String name) {
        super(name);
    }
}
