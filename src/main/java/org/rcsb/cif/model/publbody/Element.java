package org.rcsb.cif.model.publbody;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Element extends StrColumn {
    public Element(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Element(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Element(String name) {
        super(name);
    }
}
