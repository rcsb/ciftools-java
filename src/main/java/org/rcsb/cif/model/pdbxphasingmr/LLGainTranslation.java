package org.rcsb.cif.model.pdbxphasingmr;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LLGainTranslation extends SingleRowFloatColumn {
    public LLGainTranslation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LLGainTranslation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LLGainTranslation(String name) {
        super(name);
    }
}
