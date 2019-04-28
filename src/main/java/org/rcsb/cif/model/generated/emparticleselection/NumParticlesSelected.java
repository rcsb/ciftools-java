package org.rcsb.cif.model.generated.emparticleselection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumParticlesSelected extends SingleRowIntColumn {
    public NumParticlesSelected(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumParticlesSelected(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumParticlesSelected(String name) {
        super(name);
    }
}
