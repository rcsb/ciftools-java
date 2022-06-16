package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedData;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;
import org.rcsb.cif.binary.encoding.IntervalQuantizationEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * A library of codec implementations and provider to codec-specific constants such as encoder name, version, and
 * minimal version of the data to decode.
 */
public class BinaryCifCodec {
    public static final String CODEC_NAME = "ciftools-java";
    public static final String VERSION = "0.3.0";
    public static final String MIN_VERSION = "0.3";
    public static final boolean IS_NATIVE_LITTLE_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);

    private BinaryCifCodec() {
        // nothing here
    }

    /**
     * Request decoding of this {@link EncodedData} instance. Will automatically resolve its decoding chain, starting
     * from a ByteArray until 'raw' data represented by Int32Array, Float64Array, or StringArray classes is achieved
     * which is then ready to use.
     * @param data what to decode
     * @return the decoded data
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static EncodedData<?> decode(EncodedData<?> data) {
        EncodedData<?> current = data;

        while (current.hasNextDecodingStep()) {
            // pop the last element of this encoding chain, do so until chain is completely resolved
            Encoding encoding = current.getEncoding().removeLast();
            current = encoding.decode(current);
        }

        return current;
    }

    /**
     * Decode an instance of {@link EncodedData} by traversing its encoding chain until the original data is restored.
     * @param encodedData the map of data to decode
     * @return the decoded data
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static Object decode(Map<String, Object> encodedData) {
        EncodedData current = new ByteArray((byte[]) encodedData.get("data"));
        Object[] encodingMaps = (Object[]) encodedData.get("encoding");
        for (int i = encodingMaps.length - 1; i >= 0; i--) {
            Map<String, Object> map = (Map<String, Object>) encodingMaps[i];
            Encoding encoding = deserializeEncodingMap(map);
            current = encoding.decode(current);
        }

        return current.getData();
    }

    /**
     * Convert a map representation of an encoding to a Java object.
     * @param encoding map representation of encoding
     * @return the concrete Encoding instance
     */
    private static Encoding<?, ?> deserializeEncodingMap(Map<String, Object> encoding) {
        String kind = (String) encoding.get("kind");
        switch (kind) {
            case "ByteArray":
                int type = (int) encoding.get("type");
                switch (type) {
                    case 1:
                        return ByteArrayEncoding.INT8;
                    case 2:
                        return ByteArrayEncoding.INT16;
                    case 3:
                        return ByteArrayEncoding.INT32;
                    case 4:
                        return ByteArrayEncoding.UINT8;
                    case 5:
                        return ByteArrayEncoding.UINT16;
                    case 6:
                        return ByteArrayEncoding.UINT32;
                    case 32:
                        return ByteArrayEncoding.FLOAT32;
                    case 33:
                        return ByteArrayEncoding.FLOAT64;
                    default:
                        throw new UnsupportedOperationException("cannot handle byte array encoding type " + type);
                }
            case "FixedPoint": {
                int factor = (int) encoding.get("factor");
                int srcType = (int) encoding.get("srcType");
                return new FixedPointEncoding(factor, srcType);
            }
            case "IntervalQuantization": {
                int min = (int) encoding.get("min");
                int max = (int) encoding.get("max");
                int numSteps = (int) encoding.get("numSteps");
                int srcType = (int) encoding.get("srcType");
                return new IntervalQuantizationEncoding(min, max, numSteps, srcType);
            }
            case "RunLength": {
                int srcType = (int) encoding.get("srcType");
                int srcSize = (int) encoding.get("srcSize");
                return new RunLengthEncoding(srcType, srcSize);
            }
            case "Delta": {
                int origin = (int) encoding.get("origin");
                int srcType = (int) encoding.get("srcType");
                return new DeltaEncoding<>(origin, srcType);
            }
            case "IntegerPacking": {
                int byteCount = (int) encoding.get("byteCount");
                boolean isUnsigned = (boolean) encoding.get("isUnsigned");
                int srcSize = (int) encoding.get("srcSize");
                return new IntegerPackingEncoding(byteCount, isUnsigned, srcSize);
            }
            case "StringArray": {
                String stringData = (String) encoding.get("stringData");
                byte[] offsets = (byte[]) encoding.get("offsets");
                Deque<Encoding<?, ?>> outputEncoding = deserializeEncodingDeque(encoding.get("dataEncoding"));
                Deque<Encoding<?, ?>> offsetEncoding = deserializeEncodingDeque(encoding.get("offsetEncoding"));
                return new StringArrayEncoding(stringData, offsets, outputEncoding, offsetEncoding);
            }
            default:
                throw new IllegalArgumentException("Unsupported Encoding kind: " + kind);
        }
    }

    /**
     * Convert a array representation of an encoding chain to a Java object.
     * @param encoding array representation of encoding chain
     * @return a deque representing the encoding chain
     */
    @SuppressWarnings("unchecked")
    private static Deque<Encoding<?, ?>> deserializeEncodingDeque(Object encoding) {
        Object[] encodingArray = (Object[]) encoding;
        Deque<Encoding<?, ?>> encodings = new ArrayDeque<>();
        for (Object o : encodingArray) {
            encodings.add(deserializeEncodingMap((Map<String, Object>) o));
        }
        return encodings;
    }
}
