package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.StringArray;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.*;

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
            if (s == null || s.isEmpty()) {
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

        ByteArray offsets = Classifier.classify(EncodedDataFactory.int32Array(offsetList.stream().mapToInt(n -> n).toArray()));
        ByteArray output = Classifier.classify(EncodedDataFactory.int32Array(outputArray));

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
        System.out.println("stringdata " + stringData);

        int[] offsets;
        if (encoding.getOffsetEncoding() != null && encoding.getOffsetEncoding().size() > 0) {
            offsets = (int[]) EncodedDataFactory.byteArray(encoding.getOffsets(), encoding.getOffsetEncoding())
                    .decode()
                    .getData();
        } else {
            offsets = (int[]) EncodedDataFactory.byteArray(encoding.getOffsets())
                    .decode(new ByteArrayEncoding(4))
                    .getData();
        }
        System.out.println("offsets " + Arrays.toString(offsets));

        data.setEncoding(encoding.getDataEncoding());
        int[] indices = (int[]) data.decode().getData();
        System.out.println("data " + Arrays.toString(indices));

        String[] result = new String[indices.length];
        int offset = 0;
        for (int i : indices) {
            if (i < 0) {
                result[offset++] = null;
                continue;
            }
            result[offset++] = stringData.substring(offsets[i], offsets[i + 1]);
        }

        return EncodedDataFactory.stringArray(result);
    }
}
