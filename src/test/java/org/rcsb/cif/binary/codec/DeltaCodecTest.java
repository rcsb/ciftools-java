package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.data.*;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.rcsb.cif.binary.codec.DeltaCodec.DELTA_CODEC;

public class DeltaCodecTest {
    @Test
    public void testForward() {
        // create test case
        Int8Array plainArray = ArrayFactory.int8Array(new int[] { 1, 2, 3, 4, 5, 6 });
        CodecData<Int8Array> plainData = CodecData.of(plainArray)
                .startEncoding(DeltaCodec.KIND)
                .build();

        // encode
        CodecData<IntArray> encodedData = DELTA_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData().getData()));

        // decode
        NumberArray decodedArray = DELTA_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }

    @Test
    public void honorSrcType() {
        // create test case
        Int8Array plainArray = ArrayFactory.int8Array(new int[] { 1, 2, 3, 4, 5, 6 });
        CodecData<Int8Array> plainData = CodecData.of(plainArray)
                .startEncoding(DeltaCodec.KIND)
                .addParameter("srcType", 1)
                .build();

        // encode
        CodecData<IntArray> encodedData = DELTA_CODEC.encodeInternally(plainData);

        assertTrue(encodedData.getData() instanceof Int8Array);

        // decode
        NumberArray decodedArray = DELTA_CODEC.decodeInternally(encodedData);

        assertTrue(decodedArray instanceof Int8Array);
    }

    @Test
    public void fallbackToInt32Array() {
        // create test case
        Int8Array plainArray = ArrayFactory.int8Array(new int[] { 1, 2, 3, 4, 5, 6 });
        CodecData<Int8Array> plainData = CodecData.of(plainArray)
                .startEncoding(DeltaCodec.KIND)
                .build();

        // encode
        CodecData<IntArray> encodedData = DELTA_CODEC.encodeInternally(plainData);

        assertTrue(encodedData.getData() instanceof Int32Array);

        // decode
        NumberArray decodedArray = DELTA_CODEC.decodeInternally(encodedData);

        assertTrue(decodedArray instanceof Int32Array);
    }

    @Test
    public void emptyCase() {
        Int8Array plainArray = ArrayFactory.int8Array(new int[0]);
        CodecData<Int8Array> plainData = CodecData.of(plainArray)
                .startEncoding(DeltaCodec.KIND)
                .build();

        // encode
        CodecData<IntArray> encodedData = DELTA_CODEC.encodeInternally(plainData);

        assertEquals(0, encodedData.getData().length());

        // decode
        NumberArray decodedArray = DELTA_CODEC.decodeInternally(encodedData);

        assertEquals(0, ((int[]) decodedArray.getData()).length);
    }
}