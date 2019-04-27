package org.rcsb.cif.model.diffrnsource;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Source extends SingleRowStrColumn {
    public Source(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Source(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Source(String name) {
        super(name);
    }
}
