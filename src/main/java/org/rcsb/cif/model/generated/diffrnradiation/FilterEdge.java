package org.rcsb.cif.model.generated.diffrnradiation;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FilterEdge extends SingleRowFloatColumn {
    public FilterEdge(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FilterEdge(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FilterEdge(String name) {
        super(name);
    }
}
