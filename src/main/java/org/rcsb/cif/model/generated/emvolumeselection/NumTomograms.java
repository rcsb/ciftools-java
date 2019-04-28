package org.rcsb.cif.model.generated.emvolumeselection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumTomograms extends SingleRowIntColumn {
    public NumTomograms(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumTomograms(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumTomograms(String name) {
        super(name);
    }
}
