package org.rcsb.cif.model.pdbxentityprodprotocol;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Protocol extends StrColumn {
    public Protocol(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Protocol(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Protocol(String name) {
        super(name);
    }
}
