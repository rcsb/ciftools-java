package org.rcsb.cif.model.pdbxchemcompdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DescriptorType extends StrColumn {
    public DescriptorType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DescriptorType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DescriptorType(String name) {
        super(name);
    }
}
