package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.CodecParameters;

public class IntervalQuantizationParameters implements CodecParameters {
    private final int min;
    private final int max;
    private final int numSteps;

    public IntervalQuantizationParameters(int min, int max, int numSteps) {
        this.min = min;
        this.max = max;
        this.numSteps = numSteps;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getNumSteps() {
        return numSteps;
    }
}
