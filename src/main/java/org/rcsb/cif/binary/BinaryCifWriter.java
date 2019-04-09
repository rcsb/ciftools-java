package org.rcsb.cif.binary;

import org.rcsb.cif.CifWriter;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;
import org.rcsb.cif.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BinaryCifWriter implements CifWriter {
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
                    fields[fieldCount++] = classifyField(cifCategory.getField(fieldName));
                }

                categories[categoryCount++] = category;
            }
        }

        byte[] ret = Codec.MESSAGE_PACK_CODEC.encode(file);
        return new ByteArrayInputStream(ret);
    }

    private Map<String, Object> classifyField(CifField cifField) {
        DataType type = cifField.getDataType();

        // TODO support for auto encoding etc
        if (type == DataType.Str) {
            ByteArray byteArray = EncodedDataFactory.stringArray(cifField.strings().toArray(String[]::new))
                    .encode(new StringArrayEncoding());
            return encodeField(cifField, "Str", byteArray);
        } else if (type == DataType.Float) {
            ByteArray byteArray = EncodedDataFactory.float64Array(cifField.floats().toArray())
                    .classify();
            return encodeField(cifField, "Float", byteArray);
        } else {
            ByteArray byteArray = EncodedDataFactory.int32Array(cifField.ints().toArray())
                    .classify();
            return encodeField(cifField, "Int", byteArray);
        }
    }

    private Map<String, Object> encodeField(CifField cifField, String type, ByteArray byteArray) {
        FieldData fieldData = getFieldData(cifField, type);
        Uint8Array mask = fieldData.mask;

        // default encoding
        Map<String, Object> encodedMap = new LinkedHashMap<>();
        encodedMap.put("encoding", byteArray.getEncoding().stream().map(this::wrap).toArray(Object[]::new));
        encodedMap.put("data", byteArray.getData());

        // encode mask
        Map<String, Object> maskData = new LinkedHashMap<>();
        if (!fieldData.allPresent) {
            ByteArray maskRLE = mask.encode(new RunLengthEncoding()).encode(new ByteArrayEncoding());

            if (maskRLE.getData().length < mask.getData().length) {
                maskData.put("data", maskRLE.getData());

                RunLengthEncoding rle = (RunLengthEncoding) maskRLE.getEncoding().get(0);

                Map<String, Object> encoding1 = new LinkedHashMap<>();
                encoding1.put("kind", "RunLength");
                encoding1.put("srcType", rle.getSrcType());
                encoding1.put("srcSize", rle.getSrcSize());

                Map<String, Object> encoding2 = new LinkedHashMap<>();
                encoding2.put("kind", "ByteArray");
                encoding2.put("type", 3);

                maskData.put("encoding", new Object[] { encoding1, encoding2 });
            } else {
                ByteArray encodedMask = mask.encode(new ByteArrayEncoding(4));
                maskData.put("data", encodedMask.getData());
                Map<String, Object> encoding = new LinkedHashMap<>();
                encoding.put("kind", "ByteArray");
                encoding.put("type", 4);
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

    private Map<String, Object> wrap(Object object) {
        try {
            Map<String, Object> out = new LinkedHashMap<>();
            for (Field field : object.getClass().getDeclaredFields()) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object content = field.get(object);
                if (content instanceof Map) {
                    content = wrap(content);
                } else if (content instanceof List) {
                    content = ((List<?>) content).stream().map(this::wrap).toArray(Object[]::new);
                } else if (isObjectArray(content)) {
                    content = Stream.of((Object[]) content).map(this::wrap).toArray(Object[]::new);
                }
                out.put(field.getName(), content);
            }
            return out;
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not convert Encoding to Map representation", e);
        }
    }

    private boolean isObjectArray(Object content) {
        return content.getClass().isArray() && !(content instanceof int[] || content instanceof double[] || content instanceof byte[]);
    }

    private FieldData getFieldData(CifField cifField, String type) {
        int length = cifField.getRowCount();
        // TODO save them resources
        String[] stringArray = new String[length];
        Float64Array floatArray = EncodedDataFactory.float64Array(new double[length]);
        Int32Array intArray = EncodedDataFactory.int32Array(new int[length]);
        int[] mask = new int[length];
        Uint8Array maskArray = EncodedDataFactory.uint8Array(mask);
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

        return new FieldData("Str".equals(type) ? stringArray : "Float".equals(type) ? floatArray : intArray,
                allPresent,
                maskArray);
    }

    class FieldData {
        final Object data;
        final boolean allPresent;
        final Uint8Array mask;

        FieldData(Object data, boolean allPresent, Uint8Array mask) {
            this.data = data;
            this.allPresent = allPresent;
            this.mask = mask;
        }
    }
}
