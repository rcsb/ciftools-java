package org.rcsb.cif.model.generated.pdbxstructoperlist;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Matrix extends MatrixColumn {
    public Matrix(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Matrix(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Matrix(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
