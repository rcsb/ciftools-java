package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.TestHelper;
import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;

import static org.junit.Assert.assertArrayEquals;

public class ByteArrayCodecTest {
    @Test
    public void testForwardInt8() {
        // create test case
        Int8Array plainArray = EncodedDataFactory.int8Array(new int[] { 1, 2, 3, 4, -128, 127 });

        // encode
        ByteArrayEncoding byteArrayEncoding = new ByteArrayEncoding();
        ByteArray encodedData = plainArray.encode(byteArrayEncoding);

//        System.out.println(encodedData);

        // decode
        Int8Array decodedArray = (Int8Array) encodedData.decode(byteArrayEncoding);

//        System.out.println(plainArray);
//        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    public void testForwardInt16() {
        // create test case
        Int16Array plainArray = EncodedDataFactory.int16Array(new int[] { 1, 2, 3, 4, -32_768, 32_767 });

        // encode
        ByteArrayEncoding byteArrayEncoding = new ByteArrayEncoding();
        ByteArray encodedData = plainArray.encode(byteArrayEncoding);

//        System.out.println(encodedData);

        // decode
        IntArray decodedArray = (IntArray) encodedData.decode(byteArrayEncoding);

//        System.out.println(plainArray);
//        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    public void testForwardInt32() {
        // create test case
        Int32Array plainArray = EncodedDataFactory.int32Array(new int[] { 1, 2, 3, 4, -2_147_483_648, 2_147_483_647 });

        // encode
        ByteArrayEncoding byteArrayEncoding = new ByteArrayEncoding();
        ByteArray encodedData = plainArray.encode(byteArrayEncoding);

//        System.out.println(encodedData);

        // decode
        NumberArray decodedArray = encodedData.decode(byteArrayEncoding);

//        System.out.println(plainArray);
//        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardUint8() {
        // create test case
        Uint8Array plainArray = EncodedDataFactory.uint8Array(new int[] { 1, 2, 3, 4, 0, 255 });

        // encode
        ByteArrayEncoding byteArrayEncoding = new ByteArrayEncoding();
        ByteArray encodedData = plainArray.encode(byteArrayEncoding);

//        System.out.println(encodedData);

        // decode
        NumberArray decodedArray = encodedData.decode(byteArrayEncoding);

//        System.out.println(plainArray);
//        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardUint16() {
        // create test case
        Uint16Array plainArray = EncodedDataFactory.uint16Array(new int[] { 1, 2, 3, 4, 0, 65_535 });

        // encode
        ByteArrayEncoding byteArrayEncoding = new ByteArrayEncoding();
        ByteArray encodedData = plainArray.encode(byteArrayEncoding);

//        System.out.println(encodedData);

        // decode
        NumberArray decodedArray = encodedData.decode(byteArrayEncoding);

//        System.out.println(plainArray);
//        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardUint32() {
        // create test case
        Uint32Array plainArray = EncodedDataFactory.uint32Array(new int[] { 1, 2, 3, 4, 0, /*4_294_967_295*/ Integer.MAX_VALUE });

        // encode
        ByteArrayEncoding byteArrayEncoding = new ByteArrayEncoding();
        ByteArray encodedData = plainArray.encode(byteArrayEncoding);

//        System.out.println(encodedData);

        // decode
        NumberArray decodedArray = encodedData.decode(byteArrayEncoding);

//        System.out.println(plainArray);
//        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardFloat32() {
        // create test case
        Float32Array plainArray = EncodedDataFactory.float32Array(new double[] { -1.0, 2.3, -3.5, 4, -Float.MAX_VALUE, Float.MAX_VALUE });

        // encode
        ByteArrayEncoding byteArrayEncoding = new ByteArrayEncoding();
        ByteArray encodedData = plainArray.encode(byteArrayEncoding);

//        System.out.println(encodedData);

        // decode
        NumberArray decodedArray = encodedData.decode(byteArrayEncoding);

//        System.out.println(plainArray);
//        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (double[]) decodedArray.getData(), TestHelper.ERROR_MARGIN);
    }

    @Test
    public void testForwardFloat64() {
        // create test case
        Float64Array plainArray = EncodedDataFactory.float64Array(new double[] { -1.0, 2.3, -3.5, 4, -Double.MAX_VALUE, Double.MAX_VALUE });

        // encode
        ByteArrayEncoding byteArrayEncoding = new ByteArrayEncoding();
        ByteArray encodedData = plainArray.encode(byteArrayEncoding);

//        System.out.println(encodedData);

        // decode
        NumberArray decodedArray = encodedData.decode(byteArrayEncoding);

//        System.out.println(plainArray);
//        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (double[]) decodedArray.getData(), TestHelper.ERROR_MARGIN);
    }
}