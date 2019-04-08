package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.*;

public class DeltaCodec extends Codec<IntArray, IntArray> {
    public static final String KIND = "Delta";
    public static final DeltaCodec DELTA_CODEC = new DeltaCodec();

    private DeltaCodec() {
        super(KIND);
    }

    public static IntArray decode(CodecData<IntArray> codecData) {
        return DELTA_CODEC.decodeInternally(codecData);
    }

    public static CodecData<IntArray> encode(CodecData<IntArray> codecData) {
        return DELTA_CODEC.encodeInternally(codecData);
    }

    @Override
    protected CodecData<IntArray> encodeInternally(CodecData data) {
        IntArray input = (IntArray) data.getData();
        if (input instanceof Uint8Array || input instanceof Uint16Array || input instanceof Uint32Array) {
            throw new IllegalArgumentException("Only signed integer types can be encoded using delta encoding.");
        }

        int srcType;
        if (data.getParameters().get("srcType") == null) {
            input = ArrayFactory.int32Array(input.getData());
            srcType = Int32Array.TYPE;
        } else {
            srcType = (int) data.getParameters().get("srcType");
        }

        int[] inputArray = input.getData();
        if (inputArray.length == 0) {
            return CodecData.of(ArrayFactory.intArray(srcType, 0))
                    .startEncoding(KIND)
                    .addParameter("origin", 0)
                    .addParameter("srcType", srcType)
                    .build();
        }

        IntArray output = ArrayFactory.intArray(srcType, inputArray.length);
        int[] outputArray = output.getData();
        int origin = inputArray[0];
        outputArray[0] = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i] - inputArray[i - 1];
        }
        outputArray[0] = 0;

        return CodecData.of(output)
                .startEncoding(KIND)
                .addParameter("origin", origin)
                .addParameter("srcType", srcType)
                .build();
    }

    @Override
    protected IntArray decodeInternally(CodecData<IntArray> data) {
        ensureParametersPresent(data, "origin", "srcType");
        int[] input = data.getData().getData();
        int origin = (int) data.getParameters().get("origin");
        int srcType = (int) data.getParameters().get("srcType");
        IntArray output = ArrayFactory.intArray(srcType, input.length);

        int n = input.length;
        if (n == 0) {
            return output;
        }

        int[] outputArray = output.getData();
        outputArray[0] = input[0] + origin;
        for (int i = 1; i < n; ++i) {
            outputArray[i] = input[i] + outputArray[i - 1];
        }
        return output;
    }
}
