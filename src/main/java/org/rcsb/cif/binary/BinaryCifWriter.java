package org.rcsb.cif.binary;

import org.rcsb.cif.CifWriter;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;
import org.rcsb.cif.model.*;
import org.rcsb.cif.model.generated.CifBlock;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.*;
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
            Object[] categories = new Object[cifBlock.getCategoryNames().size()];
            int categoryCount = 0;
            block.put("categories", categories);
            blocks[blockCount++] = block;

            for (String categoryName : cifBlock.getCategoryNames()) {
                CifCategory cifCategory = cifBlock.getCategory(categoryName);
                Map<String, Object> category = new LinkedHashMap<>();
                category.put("name", "_" + cifCategory.getCategoryName());
                Object[] fields = new Object[cifCategory.getColumnNames().size()];
                int fieldCount = 0;
                category.put("columns", fields);
                category.put("rowCount", cifCategory.getColumn(cifCategory.getColumnNames().get(0)).getRowCount());

                for (String fieldName : cifCategory.getColumnNames()) {
                    fields[fieldCount++] = classifyColumn(cifCategory.getColumn(fieldName));
                }

                categories[categoryCount++] = category;
            }
        }

        byte[] ret = Codec.MESSAGE_PACK_CODEC.encode(file);
        return new ByteArrayInputStream(ret);
    }

    private Map<String, Object> classifyColumn(CifColumn cifColumn) {
        // TODO support for auto encoding etc
        if (cifColumn instanceof FloatColumn) {
            FloatColumn floatCol = (FloatColumn) cifColumn;
            ByteArray byteArray = EncodedDataFactory.float64Array(floatCol.values().toArray())
                    .classify();
            return encodeColumn(cifColumn, byteArray);
        } else if (cifColumn instanceof IntColumn) {
            IntColumn intCol = (IntColumn) cifColumn;
            ByteArray byteArray = EncodedDataFactory.int32Array(intCol.values().toArray())
                    .classify();
            return encodeColumn(cifColumn, byteArray);
        } else {
            StrColumn strCol = (StrColumn) cifColumn;
            ByteArray byteArray = EncodedDataFactory.stringArray(strCol.values().toArray(String[]::new))
                    .encode(new StringArrayEncoding());
            return encodeColumn(cifColumn, byteArray);
        }
        // no auto-encoding
//        } else if (type == DataType.Float) {
//            ByteArray byteArray = EncodedDataFactory.float64Array(cifColumn.floats().toArray())
//                    .encode(new ByteArrayEncoding());
//            return encodeColumn(cifColumn, "Float", byteArray);
//        } else {
//            ByteArray byteArray = EncodedDataFactory.int32Array(cifColumn.ints().toArray())
//                    .encode(new ByteArrayEncoding());
//            return encodeColumn(cifColumn, "Int", byteArray);
//        }
    }

    private Map<String, Object> encodeColumn(CifColumn cifField, ByteArray byteArray) {
        String name = cifField.getName();
        FieldData fieldData = getFieldData(cifField);
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
                RunLengthEncoding rle = (RunLengthEncoding) maskRLE.getEncoding().get(0);

                Map<String, Object> encoding1 = new LinkedHashMap<>();
                encoding1.put("kind", "RunLength");
                encoding1.put("srcType", rle.getSrcType());
                encoding1.put("srcSize", rle.getSrcSize());

                Map<String, Object> encoding2 = new LinkedHashMap<>();
                encoding2.put("kind", "ByteArray");
                encoding2.put("type", 3);

                maskData.put("encoding", new Object[] { encoding1, encoding2 });
                maskData.put("data", maskRLE.getData());
            } else {
                ByteArray encodedMask = mask.encode(new ByteArrayEncoding(4));
                Map<String, Object> encoding = new LinkedHashMap<>();
                encoding.put("kind", "ByteArray");
                encoding.put("type", 4);
                maskData.put("encoding", new Object[] { encoding });
                maskData.put("data", encodedMask.getData());
            }
        }

        // create map
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", name);
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

    private FieldData getFieldData(CifColumn cifField) {
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
                if (cifField instanceof StrColumn) {
                    stringArray[row] = "";
                }
                allPresent = false;
            } else {
                mask[row] = (byte) ValueKind.PRESENT.ordinal();
                if (cifField instanceof FloatColumn) {
                    floatArray.getData()[row] = ((FloatColumn) cifField).get(row);
                } else if (cifField instanceof IntColumn) {
                    intArray.getData()[row] = ((IntColumn) cifField).get(row);
                } else {
                    stringArray[row] = ((StrColumn) cifField).get(row);
                }
            }
        }

        return new FieldData(cifField instanceof StrColumn ? stringArray : cifField instanceof FloatColumn ? floatArray : intArray,
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
