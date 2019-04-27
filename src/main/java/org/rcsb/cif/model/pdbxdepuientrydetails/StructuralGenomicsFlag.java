package org.rcsb.cif.model.pdbxdepuientrydetails;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructuralGenomicsFlag extends SingleRowStrColumn {
    public StructuralGenomicsFlag(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public StructuralGenomicsFlag(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public StructuralGenomicsFlag(String name) {
        super(name);
    }
}
