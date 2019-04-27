package org.rcsb.cif.model.emtomographyspecimen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Sectioning extends StrColumn {
    public Sectioning(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Sectioning(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Sectioning(String name) {
        super(name);
    }
}
