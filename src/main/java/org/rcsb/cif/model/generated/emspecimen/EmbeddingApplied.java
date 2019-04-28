package org.rcsb.cif.model.generated.emspecimen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmbeddingApplied extends SingleRowStrColumn {
    public EmbeddingApplied(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EmbeddingApplied(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EmbeddingApplied(String name) {
        super(name);
    }
}
