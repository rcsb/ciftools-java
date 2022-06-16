package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.data.Float32Array;
import org.rcsb.cif.binary.data.FloatArray;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.encoding.IntervalQuantizationEncoding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntervalQuantizationCodecTest {
    @Test
    void testEncode() {
        // create test case
        FloatArray plainArray = new Float32Array(new double[] { 0.5, 1, 1.5, 2, 3, 1.345 });
        Int32Array expected = new Int32Array( new int[] { 0, 0, 1, 2, 2, 1 });

        // encode
        Int32Array encodedData = new IntervalQuantizationEncoding(1, 2, 3, 32).encode(plainArray);

        assertArrayEquals(expected.getData(), encodedData.getData());
    }

    // no round-trip or decode test as codec is not lossless
}