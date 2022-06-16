package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.TestHelper;
import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FixedPointCodecTest {
    @Test
    void testForward() {
        // create test case
        int factor = 1000;
        Float64Array plainArray = new Float64Array(new double[] { -1, 2.04, -100.5893, 42, Integer.MAX_VALUE / (double) factor,
                Integer.MIN_VALUE / (double) factor });

        // encode
        FixedPointEncoding fixedPointEncoding = new FixedPointEncoding(factor);
        Int32Array encodedData = plainArray.encode(fixedPointEncoding);

        // decode
        FloatArray decodedArray = encodedData.decode(fixedPointEncoding);

        assertArrayEquals(plainArray.getData(), decodedArray.getData(), TestHelper.ERROR_MARGIN);
    }

    @Test
    void testFixedPoint() {
        Int32Array intArray = new Int32Array(new int[] { 10001, 100203, 124542 });
        FloatArray testFloatArray = new Float64Array(new double[] { 10.001, 100.203, 124.542 });

        FloatArray floatArray = intArray.decode(new FixedPointEncoding(1000, 3));
        assertArrayEquals(testFloatArray.getData(), floatArray.getData(), 0.001f);
    }
}