package org.rcsb.cif.model.pdbxsolventinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumbPerAsymUnit extends IntColumn {
    public NumbPerAsymUnit(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumbPerAsymUnit(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumbPerAsymUnit(String name) {
        super(name);
    }
}
