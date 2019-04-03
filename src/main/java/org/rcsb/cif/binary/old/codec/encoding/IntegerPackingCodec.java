package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecData;
import org.rcsb.cif.binary.old.codec.primitive.ArrayType;

import java.util.stream.IntStream;

public class IntegerPackingCodec implements Codec<int[], int[], IntegerPackingParameters> {
    @Override
    public CodecData<int[], IntegerPackingParameters> encode(int[] input) {
        ArrayType srcType = Codec.determineArrayType(input);
        if (srcType != ArrayType.INT_32) {
            throw new IllegalArgumentException("Integer packing can only be applied to Int32 data.");
        }

        // TODO need to handle outside - actually needs wrapping by to byte array function
        Packing packing = determinePacking(input);
        if (packing.bytesPerElement == 4) {
//            return INT_32.encode(input);
            return new CodecData<>(input, new IntegerPackingParameters(srcType.getNumberOfBytes(), srcType.isUnsigned(), input.length));
        }

        return integerPacking(input, packing);
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

    private CodecData<int[], IntegerPackingParameters> integerPacking(int[] input, Packing packing) {
        int upperLimit = packing.signed ? packing.bytesPerElement == 1 ? 0x7F : 0x7FFF :
                packing.bytesPerElement == 1 ? 0xFF : 0xFFFF;

        int lowerLimit = -upperLimit - 1;
        int n = input.length;
        int[] packed = new int[packing.size];
        int j = 0;

        for (int i = 0; i < n; i++) {
            int value = input[i];
            if (value >= 0) {
                while (value >= upperLimit) {
                    packed[j] = upperLimit;
                    ++j;
                    value -= upperLimit;
                }
            } else {
                while (value <= lowerLimit) {
                    packed[j] = lowerLimit;
                    ++j;
                    value -= lowerLimit;
                }
            }
            packed[j] = value;
            ++j;
        }
        return new CodecData<>(packed, new IntegerPackingParameters(packing.bytesPerElement, !packing.signed, packing.size));
    }

    @Override
    public int[] decode(CodecData<int[], IntegerPackingParameters> input) {
        int[] data = input.getData();
        int srcSize = input.getParameters().getSrcSize();
        int byteCount = input.getParameters().getByteCount();
        boolean unsigned = input.getParameters().isUnsigned();

        if (data.length == srcSize) {
            return data;
        }

        int upperLimit;
        int lowerLimit = 0;
        if (input.getParameters().isUnsigned()) {
            upperLimit = byteCount == 1 ? 0xFF : 0xFFFF;
        } else {
            upperLimit = byteCount == 1 ? 0x7F : 0x7FFF;
            lowerLimit = -upperLimit - 1;
        }
        int n = data.length;
        int[] output = new int[srcSize];
        int i = 0;
        int j = 0;
        while (i < n) {
            int value = 0;
            int t = data[i];
            while (unsigned ? t == upperLimit : t == upperLimit || t == lowerLimit) {
                value += t;
                i++;
                t = data[i];
            }
            value += t;
            output[j] = value;
            i++;
            j++;
        }
        return output;
    }
}
