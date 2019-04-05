package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.array.Int32Array;
import org.rcsb.cif.binary.array.Int8Array;
import org.rcsb.cif.binary.array.IntArray;
import org.rcsb.cif.binary.array.NumberArray;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.rcsb.cif.binary.codec.RunLengthCodec.RUN_LENGTH_CODEC;

public class RunLengthCodecTest {
    @Test
    public void testForward() {
        // create test case
        Int32Array plainArray = new Int32Array(15, 15, 15, 100, 100, 111, 111, 111, 111, 10000, 10000, 10000, 10000, 10000, 10000);
        CodecData<Int32Array> plainData = CodecData.of(plainArray)
                .startEncoding(IntegerPackingCodec.KIND)
                .build();

        // encode
        CodecData<Int32Array> encodedData = RUN_LENGTH_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData().getArray()));

        // decode
        NumberArray decodedArray = RUN_LENGTH_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getArray(), (int[]) decodedArray.getArray());
    }

    @Test
    public void testEncode() {
        int[] expected = new int[] { 1, 3, 2, 1, 3, 2 };
        Int8Array plainArray = new Int8Array(1, 1, 1, 2, 3, 3);
        CodecData<Int8Array> plainData = CodecData.of(plainArray)
                .startEncoding(RunLengthCodec.KIND)
                .build();

        CodecData<Int32Array> encodedData = RUN_LENGTH_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(encodedData.getData().getArray()));

        assertArrayEquals(expected, encodedData.getData().getArray());
    }

    @Test
    public void testDecode() {
        int[] expected = new int[] { 15, 15, 15, 100, 100, 111, 111, 111, 111, 10000, 10000, 10000, 10000, 10000, 10000 };
        Int32Array encodedArray = new Int32Array(15, 3, 100, 2, 111, 4, 10000, 6);
        CodecData<Int32Array> encodedData = CodecData.of(encodedArray)
                .startEncoding(RunLengthCodec.KIND)
                .addParameter("srcType", 3)
                .addParameter("srcSize", expected.length)
                .build();

        IntArray plainData = RUN_LENGTH_CODEC.decodeInternally(encodedData);

        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(plainData.getArray()));

        assertArrayEquals(expected, plainData.getArray());
    }
}