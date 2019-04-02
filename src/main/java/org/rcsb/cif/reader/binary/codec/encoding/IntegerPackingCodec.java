package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.AbstractCodec;

public class IntegerPackingCodec extends AbstractCodec<int[], int[], IntegerPackingParameters> {
    public IntegerPackingCodec(IntegerPackingParameters parameters) {
        super(parameters);
    }

    @Override
    public int[] encode(int[] input) {
        // TODO impl
        return new int[0];
    }

    @Override
    public int[] decode(int[] input) {
        if (input.length == getParameters().getSrcSize()) {
            return input;
        }

        int upperLimit;
        int lowerLimit = 0;
        if (getParameters().isUnsigned()) {
            upperLimit = getParameters().getByteCount() == 1 ? 0xFF : 0xFFFF;
        } else {
            upperLimit = getParameters().getByteCount() == 1 ? 0x7F : 0x7FFF;
            lowerLimit = -upperLimit - 1;
        }
        int n = input.length;
        int[] output = new int[getParameters().getSrcSize()];
        int i = 0;
        int j = 0;
        while (i < n) {
            int value = 0;
            int t = input[i];
            while (getParameters().isUnsigned() ? t == upperLimit : t == upperLimit || t == lowerLimit) {
                value += t;
                i++;
                t = input[i];
            }
            value += t;
            output[j] = value;
            i++;
            j++;
        }
        return output;
    }
}
