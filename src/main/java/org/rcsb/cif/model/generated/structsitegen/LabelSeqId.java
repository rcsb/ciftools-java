package org.rcsb.cif.model.generated.structsitegen;

import org.rcsb.cif.model.*;

import java.util.Map;

public class LabelSeqId extends IntColumn {
    public LabelSeqId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public LabelSeqId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public LabelSeqId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
