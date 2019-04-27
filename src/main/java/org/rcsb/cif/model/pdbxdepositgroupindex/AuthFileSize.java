package org.rcsb.cif.model.pdbxdepositgroupindex;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuthFileSize extends IntColumn {
    public AuthFileSize(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AuthFileSize(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AuthFileSize(String name) {
        super(name);
    }
}
