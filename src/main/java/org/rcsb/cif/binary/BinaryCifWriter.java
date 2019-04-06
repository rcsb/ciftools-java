package org.rcsb.cif.binary;

import com.sun.tools.javac.jvm.Code;
import org.rcsb.cif.CifWriter;
import org.rcsb.cif.binary.array.Float64Array;
import org.rcsb.cif.binary.array.FloatArray;
import org.rcsb.cif.binary.array.Int32Array;
import org.rcsb.cif.binary.array.IntArray;
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
                category.put("columns", fields);

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
            fieldMap.put("type", "Str");
            fieldMap.put("value", cifField.strings().collect(Collectors.toList()));
            fieldMap.put("valueKind", cifField.valueKinds().mapToInt(Enum::ordinal).toArray());
            return encode(fieldMap, cifField,null);
        } else if (type == DataType.Float) {
            double[] values = cifField.floats().toArray();
            fieldMap.put("type", "Float");
            fieldMap.put("value", values);
            fieldMap.put("valueKind", cifField.valueKinds().mapToInt(Enum::ordinal).toArray());
            fieldMap.put("typedArray", "Float64Array");
            CodecData<FloatArray> encoder = Codec.classifyArray(new Float64Array(values));
            return encode(fieldMap, cifField, encoder);
        } else {
            int[] values = cifField.ints().toArray();
            fieldMap.put("type", "Int");
            fieldMap.put("value", values);
            fieldMap.put("valueKind", cifField.valueKinds().mapToInt(Enum::ordinal).toArray());
            fieldMap.put("typedArray", "Int32Array");
            CodecData<IntArray> encoder = Codec.classifyArray(new Int32Array(values));
            return encode(fieldMap, cifField, encoder);
        }
    }

    private Map<String, Object> encode(Map<String, Object> fieldMap, CifField cifField, CodecData<?> encoder) {
        Map<String, Object> fieldData = getFieldData(fieldMap, cifField);

        // default encoding
        // TODO support for auto encoding etc
        if (encoder == null) {
            // TODO need byte array codec explicitly?
            if (cifField.getDataType() == DataType.Str) {
                CodecData<?> codec = CodecData.of((String[]) fieldData.get("array"))
                        .startEncoding(StringArrayCodec.KIND)
                        .build();
                Codec.encodeMap();
            } else {
                CodecData<Object> codec = CodecData.of(fieldData.get("array"))
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
                Codec.encodeMap();
            }
        } else {
            Codec.encodeMap();
        }

        return null;
    }

    private Map<String, Object> getFieldData(Map<String, Object> fieldMap, CifField cifField) {
        Map<String, Object> data = new LinkedHashMap<>();

        int length = cifField.getRowCount();
        String type = (String) fieldMap.get("type");
        // TODO save them resources
        String[] stringArray = new String[length];
        Float64Array floatArray = new Float64Array(new double[length]);
        Int32Array intArray = new Int32Array(new int[length]);
        byte[] mask = new byte[length];
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
        data.put("mask", mask);

        return data;
    }
}
