package org.rcsb.cif.model.generated.pdbxserialcrystallographysampledeliveryinjection;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class InjectorTemperature extends SingleRowFloatColumn {
    public InjectorTemperature(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public InjectorTemperature(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public InjectorTemperature(String name) {
        super(name);
    }
}
