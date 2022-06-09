package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunLengthCodecTest {
    @Test
    void testForward() {
        // create test case
        Int32Array plainArray = new Int32Array(new int[] { 15, 15, 15, 100, 100, 111, 111, 111, 111, 10000, 10000, 10000, 10000, 10000, 10000 });

        // encode
        RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
        Int32Array encodedData = plainArray.encode(runLengthEncoding);

        // decode
        IntArray decodedArray = encodedData.decode(runLengthEncoding);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testEncode() {
        int[] expected = new int[] { 1, 3, 2, 1, 3, 2 };
        Int8Array plainArray = new Int8Array(new int[] { 1, 1, 1, 2, 3, 3 });

        RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
        Int32Array encodedData = plainArray.encode(runLengthEncoding);

        assertArrayEquals(expected, encodedData.getData());
    }

    @Test
    void testDecode() {
        int[] expected = new int[] { 15, 15, 15, 100, 100, 111, 111, 111, 111, 10000, 10000, 10000, 10000, 10000, 10000 };
        Int32Array encodedArray = new Int32Array(new int[] { 15, 3, 100, 2, 111, 4, 10000, 6 });

        IntArray plainData = encodedArray.decode(new RunLengthEncoding(3, expected.length));

        assertArrayEquals(expected, plainData.getData());
    }
}