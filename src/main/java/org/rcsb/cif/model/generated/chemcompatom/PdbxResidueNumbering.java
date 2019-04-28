package org.rcsb.cif.model.generated.chemcompatom;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxResidueNumbering extends IntColumn {
    public PdbxResidueNumbering(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxResidueNumbering(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxResidueNumbering(String name) {
        super(name);
    }
}
