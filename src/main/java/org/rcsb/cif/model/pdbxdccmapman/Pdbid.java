package org.rcsb.cif.model.pdbxdccmapman;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Pdbid extends StrColumn {
    public Pdbid(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Pdbid(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Pdbid(String name) {
        super(name);
    }
}
