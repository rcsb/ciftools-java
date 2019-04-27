package org.rcsb.cif.model.pdbxdataprocessingreflns;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PercentMarkedReject extends FloatColumn {
    public PercentMarkedReject(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PercentMarkedReject(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PercentMarkedReject(String name) {
        super(name);
    }
}
