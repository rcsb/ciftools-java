package org.rcsb.cif.model.reflnsclass;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumberTotal extends IntColumn {
    public NumberTotal(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumberTotal(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumberTotal(String name) {
        super(name);
    }
}
