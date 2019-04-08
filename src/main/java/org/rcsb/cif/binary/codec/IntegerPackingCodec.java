package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.*;

import java.util.stream.IntStream;

public class IntegerPackingCodec extends Codec<Int32Array, IntArray> {
    public static final String KIND = "IntegerPacking";
    public static final IntegerPackingCodec INTEGER_PACKING_CODEC = new IntegerPackingCodec();

    private IntegerPackingCodec() {
        super(KIND);
    }

    @SuppressWarnings("unchecked")
    public static Int32Array decode(CodecData<IntArray> codecData) {
        return INTEGER_PACKING_CODEC.decodeInternally(codecData);
    }

    public static CodecData<IntArray> encode(CodecData<Int32Array> codecData) {
        return INTEGER_PACKING_CODEC.encodeInternally(codecData);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected CodecData<IntArray> encodeInternally(CodecData data) {
        if (!(data.getData() instanceof Int32Array)) {
            throw new IllegalArgumentException("Integer packing can only be applied to Int32 data. Found " +
                    data.getData().getClass().getSimpleName());
        }

        Int32Array input = (Int32Array) data.getData();
        int[] inputArray = input.getData();

        Packing packing = determinePacking(inputArray);
        if (packing.bytesPerElement == 4) {
            return CodecData.of((IntArray) input)
                    .startEncoding(KIND)
                    .addParameter("byteCount", 4)
                    .addParameter("isUnsigned", false)
                    .addParameter("srcSize", inputArray.length)
                    .build();
        }

        int upperLimit = packing.signed ? packing.bytesPerElement == 1 ? 0x7F : 0x7FFF :
                packing.bytesPerElement == 1 ? 0xFF : 0xFFFF;

        int lowerLimit = -upperLimit - 1;
        int[] outputArray = new int[packing.size];
        int j = 0;

        for (int i1 : inputArray) {
            int value = i1;
            if (value >= 0) {
                while (value >= upperLimit) {
                    outputArray[j] = upperLimit;
                    ++j;
                    value -= upperLimit;
                }
            } else {
                while (value <= lowerLimit) {
                    outputArray[j] = lowerLimit;
                    ++j;
                    value -= lowerLimit;
                }
            }
            outputArray[j] = value;
            ++j;
        }

        IntArray output = packing.signed ? packing.bytesPerElement == 1 ? ArrayFactory.int8Array(outputArray) : ArrayFactory.int16Array(outputArray) :
                packing.bytesPerElement == 1 ? ArrayFactory.uint8Array(outputArray) : ArrayFactory.uint16Array(outputArray);
        return CodecData.of(output)
                .startEncoding(KIND)
                .addParameter("byteCount", packing.bytesPerElement)
                .addParameter("isUnsigned", !packing.signed)
                .addParameter("srcSize", packing.size)
                .build();
    }

    class Packing {
        final boolean signed;
        final int size;
        final int bytesPerElement;

        Packing(boolean signed, int size, int bytesPerElement) {
            this.signed = signed;
            this.size = size;
            this.bytesPerElement = bytesPerElement;
        }
    }

    private Packing determinePacking(int[] input) {
        boolean signed = IntStream.of(input).anyMatch(i -> i < 0);
        int size8 = packingSize(input, signed ? 0x7F : 0xFF);
        int size16 = packingSize(input, signed ? 0x7FFF : 0xFFFF);

        if (input.length * 4 < size16 * 2) {
            // 4 byte packing is the most effective
            return new Packing(signed, input.length, 4);
        } else if (size16 * 2 < size8) {
            // 2 byte packing is the most effective
            return new Packing(signed, size16, 2);
        } else {
            return new Packing(signed, size8, 1);
        }
    }

    private int packingSize(int[] input, int upperLimit) {
        int lowerLimit = -upperLimit - 1;
        int size = 0;
        for (int value : input) {
            if (value == 0) {
                size += 1;
            } else if (value > 0) {
                size += Math.ceil(value / (double) upperLimit);
                if (value % upperLimit == 0) {
                    size += 1;
                }
            } else {
                size += Math.ceil(value / (double) lowerLimit);
                if (value % lowerLimit == 0) {
                    size += 1;
                }
            }
        }
        return size;
    }

    @Override
    protected Int32Array decodeInternally(CodecData<IntArray> data) {
        ensureParametersPresent(data, "isUnsigned", "srcSize", "byteCount");

        IntArray input = data.getData();
        int[] inputArray = input.getData();

        boolean unsigned = (boolean) data.getParameters().get("isUnsigned");
        int byteCount = (int) data.getParameters().get("byteCount");
        int srcSize = (int) data.getParameters().get("srcSize");

        if (inputArray.length == srcSize && byteCount == 4) {
            return ArrayFactory.int32Array(inputArray);
        }

        int upperLimit;
        int lowerLimit = 0;
        if (unsigned) {
            upperLimit = byteCount == 1 ? 0xFF : 0xFFFF;
        } else {
            upperLimit = byteCount == 1 ? 0x7F : 0x7FFF;
            lowerLimit = -upperLimit - 1;
        }

        int n = inputArray.length;
        int[] outputArray = new int[srcSize];
        int i = 0;
        int j = 0;
        while (i < n) {
            int value = 0;
            int t = inputArray[i];
            while (unsigned ? t == upperLimit : t == upperLimit || t == lowerLimit) {
                value += t;
                i++;
                t = inputArray[i];
            }
            value += t;
            outputArray[j] = value;
            i++;
            j++;
        }

        return ArrayFactory.int32Array(outputArray);
    }
}
