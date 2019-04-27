package org.rcsb.cif.model.ementityassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EbiExpressionSystem extends SingleRowStrColumn {
    public EbiExpressionSystem(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EbiExpressionSystem(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EbiExpressionSystem(String name) {
        super(name);
    }
}
