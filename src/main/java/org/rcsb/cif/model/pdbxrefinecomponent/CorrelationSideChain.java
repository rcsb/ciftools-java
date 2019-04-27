package org.rcsb.cif.model.pdbxrefinecomponent;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CorrelationSideChain extends SingleRowFloatColumn {
    public CorrelationSideChain(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CorrelationSideChain(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CorrelationSideChain(String name) {
        super(name);
    }
}
