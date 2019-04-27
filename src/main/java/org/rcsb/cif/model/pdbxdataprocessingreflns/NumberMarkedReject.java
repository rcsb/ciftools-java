package org.rcsb.cif.model.pdbxdataprocessingreflns;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumberMarkedReject extends IntColumn {
    public NumberMarkedReject(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumberMarkedReject(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumberMarkedReject(String name) {
        super(name);
    }
}
