package org.rcsb.cif.model.pdbxentitysrcgencloneligation;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CleavageEnzymes extends StrColumn {
    public CleavageEnzymes(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CleavageEnzymes(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CleavageEnzymes(String name) {
        super(name);
    }
}
