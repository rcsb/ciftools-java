package org.rcsb.cif.model.generated.reflns;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhaseCalculationDetails extends SingleRowStrColumn {
    public PhaseCalculationDetails(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PhaseCalculationDetails(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PhaseCalculationDetails(String name) {
        super(name);
    }
}
