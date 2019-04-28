package org.rcsb.cif.model.generated.emimagescans;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class UsedFramesPerImage extends SingleRowStrColumn {
    public UsedFramesPerImage(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public UsedFramesPerImage(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public UsedFramesPerImage(String name) {
        super(name);
    }
}
