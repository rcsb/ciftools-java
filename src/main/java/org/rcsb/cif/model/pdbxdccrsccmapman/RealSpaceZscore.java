package org.rcsb.cif.model.pdbxdccrsccmapman;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RealSpaceZscore extends FloatColumn {
    public RealSpaceZscore(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RealSpaceZscore(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RealSpaceZscore(String name) {
        super(name);
    }
}
