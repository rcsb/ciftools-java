package org.rcsb.cif.model.pdbxnmrspectraldim;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SpectralRegion extends StrColumn {
    public SpectralRegion(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SpectralRegion(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SpectralRegion(String name) {
        super(name);
    }
}
