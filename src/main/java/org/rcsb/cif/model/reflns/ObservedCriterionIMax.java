package org.rcsb.cif.model.reflns;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ObservedCriterionIMax extends SingleRowFloatColumn {
    public ObservedCriterionIMax(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ObservedCriterionIMax(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ObservedCriterionIMax(String name) {
        super(name);
    }
}
