package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.Int32Array;
import org.rcsb.cif.binary.array.IntArray;

public class RunLengthCodec extends Codec<IntArray, Int32Array> {
    public static final String KIND = "RunLength";
    private static final RunLengthCodec INSTANCE = new RunLengthCodec();

    private RunLengthCodec() {
        super(KIND);
    }

    public static IntArray decode(CodecData<Int32Array> codecData) {
        return INSTANCE.decodeInternally(codecData);
    }

    @Override
    protected CodecData<Int32Array> encodeInternally(CodecData data) {
        return null;
    }

    @Override
    protected IntArray decodeInternally(CodecData data) {
        return null;
    }
}