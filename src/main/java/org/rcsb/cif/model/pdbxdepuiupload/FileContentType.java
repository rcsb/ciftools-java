package org.rcsb.cif.model.pdbxdepuiupload;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FileContentType extends StrColumn {
    public FileContentType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FileContentType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FileContentType(String name) {
        super(name);
    }
}
