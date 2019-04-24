package org.rcsb.cif.model.structsheetrange;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class BegAuthCompId extends StrColumn {
    public BegAuthCompId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public BegAuthCompId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public BegAuthCompId(String name) {
        super(name);
    }
}
