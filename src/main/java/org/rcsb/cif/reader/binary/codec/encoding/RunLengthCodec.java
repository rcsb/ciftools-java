package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.AbstractCodec;

import java.util.ArrayList;
import java.util.List;

public class RunLengthCodec extends AbstractCodec<int[], int[], RunLengthParameters> {
    private static final RunLengthParameters EMPTY_PARAMETERS = new RunLengthParameters();

    public RunLengthCodec() {
        super(EMPTY_PARAMETERS);
    }

    @Override
    public int[] encode(int[] input) {
        // TODO impl
        return new int[0];
    }

    @Override
    public int[] decode(int[] input) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < input.length; i += 2) {
            int value = input[i];  // value to be repeated
            int length = input[i + 1];  // number of repeats
            for (int j = 0; j < length; ++j) {
                output.add(value);
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}
