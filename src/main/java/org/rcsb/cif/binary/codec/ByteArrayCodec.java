package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.*;

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

    public static CodecData<byte[]> encode(CodecData<NumberArray> codecData) {
        return BYTE_ARRAY_CODEC.encodeInternally(codecData);
    }

    @Override
    protected CodecData<byte[]> encodeInternally(CodecData codecData) {
        NumberArray data = (NumberArray) codecData.getData();
        byte[] array = ensureOrder(data.toByteArray(), data.getNumberOfBytes());
        return CodecData.of(array)
                .startEncoding(KIND)
                .addParameter("type", data.getType())
                .build();
    }

    @Override
    protected NumberArray decodeInternally(CodecData<byte[]> codecData) {
        ensureParametersPresent(codecData, "type");
        byte[] data = codecData.getData();
        switch ((int) codecData.getParameters().get("type")) {
            case 1:
                return ArrayFactory.int8Array(data);
            case 2:
                return ArrayFactory.int16Array(data);
            case 3:
                return ArrayFactory.int32Array(data);
            case 4:
                return ArrayFactory.uint8Array(data);
            case 5:
                return ArrayFactory.uint16Array(data);
            case 6:
                return ArrayFactory.uint32Array(data);
            case 32:
                return ArrayFactory.float32Array(data);
            case 33:
                return ArrayFactory.float64Array(data);
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

    private static byte[] ensureOrder(byte[] bytes, int numberOfBytes) {
        if (!IS_NATIVE_LITTLE_ENDIAN) {
            bytes = flipByteOrder(bytes, numberOfBytes);
        }
        return bytes;
    }
}
