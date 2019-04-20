package org.rcsb.cif.binary;

import org.rcsb.cif.CifWriter;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;
import org.rcsb.cif.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryCifWriter implements CifWriter {
    private static final Logger logger = LoggerFactory.getLogger(BinaryCifWriter.class);

    @Override
    public InputStream write(CifFile cifFile) {
        Map<String, Object> file = createMap(cifFile);

        byte[] ret = Codec.MESSAGE_PACK_CODEC.encode(file);
        return new ByteArrayInputStream(ret);
    }

    public Map<String, Object> createMap(CifFile cifFile) {
        // naming: uses cifEntity for original model and entity for the map representation ready for MessagePack
        Map<String, Object> file = new LinkedHashMap<>();
        file.put("encoder", Codec.CODEC_NAME);
        file.put("version", Codec.VERSION);
        Object[] blocks = new Object[cifFile.getBlocks().size()];
        int blockCount = 0;
        file.put("dataBlocks", blocks);

        for (Block cifBlock : cifFile.getBlocks()) {
            Map<String, Object> block = new LinkedHashMap<>();
            block.put("header", CifWriter.formatHeader(cifBlock.getBlockHeader()));
            Object[] categories = new Object[cifBlock.getCategoryNames().size()];
            int categoryCount = 0;
            block.put("categories", categories);
            blocks[blockCount++] = block;

            for (String categoryName : cifBlock.getCategoryNames()) {
                Category cifCategory = cifBlock.getCategory(categoryName);
                if (cifCategory.getRowCount() == 0) {
                    continue;
                }

                Map<String, Object> category = new LinkedHashMap<>();
                category.put("name", "_" + cifCategory.getCategoryName());
                Object[] fields = new Object[cifCategory.getColumnNames().size()];
                int fieldCount = 0;
                category.put("columns", fields);
                category.put("rowCount", cifCategory.getRowCount());

                for (String fieldName : cifCategory.getColumnNames()) {
                    logger.debug("encoding column: {}.{}", categoryName, fieldName);
                    fields[fieldCount++] = classifyColumn(cifCategory.getColumn(fieldName));
                }

                if (fieldCount > 0) {
                    categories[categoryCount++] = category;
                }
            }
        }

        return file;
    }

    private Map<String, Object> classifyColumn(Column cifColumn) {
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
    }

    private Map<String, Object> encodeColumn(Column cifField, ByteArray byteArray) {
        String name = cifField.getColumnName();
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

        logger.debug("encoding chain: {}", byteArray.getEncoding()
                .stream()
                .map(Encoding::getKind)
                .collect(Collectors.joining(" -> ")));

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

    private FieldData getFieldData(Column cifField) {
        int length = cifField.getRowCount();

        String[] stringArray = null;
        Float64Array floatArray = null;
        Int32Array intArray = null;
        if (cifField instanceof FloatColumn) {
            floatArray = EncodedDataFactory.float64Array(new double[length]);
        } else if (cifField instanceof IntColumn) {
            intArray = EncodedDataFactory.int32Array(new int[length]);
        } else {
            stringArray = new String[length];
        }

        int[] mask = new int[length];
        Uint8Array maskArray = EncodedDataFactory.uint8Array(mask);
        boolean allPresent = true;

        for (int row = 0; row < length; row++) {
            ValueKind kind = cifField.getValueKind(row);

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

        return new FieldData(cifField instanceof StrColumn ? stringArray : cifField instanceof FloatColumn ?
                floatArray : intArray, allPresent, maskArray);
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
