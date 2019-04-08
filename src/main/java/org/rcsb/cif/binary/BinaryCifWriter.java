package org.rcsb.cif.binary;

import org.rcsb.cif.CifWriter;
import org.rcsb.cif.binary.array.*;
import org.rcsb.cif.binary.codec.*;
import org.rcsb.cif.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

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
                category.put("columns", fields);
                category.put("rowCount", cifCategory.getField(cifCategory.getFieldNames().get(0)).getRowCount());

                for (String fieldName : cifCategory.getFieldNames()) {
                    fields[fieldCount++] = classifyField(cifCategory.getField(fieldName), fieldName);
                }

                categories[categoryCount++] = category;
            }
        }

        byte[] ret = messagePackCodec.encode(file);

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
            CodecData<String[]> encoder = CodecData.of(data)
                    .startEncoding(StringArrayCodec.KIND)
                    .build();
            return encodeField(fieldMap, cifField, encoder);
        } else if (type == DataType.Float) {
            double[] values = cifField.floats().toArray();
            fieldMap.put("type", "Float");
            fieldMap.put("value", values);
            fieldMap.put("valueKind", cifField.valueKinds().mapToInt(Enum::ordinal).toArray());
            fieldMap.put("typedArray", "Float64Array");
            CodecData<FloatArray> encoder = Codec.classifyArray(ArrayFactory.float64Array(values));
            return encodeField(fieldMap, cifField, encoder);
        } else {
            int[] values = cifField.ints().toArray();
            fieldMap.put("type", "Int");
            fieldMap.put("value", values);
            fieldMap.put("valueKind", cifField.valueKinds().mapToInt(Enum::ordinal).toArray());
            fieldMap.put("typedArray", "Int32Array");
            CodecData<IntArray> encoder = Codec.classifyArray(ArrayFactory.int32Array(values));
            return encodeField(fieldMap, cifField, encoder);
        }
    }

    private Map<String, Object> encodeField(Map<String, Object> fieldMap, CifField cifField, CodecData<?> encoder) {
        Map<String, Object> fieldData = getFieldData(fieldMap, cifField);
        boolean allPresent = (boolean) fieldData.get("allPresent");
        Uint8Array mask = (Uint8Array) fieldData.get("mask");

        // default encoding
        // TODO support for auto encoding etc
        CodecData<byte[]> encoded = Codec.encodeMap(encoder);
        Map<String, Object> encodedMap = new LinkedHashMap<>();

        // TODO function to create maps from codec data
        encodedMap.put("encoding", encoded.getEncoding());
        encodedMap.put("data", encoded.getData());

        Map<String, Object> maskData = new LinkedHashMap<>();
        // encode mask
        if (!allPresent) {
            CodecData<byte[]> maskRLE = Codec.encodeMap(CodecData.of(mask)
                    .startEncoding(RunLengthCodec.KIND)
                    .startEncoding(ByteArrayCodec.KIND)
                    .build());

            if (maskRLE.getData().length < mask.getData().length) {
                maskData.put("data", maskRLE.getData());
                Map<String, Object> encoding1 = new LinkedHashMap<>();
                encoding1.put("kind", RunLengthCodec.KIND);
                Map<String, Object> e = (Map<String, Object>) maskRLE.getEncoding()[0];
                encoding1.put("srcType", e.get("srcType"));
                encoding1.put("srcSize", e.get("srcSize"));
                Map<String, Object> encoding2 = new LinkedHashMap<>();
                encoding2.put("kind", ByteArrayCodec.KIND);
                encoding2.put("type", Int32Array.TYPE);
                maskData.put("encoding", new Object[] { encoding1, encoding2 });
            } else {
                CodecData<byte[]> encodedMask = Codec.encodeMap(CodecData.of(mask)
                        .startEncoding(ByteArrayCodec.KIND)
                        .addParameter("type", Uint8Array.TYPE)
                        .build());
                maskData.put("data", encodedMask.getData());
                Map<String, Object> encoding = new LinkedHashMap<>();
                encoding.put("kind", ByteArrayCodec.KIND);
                encoding.put("type", Uint8Array.TYPE);
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
        Float64Array floatArray = ArrayFactory.float64Array(new double[length]);
        Int32Array intArray = ArrayFactory.int32Array(new int[length]);
        int[] mask = new int[length];
        Uint8Array maskArray = ArrayFactory.uint8Array(mask);
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
                    floatArray.getData()[row] = cifField.getFloat(row);
                } else {
                    intArray.getData()[row] = cifField.getInt(row);
                }
            }
        }

        data.put("data", "Str".equals(type) ? stringArray : "Float".equals(type) ? floatArray : intArray);
        data.put("allPresent", allPresent);
        data.put("mask", maskArray);

        return data;
    }
}
