package org.rcsb.cif.binary;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.Float64Array;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntChainEncoderTest {
    private static final String[] KINDS = { "byte", "pack", "rle", "delta", "delta-rle" };
    private static final int[] LIMITS = { 0x7F, 0x80, 0xFF, 0x100, 0x7FFF, 0x8000, 0xFFFF, 0x10000 };

    /** The chains one step at a time, with an array per step: the reference for the fused encoding. */
    private static ByteArray stepByStep(Int32Array column, String kind) {
        switch (kind) {
            case "byte":
                return column.encode();
            case "pack":
                return column.encode(new IntegerPackingEncoding())
                        .encode();
            case "rle":
                return column.encode(new RunLengthEncoding())
                        .encode(new IntegerPackingEncoding())
                        .encode();
            case "delta":
                return column.encode(new DeltaEncoding<>())
                        .encode(new IntegerPackingEncoding())
                        .encode();
            case "delta-rle":
                return column.encode(new DeltaEncoding<>())
                        .encode(new RunLengthEncoding())
                        .encode(new IntegerPackingEncoding())
                        .encode();
            default:
                throw new IllegalArgumentException(kind);
        }
    }

    private static List<Map<String, Object>> steps(ByteArray byteArray) {
        return byteArray.getEncoding()
                .stream()
                .map(Encoding::getMapRepresentation)
                .collect(Collectors.toList());
    }

    private static void assertSameAsStepByStep(int[] data) {
        for (String kind : KINDS) {
            ByteArray expected = stepByStep(new Int32Array(data.clone()), kind);
            ByteArray actual = Classifier.encode(new Int32Array(data.clone()), kind);

            String message = kind + " of " + Arrays.toString(data);
            assertEquals(steps(expected), steps(actual), message);
            assertArrayEquals(expected.getData(), actual.getData(), message);

            Map<String, Object> encoded = new LinkedHashMap<>();
            encoded.put("data", actual.getData());
            encoded.put("encoding", steps(actual).toArray());
            assertArrayEquals(data, (int[]) BinaryCifCodec.decode(encoded), message);
        }
    }

    @Test
    void sameAsStepByStepForRandomData() {
        Random random = new Random(20261027);
        for (int round = 0; round < 3000; round++) {
            assertSameAsStepByStep(randomData(random));
        }
    }

    /** Ids, residue numbers, coordinates, runs, flags, values around the packing limits and anything an int holds. */
    static int[] randomData(Random random) {
        int n = random.nextInt(4) == 0 ? random.nextInt(4) : 1 + random.nextInt(random.nextBoolean() ? 50 : 2000);
        int[] data = new int[n];
        int shape = random.nextInt(7);
        int value = random.nextInt(2000) - 1000;
        for (int i = 0; i < n; i++) {
            switch (shape) {
                case 0: // ascending ids with gaps
                    value += random.nextInt(10) == 0 ? random.nextInt(5000) : 1;
                    break;
                case 1: // runs
                    if (random.nextInt(8) == 0) {
                        value = random.nextInt(400) - 200;
                    }
                    break;
                case 2: // coordinates at 3 decimals
                    value += random.nextInt(4000) - 2000;
                    break;
                case 3: // around the packing limits, either sign
                    value = (LIMITS[random.nextInt(LIMITS.length)] + random.nextInt(5) - 2) * (random.nextBoolean() ? 1 : -1);
                    break;
                case 4: // small non-negative
                    value = random.nextInt(3);
                    break;
                case 5: // anything, with differences that overflow
                    value = random.nextInt(3) == 0 ? (random.nextBoolean() ? Integer.MAX_VALUE : Integer.MIN_VALUE) : random.nextInt();
                    break;
                default: // large magnitudes: several elements per value
                    value = random.nextInt(1 << 22) * (random.nextBoolean() ? 1 : -1);
                    break;
            }
            data[i] = value;
        }
        return data;
    }

    @Test
    void sameAsStepByStepAtPackingLimits() {
        for (int limit : LIMITS) {
            for (int offset = -2; offset <= 2; offset++) {
                int v = limit + offset;
                assertSameAsStepByStep(new int[] { v });
                assertSameAsStepByStep(new int[] { -v });
                assertSameAsStepByStep(new int[] { 0, v, v, -v, 0 });
                assertSameAsStepByStep(new int[] { v, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
            }
        }
        assertSameAsStepByStep(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE });
        assertSameAsStepByStep(new int[0]);
    }

    @Test
    void keepsTheStepsThatProducedTheValues() {
        Int32Array fixedPoint = new Float64Array(new double[] { 1.5, 1.25, -7, 1.5 }).encode(new FixedPointEncoding(100));

        ByteArray encoded = Classifier.encode(fixedPoint, "delta");

        assertEquals("FixedPoint", steps(encoded).get(0).get("kind"));
        assertEquals(steps(stepByStep(fixedPoint, "delta")), steps(encoded));
    }

    @Test
    void unknownEncoding() {
        assertThrows(IllegalArgumentException.class, () -> Classifier.encode(new Int32Array(new int[] { 1 }), "zip"));
    }
}
