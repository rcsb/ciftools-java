package org.rcsb.cif.binary.old.codec.encoding;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecData;
import org.rcsb.cif.binary.old.codec.classify.Classifier;
import org.rcsb.cif.binary.old.codec.primitive.ArrayType;
import org.rcsb.cif.binary.old.codec.primitive.ByteParameters;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StringArrayCodec implements Codec<String[], byte[], StringArrayParameters> {
    @Override
    public CodecData<byte[], StringArrayParameters> encode(String[] input) {
        Map<String, Integer> map = new HashMap<>();
        List<String> strings = new ArrayList<>();
        int[] output = new int[input.length];
        List<Integer> offsets = new ArrayList<>();

        int accLength = 0;
        int i = 0;
        for (String s : input) {
            // handle null strings
            if (s == null || s.isEmpty()) {
                output[i++] = -1;
                continue;
            }

            if (map.containsKey(s)) {
                int index = map.get(s);
                output[i++] = index;
            } else {
                // increment the length
                accLength += s.length();

                // store the string and index
                int index = strings.size();
                strings.add(s);
                map.put(s, index);

                // store offset
                offsets.add(accLength);
                output[i++] = index;
            }
        }

        int[] offsetArray = offsets.stream().mapToInt(n -> n).toArray();

        // TODO encode must return composite data type of encoded data and parameters
        Function<int[], int[]> offsetEncoding = Classifier.classifyArray(offsetArray);
        int[] encodedOffsets = offsetEncoding.apply(offsetArray);
        Function<int[], int[]> dataEncoding = Classifier.classifyArray(output);
        int[] encodedData = dataEncoding.apply(output);

//        return new CodecData<byte[], StringArrayParameters>(encodedData,
                // TODO fix
//                new StringArrayParameters(String.join("", strings),
//                        encodedOffsets,
//                        dataEncoding,
//                        offsetEncoding)
//                null
//        );
        return null;
    }

    @Override
    public String[] decode(CodecData<byte[], StringArrayParameters> input) {
        StringArrayParameters parameters = input.getParameters();
        Map<String, Object> offsetTask = new HashMap<>();
        offsetTask.put("data", parameters.getEncodedOffsets());
        offsetTask.put("encoding", parameters.getOffsetEncodings());
        Map<String, Object> dataTask = new HashMap<>();
        dataTask.put("data", input);
        dataTask.put("encoding", parameters.getDataEncodings());

        int[] offsets = parameters.getOffsetEncodings() != null ? (int[]) Codec.decode(offsetTask) :
                Codec.UINT_8.decode(new CodecData<>(parameters.getEncodedOffsets(),
                        new ByteParameters(ArrayType.UINT_8, ByteOrder.LITTLE_ENDIAN)));
        int[] indices = (int[]) Codec.decode(dataTask);

        String[] result = new String[indices.length];
        int offset = 0;
        for (int i : indices) {
            if (i < 0) {
                result[offset++] = null;
                continue;
            }
            result[offset++] = parameters.getEncodedStringData().substring(offsets[i], offsets[i + 1]);
        }
        return result;
    }
}
