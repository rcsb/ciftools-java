package org.rcsb.cif.model.ndboriginalndbcoordinates;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CoordSection extends StrColumn {
    public CoordSection(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CoordSection(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CoordSection(String name) {
        super(name);
    }
}
