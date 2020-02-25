package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.FloatArray;
import org.rcsb.cif.binary.data.Int32Array;

import java.util.Map;

public class IntervalQuantizationEncoding implements Encoding<Int32Array> {
    private static final String kind = "IntervalQuantization";
    private final int min;
    private final int max;
    private final int numSteps;
    private int srcType;

    public IntervalQuantizationEncoding(int min, int max, int numSteps) {
        this(min, max, numSteps, 0);
    }

    public IntervalQuantizationEncoding(int min, int max, int numSteps, int srcType) {
        this.min = min;
        this.max = max;
        this.numSteps = numSteps;
        this.srcType = srcType;
    }

    public IntervalQuantizationEncoding(Map<String, Object> encoding) {
        this((int) encoding.get("min"), (int) encoding.get("max"), (int) encoding.get("numSteps"),
                (int) encoding.get("srcType"));
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

    public int getSrcType() {
        return srcType;
    }

    public void setSrcType(int srcType) {
        this.srcType = srcType;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public FloatArray decode(Int32Array current) {
        return Codec.INTERVAL_QUANTIZATION_CODEC.decode(current, this);
    }

    @Override
    public String toString() {
        return "IntervalQuantizationEncoding{" +
                "min=" + min +
                ", max=" + max +
                ", numSteps=" + numSteps +
                ", srcType=" + srcType +
                '}';
    }
}