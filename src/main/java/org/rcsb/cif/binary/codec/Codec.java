package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.*;

import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Codec {
    public static final String CODEC_NAME = /*"ciftools-java"*/ "mol*";
    public static final String VERSION = "0.3.0";
    public static final String MIN_VERSION = "0.3";

    public static final ByteArrayCodec BYTE_ARRAY_CODEC = new ByteArrayCodec();
    public static final DeltaCodec DELTA_CODEC = new DeltaCodec();
    public static final FixedPointCodec FIXED_POINT_CODEC = new FixedPointCodec();
    public static final IntegerPackingCodec INTEGER_PACKING_CODEC = new IntegerPackingCodec();
    public static final IntervalQuantizationCodec INTERVAL_QUANTIZATION_CODEC = new IntervalQuantizationCodec();
    public static final RunLengthCodec RUN_LENGTH_CODEC = new RunLengthCodec();
    public static final StringArrayCodec STRING_ARRAY_CODEC = new StringArrayCodec();

    public static final MessagePackCodec MESSAGE_PACK_CODEC = new MessagePackCodec();

    public static EncodedData decode(EncodedData encodedData) {
        EncodedData current = encodedData;

        while (current.hasNextDecodingStep()) {
            // pop the last element of this encoding chain, do so until chain is completely resolved
            Encoding encoding = (Encoding) current.getEncoding().removeLast();
            current = decodeStep(current, encoding);
        }

        return current;
    }

    @SuppressWarnings("unchecked")
    public static Object decode(Map<String, Object> encodedData) {
        EncodedData current = EncodedDataFactory.byteArray((byte[]) encodedData.get("data"));
        Object[] encodings = (Object[]) encodedData.get("encoding");

        for (int i = encodings.length - 1; i >= 0; i--) {
            current = decodeStep(current, wrap((Map<String, Object>) encodings[i]));
        }
        return current.getData();
    }

    @SuppressWarnings("unchecked")
    private static Encoding wrap(Map<String, Object> encoding) {
        String kind = (String) encoding.get("kind");
        switch (kind) {
            case "ByteArray":
                return new ByteArrayEncoding((int) encoding.get("type"));
            case "FixedPoint":
                return new FixedPointEncoding((int) encoding.get("factor"),
                        (int) encoding.get("srcType"));
            case "IntervalQuantization":
                return new IntervalQuantizationEncoding((int) encoding.get("min"),
                        (int) encoding.get("max"),
                        (int) encoding.get("numSteps"),
                        (int) encoding.get("srcType"));
            case "RunLength":
                return new RunLengthEncoding((int) encoding.get("srcType"),
                        (int) encoding.get("srcSize"));
            case "Delta":
                return new DeltaEncoding((int) encoding.get("origin"),
                        (int) encoding.get("srcType"));
            case "IntegerPacking":
                return new IntegerPackingEncoding((int) encoding.get("byteCount"),
                        (boolean) encoding.get("isUnsigned"),
                        (int) encoding.get("srcSize"));
            case "StringArray":
                ByteArray output = EncodedDataFactory.byteArray((byte[]) encoding.get("data"),
                        (LinkedList<Encoding>) Stream.of((Object[]) encoding.get("dataEncoding"))
                                .map(map -> wrap((Map<String, Object>) map))
                                .collect(Collectors.toCollection(LinkedList::new)));
                ByteArray offsets = EncodedDataFactory.byteArray((byte[]) encoding.get("offsets"),
                        (LinkedList<Encoding>) Stream.of((Object[]) encoding.get("offsetEncoding"))
                                .map(map -> wrap((Map<String, Object>) map))
                                .collect(Collectors.toCollection(LinkedList::new)));
                return new StringArrayEncoding(output,
                        offsets,
                        (String) encoding.get("stringData"));
            default:
                throw new IllegalArgumentException("Unsupported Encoding kind: " + kind);
        }
    }

    private static EncodedData decodeStep(EncodedData current, Encoding encoding) {
        // not an elegant approach, maybe impl OO-solution
        if (encoding instanceof ByteArrayEncoding) {
            return BYTE_ARRAY_CODEC.decode((ByteArray) current, (ByteArrayEncoding) encoding);
        } else if (encoding instanceof FixedPointEncoding) {
            return FIXED_POINT_CODEC.decode((Int32Array) current, (FixedPointEncoding) encoding);
        } else if (encoding instanceof IntervalQuantizationEncoding) {
            return INTERVAL_QUANTIZATION_CODEC.decode((Int32Array) current, (IntervalQuantizationEncoding) encoding);
        } else if (encoding instanceof RunLengthEncoding) {
            return RUN_LENGTH_CODEC.decode((Int32Array) current, (RunLengthEncoding) encoding);
        } else if (encoding instanceof DeltaEncoding) {
            return DELTA_CODEC.decode((SignedIntArray) current, (DeltaEncoding) encoding);
        } else if (encoding instanceof IntegerPackingEncoding) {
            return INTEGER_PACKING_CODEC.decode((IntArray) current, (IntegerPackingEncoding) encoding);
        } else if (encoding instanceof StringArrayEncoding){
            return STRING_ARRAY_CODEC.decode((ByteArray) current, (StringArrayEncoding) encoding);
        } else {
            throw new IllegalArgumentException("Unsupported Encoding kind: " + encoding.getClass().getSimpleName());
        }
    }
}
