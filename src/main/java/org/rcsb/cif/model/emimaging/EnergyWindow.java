package org.rcsb.cif.model.emimaging;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EnergyWindow extends SingleRowStrColumn {
    public EnergyWindow(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EnergyWindow(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EnergyWindow(String name) {
        super(name);
    }
}
