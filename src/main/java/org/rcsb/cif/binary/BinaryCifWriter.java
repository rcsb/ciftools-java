package org.rcsb.cif.binary;

import org.rcsb.cif.BinaryCifWriterOptions;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.Uint8Array;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;
import org.rcsb.cif.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryCifWriter {
    private final BinaryCifWriterOptions options;

    public BinaryCifWriter(BinaryCifWriterOptions options) {
        this.options = options;
    }

    public InputStream write(CifFile cifFile) {
        Map<String, Object> file = encodeFile(cifFile);

        byte[] bytes = Codec.MESSAGE_PACK_CODEC.encode(file);
        return new ByteArrayInputStream(bytes);
    }

    public Map<String, Object> encodeFile(CifFile cifFile) {
        // naming: uses cifEntity for original model and entity for the map representation ready for MessagePack
        Map<String, Object> file = new LinkedHashMap<>();
        file.put("encoder", options.getEncoder());
        file.put("version", Codec.VERSION);
        Object[] blocks = new Object[cifFile.getBlocks().size()];
        int blockCount = 0;
        file.put("dataBlocks", blocks);

        for (Block cifBlock : cifFile.getBlocks()) {
            Map<String, Object> block = new LinkedHashMap<>();
            String blockHeader = cifBlock.getBlockHeader();
            String header = blockHeader != null ? blockHeader.replaceAll("[ \n\t]", "").toUpperCase() : "UNKNOWN";
            block.put("header", header);
            Object[] categories = new Object[cifBlock.getCategoryNames().size()];
            int categoryCount = 0;
            block.put("categories", categories);
            blocks[blockCount++] = block;

            for (String categoryName : cifBlock.getCategoryNames()) {
                Category cifCategory = cifBlock.getCategory(categoryName);
                int rowCount = cifCategory.getRowCount();
                if (rowCount == 0) {
                    continue;
                }

                Map<String, Object> category = new LinkedHashMap<>();
                category.put("name", "_" + cifCategory.getCategoryName());

                // single row
                if (options.isSingleRowMessagePack() && rowCount == 1) {
                    category.put("columns", encodeSingleRowCategory(cifCategory));
                } else {
                    Object[] fields = new Object[cifCategory.getColumnNames().size()];
                    int fieldCount = 0;
                    category.put("columns", fields);
                    for (String fieldName : cifCategory.getColumnNames()) {
                        fields[fieldCount++] = encodeColumn(cifCategory.getColumn(fieldName));
                    }
                }
                category.put("rowCount", rowCount);
                categories[categoryCount++] = category;
            }
        }

        return file;
    }

    private byte[] encodeSingleRowCategory(Category category) {
        Map<String, Object> map = category.getColumnNames()
                .stream()
                .map(category::getColumn)
                .collect(Collectors.toMap(Column::getColumnName,
                        this::extractStringData,
                        (u, v) -> {
                            throw new IllegalStateException("Duplicate key " + u);
                        },
                        LinkedHashMap::new));
        return Codec.MESSAGE_PACK_CODEC.encode(map);
    }

    private String extractStringData(Column column) {
        ValueKind valueKind = column.getValueKind(0);
        if (valueKind == ValueKind.NOT_PRESENT) {
            return ".";
        } else if (valueKind == ValueKind.UNKNOWN) {
            return "?";
        } else {
            return column.getStringData(0);
        }
    }

    private Map<String, Object> encodeColumn(Column cifColumn) {
        if (cifColumn instanceof FloatColumn) {
            FloatColumn floatCol = (FloatColumn) cifColumn;
            double[] array = floatCol.getBinaryData() != null ? floatCol.getBinaryData() : floatCol.values().toArray();
            ByteArray byteArray = EncodedDataFactory.float64Array(array).classify();
            return encodeColumn(cifColumn, byteArray);
        } else if (cifColumn instanceof IntColumn) {
            IntColumn intCol = (IntColumn) cifColumn;
            int[] array = intCol.getBinaryData() != null ? intCol.getBinaryData() : intCol.values().toArray();
            ByteArray byteArray = EncodedDataFactory.int32Array(array).classify();
            return encodeColumn(cifColumn, byteArray);
        } else {
            StrColumn strCol = (StrColumn) cifColumn;
            String[] array = strCol.getBinaryData() != null ? strCol.getBinaryData() : strCol.values().toArray(String[]::new);
            ByteArray byteArray = EncodedDataFactory.stringArray(array).encode(new StringArrayEncoding());
            return encodeColumn(cifColumn, byteArray);
        }
    }

    private Map<String, Object> encodeColumn(Column cifField, ByteArray byteArray) {
        String name = cifField.getColumnName();

        // handle ValueKind and if needed create mask
        int[] maskArray = new int[cifField.getRowCount()];
        Uint8Array mask = EncodedDataFactory.uint8Array(maskArray);
        boolean allPresent = true;

        for (int row = 0; row < maskArray.length; row++) {
            ValueKind kind = cifField.getValueKind(row);

            if (kind != ValueKind.PRESENT) {
                maskArray[row] = (byte) kind.ordinal();
                allPresent = false;
            } else {
                maskArray[row] = (byte) ValueKind.PRESENT.ordinal();
            }
        }

        // default encoding
        Map<String, Object> encodedMap = new LinkedHashMap<>();
        encodedMap.put("encoding", byteArray.getEncoding().stream().map(this::wrap).toArray(Object[]::new));
        encodedMap.put("data", byteArray.getData());

        // encode mask
        Map<String, Object> maskData = new LinkedHashMap<>();
        if (!allPresent) {
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
                    content = ((List<?>) content).stream()
                            .map(this::wrap)
                            .toArray(Object[]::new);
                } else if (isObjectArray(content)) {
                    content = Stream.of((Object[]) content)
                            .map(this::wrap)
                            .toArray(Object[]::new);
                }
                out.put(field.getName(), content);
            }
            return out;
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not convert Encoding to Map representation", e);
        }
    }

    private boolean isObjectArray(Object content) {
        if (content == null) {
            return false;
        } else if (!content.getClass().isArray()) {
            return false;
        } else {
            return !(content instanceof int[] || content instanceof double[] || content instanceof byte[] || content instanceof char[]);
        }
    }
}
