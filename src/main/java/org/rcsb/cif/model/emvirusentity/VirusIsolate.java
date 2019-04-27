package org.rcsb.cif.model.emvirusentity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class VirusIsolate extends StrColumn {
    public VirusIsolate(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public VirusIsolate(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public VirusIsolate(String name) {
        super(name);
    }
}
