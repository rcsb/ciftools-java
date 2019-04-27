package org.rcsb.cif.model.emimagescans;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ScannerModel extends SingleRowStrColumn {
    public ScannerModel(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ScannerModel(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ScannerModel(String name) {
        super(name);
    }
}
