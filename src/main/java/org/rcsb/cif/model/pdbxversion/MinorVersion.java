package org.rcsb.cif.model.pdbxversion;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MinorVersion extends SingleRowStrColumn {
    public MinorVersion(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MinorVersion(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MinorVersion(String name) {
        super(name);
    }
}
