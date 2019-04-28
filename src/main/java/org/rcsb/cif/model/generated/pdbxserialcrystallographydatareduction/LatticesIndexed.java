package org.rcsb.cif.model.generated.pdbxserialcrystallographydatareduction;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LatticesIndexed extends SingleRowIntColumn {
    public LatticesIndexed(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LatticesIndexed(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LatticesIndexed(String name) {
        super(name);
    }
}
