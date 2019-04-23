package org.rcsb.cif.model.chemcomp;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class FormulaWeight extends FloatColumn {
    public FormulaWeight(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FormulaWeight(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FormulaWeight(String name) {
        super(name);
    }
}
