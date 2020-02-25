package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.FloatArray;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.encoding.IntervalQuantizationEncoding;

import static org.junit.Assert.assertArrayEquals;

public class IntervalQuantizationCodecTest {
    @Test
    public void testEncode() {
        // create test case
        FloatArray plainArray = EncodedDataFactory.float32Array(new double[] { 0.5, 1, 1.5, 2, 3, 1.345 });
        Int32Array expected = EncodedDataFactory.int32Array( new int[] { 0, 0, 1, 2, 2, 1 });

        // encode
        Int32Array encodedData = new IntervalQuantizationEncoding(1, 2, 3, 32).encode(plainArray);

//        System.out.println(encodedData);
//        System.out.println(expected);

        assertArrayEquals(expected.getData(), encodedData.getData());
    }

    // no round-trip or decode test as codec is not lossless
}