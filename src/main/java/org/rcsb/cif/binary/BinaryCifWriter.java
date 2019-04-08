package org.rcsb.cif.binary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.rcsb.cif.CifWriter;
import org.rcsb.cif.binary.array.*;
import org.rcsb.cif.binary.codec.*;
import org.rcsb.cif.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.rcsb.cif.binary.codec.MessagePackCodec.MESSAGE_PACK_CODEC;

public class BinaryCifWriter implements CifWriter {
    private final MessagePackCodec messagePackCodec;

    public BinaryCifWriter() {
        this.messagePackCodec = MESSAGE_PACK_CODEC;
    }

    @Override
    public InputStream write(CifFile cifFile) {
        // naming: uses cifEntity for original model and entity for the map representation ready for MessagePack
        Map<String, Object> file = new LinkedHashMap<>();
        file.put("encoder", Codec.CODEC_NAME);
        file.put("version", Codec.VERSION);
        Object[] blocks = new Object[cifFile.getBlocks().size()];
        int blockCount = 0;
        file.put("dataBlocks", blocks);

        for (CifBlock cifBlock : cifFile.getBlocks()) {
            Map<String, Object> block = new LinkedHashMap<>();
            block.put("header", CifWriter.formatHeader(cifBlock.getHeader()));
            Object[] categories = new Object[cifBlock.getCategories().size()];
            int categoryCount = 0;
            block.put("categories", categories);
            blocks[blockCount++] = block;

            for (CifCategory cifCategory : cifBlock.getCategories().values()) {
                Map<String, Object> category = new LinkedHashMap<>();
                category.put("name", "_" + cifCategory.getName());
                Object[] fields = new Object[cifCategory.getFieldNames().size()];
                int fieldCount = 0;
                category.put("rowCount", cifCategory.getField(cifCategory.getFieldNames().get(0)).getRowCount());
                // FIXME rowCount before columns omits missing row count at some occasion
                category.put("columns", fields);

                for (String fieldName : cifCategory.getFieldNames()) {
                    fields[fieldCount++] = classifyField(cifCategory.getField(fieldName), fieldName);
                }

                categories[categoryCount++] = category;
            }
        }

        byte[] ret = messagePackCodec.encode(file);

//        for (Object block : (Object[]) file.get("dataBlocks")) {
//            for (Object category : (Object[]) ((Map<String, Object>) block).get("categories")) {
//                if (((Map<String, Object>) category).get("name").equals("_pdbx_poly_seq_scheme")) {
//                    System.out.println(category);
//                }
//            }
//        }

        return new ByteArrayInputStream(ret);
    }

    private Map<String, Object> classifyField(CifField cifField, String name) {
        DataType type = cifField.getDataType();
        Map<String, Object> fieldMap = new LinkedHashMap<>();
        fieldMap.put("name", name);

        if (type == DataType.Str) {
            String[] data = cifField.strings().toArray(String[]::new);
            fieldMap.put("type", "Str");
            fieldMap.put("value", data);
            fieldMap.put("valueKind", cifField.valueKinds().mapToInt(Enum::ordinal).toArray());
//            CodecData<String[]> encoder = CodecData.of(data)
//                    .startEncoding(StringArrayCodec.KIND)
//                    .build();
            return encodeField(fieldMap, cifField, null);
        } else if (type == DataType.Float) {
            double[] values = cifField.floats().toArray();
            fieldMap.put("type", "Float");
            fieldMap.put("value", values);
            fieldMap.put("valueKind", cifField.valueKinds().mapToInt(Enum::ordinal).toArray());
            fieldMap.put("typedArray", "Float64Array");
            CodecData<FloatArray> encoder = Codec.classifyArray(new Float64Array(values));
            return encodeField(fieldMap, cifField, encoder);
        } else {
            int[] values = cifField.ints().toArray();
            fieldMap.put("type", "Int");
            fieldMap.put("value", values);
            fieldMap.put("valueKind", cifField.valueKinds().mapToInt(Enum::ordinal).toArray());
            fieldMap.put("typedArray", "Int32Array");
            CodecData<IntArray> encoder = Codec.classifyArray(new Int32Array(values));
            return encodeField(fieldMap, cifField, encoder);
        }
    }

    private Map<String, Object> encodeField(Map<String, Object> fieldMap, CifField cifField, CodecData<?> encoder) {
        Map<String, Object> fieldData = getFieldData(fieldMap, cifField);
        boolean allPresent = (boolean) fieldData.get("allPresent");
        Uint8Array mask = (Uint8Array) fieldData.get("mask");

        // default encoding
        // TODO support for auto encoding etc
        CodecData<byte[]> encoded;
        Map<String, Object> encodedMap = new LinkedHashMap<>();
        if (encoder == null) {
            // TODO need byte array codec explicitly?
            if (cifField.getDataType() == DataType.Str) {
                CodecData<String[]> codec = CodecData.of((String[]) fieldData.get("array"))
                        .startEncoding(StringArrayCodec.KIND)
                        .build();
                encoded = Codec.encodeMap(codec);
                System.out.print("str: ");
            } else {
                System.out.println("the never-happen case");
                CodecData<Object> codec = CodecData.of(fieldData.get("array"))
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
                encoded = Codec.encodeMap(codec);
            }
        } else {
            encoded = Codec.encodeMap(encoder);
            System.out.print("number: ");
        }

        // TODO function to create maps from codec data
        encodedMap.put("encoding", encoded.getEncoding());
        encodedMap.put("data", encoded.getData());
        System.out.println(encodedMap);

        Map<String, Object> maskData = new LinkedHashMap<>();
        // encode mask
        if (!allPresent) {
            CodecData<byte[]> maskRLE = Codec.encodeMap(CodecData.of(mask)
                    .startEncoding(RunLengthCodec.KIND)
                    .startEncoding(ByteArrayCodec.KIND)
                    .build());

            if (maskRLE.getData().length < mask.getArray().length) {
//                maskData = maskRLE;
                maskData.put("data", maskRLE.getData());
                Map<String, Object> encoding1 = new LinkedHashMap<>();
                encoding1.put("type", RunLengthCodec.KIND);
                Map<String, Object> encoding2 = new LinkedHashMap<>();
                encoding2.put("type", ByteArrayCodec.KIND);
                maskData.put("encoding", new Object[] { encoding1, encoding2 });
            } else {
                CodecData<byte[]> encodedMask = Codec.encodeMap(CodecData.of(mask)
                        .startEncoding(ByteArrayCodec.KIND)
                        .addParameter("type", Uint8Array.TYPE)
                        .build());
                maskData.put("data", encodedMask.getData());
                Map<String, Object> encoding = new LinkedHashMap<>();
                encoding.put("type", ByteArrayCodec.KIND);
                maskData.put("encoding", new Object[] { encoding });
            }
        }

        // create Map
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", cifField.getName());
        map.put("data", encodedMap);
        map.put("mask", maskData);

        return map;
    }

    private Map<String, Object> getFieldData(Map<String, Object> fieldMap, CifField cifField) {
        Map<String, Object> data = new LinkedHashMap<>();

        int length = cifField.getRowCount();
        String type = (String) fieldMap.get("type");
        // TODO save them resources
        String[] stringArray = new String[length];
        Float64Array floatArray = new Float64Array(new double[length]);
        Int32Array intArray = new Int32Array(new int[length]);
        int[] mask = new int[length];
        Uint8Array maskArray = new Uint8Array(mask);
        boolean allPresent = true;

        for (int row = 0; row < length; row++) {
            ValueKind kind;
            try {
                kind = cifField.getValueKind(row);
            } catch (ArrayIndexOutOfBoundsException e) {
                kind = ValueKind.PRESENT;
            }

            if (kind != ValueKind.PRESENT) {
                mask[row] = (byte) kind.ordinal();
                if ("Str".equals(type)) {
                    stringArray[row] = "";
                }
                allPresent = false;
            } else {
                mask[row] = (byte) ValueKind.PRESENT.ordinal();
                if ("Str".equals(type)) {
                    stringArray[row] = cifField.getString(row);
                } else if ("Float".equals(type)) {
                    floatArray.getArray()[row] = cifField.getFloat(row);
                } else {
                    intArray.getArray()[row] = cifField.getInt(row);
                }
            }
        }

        data.put("array", "Str".equals(type) ? stringArray : "Float".equals(type) ? floatArray : intArray);
        data.put("allPresent", allPresent);
        data.put("mask", maskArray);

        return data;
    }
}
