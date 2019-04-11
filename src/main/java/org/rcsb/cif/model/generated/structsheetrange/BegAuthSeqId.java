package org.rcsb.cif.model.generated.structsheetrange;

import org.rcsb.cif.model.*;

import java.util.Map;

public class BegAuthSeqId extends IntColumn {
    public BegAuthSeqId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public BegAuthSeqId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public BegAuthSeqId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
