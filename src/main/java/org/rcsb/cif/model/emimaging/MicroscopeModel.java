package org.rcsb.cif.model.emimaging;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MicroscopeModel extends SingleRowStrColumn {
    public MicroscopeModel(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MicroscopeModel(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MicroscopeModel(String name) {
        super(name);
    }
}
