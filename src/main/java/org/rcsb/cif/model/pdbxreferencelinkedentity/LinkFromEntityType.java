package org.rcsb.cif.model.pdbxreferencelinkedentity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LinkFromEntityType extends StrColumn {
    public LinkFromEntityType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LinkFromEntityType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LinkFromEntityType(String name) {
        super(name);
    }
}
