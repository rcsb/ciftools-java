package org.rcsb.cif.binary.data;

import java.util.Arrays;

public class ByteArray extends DataArray {
    ByteArray(byte[] data) {
        super(data);
    }

    @Override
    public byte[] getData() {
        return (byte[]) get("data");
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }

    public Float32Array toFloat32Array() {
        return new Float32Array(getData());
    }

    public Float64Array toFloat64Array() {
        return new Float64Array(getData());
    }

    public Int8Array toInt82Array() {
        return new Int8Array(getData());
    }

    public Int16Array toInt16Array() {
        return new Int16Array(getData());
    }

    public Int32Array toInt32Array() {
        return new Int32Array(getData());
    }

    public Uint8Array toUint8Array() {
        return new Uint8Array(getData());
    }

    public Uint16Array toUint16Array() {
        return new Uint16Array(getData());
    }

    public Uint32Array toUint32Array() {
        return new Uint32Array(getData());
    }
}
