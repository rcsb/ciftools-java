package org.rcsb.cif.model.pdbxserialcrystallographysampledeliveryfixedtarget;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CrystalsPerUnit extends SingleRowIntColumn {
    public CrystalsPerUnit(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CrystalsPerUnit(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CrystalsPerUnit(String name) {
        super(name);
    }
}
