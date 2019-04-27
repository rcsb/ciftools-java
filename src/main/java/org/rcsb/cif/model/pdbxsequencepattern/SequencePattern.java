package org.rcsb.cif.model.pdbxsequencepattern;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SequencePattern extends StrColumn {
    public SequencePattern(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SequencePattern(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SequencePattern(String name) {
        super(name);
    }
}
