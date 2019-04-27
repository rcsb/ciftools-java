package org.rcsb.cif.model.publauthor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Footnote extends StrColumn {
    public Footnote(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Footnote(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Footnote(String name) {
        super(name);
    }
}
