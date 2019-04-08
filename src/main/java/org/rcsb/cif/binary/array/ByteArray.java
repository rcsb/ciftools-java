package org.rcsb.cif.binary.array;

import java.util.Arrays;

public class ByteArray implements DataArray {
    private final byte[] data;

    ByteArray(byte[] data) {
        this.data = data;
    }

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(data);
    }

    public Float32Array toFloat32Array() {
        return new Float32Array(data);
    }

    public Float64Array toFloat64Array() {
        return new Float64Array(data);
    }

    public Int8Array toInt82Array() {
        return new Int8Array(data);
    }

    public Int16Array toInt16Array() {
        return new Int16Array(data);
    }

    public Int32Array toInt32Array() {
        return new Int32Array(data);
    }

    public Uint8Array toUint8Array() {
        return new Uint8Array(data);
    }

    public Uint16Array toUint16Array() {
        return new Uint16Array(data);
    }

    public Uint32Array toUint32Array() {
        return new Uint32Array(data);
    }
}
