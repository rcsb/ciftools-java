package org.rcsb.cif.model.emtomographyspecimen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FiducialMarkers extends StrColumn {
    public FiducialMarkers(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FiducialMarkers(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FiducialMarkers(String name) {
        super(name);
    }
}
