package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecData;

import java.util.ArrayList;
import java.util.List;

public class RunLengthCodec implements Codec<int[], int[], RunLengthParameters> {
    @Override
    public CodecData<int[], RunLengthParameters> encode(int[] input) {
        // TODO impl
        return null;
    }

    @Override
    public int[] decode(CodecData<int[], RunLengthParameters> input) {
        int[] data = input.getData();
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < data.length; i += 2) {
            int value = data[i];  // value to be repeated
            int length = data[i + 1];  // number of repeats
            for (int j = 0; j < length; ++j) {
                output.add(value);
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}
