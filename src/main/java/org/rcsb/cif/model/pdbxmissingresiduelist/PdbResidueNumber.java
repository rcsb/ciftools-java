package org.rcsb.cif.model.pdbxmissingresiduelist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbResidueNumber extends StrColumn {
    public PdbResidueNumber(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbResidueNumber(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbResidueNumber(String name) {
        super(name);
    }
}
