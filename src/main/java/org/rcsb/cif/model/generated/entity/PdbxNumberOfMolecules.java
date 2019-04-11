package org.rcsb.cif.model.generated.entity;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxNumberOfMolecules extends IntColumn {
    public PdbxNumberOfMolecules(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxNumberOfMolecules(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxNumberOfMolecules(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
