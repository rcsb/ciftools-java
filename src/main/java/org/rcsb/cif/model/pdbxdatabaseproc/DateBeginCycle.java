package org.rcsb.cif.model.pdbxdatabaseproc;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DateBeginCycle extends SingleRowStrColumn {
    public DateBeginCycle(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DateBeginCycle(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DateBeginCycle(String name) {
        super(name);
    }
}
