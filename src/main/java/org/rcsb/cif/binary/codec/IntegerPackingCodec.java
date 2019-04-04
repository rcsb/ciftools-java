package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.Int32Array;
import org.rcsb.cif.binary.array.IntArray;

public class IntegerPackingCodec extends Codec<Int32Array, IntArray> {
    public static final String KIND = "IntegerPacking";
    private static final IntegerPackingCodec INSTANCE = new IntegerPackingCodec();

    private IntegerPackingCodec() {
        super(KIND);
    }

    public static Int32Array decode(CodecData<IntArray> codecData) {
        return INSTANCE.decodeInternally(codecData);
    }

    @Override
    protected CodecData<IntArray> encodeInternally(CodecData<Int32Array> data) {
        return null;
    }

    @Override
    protected Int32Array decodeInternally(CodecData<IntArray> data) {
        return null;
    }
}
