package org.rcsb.cif.model.pdbxdepositgroupindex;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuthFileLabel extends StrColumn {
    public AuthFileLabel(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AuthFileLabel(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AuthFileLabel(String name) {
        super(name);
    }
}
