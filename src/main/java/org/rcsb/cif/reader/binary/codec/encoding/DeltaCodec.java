package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.AbstractCodec;

public class DeltaCodec extends AbstractCodec<int[], int[], DeltaParameters> {
    public DeltaCodec(DeltaParameters parameters) {
        super(parameters);
    }

    @Override
    public int[] encode(int[] input) {
        // TODO impl
        return new int[0];
    }

    @Override
    public int[] decode(int[] input) {
        int n = input.length;
        int[] output = new int[n];
        if (n == 0) {
            return output;
        }
        output[0] = input[0] + getParameters().getOrigin();
        for (int i = 1; i < n; ++i) {
            output[i] = input[i] + output[i - 1];
        }
        return output;
    }
}
