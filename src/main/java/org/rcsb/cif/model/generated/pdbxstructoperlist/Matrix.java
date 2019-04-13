package org.rcsb.cif.model.generated.pdbxstructoperlist;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.Schema;

import javax.annotation.Generated;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Generated("org.rcsb.cif.schema.Schema")
public class Matrix extends MatrixColumn {
    public Matrix(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Matrix(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
