package org.rcsb.cif.model.generated.pdbxprereleaseseq;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SeqOneLetterCode extends StrColumn {
    public SeqOneLetterCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SeqOneLetterCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SeqOneLetterCode(String name) {
        super(name);
    }
}
