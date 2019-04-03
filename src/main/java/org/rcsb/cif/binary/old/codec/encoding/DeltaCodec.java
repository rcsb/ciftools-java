package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecData;
import org.rcsb.cif.binary.old.codec.primitive.ArrayType;

/**
 * plain: Int8[], Int16[], Int32[] - encoded: byte[]
 */
public class DeltaCodec implements Codec<int[], int[], DeltaParameters> {
    @Override
    public CodecData<int[], DeltaParameters> encode(int[] input) {
        ArrayType srcType = Codec.determineArrayType(input);
        if (srcType.isUnsigned()) {
            throw new IllegalArgumentException("Only signed integer types can be encoded using delta encoding.");
        }

        if (input.length == 0) {
            new CodecData<>(new int[0], new DeltaParameters(0));
        }

        int[] output = new int[input.length];
        int origin = input[0];
        output[0] = input[0];
        for (int i = 1; i < input.length; i++) {
            output[i] = input[i] - input[i - 1];
        }
        output[0] = 0;
        return new CodecData<>(output,
                new DeltaParameters(origin));
    }

    @Override
    public int[] decode(CodecData<int[], DeltaParameters> input) {
        int[] encodedData = input.getData();
        int n = encodedData.length;
        int[] output = new int[n];
        if (n == 0) {
            return output;
        }
        output[0] = encodedData[0] + input.getParameters().getOrigin();
        for (int i = 1; i < n; ++i) {
            output[i] = encodedData[i] + output[i - 1];
        }
        return output;
    }
}
