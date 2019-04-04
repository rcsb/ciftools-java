package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.FloatArray;
import org.rcsb.cif.binary.array.Int32Array;

public class FixedPointCodec extends Codec<FloatArray, Int32Array> {
    public static final String KIND = "FixedPoint";
    private static final FixedPointCodec INSTANCE = new FixedPointCodec();

    private FixedPointCodec() {
        super(KIND);
    }

    public static FloatArray decode(CodecData<Int32Array> codecData) {
        return INSTANCE.decodeInternally(codecData);
    }

    @Override
    protected CodecData<Int32Array> encodeInternally(CodecData data) {
        return null;
    }

    @Override
    protected FloatArray decodeInternally(CodecData data) {
        return null;
    }
}
