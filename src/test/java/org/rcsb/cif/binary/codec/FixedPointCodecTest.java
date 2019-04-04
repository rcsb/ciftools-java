package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.TestHelper;
import org.rcsb.cif.binary.array.*;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.rcsb.cif.binary.codec.FixedPointCodec.FIXED_POINT_CODEC;

public class FixedPointCodecTest {
    @Test
    public void testForward() {
        // create test case
        int factor = 1000;
        FloatArray plainArray = new Float64Array(-1, 2.04, -100.5893, 42, Integer.MAX_VALUE / (double) factor,
                Integer.MIN_VALUE / (double) factor);
        CodecData<FloatArray> plainData = CodecData.of(plainArray)
                .addParameter("factor", factor)
                .addParameter("srcType", Float64Array.TYPE)
                .create(FixedPointCodec.KIND);

        // encode
        CodecData<Int32Array> encodedData = FIXED_POINT_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData().getArray()));

        // decode
        NumberArray decodedArray = FIXED_POINT_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getArray(), (double[]) decodedArray.getArray(), TestHelper.ERROR_MARGIN);
    }

    @Test
    public final void testFixedPoint() {
        IntArray intArray = new Int32Array(10001, 100203, 124542);
        FloatArray testFloatArray = new Float64Array(10.001, 100.203, 124.542);
        CodecData<IntArray> codecData = CodecData.of(intArray)
                .addParameter("factor", 1000)
                .addParameter("srcType", 33)
                .create(FixedPointCodec.KIND);
        double[] floatArray = FIXED_POINT_CODEC.decodeInternally(codecData).getArray();
        assertArrayEquals(testFloatArray.getArray(), floatArray, 0.001f);
    }
}