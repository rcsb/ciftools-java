package org.rcsb.cif.model.generated.entitypoly;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxSeqOneLetterCode extends StrColumn {
    public PdbxSeqOneLetterCode(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxSeqOneLetterCode(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxSeqOneLetterCode(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
