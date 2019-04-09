package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class RunLengthCodecTest {
    @Test
    public void testForward() {
        // create test case
        Int32Array plainArray = EncodedDataFactory.int32Array(new int[] { 15, 15, 15, 100, 100, 111, 111, 111, 111, 10000, 10000, 10000, 10000, 10000, 10000 });

        // encode
        RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
        Int32Array encodedData = plainArray.encode(runLengthEncoding);

        System.out.println(encodedData);

        // decode
        NumberArray decodedArray = encodedData.decode(runLengthEncoding);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testEncode() {
        int[] expected = new int[] { 1, 3, 2, 1, 3, 2 };
        Int8Array plainArray = EncodedDataFactory.int8Array(new int[] { 1, 1, 1, 2, 3, 3 });

        RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
        Int32Array encodedData = plainArray.encode(runLengthEncoding);

        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(encodedData.getData()));

        assertArrayEquals(expected, encodedData.getData());
    }

    @Test
    public void testDecode() {
        int[] expected = new int[] { 15, 15, 15, 100, 100, 111, 111, 111, 111, 10000, 10000, 10000, 10000, 10000, 10000 };
        Int32Array encodedArray = EncodedDataFactory.int32Array(new int[] { 15, 3, 100, 2, 111, 4, 10000, 6 });

        IntArray plainData = encodedArray.decode(new RunLengthEncoding(3, expected.length));

        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(plainData.getData()));

        assertArrayEquals(expected, plainData.getData());
    }
}