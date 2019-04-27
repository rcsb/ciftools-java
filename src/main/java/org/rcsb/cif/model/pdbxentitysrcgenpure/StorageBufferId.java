package org.rcsb.cif.model.pdbxentitysrcgenpure;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StorageBufferId extends StrColumn {
    public StorageBufferId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public StorageBufferId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public StorageBufferId(String name) {
        super(name);
    }
}
