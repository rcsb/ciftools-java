package org.rcsb.cif.model.generated.pdbxrelatedexpdataset;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MetadataReference extends StrColumn {
    public MetadataReference(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MetadataReference(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MetadataReference(String name) {
        super(name);
    }
}
