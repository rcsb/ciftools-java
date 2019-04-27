package org.rcsb.cif.model.atomsite;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DisorderAssembly extends StrColumn {
    public DisorderAssembly(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DisorderAssembly(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DisorderAssembly(String name) {
        super(name);
    }
}
