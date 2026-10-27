package org.rcsb.cif.binary;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.data.Int32Array;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassifierTest {
    @Test
    void sameEncodingAsSizingEachEncodingSeparately() {
        Random random = new Random(1027);
        for (int round = 0; round < 5000; round++) {
            int[] data = IntChainEncoderTest.randomData(random);
            if (data.length < 2) {
                continue;
            }
            assertEquals(Reference.classify(data), Classifier.classify(new Int32Array(data)).getEncoding(), Arrays.toString(data));
        }
    }

    /** The sizes as computed before, one pass per encoding. */
    private static class Reference {
        static String classify(int[] data) {
            boolean signed = Arrays.stream(data).anyMatch(v -> v < 0);
            int limit8 = signed ? 0x7F : 0xFF;
            int limit16 = signed ? 0x7FFF : 0xFFFF;

            String[] kinds = { "pack", "rle", "delta", "delta-rle" };
            long[][] sizes = { new long[3], new long[3], new long[3], new long[3] };
            for (int datum : data) {
                inc(sizes[0], datum, limit8, limit16);
            }

            int run = 1;
            for (int i = 1; i < data.length; i++) {
                if (data[i - 1] != data[i]) {
                    inc(sizes[1], data[i - 1], limit8, limit16);
                    inc(sizes[1], run, limit8, limit16);
                    run = 1;
                } else {
                    run++;
                }
            }
            inc(sizes[1], data[data.length - 1], limit8, limit16);
            inc(sizes[1], run, limit8, limit16);

            for (int i = 1; i < data.length; i++) {
                inc(sizes[2], data[i] - data[i - 1], 0x7F, 0x7FFF);
            }

            run = 1;
            int prev = 0;
            int prevValue = 0;
            for (int i = 1; i < data.length; i++) {
                int v = data[i] - prev;
                if (prevValue != v) {
                    inc(sizes[3], prevValue, 0x7F, 0x7FFF);
                    inc(sizes[3], run, 0x7F, 0x7FFF);
                    run = 1;
                } else {
                    run++;
                }
                prevValue = v;
                prev = data[i];
            }
            inc(sizes[3], prevValue, 0x7F, 0x7FFF);
            inc(sizes[3], run, 0x7F, 0x7FFF);

            int min = 0;
            for (int k = 1; k < kinds.length; k++) {
                if (length(sizes[k]) < length(sizes[min])) {
                    min = k;
                }
            }
            return kinds[min];
        }

        /** count, 1-byte and 2-byte packed lengths */
        static void inc(long[] size, int value, int limit8, int limit16) {
            size[0]++;
            size[1] += packSize(value, limit8);
            size[2] += packSize(value, limit16);
        }

        /** ceil((value + 1) / limit), the negative limit for negative values, in integer arithmetic */
        static long packSize(int value, int upperLimit) {
            if (value >= 0) {
                return (value + (long) upperLimit) / upperLimit;
            }
            return (-(value + 1L) + upperLimit) / (upperLimit + 1L);
        }

        static long length(long[] size) {
            if (size[0] * 4 < size[2] * 2) {
                return size[0] * 4;
            } else if (size[2] * 2 < size[1]) {
                return size[2] * 2;
            } else {
                return size[1];
            }
        }
    }
}
