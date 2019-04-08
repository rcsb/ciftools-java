package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.Int32Array;
import org.rcsb.cif.binary.array.IntArray;
import org.rcsb.cif.binary.array.NumberArray;

public class RunLengthCodec extends Codec<IntArray, Int32Array> {
    public static final String KIND = "RunLength";
    public static final RunLengthCodec RUN_LENGTH_CODEC = new RunLengthCodec();

    private RunLengthCodec() {
        super(KIND);
    }

    public static IntArray decode(CodecData<Int32Array> codecData) {
        return RUN_LENGTH_CODEC.decodeInternally(codecData);
    }

    public static CodecData<Int32Array> encode(CodecData<IntArray> codecData) {
        return RUN_LENGTH_CODEC.encodeInternally(codecData);
    }

    @Override
    protected CodecData<Int32Array> encodeInternally(CodecData data) {
        IntArray input = (IntArray) data.getData();
//        int srcType;
//
//        if (data.getParameters().containsKey("srcType")) {
//            srcType = (int) data.getParameters().get("srcType");
//        } else {
//            input = new Int32Array(input.getArray());
//            srcType = Int32Array.TYPE;
//        }

        int[] inputArray = input.getArray();
        if (inputArray.length == 0) {
            return CodecData.of(new Int32Array(new int[0]))
                    .startEncoding(KIND)
                    .addParameter("srcType", Int32Array.TYPE)
                    .addParameter("srcSize", 0)
                    .build();
        }

        // calculate output size
        int fullLength = 2;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i - 1] != inputArray[i]) {
                fullLength += 2;
            }
        }
        int[] outputArray = new int[fullLength];
        int offset = 0;
        int runLength = 1;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i - 1] != inputArray[i]) {
                outputArray[offset] = inputArray[i - 1];
                outputArray[offset + 1] = runLength;
                runLength = 1;
                offset += 2;
            } else {
                ++runLength;
            }
        }
        outputArray[offset] = inputArray[inputArray.length - 1];
        outputArray[offset + 1] = runLength;

        return CodecData.of(new Int32Array(outputArray))
                .startEncoding(KIND)
                .addParameter("srcType", Int32Array.TYPE)
                .addParameter("srcSize", inputArray.length)
                .build();
    }

    @Override
    protected IntArray decodeInternally(CodecData<Int32Array> data) {
        ensureParametersPresent(data, "srcType", "srcSize");
        int srcType = (int) data.getParameters().get("srcType");
        int srcSize = (int) data.getParameters().get("srcSize");

        Int32Array input = (Int32Array) data.getData();
        int[] inputArray = input.getArray();

        if (inputArray.length == 0) {
            return (IntArray) data.getData();
        }

        int dataOffset = 0;
        IntArray output = IntArray.get(srcType, srcSize);
        int[] outputArray = output.getArray();

        for (int i = 0; i < inputArray.length; i += 2) {
            int value = inputArray[i];  // value to be repeated
            int length = inputArray[i + 1];  // number of repeats
            for (int j = 0; j < length; ++j) {
                outputArray[dataOffset++] = value;
            }
        }

        return output;
    }
}