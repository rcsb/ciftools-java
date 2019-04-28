package org.rcsb.cif.model.generated.diffrndetector;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Detector extends SingleRowStrColumn {
    public Detector(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Detector(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Detector(String name) {
        super(name);
    }
}
