package org.rcsb.cif.model.publ;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SectionTableLegends extends SingleRowStrColumn {
    public SectionTableLegends(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SectionTableLegends(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SectionTableLegends(String name) {
        super(name);
    }
}
