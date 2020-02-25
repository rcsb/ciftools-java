package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.data.Int8Array;
import org.rcsb.cif.binary.data.SignedIntArray;
import org.rcsb.cif.binary.encoding.DeltaEncoding;

import static org.junit.Assert.*;

public class DeltaCodecTest {
    @Test
    public void testForward() {
        // create test case
        Int8Array plainArray = new Int8Array(new int[] { 1, 2, 3, 4, 5, 6 });

        // encode
        DeltaEncoding deltaEncoding = new DeltaEncoding();
        SignedIntArray encodedData = plainArray.encode(deltaEncoding);

        // decode
        SignedIntArray decodedArray = encodedData.decode(deltaEncoding);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    public void honorSrcType() {
        // create test case
        Int8Array plainArray = new Int8Array(new int[] { 1, 2, 3, 4, 5, 6 });

        // encode
        DeltaEncoding deltaEncoding = new DeltaEncoding();
        SignedIntArray encodedData = plainArray.encode(deltaEncoding);

        // decode
        SignedIntArray decodedArray = encodedData.decode(deltaEncoding);

        assertNotNull(decodedArray);
    }

    @Test
    public void emptyCase() {
        Int8Array plainArray = new Int8Array(new int[0]);

        // encode
        DeltaEncoding deltaEncoding = new DeltaEncoding();
        SignedIntArray encodedData = plainArray.encode(deltaEncoding);

        assertEquals(0, encodedData.length());

        // decode
        SignedIntArray decodedArray = encodedData.decode(deltaEncoding);

        assertEquals(0, decodedArray.length());
    }
}