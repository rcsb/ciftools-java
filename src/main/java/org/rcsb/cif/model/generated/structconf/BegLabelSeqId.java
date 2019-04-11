package org.rcsb.cif.model.generated.structconf;

import org.rcsb.cif.model.*;

import java.util.Map;

public class BegLabelSeqId extends IntColumn {
    public BegLabelSeqId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public BegLabelSeqId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public BegLabelSeqId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
