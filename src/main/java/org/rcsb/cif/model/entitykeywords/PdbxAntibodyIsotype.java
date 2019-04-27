package org.rcsb.cif.model.entitykeywords;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAntibodyIsotype extends StrColumn {
    public PdbxAntibodyIsotype(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxAntibodyIsotype(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxAntibodyIsotype(String name) {
        super(name);
    }
}
