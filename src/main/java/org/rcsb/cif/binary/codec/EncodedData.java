package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.DataArray;

import java.util.LinkedHashMap;

public class EncodedData<D extends DataArray> extends LinkedHashMap {
    private final D data;

    public EncodedData(D data) {
        this.data = data;
    }

    public D getData() {
        return data;
    }
}
