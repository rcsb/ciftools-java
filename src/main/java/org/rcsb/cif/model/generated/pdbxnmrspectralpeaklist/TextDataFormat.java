package org.rcsb.cif.model.generated.pdbxnmrspectralpeaklist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TextDataFormat extends StrColumn {
    public TextDataFormat(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TextDataFormat(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TextDataFormat(String name) {
        super(name);
    }
}
