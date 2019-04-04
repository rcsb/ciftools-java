package org.rcsb.cif.binary.codec;

public class StringArrayCodec extends Codec<String[], byte[]> {
    public static final String KIND = "StringArray";
    private static final StringArrayCodec INSTANCE = new StringArrayCodec();

    private StringArrayCodec() {
        super(KIND);
    }

    public static String[] decode(CodecData<byte[]> codecData) {
        return INSTANCE.decodeInternally(codecData);
    }

    @Override
    protected CodecData<byte[]> encodeInternally(CodecData<String[]> data) {
        return null;
    }

    @Override
    protected String[] decodeInternally(CodecData<byte[]> data) {
        return null;
    }
}
