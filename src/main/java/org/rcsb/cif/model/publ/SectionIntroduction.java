package org.rcsb.cif.model.publ;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SectionIntroduction extends SingleRowStrColumn {
    public SectionIntroduction(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SectionIntroduction(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SectionIntroduction(String name) {
        super(name);
    }
}
