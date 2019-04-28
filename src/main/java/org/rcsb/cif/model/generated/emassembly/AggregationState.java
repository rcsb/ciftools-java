package org.rcsb.cif.model.generated.emassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AggregationState extends SingleRowStrColumn {
    public AggregationState(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AggregationState(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AggregationState(String name) {
        super(name);
    }
}
