package org.rcsb.cif.binary.codec;

import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.StringArray;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.*;

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
public class StringArrayCodec {
    public ByteArray encode(StringArray data, StringArrayEncoding encoding) {
        String[] input = data.getData();

        Map<String, Integer> map = new HashMap<>();
        List<String> strings = new ArrayList<>();
        int[] outputArray = new int[input.length];
        List<Integer> offsetList = new ArrayList<>();
        offsetList.add(0);

        int accLength = 0;
        int i = 0;
        for (String s : input) {
            // handle null strings
            if (s == null) {
                outputArray[i++] = -1;
                continue;
            }

            if (map.containsKey(s)) {
                int index = map.get(s);
                outputArray[i++] = index;
            } else {
                // increment the length
                accLength += s.length();

                // store the string and index
                int index = strings.size();
                strings.add(s);
                map.put(s, index);

                // store offset
                offsetList.add(accLength);
                outputArray[i++] = index;
            }
        }

        Int32Array offsetPlain = EncodedDataFactory.int32Array(offsetList.stream().mapToInt(n -> n).toArray());
        EncodingStrategyHint offsetHint = Classifier.classify(offsetPlain);
        ByteArray offsets = Classifier.encode(offsetPlain, offsetHint.getEncoding());

        Int32Array outputPlain = EncodedDataFactory.int32Array(outputArray);
        EncodingStrategyHint outputHint = Classifier.classify(outputPlain);
        ByteArray output = Classifier.encode(outputPlain, outputHint.getEncoding());

        LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
        encoding.setOffsets(offsets.getData());
        encoding.setOffsetEncoding(offsets.getEncoding());
        encoding.setStringData(String.join("", strings));
        encoding.setDataEncoding(output.getEncoding());
        enc.add(encoding);

        return EncodedDataFactory.byteArray(output.getData(), enc);
    }

    public StringArray decode(ByteArray data, StringArrayEncoding encoding) {
        String stringData = encoding.getStringData();
        int[] offsets = (int[]) EncodedDataFactory.byteArray(encoding.getOffsets(), encoding.getOffsetEncoding())
                    .decode()
                    .getData();
        data.setEncoding(encoding.getDataEncoding());
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

        return EncodedDataFactory.stringArray(result, data.getEncoding());
    }
}
