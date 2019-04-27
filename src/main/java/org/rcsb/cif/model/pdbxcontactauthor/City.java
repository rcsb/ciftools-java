package org.rcsb.cif.model.pdbxcontactauthor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class City extends SingleRowStrColumn {
    public City(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public City(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public City(String name) {
        super(name);
    }
}
