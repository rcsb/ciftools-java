package org.rcsb.cif.model.pdbxentitysrcgenclonerecombination;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RecombinationEnzymes extends StrColumn {
    public RecombinationEnzymes(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RecombinationEnzymes(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RecombinationEnzymes(String name) {
        super(name);
    }
}
