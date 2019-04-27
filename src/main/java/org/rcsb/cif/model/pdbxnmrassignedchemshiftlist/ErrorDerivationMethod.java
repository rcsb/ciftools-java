package org.rcsb.cif.model.pdbxnmrassignedchemshiftlist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ErrorDerivationMethod extends StrColumn {
    public ErrorDerivationMethod(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ErrorDerivationMethod(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ErrorDerivationMethod(String name) {
        super(name);
    }
}
