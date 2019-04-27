package org.rcsb.cif.model.structbiol;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxFormulaWeight extends FloatColumn {
    public PdbxFormulaWeight(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxFormulaWeight(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxFormulaWeight(String name) {
        super(name);
    }
}
