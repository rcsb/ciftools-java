package org.rcsb.cif.model.generated.emmap;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ContourLevelSource extends SingleRowStrColumn {
    public ContourLevelSource(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ContourLevelSource(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ContourLevelSource(String name) {
        super(name);
    }
}
