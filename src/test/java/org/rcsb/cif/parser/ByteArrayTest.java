package org.rcsb.cif.parser;

import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;

public class ByteArrayTest {
    /**
     * Test the conversion of byte arrays to one byte integer arrays
     */
    @Test
    public final void parseInt8() {
        int[] testIntArray = { -12, 123, -24 };
        byte[] byteArray = { (byte) -12, (byte) 123, (byte) -24 };
        int[] intArray = new ByteArray(byteArray, 1).parseAsInt8();
        Assert.assertArrayEquals(testIntArray, intArray);
    }

    /**
     * Test the conversion of byte arrays to two byte integer arrays
     */
    @Test
    public final void parseInt16(){
        int[] testIntArray = { 1000, -1002, 546 };
        byte[] byteArray = getByteArray(testIntArray,2);
        int[] intArray = new ByteArray(byteArray, 2).parseAsInt16();
        Assert.assertArrayEquals(testIntArray, intArray);
    }

    /**
     * Test the conversion of byte arrays to four byte integer arrays
     */
    @Test
    public final void parseInt32() {
        int[] testIntArray = { -32403, 11200, 100090 };
        byte[] byteArray = getByteArray(testIntArray,4);
        int[] intArray = new ByteArray(byteArray, 4).parseAsInt32();
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
            System.arraycopy(intBytes, 0, outBytes, i * numBytes, numBytes);
        }
        return outBytes;
    }

    @Test
    public void parseAsUint8() {
        int[] testIntArray = { 244, 123, 232 };
        byte[] byteArray = { (byte) -12, (byte) 123, (byte) -24 };
        int[] intArray = new ByteArray(byteArray, 1).parseAsUint8();
        Assert.assertArrayEquals(testIntArray, intArray);
    }

    @Test
    public void parseAsUint16() {
        int[] testIntArray = { 1000, 64534, 546 };
        byte[] byteArray = getByteArray(testIntArray,2);
        int[] intArray = new ByteArray(byteArray, 2).parseAsUint16();
        Assert.assertArrayEquals(testIntArray, intArray);
    }

    @Test
    public void parseAsUint32() {
        int[] testIntArray = { Integer.MAX_VALUE - 32403, 11200, 100090 };
        byte[] byteArray = getByteArray(testIntArray,4);
        int[] intArray = new ByteArray(byteArray, 4).parseAsUint32();
        Assert.assertArrayEquals(testIntArray, intArray);
    }

    @Test
    public void parseAsFloat() {
        // TODO impl
    }

    @Test
    public void parseAsDouble() {
        // TODO impl
    }
}