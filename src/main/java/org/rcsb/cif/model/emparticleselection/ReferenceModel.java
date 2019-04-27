package org.rcsb.cif.model.emparticleselection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReferenceModel extends SingleRowStrColumn {
    public ReferenceModel(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ReferenceModel(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ReferenceModel(String name) {
        super(name);
    }
}
