package org.rcsb.cif.model.atomtype;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ScatDispersionImag extends FloatColumn {
    public ScatDispersionImag(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ScatDispersionImag(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ScatDispersionImag(String name) {
        super(name);
    }
}
