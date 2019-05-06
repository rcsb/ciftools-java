package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.EncodedData;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.encoding.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A library of codec implementations and provider to codec-specific constants such as encoder name, version, and
 * minimal version of the data to decode.
 */
public class Codec {
    public static final String CODEC_NAME = "ciftools-java";
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

    /**
     * Decode an instance of {@link EncodedData} by traversing its encoding chain until the original data is restored.
     * @param encodedData the data to decode
     * @return the decoded data
     */
    @SuppressWarnings("unchecked")
    public static EncodedData decode(EncodedData encodedData) {
        EncodedData current = encodedData;

        while (current.hasNextDecodingStep()) {
            // pop the last element of this encoding chain, do so until chain is completely resolved
            Encoding encoding = (Encoding) current.getEncoding().removeLast();
            current = encoding.decode(current);
        }

        return current;
    }

    /**
     * Decode an instance of {@link EncodedData} by traversing its encoding chain until the original data is restored.
     * @param encodedData the map of data to decode
     * @return the decoded data
     */
    @SuppressWarnings("unchecked")
    public static Object decode(Map<String, Object> encodedData) {
        EncodedData current = EncodedDataFactory.byteArray((byte[]) encodedData.get("data"));
        Object[] encodingMaps = (Object[]) encodedData.get("encoding");
        LinkedList<Encoding> encodings = Stream.of(encodingMaps)
                .map(Map.class::cast)
                .map(Codec::wrap)
                .collect(Collectors.toCollection(LinkedList::new));
        Collections.reverse(encodings);

        for (Encoding encoding : encodings) {
            current = encoding.decode(current);
        }

        return current.getData();
    }

    /**
     * Convert a map representation of an encoding to a Java object.
     * @param encoding map representation of encoding
     * @return the concrete Encoding instance
     */
    @SuppressWarnings("unchecked")
    private static Encoding wrap(Map encoding) {
        String kind = (String) encoding.get("kind");
        switch (kind) {
            case "ByteArray":
                return new ByteArrayEncoding(encoding);
            case "FixedPoint":
                return new FixedPointEncoding(encoding);
            case "IntervalQuantization":
                return new IntervalQuantizationEncoding(encoding);
            case "RunLength":
                return new RunLengthEncoding(encoding);
            case "Delta":
                return new DeltaEncoding(encoding);
            case "IntegerPacking":
                return new IntegerPackingEncoding(encoding);
            case "StringArray":
                LinkedList<Encoding> outputEncoding = Stream.of((Object[]) encoding.get("dataEncoding"))
                        .map(map -> wrap((Map<String, Object>) map))
                        .collect(Collectors.toCollection(LinkedList::new));
                LinkedList<Encoding> offsetEncoding = Stream.of((Object[]) encoding.get("offsetEncoding"))
                                .map(map -> wrap((Map<String, Object>) map))
                                .collect(Collectors.toCollection(LinkedList::new));
                return new StringArrayEncoding(encoding, outputEncoding, offsetEncoding);
            default:
                throw new IllegalArgumentException("Unsupported Encoding kind: " + kind);
        }
    }
}
