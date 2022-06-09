package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntegerPackingCodecTest {
    @Test
    void testForward() {
        // create test case
        Int32Array plainArray = new Int32Array(new int[] { -1, 2, -100, 42, 126 });

        // encode
        IntegerPackingEncoding integerPackingEncoding = new IntegerPackingEncoding();
        IntArray encodedData = plainArray.encode(integerPackingEncoding);

        // decode
        Int32Array decodedArray = encodedData.decode(integerPackingEncoding);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }
}