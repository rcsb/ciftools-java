package org.rcsb.cif.model.generated.publ;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SectionComment extends SingleRowStrColumn {
    public SectionComment(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SectionComment(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SectionComment(String name) {
        super(name);
    }
}
