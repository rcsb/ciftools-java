package org.rcsb.cif.model.generated.structsite;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxAuthSeqId extends StrColumn {
    public PdbxAuthSeqId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxAuthSeqId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxAuthSeqId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
