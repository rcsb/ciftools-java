package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecData;
import org.rcsb.cif.binary.old.codec.primitive.ArrayType;

import java.util.stream.IntStream;

public class IntervalQuantizationCodec implements Codec<double[], int[], IntervalQuantizationParameters> {
    private static final int DEFAULT_MIN = 0;
    private static final int DEFAULT_MAX = 5;
    private static final int DEFAULT_NUM_STEPS = 254;

    @Override
    public CodecData<int[], IntervalQuantizationParameters> encode(double[] input) {
        // TODO way to provide parameters
        int min = DEFAULT_MIN;
        int max = DEFAULT_MAX;
        int numSteps = DEFAULT_NUM_STEPS;

        ArrayType srcType = Codec.determineArrayType(input);
        if (input.length == 0) {
            return new CodecData<>(new int[0], new IntervalQuantizationParameters(min, max, numSteps));
        }

        if (max < min) {
            int t = min;
            min = max;
            max = t;
        }

        double delta = (max - min) / (numSteps - 1.0);

        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            double v = input[i];
            if (v <= min) {
                output[i] = 0;
            } else if (v >= max) {
                output[i] = numSteps;
            } else {
                output[i] = delta == 0 ? 0 : (int) Math.round((v - min) / delta);
            }
        }

        return new CodecData<>(output, new IntervalQuantizationParameters(min, max, numSteps));
    }

    @Override
    public double[] decode(CodecData<int[], IntervalQuantizationParameters> input) {
        int min = input.getParameters().getMin();
        double delta = (input.getParameters().getMax() - min) / (input.getParameters().getNumSteps() - 1.0);
        return IntStream.of(input.getData())
                .mapToDouble(i -> min + delta * i)
                .toArray();
    }
}
