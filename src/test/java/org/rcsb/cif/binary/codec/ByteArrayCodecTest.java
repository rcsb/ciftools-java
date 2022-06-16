package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.TestHelper;
import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ByteArrayCodecTest {
    @Test
    void testForwardInt8() {
        // create test case
        Int8Array plainArray = new Int8Array(new int[] { 1, 2, 3, 4, -128, 127 });

        // encode
        ByteArray encodedData = plainArray.encode();

        // decode
        Int8Array decodedArray = encodedData.decode(ByteArrayEncoding.INT8);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testForwardInt16() {
        // create test case
        Int16Array plainArray = new Int16Array(new int[] { 1, 2, 3, 4, -32_768, 32_767 });

        // encode
        ByteArray encodedData = plainArray.encode();

        // decode
        IntArray decodedArray = encodedData.decode(ByteArrayEncoding.INT16);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testForwardInt32() {
        // create test case
        Int32Array plainArray = new Int32Array(new int[] { 1, 2, 3, 4, -2_147_483_648, 2_147_483_647 });

        // encode
        ByteArray encodedData = plainArray.encode();

        // decode
        IntArray decodedArray = encodedData.decode(ByteArrayEncoding.INT32);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testForwardUint8() {
        // create test case
        Uint8Array plainArray = new Uint8Array(new int[] { 1, 2, 3, 4, 0, 255 });

        // encode
        ByteArray encodedData = plainArray.encode();

        // decode
        IntArray decodedArray = encodedData.decode(ByteArrayEncoding.UINT8);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testForwardUint16() {
        // create test case
        Uint16Array plainArray = new Uint16Array(new int[] { 1, 2, 3, 4, 0, 65_535 });

        // encode
        ByteArray encodedData = plainArray.encode();

        // decode
        IntArray decodedArray = encodedData.decode(ByteArrayEncoding.UINT16);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testForwardUint32() {
        // create test case
        Uint32Array plainArray = new Uint32Array(new int[] { 1, 2, 3, 4, 0, Integer.MAX_VALUE });

        // encode
        ByteArray encodedData = plainArray.encode();

        // decode
        IntArray decodedArray = encodedData.decode(ByteArrayEncoding.UINT32);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testForwardFloat32() {
        // create test case
        Float32Array plainArray = new Float32Array(new double[] { -1.0, 2.3, -3.5, 4, -Float.MAX_VALUE, Float.MAX_VALUE });

        // encode
        ByteArray encodedData = plainArray.encode();

        // decode
        FloatArray decodedArray = encodedData.decode(ByteArrayEncoding.FLOAT32);

        assertArrayEquals(plainArray.getData(), decodedArray.getData(), TestHelper.ERROR_MARGIN);
    }

    @Test
    void testForwardFloat64() {
        // create test case
        Float64Array plainArray = new Float64Array(new double[] { -1.0, 2.3, -3.5, 4, -Double.MAX_VALUE, Double.MAX_VALUE });

        // encode
        ByteArray encodedData = plainArray.encode();

        // decode
        FloatArray decodedArray = encodedData.decode(ByteArrayEncoding.FLOAT64);

        assertArrayEquals(plainArray.getData(), decodedArray.getData(), TestHelper.ERROR_MARGIN);
    }
}