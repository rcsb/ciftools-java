package org.rcsb.cif.model.emexperiment;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SpecimenType extends SingleRowStrColumn {
    public SpecimenType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SpecimenType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SpecimenType(String name) {
        super(name);
    }
}
