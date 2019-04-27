package org.rcsb.cif.model.pdbxentitynametaxonomy;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NameType extends StrColumn {
    public NameType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NameType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NameType(String name) {
        super(name);
    }
}
