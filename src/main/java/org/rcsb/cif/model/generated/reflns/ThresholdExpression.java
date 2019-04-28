package org.rcsb.cif.model.generated.reflns;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ThresholdExpression extends SingleRowStrColumn {
    public ThresholdExpression(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ThresholdExpression(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ThresholdExpression(String name) {
        super(name);
    }
}
