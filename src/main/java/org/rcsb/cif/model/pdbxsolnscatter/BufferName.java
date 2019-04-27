package org.rcsb.cif.model.pdbxsolnscatter;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class BufferName extends StrColumn {
    public BufferName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public BufferName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public BufferName(String name) {
        super(name);
    }
}
