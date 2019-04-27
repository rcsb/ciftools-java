package org.rcsb.cif.model.emmapdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class UploadFormat extends SingleRowStrColumn {
    public UploadFormat(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public UploadFormat(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public UploadFormat(String name) {
        super(name);
    }
}
