package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.IntArray;
import org.rcsb.cif.binary.array.Uint8Array;

import java.util.*;

public class StringArrayCodec extends Codec<String[], byte[]> {
    public static final String KIND = "StringArray";
    public static final StringArrayCodec STRING_ARRAY_CODEC = new StringArrayCodec();

    private StringArrayCodec() {
        super(KIND);
    }

    public static String[] decode(CodecData<byte[]> codecData) {
        return STRING_ARRAY_CODEC.decodeInternally(codecData);
    }

    @Override
    protected CodecData<byte[]> encodeInternally(CodecData<String[]> data) {
        String[] inputArray = data.getData();

        Map<String, Integer> map = new HashMap<>();
        List<String> strings = new ArrayList<>();
        int[] output = new int[inputArray.length];
        List<Integer> offsets = new ArrayList<>();

        int accLength = 0;
        int i = 0;
        for (String s : inputArray) {
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

        // TODO classify, encode, return
        return null;
    }

    @Override
    protected String[] decodeInternally(CodecData<byte[]> data) {
        Map<String, Object> parameters = data.getParameters();
        String stringData = (String) parameters.get("stringData");

        int[] offsets;
        if (parameters.containsKey("offsetEncodings")) {
            Map<String, Object> offsetTask = new LinkedHashMap<>();
            offsetTask.put("data", parameters.get("offsets"));
            offsetTask.put("encoding", parameters.get("offsetEncoding"));
            offsets = (int[]) Codec.decode(offsetTask);
        } else {
            offsets = (int[]) ByteArrayCodec.decode(CodecData.of((byte[]) parameters.get("offsets"))
                    .addParameter("type", Uint8Array.TYPE)
                    .create(ByteArrayCodec.KIND))
                    .getArray();
        }

        Map<String, Object> dataTask = new LinkedHashMap<>();
        dataTask.put("data", data.getData());
        dataTask.put("encoding", parameters.get("dataEncoding"));

        int[] indices = ((IntArray) Codec.decode(dataTask)).getArray();

        String[] result = new String[indices.length];
        int offset = 0;
        for (int i : indices) {
            if (i < 0) {
                result[offset++] = null;
                continue;
            }
            result[offset++] = stringData.substring(offsets[i], offsets[i + 1]);
        }
        return result;
    }
}
