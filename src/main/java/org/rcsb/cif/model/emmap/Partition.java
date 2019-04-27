package org.rcsb.cif.model.emmap;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Partition extends SingleRowIntColumn {
    public Partition(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Partition(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Partition(String name) {
        super(name);
    }
}
