package org.rcsb.cif.reader.binary.codec;

import org.rcsb.cif.reader.binary.codec.encoding.*;
import org.rcsb.cif.reader.binary.codec.msgpack.MessagePackCodec;
import org.rcsb.cif.reader.binary.codec.primitive.ByteArrayType;
import org.rcsb.cif.reader.binary.codec.primitive.ByteParameters;
import org.rcsb.cif.reader.binary.codec.primitive.DoubleCodec;
import org.rcsb.cif.reader.binary.codec.primitive.IntegerCodec;

import java.nio.ByteOrder;
import java.util.Map;

public class CodecFactory {
    public static Object decode(Map<String, Object> map) {
        Object current = map.get("data");
        Object[] encodings = (Object[]) map.get("encoding");

        for (int i = encodings.length - 1; i >= 0; i--) {
            Codec codec = CodecFactory.of((Map<String, Object>) encodings[i]);
            current = codec.decode(current);
        }
        return current;
    }

    private static final MessagePackCodec MESSAGE_PACK_CODEC = new MessagePackCodec();

    public static MessagePackCodec getMessagePackCodec() {
        return MESSAGE_PACK_CODEC;
    }

    private static final IntegerCodec INT_8 = new IntegerCodec(new ByteParameters(ByteArrayType.INT_8, ByteOrder.LITTLE_ENDIAN));
    private static final IntegerCodec INT_16 = new IntegerCodec(new ByteParameters(ByteArrayType.INT_16, ByteOrder.LITTLE_ENDIAN));
    private static final IntegerCodec INT_32 = new IntegerCodec(new ByteParameters(ByteArrayType.INT_32, ByteOrder.LITTLE_ENDIAN));
    private static final IntegerCodec UINT_8 = new IntegerCodec(new ByteParameters(ByteArrayType.UINT_8, ByteOrder.LITTLE_ENDIAN));
    private static final IntegerCodec UINT_16 = new IntegerCodec(new ByteParameters(ByteArrayType.UINT_16, ByteOrder.LITTLE_ENDIAN));
    private static final IntegerCodec UINT_32 = new IntegerCodec(new ByteParameters(ByteArrayType.UINT_32, ByteOrder.LITTLE_ENDIAN));

    private static final DoubleCodec FLOAT = new DoubleCodec(new ByteParameters(ByteArrayType.FLOAT, ByteOrder.LITTLE_ENDIAN));
    private static final DoubleCodec DOUBLE = new DoubleCodec(new ByteParameters(ByteArrayType.DOUBLE, ByteOrder.LITTLE_ENDIAN));

    public static IntegerCodec getInt8() {
        return INT_8;
    }

    public static IntegerCodec getInt16() {
        return INT_16;
    }

    public static IntegerCodec getInt32() {
        return INT_32;
    }

    public static IntegerCodec getUint8() {
        return UINT_8;
    }

    public static IntegerCodec getUint16() {
        return UINT_16;
    }

    public static IntegerCodec getUint32() {
        return UINT_32;
    }

    public static DoubleCodec getFloat() {
        return FLOAT;
    }

    public static DoubleCodec getDouble() {
        return DOUBLE;
    }

    public static DeltaCodec getDeltaCodec(int origin) {
        return new DeltaCodec(new DeltaParameters(origin));
    }

    public static FixedPointCodec getFixedPointCodec(int factor) {
        return new FixedPointCodec(new FixedPointParameters(factor));
    }

    public static IntegerPackingCodec getIntegerPackingCodec(int byteCount, boolean unsigned, int srcSice) {
        return new IntegerPackingCodec(new IntegerPackingParameters(byteCount, unsigned, srcSice));
    }

    public static IntervalQuantizationCodec getIntervalQuantizationCodec(int min, int max, int numSteps) {
        return new IntervalQuantizationCodec(new IntervalQuantizationParameters(min, max, numSteps));
    }

    private static final RunLengthCodec RUN_LENGTH_CODEC = new RunLengthCodec();

    public static RunLengthCodec getRunLengthCodec() {
        return RUN_LENGTH_CODEC;
    }

    public static StringArrayCodec getStringArrayCodec(String stringData, byte[] offsets, Object[] dataEncoding, Object[] offsetEncoding) {
        return new StringArrayCodec(new StringArrayParameters(stringData, offsets, dataEncoding, offsetEncoding));
    }

    public static Codec of(Map<String, Object> encoding) {
        String kind = (String) encoding.get("kind");
        switch (kind) {
            case "ByteArray":
                switch ((int) encoding.get("type")) {
                    case 1:
                        return INT_8;
                    case 2:
                        return INT_16;
                    case 3:
                        return INT_32;
                    case 4:
                        return UINT_8;
                    case 5:
                        return UINT_16;
                    case 6:
                        return UINT_32;
                    case 32:
                        return FLOAT;
                    case 33:
                        return DOUBLE;
                }
            case "FixedPoint":
                return getFixedPointCodec((int) encoding.get("factor"));
            case "IntervalQuantization":
                return getIntervalQuantizationCodec((int) encoding.get("min"),
                        (int) encoding.get("max"),
                        (int) encoding.get("numSteps"));
            case "RunLength":
                return RUN_LENGTH_CODEC;
            case "Delta":
                return getDeltaCodec((int) encoding.get("origin"));
            case "IntegerPacking":
                return getIntegerPackingCodec((int) encoding.get("byteCount"),
                        (boolean) encoding.get("isUnsigned"),
                        (int) encoding.get("srcSize"));
            case "StringArray":
                return getStringArrayCodec((String) encoding.get("stringData"),
                        (byte[]) encoding.get("offsets"),
                        (Object[]) encoding.get("dataEncoding"),
                        (Object[]) encoding.get("offsetEncoding"));
        }
        throw new IllegalArgumentException("Unsupported Encoding kind: " + encoding.get("kind"));
    }
}
