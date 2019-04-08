package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.*;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FixedPointCodec extends Codec<FloatArray, Int32Array> {
    public static final String KIND = "FixedPoint";
    public static final FixedPointCodec FIXED_POINT_CODEC = new FixedPointCodec();

    private FixedPointCodec() {
        super(KIND);
    }

    public static FloatArray decode(CodecData<Int32Array> codecData) {
        return FIXED_POINT_CODEC.decodeInternally(codecData);
    }

    public static CodecData<Int32Array> encode(CodecData<FloatArray> codecData) {
        return FIXED_POINT_CODEC.encodeInternally(codecData);
    }

    @Override
    protected CodecData<Int32Array> encodeInternally(CodecData data) {
        if (!data.getParameters().containsKey("factor")) {
            throw new IllegalArgumentException("No factor provided for FixedPointCodec");
        }

        FloatArray input = (FloatArray) data.getData();
        double[] inputArray = input.getData();
        int srcType = input.getType();
        int factor = (int) data.getParameters().get("factor");

        int[] outputArray = DoubleStream.of(inputArray)
                .mapToInt(d -> (int) Math.round(d * factor))
                .toArray();

        return CodecData.of(ArrayFactory.int32Array(outputArray))
                .startEncoding(KIND)
                .addParameter("factor", factor)
                .addParameter("srcType", srcType)
                .build();
    }

    @Override
    protected FloatArray decodeInternally(CodecData data) {
        ensureParametersPresent(data, "factor", "srcType");

        Int32Array input = (Int32Array) data.getData();
        int[] inputArray = input.getData();
        int srcType = (int) data.getParameters().get("srcType");
        double f = 1.0 / (int) data.getParameters().get("factor");

        double[] outputArray = IntStream.of(inputArray)
                .mapToDouble(i -> f * i)
                .toArray();

        return srcType == Float32Array.TYPE ? ArrayFactory.float32Array(outputArray) : ArrayFactory.float64Array(outputArray);
    }
}
