package org.rcsb.cif.model.generated.pdbxxplorfile;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SerialNo extends SingleRowStrColumn {
    public SerialNo(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SerialNo(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SerialNo(String name) {
        super(name);
    }
}
