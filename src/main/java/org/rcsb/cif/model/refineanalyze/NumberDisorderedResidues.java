package org.rcsb.cif.model.refineanalyze;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NumberDisorderedResidues extends FloatColumn {
    public NumberDisorderedResidues(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NumberDisorderedResidues(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NumberDisorderedResidues(String name) {
        super(name);
    }
}
