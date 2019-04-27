package org.rcsb.cif.model.pdbxentrydetails;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SequenceDetails extends SingleRowStrColumn {
    public SequenceDetails(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SequenceDetails(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SequenceDetails(String name) {
        super(name);
    }
}
