package org.rcsb.cif.model.reflns;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNumberMeasuredAll extends SingleRowIntColumn {
    public PdbxNumberMeasuredAll(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxNumberMeasuredAll(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxNumberMeasuredAll(String name) {
        super(name);
    }
}
