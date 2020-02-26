package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.data.IntArray;
import org.rcsb.cif.binary.data.SignedIntArray;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;

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
public class DeltaEncoding<T extends SignedIntArray<?>> implements Encoding<T, T> {
    private int origin;
    private int srcType;

    public DeltaEncoding() {

    }

    public DeltaEncoding(int origin, int srcType) {
        this.origin = origin;
        this.srcType = srcType;
    }

    @Override
    public Map<String, Object> getMapRepresentation() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("kind", "Delta");
        map.put("origin", origin);
        map.put("srcType", srcType);
        return map;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T decode(T data) {
        int[] input = data.getData();
        T output = (T) IntArray.create(data.getType(), input.length);
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

    @Override
    @SuppressWarnings("unchecked")
    public T encode(T data) {
        int srcType = data.getType();
        int[] inputArray = data.getData();
        if (inputArray.length == 0) {
            T output = (T) IntArray.create(srcType, 0);

            return create(data, srcType, output, 0);
        }

        T output = (T) IntArray.create(srcType, inputArray.length);
        int[] outputArray = output.getData();
        int origin = inputArray[0];
        outputArray[0] = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i] - inputArray[i - 1];
        }
        outputArray[0] = 0;

        return create(data, srcType, output, origin);
    }

    private T create(T data, int srcType, T output, int origin) {
        Deque<Encoding<?, ?>> enc = new ArrayDeque<>(data.getEncoding());
        this.origin = origin;
        this.srcType = srcType;
        enc.add(this);
        output.setEncoding(enc);
        return output;
    }

    @Override
    public String toString() {
        return "DeltaEncoding{" +
                "origin=" + origin +
                ", srcType=" + srcType +
                '}';
    }
}
