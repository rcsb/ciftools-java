package org.rcsb.cif.model.refinelsrestr;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRestraintFunction extends StrColumn {
    public PdbxRestraintFunction(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxRestraintFunction(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxRestraintFunction(String name) {
        super(name);
    }
}
