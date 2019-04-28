package org.rcsb.cif.model.generated.pdbxconstructfeature;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StartSeq extends IntColumn {
    public StartSeq(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public StartSeq(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public StartSeq(String name) {
        super(name);
    }
}
