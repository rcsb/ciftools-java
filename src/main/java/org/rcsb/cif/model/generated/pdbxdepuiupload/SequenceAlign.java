package org.rcsb.cif.model.generated.pdbxdepuiupload;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SequenceAlign extends StrColumn {
    public SequenceAlign(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SequenceAlign(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SequenceAlign(String name) {
        super(name);
    }
}
