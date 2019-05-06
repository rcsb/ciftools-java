package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.SignedIntArray;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.util.LinkedList;

/**
 * <p>Stores the input integer array as an array of consecutive differences.</p>
 *
 * <pre>
 * Delta {
 *     kind = "Delta"
 *     origin: number
 *     srcType: int[]
 * }
 * </pre>
 */
public class DeltaCodec {
    @SuppressWarnings("unchecked")
    public <T extends SignedIntArray> T encode(T data, DeltaEncoding encoding) {
        int srcType = data.getType();
        int[] inputArray = data.getData();
        if (inputArray.length == 0) {
            T output = (T) EncodedDataFactory.intArray(srcType, 0);

            LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
            encoding.setOrigin(0);
            encoding.setSrcType(srcType);
            enc.add(encoding);
            output.setEncoding(enc);
            return output;
        }

        T output = (T) EncodedDataFactory.intArray(srcType, inputArray.length);
        int[] outputArray = output.getData();
        int origin = inputArray[0];
        outputArray[0] = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i] - inputArray[i - 1];
        }
        outputArray[0] = 0;

        LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
        encoding.setOrigin(origin);
        encoding.setSrcType(srcType);
        enc.add(encoding);
        output.setEncoding(enc);
        return output;
    }

    @SuppressWarnings("unchecked")
    public <T extends SignedIntArray> T decode(T data, DeltaEncoding encoding) {
        int[] input = data.getData();
        int origin = encoding.getOrigin();
        int srcType = encoding.getSrcType();
        T output = (T) EncodedDataFactory.intArray(srcType, input.length);
        output.setEncoding(data.getEncoding());

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
