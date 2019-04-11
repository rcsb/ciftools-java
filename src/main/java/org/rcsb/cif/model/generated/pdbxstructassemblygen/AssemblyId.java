package org.rcsb.cif.model.generated.pdbxstructassemblygen;

import org.rcsb.cif.model.*;

import java.util.Map;

public class AssemblyId extends StrColumn {
    public AssemblyId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AssemblyId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AssemblyId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
