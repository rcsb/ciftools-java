package org.rcsb.cif.model.pdbxdatabaseproc;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DateEndCycle extends SingleRowStrColumn {
    public DateEndCycle(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DateEndCycle(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DateEndCycle(String name) {
        super(name);
    }
}
