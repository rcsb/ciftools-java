package org.rcsb.cif.model.generated.pdbxauditrevisioncategory;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Category extends StrColumn {
    public Category(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Category(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Category(String name) {
        super(name);
    }
}
