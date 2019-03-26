package org.rcsb.cif.binary.codec;

import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;

public class DecoderTest {
    /**
     * Run length decode int test.
     */
    @Test
    public final void runLengthDecodeTest() {
        // Allocate the byte array
        int[] inputData =  { 15, 3, 100, 2, 111, 4, 10000, 6 };
        int[] outputDataTest = { 15, 15, 15, 100, 100, 111, 111, 111, 111, 10000, 10000, 10000, 10000, 10000, 10000 };
        int[] outputData = Decoder.runLength(inputData);
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
        int[] outputData = Decoder.runLength(inputData);
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
        int[] outputData = Decoder.delta(inputData, 0);
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
        int[] outputData = Decoder.delta(inputData, 0);
        Assert.assertArrayEquals(outputDataTest, outputData);
    }

    /**
     * Test the conversion of the integer array to a float
     */
    @Test
    public final void testFixedPoint() {
        int[] intArray = { 10001, 100203, 124542 };
        double[] testFloatArray = { 10.001, 100.203, 124.542 };
        float divider = 1000.0f;
        double[] floatArray = Decoder.fixedPoint(intArray, divider);
        Assert.assertArrayEquals(testFloatArray, floatArray, 0.001f);
    }

    /**
     * Test the conversion of byte arrays to one byte integer arrays
     */
    @Test
    public final void testConvertSingleByteToInt() {
        int[] testIntArray = { 12, 123, 24 };
        byte[] byteArray = { (byte) 12, (byte) 123, (byte) 24 };
        int[] intArray = Decoder.convertByteToIntegers(byteArray);
        Assert.assertArrayEquals(testIntArray, intArray);
    }

    /**
     * Test the conversion of byte arrays to two byte integer arrays
     */
    @Test
    public final void testConvertTwoBytesToInt(){
        int[] testIntArray = { 1000, 1002, 546 };
        byte[] byteArray = getByteArray(testIntArray,2);
        int[] intArray = Decoder.convertTwoBytesToIntegers(byteArray);
        Assert.assertArrayEquals(testIntArray, intArray);
    }

    /**
     * Test the conversion of byte arrays to four byte integer arrays
     */
    @Test
    public final void testConvertFourBytesToInt() {
        int[] testIntArray = { 32403, 11200, 100090 };
        byte[] byteArray = getByteArray(testIntArray,4);
        int[] intArray = Decoder.convertFourBytesToIntegers(byteArray);
        Assert.assertArrayEquals(testIntArray, intArray);
    }

    /**
     * Utility function to get a byte array. I don't really like this but at least it's an orthogonal approach.
     * @param inArray the input int array
     * @param numBytes the number of bytes per integer
     * @return the output byte array
     */
    private byte[] getByteArray(int[] inArray, int numBytes) {
        byte[] outBytes = new byte[inArray.length * numBytes];
        for (int i = 0; i < inArray.length; i++) {
            byte[] intBytes;
            if (numBytes == 4) {
                intBytes = ByteBuffer.allocate(numBytes).putInt(inArray[i]).array();
            }
            else if (numBytes == 2) {
                intBytes = ByteBuffer.allocate(numBytes).putShort((short) inArray[i]).array();
            }
            else if (numBytes == 1) {
                intBytes = ByteBuffer.allocate(numBytes).put((byte) inArray[i]).array();
            }
            else {
                intBytes = new byte[numBytes];
            }
            for (int j = 0; j < numBytes; j++) {
                outBytes[i * numBytes + j] = intBytes[j];
            }
        }
        return outBytes;
    }
}