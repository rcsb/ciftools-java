package org.rcsb.cif.model.pdbxdepuientrydetails;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Country extends SingleRowStrColumn {
    public Country(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Country(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Country(String name) {
        super(name);
    }
}
