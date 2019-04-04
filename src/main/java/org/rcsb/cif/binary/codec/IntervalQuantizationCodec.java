package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.Float32Array;
import org.rcsb.cif.binary.array.Float64Array;
import org.rcsb.cif.binary.array.FloatArray;
import org.rcsb.cif.binary.array.Int32Array;

import java.util.stream.IntStream;

public class IntervalQuantizationCodec extends Codec<FloatArray, Int32Array> {
    public static final String KIND = "IntervalQuantization";
    public static final IntervalQuantizationCodec INTERVAL_QUANTIZATION_CODEC = new IntervalQuantizationCodec();

    private IntervalQuantizationCodec() {
        super(KIND);
    }

    public static FloatArray decode(CodecData<Int32Array> codecData) {
        return INTERVAL_QUANTIZATION_CODEC.decodeInternally(codecData);
    }

    @Override
    protected CodecData<Int32Array> encodeInternally(CodecData data) {
        FloatArray input = (FloatArray) data.getData();
        double[] inputArray = input.getArray();

        int min = (int) data.getParameters().get("min");
        int max = (int) data.getParameters().get("max");
        int numSteps = (int) data.getParameters().get("numSteps");

        if (inputArray.length == 0) {
            return CodecData.of(new Int32Array(new int[0]))
                    .addParameter("min", min)
                    .addParameter("max", max)
                    .addParameter("numSteps", numSteps)
                    .addParameter("srcType", Int32Array.TYPE)
                    .create(KIND);
        }

        if (max < min) {
            int t = min;
            min = max;
            max = t;
        }

        double delta = (max - min) / (numSteps - 1.0);

        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            double v = inputArray[i];
            if (v <= min) {
                outputArray[i] = 0;
            } else if (v >= max) {
                // TODO difference to reference impl at https://github.com/molstar/molstar-proto/blob/50ebd5467cbf80da6898bf307a8062f9cd300b6d/src/mol-io/common/binary-cif/array-encoder.ts#L175
                outputArray[i] = max;
            } else {
                outputArray[i] = delta == 0 ? 0 : (int) Math.round((v - min) / delta);
            }
        }

        return CodecData.of(new Int32Array(outputArray))
                .addParameter("min", min)
                .addParameter("max", max)
                .addParameter("numSteps", numSteps)
                .addParameter("srcType", input.getType())
                .create(KIND);
    }

    @Override
    protected FloatArray decodeInternally(CodecData data) {
        Int32Array input = (Int32Array) data.getData();
        int min = (int) data.getParameters().get("min");
        int max = (int) data.getParameters().get("max");
        int numSteps = (int) data.getParameters().get("numSteps");
        int srcType = (int) data.getParameters().get("srcType");

        double delta = (max - min) / (numSteps - 1.0);

        double[] output = IntStream.of(input.getArray())
                .mapToDouble(i -> min + delta * i)
                .toArray();
        return srcType == 32 ? new Float32Array(output) : new Float64Array(output);
    }
}
