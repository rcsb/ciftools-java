package org.rcsb.cif.model.emtomography;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Axis1MinAngle extends SingleRowFloatColumn {
    public Axis1MinAngle(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Axis1MinAngle(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Axis1MinAngle(String name) {
        super(name);
    }
}
