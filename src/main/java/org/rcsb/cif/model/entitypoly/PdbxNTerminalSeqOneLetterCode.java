package org.rcsb.cif.model.entitypoly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNTerminalSeqOneLetterCode extends StrColumn {
    public PdbxNTerminalSeqOneLetterCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxNTerminalSeqOneLetterCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxNTerminalSeqOneLetterCode(String name) {
        super(name);
    }
}
