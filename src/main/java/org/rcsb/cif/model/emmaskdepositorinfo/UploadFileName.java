package org.rcsb.cif.model.emmaskdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class UploadFileName extends SingleRowStrColumn {
    public UploadFileName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public UploadFileName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public UploadFileName(String name) {
        super(name);
    }
}
