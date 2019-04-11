package org.rcsb.cif.model.generated.pdbxmolecule;

import org.rcsb.cif.model.*;

import java.util.Map;

public class InstanceId extends IntColumn {
    public InstanceId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public InstanceId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public InstanceId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
