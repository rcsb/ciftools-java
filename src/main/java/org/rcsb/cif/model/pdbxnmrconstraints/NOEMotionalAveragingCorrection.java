package org.rcsb.cif.model.pdbxnmrconstraints;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NOEMotionalAveragingCorrection extends StrColumn {
    public NOEMotionalAveragingCorrection(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NOEMotionalAveragingCorrection(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NOEMotionalAveragingCorrection(String name) {
        super(name);
    }
}
