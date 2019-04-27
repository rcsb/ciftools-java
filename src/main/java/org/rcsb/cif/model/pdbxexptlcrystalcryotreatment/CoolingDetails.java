package org.rcsb.cif.model.pdbxexptlcrystalcryotreatment;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CoolingDetails extends SingleRowStrColumn {
    public CoolingDetails(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CoolingDetails(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CoolingDetails(String name) {
        super(name);
    }
}
