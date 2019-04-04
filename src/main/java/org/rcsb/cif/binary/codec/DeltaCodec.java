package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.IntArray;

public class DeltaCodec extends Codec<IntArray, IntArray> {
    public static final String KIND = "Delta";
    private static final DeltaCodec INSTANCE = new DeltaCodec();

    private DeltaCodec() {
        super(KIND);
    }

    public static IntArray decode(CodecData<IntArray> codecData) {
        return INSTANCE.decodeInternally(codecData);
    }

    @Override
    protected CodecData<IntArray> encodeInternally(CodecData<IntArray> data) {
        return null;
    }

    @Override
    protected IntArray decodeInternally(CodecData<IntArray> data) {
        return null;
    }
}
