package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;

import static org.junit.Assert.assertArrayEquals;

public class IntegerPackingCodecTest {
    @Test
    public void testForward() {
        // create test case
        Int32Array plainArray = EncodedDataFactory.int32Array(new int[] { -1, 2, -100, 42, 126 });

        // encode
        IntegerPackingEncoding integerPackingEncoding = new IntegerPackingEncoding();
        IntArray encodedData = plainArray.encode(integerPackingEncoding);

        System.out.println(encodedData);

        // decode
        Int32Array decodedArray = encodedData.decode(integerPackingEncoding);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }
}