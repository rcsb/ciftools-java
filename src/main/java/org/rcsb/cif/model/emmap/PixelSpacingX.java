package org.rcsb.cif.model.emmap;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PixelSpacingX extends SingleRowFloatColumn {
    public PixelSpacingX(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PixelSpacingX(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PixelSpacingX(String name) {
        super(name);
    }
}
