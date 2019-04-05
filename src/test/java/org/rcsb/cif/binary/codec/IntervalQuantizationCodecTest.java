package org.rcsb.cif.binary.codec;

import org.junit.Test;
import org.rcsb.cif.binary.array.Float32Array;
import org.rcsb.cif.binary.array.FloatArray;
import org.rcsb.cif.binary.array.Int32Array;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.rcsb.cif.binary.codec.IntervalQuantizationCodec.INTERVAL_QUANTIZATION_CODEC;

public class IntervalQuantizationCodecTest {
    @Test
    public void testEncode() {
        // create test case
        FloatArray plainArray = new Float32Array(0.5, 1, 1.5, 2, 3, 1.345);
        Int32Array expected = new Int32Array(0, 0, 1, 2, 2, 1);
        CodecData<FloatArray> plainData = CodecData.of(plainArray)
                .startEncoding(IntervalQuantizationCodec.KIND)
                .addParameter("min", 1)
                .addParameter("max", 2)
                .addParameter("numSteps", 3)
                .build();

        // encode
        CodecData<Int32Array> encodedData = INTERVAL_QUANTIZATION_CODEC.encodeInternally(plainData);

        System.out.println(Arrays.toString(encodedData.getData().getArray()));
        System.out.println(Arrays.toString(expected.getArray()));

        assertArrayEquals(expected.getArray(), encodedData.getData().getArray());
    }

    // no round-trip or decode test as codec is not lossless
}