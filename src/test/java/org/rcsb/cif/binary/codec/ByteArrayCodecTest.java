package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.TestHelper;
import org.rcsb.cif.binary.array.*;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.rcsb.cif.binary.codec.ByteArrayCodec.BYTE_ARRAY_CODEC;

public class ByteArrayCodecTest {
    @Test
    public void testForwardInt8() {
        // create test case
        Int8Array plainArray = ArrayFactory.int8Array(new int[] { 1, 2, 3, 4, -128, 127 });
        CodecData<Int8Array> plainData = CodecData.of(plainArray)
                .startEncoding(ByteArrayCodec.KIND)
                .build();

        // encode
        CodecData<byte[]> encodedData = BYTE_ARRAY_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData()));

        // decode
        NumberArray decodedArray = BYTE_ARRAY_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardInt16() {
        // create test case
        Int16Array plainArray = ArrayFactory.int16Array(new int[] { 1, 2, 3, 4, -32_768, 32_767 });
        CodecData<Int16Array> plainData = CodecData.of(plainArray)
                .startEncoding(ByteArrayCodec.KIND)
                .build();

        // encode
        CodecData<byte[]> encodedData = BYTE_ARRAY_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData()));

        // decode
        NumberArray decodedArray = BYTE_ARRAY_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardInt32() {
        // create test case
        Int32Array plainArray = ArrayFactory.int32Array(new int[] { 1, 2, 3, 4, -2_147_483_648, 2_147_483_647 });
        CodecData<Int32Array> plainData = CodecData.of(plainArray)
                .startEncoding(ByteArrayCodec.KIND)
                .build();

        // encode
        CodecData<byte[]> encodedData = BYTE_ARRAY_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData()));

        // decode
        NumberArray decodedArray = BYTE_ARRAY_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardUint8() {
        // create test case
        Uint8Array plainArray = ArrayFactory.uint8Array(new int[] { 1, 2, 3, 4, 0, 255 });
        CodecData<Uint8Array> plainData = CodecData.of(plainArray)
                .startEncoding(ByteArrayCodec.KIND)
                .build();

        // encode
        CodecData<byte[]> encodedData = BYTE_ARRAY_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData()));

        // decode
        NumberArray decodedArray = BYTE_ARRAY_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardUint16() {
        // create test case
        Uint16Array plainArray = ArrayFactory.uint16Array(new int[] { 1, 2, 3, 4, 0, 65_535 });
        CodecData<Uint16Array> plainData = CodecData.of(plainArray)
                .startEncoding(ByteArrayCodec.KIND)
                .build();

        // encode
        CodecData<byte[]> encodedData = BYTE_ARRAY_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData()));

        // decode
        NumberArray decodedArray = BYTE_ARRAY_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardUint32() {
        // create test case
        Uint32Array plainArray = ArrayFactory.uint32Array(new int[] { 1, 2, 3, 4, 0, /*4_294_967_295*/ Integer.MAX_VALUE });
        CodecData<Uint32Array> plainData = CodecData.of(plainArray)
                .startEncoding(ByteArrayCodec.KIND)
                .build();

        // encode
        CodecData<byte[]> encodedData = BYTE_ARRAY_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData()));

        // decode
        NumberArray decodedArray = BYTE_ARRAY_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void testForwardFloat32() {
        // create test case
        Float32Array plainArray = ArrayFactory.float32Array(new double[] { -1.0, 2.3, -3.5, 4, -Float.MAX_VALUE, Float.MAX_VALUE });
        CodecData<Float32Array> plainData = CodecData.of(plainArray)
                .startEncoding(ByteArrayCodec.KIND)
                .build();

        // encode
        CodecData<byte[]> encodedData = BYTE_ARRAY_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData()));

        // decode
        NumberArray decodedArray = BYTE_ARRAY_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (double[]) decodedArray.getData(), TestHelper.ERROR_MARGIN);
    }

    @Test
    public void testForwardFloat64() {
        // create test case
        Float64Array plainArray = ArrayFactory.float64Array(new double[] { -1.0, 2.3, -3.5, 4, -Double.MAX_VALUE, Double.MAX_VALUE });
        CodecData<Float64Array> plainData = CodecData.of(plainArray)
                .startEncoding(ByteArrayCodec.KIND)
                .build();

        // encode
        CodecData<byte[]> encodedData = BYTE_ARRAY_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData()));

        // decode
        NumberArray decodedArray = BYTE_ARRAY_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (double[]) decodedArray.getData(), TestHelper.ERROR_MARGIN);
    }
}