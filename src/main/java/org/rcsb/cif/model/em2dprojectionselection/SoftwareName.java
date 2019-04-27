package org.rcsb.cif.model.em2dprojectionselection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SoftwareName extends SingleRowStrColumn {
    public SoftwareName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SoftwareName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SoftwareName(String name) {
        super(name);
    }
}
