package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.*;

import java.nio.ByteOrder;

public class ByteArrayCodec extends Codec<NumberArray, byte[]> {
    public static final String KIND = "ByteArray";
    public static final ByteArrayCodec BYTE_ARRAY_CODEC = new ByteArrayCodec();

    private ByteArrayCodec() {
        super(KIND);
    }

    public static NumberArray decode(CodecData<byte[]> codecData) {
        return BYTE_ARRAY_CODEC.decodeInternally(codecData);
    }

    @Override
    protected CodecData<byte[]> encodeInternally(CodecData codecData) {
        // TODO method to ensure all fields needed in the parameters are provided
        NumberArray data = (NumberArray) codecData.getData();
        byte[] array = ensureOrder(data.toByteArray(), data.getNumberOfBytes(), ByteOrder.LITTLE_ENDIAN);
        return CodecData.of(array)
                .addParameter("kind", KIND)
                .addParameter("type", data.getType())
                .create(KIND);
    }

    @Override
    protected NumberArray decodeInternally(CodecData<byte[]> codecData) {
        byte[] data = codecData.getData();
        switch ((int) codecData.getParameters().get("type")) {
            case 1:
                return new Int8Array(data);
            case 2:
                return new Int16Array(data);
            case 3:
                return new Int32Array(data);
            case 4:
                return new Uint8Array(data);
            case 5:
                return new Uint16Array(data);
            case 6:
                return new Uint32Array(data);
            case 32:
                return new Float32Array(data);
            case 33:
                return new Float64Array(data);
            default:
                throw new IllegalArgumentException("Unsupported byte type " + codecData.getParameters().get("type"));
        }
    }

    private static final boolean IS_NATIVE_LITTLE_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);

    private static byte[] flipByteOrder(byte[] data, int bytes) {
        byte[] buffer = new byte[data.length];
        for (int i = 0, n = data.length; i < n; i += bytes) {
            for (int j = 0; j < bytes; j++) {
                buffer[i + bytes - j - 1] = data[i + j];
            }
        }
        return buffer;
    }

    private static byte[] ensureOrder(byte[] bytes, int numberOfBytes, ByteOrder byteOrder) {
        if (!IS_NATIVE_LITTLE_ENDIAN && byteOrder == ByteOrder.LITTLE_ENDIAN ||
                IS_NATIVE_LITTLE_ENDIAN && byteOrder == ByteOrder.BIG_ENDIAN) {
            bytes = flipByteOrder(bytes, numberOfBytes);
        }
        return bytes;
    }
}
