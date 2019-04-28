package org.rcsb.cif.model.generated.pdbxconnectmodification;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ResName extends StrColumn {
    public ResName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ResName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ResName(String name) {
        super(name);
    }
}
