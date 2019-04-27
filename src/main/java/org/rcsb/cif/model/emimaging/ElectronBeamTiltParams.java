package org.rcsb.cif.model.emimaging;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ElectronBeamTiltParams extends SingleRowStrColumn {
    public ElectronBeamTiltParams(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ElectronBeamTiltParams(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ElectronBeamTiltParams(String name) {
        super(name);
    }
}
