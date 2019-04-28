package org.rcsb.cif.model.generated.pdbxstructrefseqdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DbSeqOneLetterCode extends SingleRowStrColumn {
    public DbSeqOneLetterCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DbSeqOneLetterCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DbSeqOneLetterCode(String name) {
        super(name);
    }
}
