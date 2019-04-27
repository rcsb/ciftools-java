package org.rcsb.cif.model.pdbxentitysrcsyn;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxBegSeqNum extends IntColumn {
    public PdbxBegSeqNum(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxBegSeqNum(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxBegSeqNum(String name) {
        super(name);
    }
}
