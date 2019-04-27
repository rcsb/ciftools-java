package org.rcsb.cif.model.software;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Location extends StrColumn {
    public Location(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Location(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Location(String name) {
        super(name);
    }
}
