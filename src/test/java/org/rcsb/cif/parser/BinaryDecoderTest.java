package org.rcsb.cif.parser;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BinaryDecoderTest {
    @Test
    public void integerPackingTest() {
        // TODO impl
    }

    @Test
    public void stringArrayTest() {
        // TODO impl
    }

    @Test
    public void intervalQuantizationTest() {
        // TODO impl
    }

    /**
     * Run length decode int test.
     */
    @Test
    public final void runLengthDecodeTest() {
        // Allocate the byte array
        int[] inputData =  { 15, 3, 100, 2, 111, 4, 10000, 6 };
        int[] outputDataTest = { 15, 15, 15, 100, 100, 111, 111, 111, 111, 10000, 10000, 10000, 10000, 10000, 10000 };
        int[] outputData = BinaryDecoder.runLength(inputData);
        Assert.assertArrayEquals(outputDataTest, outputData);
    }

    /**
     * Check run length encoding on empty arrays
     */
    @Test
    public final void emptyRunLengthDecodeTest() {
        // Allocate the byte array
        int[] inputData =  {};
        int[] outputDataTest = {};
        int[] outputData = BinaryDecoder.runLength(inputData);
        Assert.assertArrayEquals(outputDataTest, outputData);
    }

    /**
     * Delta decode int test.
     */
    @Test
    public final void deltaDecodeTest() {
        // Allocate the byte array
        int[] inputData =  { 15, 3, 100, -1, 11, 4 };
        int[] outputDataTest = { 15, 18, 118, 117, 128, 132 };
        Map<String, Object> encoding = new HashMap<>();
        encoding.put("origin", 0);
        int[] outputData = BinaryDecoder.delta(inputData, encoding);
        Assert.assertArrayEquals(outputDataTest, outputData);
    }

    /**
     * Check delta decoding on empty array
     */
    @Test
    public final void emptyDeltaDecodeTest() {
        // Allocate the byte array
        int[] inputData =  {};
        int[] outputDataTest = {};
        Map<String, Object> encoding = new HashMap<>();
        encoding.put("origin", 0);
        int[] outputData = BinaryDecoder.delta(inputData, encoding);
        Assert.assertArrayEquals(outputDataTest, outputData);
    }

    /**
     * Test the conversion of the integer array to a float
     */
    @Test
    public final void testFixedPoint() {
        int[] intArray = { 10001, 100203, 124542 };
        double[] testFloatArray = { 10.001, 100.203, 124.542 };
        Map<String, Object> encoding = new HashMap<>();
        encoding.put("factor", 1000);
        double[] floatArray = BinaryDecoder.fixedPoint(intArray, encoding);
        Assert.assertArrayEquals(testFloatArray, floatArray, 0.001f);
    }
}