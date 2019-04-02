package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.AbstractCodec;

import java.util.stream.IntStream;

public class FixedPointCodec extends AbstractCodec<double[], int[], FixedPointParameters> {
    public FixedPointCodec(FixedPointParameters parameters) {
        super(parameters);
    }

    @Override
    public int[] encode(double[] input) {
        // TODO impl
        return new int[0];
    }

    @Override
    public double[] decode(int[] input) {
        double f = 1.0 / getParameters().getFactor();
        return IntStream.of(input)
                .mapToDouble(i -> f * i)
                .toArray();
    }
}
