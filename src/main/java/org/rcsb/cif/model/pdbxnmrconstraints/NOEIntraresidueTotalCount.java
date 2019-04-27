package org.rcsb.cif.model.pdbxnmrconstraints;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NOEIntraresidueTotalCount extends IntColumn {
    public NOEIntraresidueTotalCount(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NOEIntraresidueTotalCount(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NOEIntraresidueTotalCount(String name) {
        super(name);
    }
}
