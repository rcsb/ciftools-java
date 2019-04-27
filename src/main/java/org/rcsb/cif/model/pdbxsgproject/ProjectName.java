package org.rcsb.cif.model.pdbxsgproject;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ProjectName extends SingleRowStrColumn {
    public ProjectName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ProjectName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ProjectName(String name) {
        super(name);
    }
}
