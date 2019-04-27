package org.rcsb.cif.model.pdbxdatabasestatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DateNmrConstraints extends SingleRowStrColumn {
    public DateNmrConstraints(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DateNmrConstraints(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DateNmrConstraints(String name) {
        super(name);
    }
}
