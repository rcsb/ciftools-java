package org.rcsb.cif.model.emtomography;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Axis2MinAngle extends SingleRowFloatColumn {
    public Axis2MinAngle(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Axis2MinAngle(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Axis2MinAngle(String name) {
        super(name);
    }
}
