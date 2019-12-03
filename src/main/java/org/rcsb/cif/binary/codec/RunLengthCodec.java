package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>Represents each integer value in the input as a pair of (value, number of repeats) and stores the result
 * sequentially as {@link Int32Array}. Additionally, stores the size of the original array to make decoding
 * easier.</p>
 *
 * <pre>
 * RunLength {
 *     kind = "RunLength"
 *     srcType: int[]
 *     srcSize: number
 * }
 * Example
 * [1, 1, 1, 2, 3, 3]
 * ---RunLength---&gt;
 * { srcSize = 6 } [1, 3, 2, 1, 3, 2]
 * </pre>
 */
public class RunLengthCodec {
    public Int32Array encode(IntArray data, RunLengthEncoding encoding) {
        int[] input = data.getData();
        if (input.length == 0) {
            Deque<Encoding> enc = new ArrayDeque<>(data.getEncoding());
            encoding.setSrcType(3);
            encoding.setSrcSize(0);
            enc.add(encoding);
            return EncodedDataFactory.int32Array(new int[0], enc);
        }

        // calculate output size
        int fullLength = 2;
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] != input[i]) {
                fullLength += 2;
            }
        }

        int[] output = new int[fullLength];

        int offset = 0;
        int runLength = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] != input[i]) {
                output[offset] = input[i - 1];
                output[offset + 1] = runLength;
                runLength = 1;
                offset += 2;
            } else {
                ++runLength;
            }
        }
        output[offset] = input[input.length - 1];
        output[offset + 1] = runLength;

        Deque<Encoding> enc = new ArrayDeque<>(data.getEncoding());
        encoding.setSrcType(3);
        encoding.setSrcSize(input.length);
        enc.add(encoding);

        return EncodedDataFactory.int32Array(output, enc);
    }

    public IntArray decode(Int32Array data, RunLengthEncoding encoding) {
        int srcType = encoding.getSrcType();
        int srcSize = encoding.getSrcSize();

        int[] input = data.getData();
        if (input.length == 0) {
            return data;
        }

        int dataOffset = 0;
        IntArray output = EncodedDataFactory.intArray(srcType, srcSize);

        output.setEncoding(data.getEncoding());
        int[] outputArray = output.getData();

        for (int i = 0; i < data.length(); i += 2) {
            int value = input[i];  // value to be repeated
            int length = input[i + 1];  // number of repeats
            for (int j = 0; j < length; ++j) {
                outputArray[dataOffset++] = value;
            }
        }

        return output;
    }
}
