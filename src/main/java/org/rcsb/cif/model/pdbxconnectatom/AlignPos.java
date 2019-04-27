package org.rcsb.cif.model.pdbxconnectatom;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AlignPos extends IntColumn {
    public AlignPos(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AlignPos(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AlignPos(String name) {
        super(name);
    }
}
