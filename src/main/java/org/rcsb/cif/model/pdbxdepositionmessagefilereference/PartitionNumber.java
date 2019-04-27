package org.rcsb.cif.model.pdbxdepositionmessagefilereference;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PartitionNumber extends StrColumn {
    public PartitionNumber(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PartitionNumber(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PartitionNumber(String name) {
        super(name);
    }
}
