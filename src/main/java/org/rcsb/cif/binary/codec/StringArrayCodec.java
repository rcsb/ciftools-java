package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.ArrayFactory;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;
import org.rcsb.cif.binary.data.Uint8Array;

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

    public static CodecData<byte[]> encode(CodecData<String[]> codecData) {
        return STRING_ARRAY_CODEC.encodeInternally(codecData);
    }

    @Override
    protected CodecData<byte[]> encodeInternally(CodecData<String[]> data) {
        String[] inputArray = data.getData();

        Map<String, Integer> map = new HashMap<>();
        List<String> strings = new ArrayList<>();
        int[] outputArray = new int[inputArray.length];
        List<Integer> offsets = new ArrayList<>();
        offsets.add(0);

        int accLength = 0;
        int i = 0;
        for (String s : inputArray) {
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
                offsets.add(accLength);
                outputArray[i++] = index;
            }
        }

        int[] offsetArray = offsets.stream().mapToInt(n -> n).toArray();
        Int32Array offsetData = ArrayFactory.int32Array(offsetArray);
        Int32Array output = ArrayFactory.int32Array(outputArray);

        CodecData<IntArray> offsetEncoding = classifyArray(offsetData);
        CodecData<byte[]> encodedOffsets = Codec.encodeMap(offsetEncoding);
        CodecData<IntArray> dataEncoding = classifyArray(output);
        CodecData<byte[]> encodedData = Codec.encodeMap(dataEncoding);

        return CodecData.of(encodedData.getData())
                .startEncoding(StringArrayCodec.KIND)
                .addParameter("dataEncoding", encodedData.getEncoding())
                .addParameter("stringData", String.join("", strings))
                .addParameter("offsetEncoding",encodedOffsets.getEncoding())
                .addParameter("offsets", encodedOffsets.getData())
                .build();
    }

    @Override
    protected String[] decodeInternally(CodecData<byte[]> data) {
        ensureParametersPresent(data, "stringData", "offsets", "dataEncoding");

        Map<String, Object> parameters = data.getParameters();
        String stringData = (String) parameters.get("stringData");

        int[] offsets;
        if (parameters.containsKey("offsetEncoding")) {
            Map<String, Object> offsetTask = new LinkedHashMap<>();
            offsetTask.put("data", parameters.get("offsets"));
            offsetTask.put("encoding", parameters.get("offsetEncoding"));
            offsets = ((IntArray) Codec.decodeMap(offsetTask)).getData();
        } else {
            offsets = ((IntArray) ByteArrayCodec.decode(CodecData.of((byte[]) parameters.get("offsets"))
                    .startEncoding(KIND)
                    .addParameter("type", Uint8Array.TYPE)
                    .build())
                    .getData()).getData();
        }

        Map<String, Object> dataTask = new LinkedHashMap<>();
        dataTask.put("data", data.getData());
        dataTask.put("encoding", parameters.get("dataEncoding"));
        int[] indices = ((IntArray) Codec.decodeMap(dataTask)).getData();

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
