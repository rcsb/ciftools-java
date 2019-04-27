package org.rcsb.cif.model.pdbxsgproject;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class InitialOfCenter extends SingleRowStrColumn {
    public InitialOfCenter(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public InitialOfCenter(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public InitialOfCenter(String name) {
        super(name);
    }
}
