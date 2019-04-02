package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.AbstractCodec;

import java.util.stream.IntStream;

public class IntervalQuantizationCodec extends AbstractCodec<double[], int[], IntervalQuantizationParameters> {
    public IntervalQuantizationCodec(IntervalQuantizationParameters parameters) {
        super(parameters);
    }

    @Override
    public int[] encode(double[] input) {
        // TODO impl
        return new int[0];
    }

    @Override
    public double[] decode(int[] input) {
        int min = getParameters().getMin();
        double delta = (getParameters().getMax() - min) / (getParameters().getNumSteps() - 1.0);
        return IntStream.of(input)
                .mapToDouble(i -> min + delta * i)
                .toArray();
    }
}
