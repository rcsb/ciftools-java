package org.rcsb.cif.model.pdbxdatabasestatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DateDepositionForm extends SingleRowStrColumn {
    public DateDepositionForm(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DateDepositionForm(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DateDepositionForm(String name) {
        super(name);
    }
}
