package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.data.ArrayFactory;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;
import org.rcsb.cif.binary.data.NumberArray;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.rcsb.cif.binary.codec.IntegerPackingCodec.INTEGER_PACKING_CODEC;

public class IntegerPackingCodecTest {
    @Test
    public void testForward() {
        // create test case
        Int32Array plainArray = ArrayFactory.int32Array(new int[] { -1, 2, -100, 42, 126 });
        CodecData<Int32Array> plainData = CodecData.of(plainArray)
                .startEncoding(IntegerPackingCodec.KIND)
                .build();

        // encode
        CodecData<IntArray> encodedData = INTEGER_PACKING_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData().getData()));

        // decode
        NumberArray decodedArray = INTEGER_PACKING_CODEC.decodeInternally(encodedData);

        System.out.println(plainArray);
        System.out.println(decodedArray);
        assertArrayEquals(plainArray.getData(), (int[]) decodedArray.getData());
    }
}