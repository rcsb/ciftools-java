package org.rcsb.cif.model.software;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Version extends StrColumn {
    public Version(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Version(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Version(String name) {
        super(name);
    }
}
