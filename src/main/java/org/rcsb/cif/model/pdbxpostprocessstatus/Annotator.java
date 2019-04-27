package org.rcsb.cif.model.pdbxpostprocessstatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Annotator extends SingleRowStrColumn {
    public Annotator(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Annotator(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Annotator(String name) {
        super(name);
    }
}
