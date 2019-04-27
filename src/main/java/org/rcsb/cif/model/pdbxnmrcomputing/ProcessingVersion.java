package org.rcsb.cif.model.pdbxnmrcomputing;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ProcessingVersion extends SingleRowStrColumn {
    public ProcessingVersion(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ProcessingVersion(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ProcessingVersion(String name) {
        super(name);
    }
}
