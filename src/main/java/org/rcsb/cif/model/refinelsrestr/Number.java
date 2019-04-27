package org.rcsb.cif.model.refinelsrestr;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Number extends IntColumn {
    public Number(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Number(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Number(String name) {
        super(name);
    }
}
