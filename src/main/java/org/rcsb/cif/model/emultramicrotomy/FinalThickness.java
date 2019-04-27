package org.rcsb.cif.model.emultramicrotomy;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FinalThickness extends IntColumn {
    public FinalThickness(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FinalThickness(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FinalThickness(String name) {
        super(name);
    }
}
