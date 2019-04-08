package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.Int32Array;
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

    public static CodecData<byte[]> encode(CodecData<String[]> codecData) {
        return STRING_ARRAY_CODEC.encodeInternally(codecData);
    }

    @Override
    protected CodecData<byte[]> encodeInternally(CodecData<String[]> data) {
//        System.out.println("@encoding");
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
        Int32Array offsetData = new Int32Array(offsetArray);
        Int32Array output = new Int32Array(outputArray);

        CodecData<IntArray> offsetEncoding = classifyArray(offsetData);
        CodecData<byte[]> encodedOffsets = Codec.encodeMap(offsetEncoding);
//        System.out.println("offsets: " + Arrays.toString(offsetData.getArray()));
//        System.out.println("encoded: " + Arrays.toString(encodedOffsets.getData()));
        CodecData<IntArray> dataEncoding = classifyArray(output);
        CodecData<byte[]> encodedData = Codec.encodeMap(dataEncoding);
//        System.out.println("data: " + Arrays.toString(output.getArray()));
//        System.out.println("encoded: " + Arrays.toString(encodedData.getData()));

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
//        System.out.println("@decoding");
        ensureParametersPresent(data, "stringData", "offsets", "dataEncoding");

        Map<String, Object> parameters = data.getParameters();
        String stringData = (String) parameters.get("stringData");

        int[] offsets;
        if (parameters.containsKey("offsetEncoding")) {
            Map<String, Object> offsetTask = new LinkedHashMap<>();
            offsetTask.put("data", parameters.get("offsets"));
            offsetTask.put("encoding", parameters.get("offsetEncoding"));
            offsets = ((IntArray) Codec.decodeMap(offsetTask)).getArray();
//            System.out.println("offsets: " + Arrays.toString(offsets));
//            System.out.println("encoded: " + Arrays.toString((byte[]) parameters.get("offsets")));
        } else {
            offsets = ((IntArray) ByteArrayCodec.decode(CodecData.of((byte[]) parameters.get("offsets"))
                    .startEncoding(KIND)
                    .addParameter("type", Uint8Array.TYPE)
                    .build())
                    .getArray()).getArray();
        }

        Map<String, Object> dataTask = new LinkedHashMap<>();
        dataTask.put("data", data.getData());
        dataTask.put("encoding", parameters.get("dataEncoding"));
        int[] indices = ((IntArray) Codec.decodeMap(dataTask)).getArray();

//        System.out.println("data: " + Arrays.toString(indices));
//        System.out.println("encoded: " + Arrays.toString(data.getData()));

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
