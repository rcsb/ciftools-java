package org.rcsb.cif.model.emvitrification;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TimeResolvedState extends SingleRowStrColumn {
    public TimeResolvedState(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TimeResolvedState(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TimeResolvedState(String name) {
        super(name);
    }
}
