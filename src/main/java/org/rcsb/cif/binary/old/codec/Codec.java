package org.rcsb.cif.binary.old.codec;

import org.rcsb.cif.binary.old.codec.encoding.*;
import org.rcsb.cif.binary.old.codec.primitive.ArrayType;
import org.rcsb.cif.binary.old.codec.primitive.ByteParameters;
import org.rcsb.cif.binary.old.codec.primitive.DoubleCodec;
import org.rcsb.cif.binary.old.codec.primitive.IntegerCodec;

import java.nio.ByteOrder;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface Codec<P, E, M extends CodecParameters> {
    String VERSION = "0.3.0";
    String MIN_VERSION = "0.3";

    CodecData<E, M> encode(P input);

//    CodecData<E, M> encode(CodecData<P, M> input);

//    P decode(E input);

    P decode(CodecData<E, M> input);

    default Function<P, E> getEncodingFunction() {
        // TODO impl
        return null;
    }

    default Function<E, P> getDecodingFunction() {
        // TODO impl
        return null;
    }

    @SuppressWarnings("unchecked")
    static Object decode(Map<String, Object> map) {
        Object current = map.get("data");
        Object[] encodings = (Object[]) map.get("encoding");

        for (int i = encodings.length - 1; i >= 0; i--) {
            current = decodeInternal(current, (Map<String, Object>) encodings[i]);
        }
        return current;
    }

    static Object decodeInternal(Object data, Map<String, Object> encoding) {
        String kind = (String) encoding.get("kind");
        switch (kind) {
            case "ByteArray":
                byte[] byteData = (byte[]) data;
                switch ((int) encoding.get("type")) {
                    case 1:
                        return INT_8.decode(new CodecData<>(byteData,
                                new ByteParameters(ArrayType.INT_8, ByteOrder.LITTLE_ENDIAN)));
                    case 2:
                        return INT_16.decode(new CodecData<>(byteData,
                                new ByteParameters(ArrayType.INT_16, ByteOrder.LITTLE_ENDIAN)));
                    case 3:
                        return INT_32.decode(new CodecData<>(byteData,
                                new ByteParameters(ArrayType.INT_32, ByteOrder.LITTLE_ENDIAN)));
                    case 4:
                        return UINT_8.decode(new CodecData<>(byteData,
                                new ByteParameters(ArrayType.UINT_8, ByteOrder.LITTLE_ENDIAN)));
                    case 5:
                        return UINT_16.decode(new CodecData<>(byteData,
                                new ByteParameters(ArrayType.UINT_16, ByteOrder.LITTLE_ENDIAN)));
                    case 6:
                        return UINT_32.decode(new CodecData<>(byteData,
                                new ByteParameters(ArrayType.UINT_32, ByteOrder.LITTLE_ENDIAN)));
                    case 32:
                        return FLOAT.decode(new CodecData<>(byteData,
                                new ByteParameters(ArrayType.FLOAT, ByteOrder.LITTLE_ENDIAN)));
                    case 33:
                        return DOUBLE.decode(new CodecData<>(byteData,
                                new ByteParameters(ArrayType.DOUBLE, ByteOrder.LITTLE_ENDIAN)));
                }
            case "FixedPoint":
                return FIXED_POINT.decode(new CodecData<>((int[]) data,
                        new FixedPointParameters((int) encoding.get("factor"))));
            case "IntervalQuantization":
                return INTERVAL_QUANTIZATION.decode(new CodecData<>((int[]) data,
                        new IntervalQuantizationParameters((int) encoding.get("min"), (int) encoding.get("max"), (int) encoding.get("numSteps"))));
            case "RunLength":
                return RUN_LENGTH.decode(new CodecData<>((int[]) data,
                        null));
            case "Delta":
                return DELTA.decode(new CodecData<>((int[]) data,
                        new DeltaParameters((int) encoding.get("origin"))));
            case "IntegerPacking":
                return INTEGER_PACKING.decode(new CodecData<>((int[]) data,
                        new IntegerPackingParameters((int) encoding.get("byteCount"), (boolean) encoding.get("isUnsigned"), (int) encoding.get("srcSize"))));
            case "StringArray":
                return STRING_ARRAY.decode(new CodecData<>((byte[]) data,
                        new StringArrayParameters((String) encoding.get("stringData"), (byte[]) encoding.get("offsets"), (Object[]) encoding.get("dataEncoding"), (Object[]) encoding.get("offsetEncoding"))));
        }
        throw new IllegalArgumentException("Unsupported Encoding kind: " + encoding.get("kind"));
    }

    IntegerCodec INT_8 = new IntegerCodec();
    IntegerCodec INT_16 = new IntegerCodec();
    IntegerCodec INT_32 = new IntegerCodec();
    IntegerCodec UINT_8 = new IntegerCodec();
    IntegerCodec UINT_16 = new IntegerCodec();
    IntegerCodec UINT_32 = new IntegerCodec();

    DoubleCodec FLOAT = new DoubleCodec();
    DoubleCodec DOUBLE = new DoubleCodec();

    DeltaCodec DELTA = new DeltaCodec();
    FixedPointCodec FIXED_POINT = new FixedPointCodec();
    IntegerPackingCodec INTEGER_PACKING = new IntegerPackingCodec();
    IntervalQuantizationCodec INTERVAL_QUANTIZATION = new IntervalQuantizationCodec();
    RunLengthCodec RUN_LENGTH = new RunLengthCodec();
    StringArrayCodec STRING_ARRAY = new StringArrayCodec();

    static ArrayType determineArrayType(int[] data) {
        IntSummaryStatistics intSummaryStatistics = IntStream.of(data).summaryStatistics();
        int min = intSummaryStatistics.getMin();
        int max = intSummaryStatistics.getMax();

        if (min >= 0 && max <= 255) {
            return ArrayType.UINT_8;
        } else if (min >= 0 && max <= 65_535) {
            return ArrayType.UINT_16;
        } else if (min >= 0) {
            return ArrayType.UINT_32;
        } else if (min >= -128 && max <= 127) {
            return ArrayType.INT_8;
        } else if (min >= -32_768 && max <= 32_767) {
            return ArrayType.INT_16;
        } else {
            return ArrayType.INT_32;
        }
    }

    static ArrayType determineArrayType(double[] data) {
        return DoubleStream.of(data).anyMatch(d -> d > Float.MAX_VALUE || d < -Float.MAX_VALUE) ?
                ArrayType.DOUBLE : ArrayType.FLOAT;
    }
}
