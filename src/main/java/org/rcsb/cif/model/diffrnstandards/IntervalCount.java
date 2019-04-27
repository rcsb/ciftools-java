package org.rcsb.cif.model.diffrnstandards;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class IntervalCount extends SingleRowIntColumn {
    public IntervalCount(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public IntervalCount(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public IntervalCount(String name) {
        super(name);
    }
}
