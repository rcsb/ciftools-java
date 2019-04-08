package org.rcsb.cif.binary.data;

import java.util.LinkedHashMap;

/**
 * Represents data which can be decoded or encoded. Extends {@link LinkedHashMap} which is risky with regards to
 * API-changes, but allows to stay really close to the TypeScript implementation and makes serialization by MessagePack
 * more easy.
 */
public abstract class DataArray extends LinkedHashMap<String, Object> {
    DataArray(Object data) {
        put("data", data);
    }

    abstract Object getData();

    abstract int length();
}
