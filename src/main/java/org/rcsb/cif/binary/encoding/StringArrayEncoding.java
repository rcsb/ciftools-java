package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.Classifier;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.StringArray;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Stores an array of strings as a concatenation of all unique strings, an array of offsets describing substrings,
 * and indices into the offset array. Indices to corresponding substrings.</p>
 *
 * <pre>
 * StringArray {
 *     kind = "StringArray"
 *     dataEncoding: Encoding[]
 *     stringData: string
 *     offsetEncoding: Encoding[]
 *     offsets: Uint8Array
 * }
 * Example
 * ['a','AB','a']
 * ---StringArray---&gt;
 * { stringData = 'aAB', offsets = [0, 1, 3] } [0, 1, 0]
 * </pre>
 */
public class StringArrayEncoding implements Encoding<StringArray, ByteArray> {
    private Deque<Encoding<?, ?>> dataEncoding;
    private String stringData;
    private Deque<Encoding<?, ?>> offsetEncoding;
    private byte[] offsets;

    public StringArrayEncoding() {

    }

    public StringArrayEncoding(String stringData, byte[] offsets, Deque<Encoding<?, ?>> outputEncoding, Deque<Encoding<?, ?>> offsetEncoding) {
        this.dataEncoding = outputEncoding;
        this.stringData = stringData;
        this.offsetEncoding = offsetEncoding;
        this.offsets = offsets;
    }

    @Override
    public Map<String, Object> getMapRepresentation() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("kind", "StringArray");
        map.put("dataEncoding", toArray(dataEncoding));
        map.put("stringData", stringData);
        map.put("offsetEncoding", toArray(offsetEncoding));
        map.put("offsets", offsets);
        return map;
    }

    private Map<?, ?>[] toArray(Deque<Encoding<?, ?>> deque) {
        return deque.stream()
                .map(Encoding::getMapRepresentation)
                .toArray(Map[]::new);
    }

    @Override
    public StringArray decode(ByteArray data) {
        int[] offsets = (int[]) new ByteArray(this.offsets, offsetEncoding)
                .decode()
                .getData();
        data.setEncoding(dataEncoding);
        int[] indices = (int[]) data.decode().getData();

        String[] strings = new String[offsets.length];
        strings[0] = "";
        for (int i = 1; i < offsets.length; i++) {
            strings[i] = stringData.substring(offsets[i - 1], offsets[i]);
        }

        int offset = 0;
        String[] result = new String[indices.length];
        for (int index : indices) {
            result[offset++] = strings[index + 1];
        }

        return new StringArray(result, data.getEncoding());
    }

    @Override
    public ByteArray encode(StringArray data) {
        String[] input = data.getData();

        Map<String, Integer> map = new HashMap<>();
        List<String> strings = new ArrayList<>();
        int[] outputArray = new int[input.length];
        int[] offsetArray = new int[16];
        int offsetCount = 1;

        int accLength = 0;
        int i = 0;
        String last = null;
        int lastIndex = 0;
        for (String s : input) {
            // handle null strings
            if (s == null) {
                outputArray[i++] = -1;
                continue;
            }
            // runs of the same instance (e.g. per residue or chain) need no lookup
            if (s == last) {
                outputArray[i++] = lastIndex;
                continue;
            }

            Integer known = map.putIfAbsent(s, strings.size());
            last = s;
            if (known != null) {
                lastIndex = known;
                outputArray[i++] = known;
            } else {
                // increment the length
                accLength += s.length();

                // store the string and index
                int index = strings.size();
                strings.add(s);

                // store offset
                if (offsetCount == offsetArray.length) {
                    offsetArray = Arrays.copyOf(offsetArray, 2 * offsetCount);
                }
                offsetArray[offsetCount++] = accLength;
                lastIndex = index;
                outputArray[i++] = index;
            }
        }
        offsetArray = Arrays.copyOf(offsetArray, offsetCount);

        Int32Array offsetPlain = new Int32Array(offsetArray);
        EncodingStrategyHint offsetHint = Classifier.classify(offsetPlain);
        ByteArray offsets = Classifier.encode(offsetPlain, offsetHint.getEncoding());

        Int32Array outputPlain = new Int32Array(outputArray);
        EncodingStrategyHint outputHint = Classifier.classify(outputPlain);
        ByteArray output = Classifier.encode(outputPlain, outputHint.getEncoding());

        Deque<Encoding<?, ?>> enc = new ArrayDeque<>(data.getEncoding());
        this.offsets = offsets.getData();
        this.offsetEncoding = offsets.getEncoding();
        this.stringData = String.join("", strings);
        this.dataEncoding = output.getEncoding();
        enc.add(this);

        return new ByteArray(output.getData(), enc);
    }

    @Override
    public String toString() {
        return "StringArrayEncoding{" +
                "dataEncoding=" + dataEncoding +
                ", stringData='" + stringData + '\'' +
                ", offsetEncoding=" + offsetEncoding +
                ", offsets=" + Arrays.toString(offsets) +
                '}';
    }
}
