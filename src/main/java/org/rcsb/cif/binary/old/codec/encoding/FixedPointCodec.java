package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecData;

import java.util.stream.IntStream;

public class FixedPointCodec implements Codec<double[], int[], FixedPointParameters> {
    private static final int DEFAULT_FACTOR = 1000;

    @Override
    public CodecData<int[], FixedPointParameters> encode(double[] input) {
        // TODO way to specify/determine factor
//        ArrayType srcType = Codec.determineArrayType(input);
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = (int) Math.round(input[i] * DEFAULT_FACTOR);
        }
        return new CodecData<>(result, new FixedPointParameters(DEFAULT_FACTOR));
    }

    @Override
    public double[] decode(CodecData<int[], FixedPointParameters> input) {
        double f = 1.0 / input.getParameters().getFactor();
        return IntStream.of(input.getData())
                .mapToDouble(i -> f * i)
                .toArray();
    }
}
