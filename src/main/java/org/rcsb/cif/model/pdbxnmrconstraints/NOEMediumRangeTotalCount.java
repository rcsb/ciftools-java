package org.rcsb.cif.model.pdbxnmrconstraints;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NOEMediumRangeTotalCount extends IntColumn {
    public NOEMediumRangeTotalCount(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NOEMediumRangeTotalCount(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NOEMediumRangeTotalCount(String name) {
        super(name);
    }
}
