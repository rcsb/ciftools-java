package org.rcsb.cif.model.diffrnrefln;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CountsBg1 extends SingleRowIntColumn {
    public CountsBg1(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CountsBg1(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CountsBg1(String name) {
        super(name);
    }
}
