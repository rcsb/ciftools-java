package org.rcsb.cif.model.pdbxviewcategory;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CategoryViewName extends StrColumn {
    public CategoryViewName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CategoryViewName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CategoryViewName(String name) {
        super(name);
    }
}
