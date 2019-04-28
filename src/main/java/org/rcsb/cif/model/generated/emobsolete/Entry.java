package org.rcsb.cif.model.generated.emobsolete;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Entry extends StrColumn {
    public Entry(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Entry(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Entry(String name) {
        super(name);
    }
}
