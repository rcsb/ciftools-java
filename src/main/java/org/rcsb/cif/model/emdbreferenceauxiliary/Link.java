package org.rcsb.cif.model.emdbreferenceauxiliary;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Link extends StrColumn {
    public Link(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Link(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Link(String name) {
        super(name);
    }
}
