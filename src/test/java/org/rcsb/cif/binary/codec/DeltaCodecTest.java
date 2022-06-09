package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.data.Int8Array;
import org.rcsb.cif.binary.encoding.DeltaEncoding;

import static org.junit.jupiter.api.Assertions.*;

class DeltaCodecTest {
    @Test
    void testForward() {
        // create test case
        Int8Array plainArray = new Int8Array(new int[] { 1, 2, 3, 4, 5, 6 });

        // encode
        DeltaEncoding<Int8Array> deltaEncoding = new DeltaEncoding<>();
        Int8Array encodedData = plainArray.encode(deltaEncoding);

        // decode
        Int8Array decodedArray = encodedData.decode(deltaEncoding);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void honorSrcType() {
        // create test case
        Int8Array plainArray = new Int8Array(new int[] { 1, 2, 3, 4, 5, 6 });

        // encode
        DeltaEncoding<Int8Array> deltaEncoding = new DeltaEncoding<>();
        Int8Array encodedData = plainArray.encode(deltaEncoding);

        // decode
        Int8Array decodedArray = encodedData.decode(deltaEncoding);

        assertNotNull(decodedArray);
    }

    @Test
    void emptyCase() {
        Int8Array plainArray = new Int8Array(new int[0]);

        // encode
        DeltaEncoding<Int8Array> deltaEncoding = new DeltaEncoding<>();
        Int8Array encodedData = plainArray.encode(deltaEncoding);

        assertEquals(0, encodedData.length());

        // decode
        Int8Array decodedArray = encodedData.decode(deltaEncoding);

        assertEquals(0, decodedArray.length());
    }
}