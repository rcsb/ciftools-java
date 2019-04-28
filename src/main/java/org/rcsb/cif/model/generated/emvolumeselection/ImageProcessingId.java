package org.rcsb.cif.model.generated.emvolumeselection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ImageProcessingId extends SingleRowStrColumn {
    public ImageProcessingId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ImageProcessingId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ImageProcessingId(String name) {
        super(name);
    }
}
