package org.rcsb.cif.binary;

import org.rcsb.cif.CifOptions;
import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.codec.Classifier;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.Float64Array;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.Uint8Array;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryCifWriter {
    private final CifOptions options;

    public BinaryCifWriter(CifOptions options) {
        this.options = options;
    }

    public byte[] write(CifFile cifFile) {
        Map<String, Object> file = encodeFile(cifFile);
        return Codec.MESSAGE_PACK_CODEC.encode(file);
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

            // filter category names
            List<String> filteredCategoryNames = cifBlock.getCategoryNames()
                    .stream()
                    .filter(options::filterCategory)
                    .collect(Collectors.toList());
            Object[] categories = new Object[filteredCategoryNames.size()];
            int categoryCount = 0;

            block.put("categories", categories);
            blocks[blockCount++] = block;

            for (String categoryName : filteredCategoryNames) {
                Category cifCategory = cifBlock.getCategory(categoryName);
                int rowCount = cifCategory.getRowCount();
                if (rowCount == 0) {
                    continue;
                }

                Map<String, Object> category = new LinkedHashMap<>();
                category.put("name", "_" + cifCategory.getCategoryName());

                // single row
                if (options.isSingleRow() && rowCount == 1) {
                    category.put("columns", encodeSingleRowCategory(cifCategory));
                } else {
                    Object[] columns = cifCategory.getColumnNames()
                            .stream()
                            .filter(columnName -> options.filterColumn(categoryName, columnName))
                            .map(cifCategory::getColumn)
                            .map(cifColumn -> encodeColumn(categoryName, cifColumn))
                            .toArray();
                    category.put("columns", columns);
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
                .filter(columnName -> options.filterColumn(category.getCategoryName(), columnName))
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

    private ByteArray encode(String categoryName, String columnName, Float64Array column) {
        Optional<EncodingStrategyHint> optional = options.getEncodingStrategyHint(categoryName, columnName);

        // if no hint given, auto-classify column
        EncodingStrategyHint hint = optional.orElseGet(column::classify);
        // if no encoding given, auto-classify encoding
        String encoding = hint.getEncoding() != null ? hint.getEncoding() : Classifier.classify(column).getEncoding();
        // if multiplier/precision not given, auto-classify only precision
        EncodingStrategyHint precisionClassification = Classifier.classifyPrecision(column);
        if ("byte".equals(precisionClassification.getEncoding())) {
            return column.encode(new ByteArrayEncoding(column.getType()));
        }
        int multiplier = getMultiplier(hint.getPrecision() != null ? hint.getPrecision() : precisionClassification.getPrecision());

        Int32Array fixedPoint = column.encode(new FixedPointEncoding(multiplier));
        return Classifier.encode(fixedPoint, encoding);
    }

    private static int getMultiplier(int mantissaDigits) {
        int m = 1;
        for (int i = 0; i < mantissaDigits; i++) {
            m *= 10;
        }
        return m;
    }

    private ByteArray encode(String categoryName, String columnName, Int32Array column) {
        Optional<String> optional = options.getEncodingStrategyHint(categoryName, columnName).map(EncodingStrategyHint::getEncoding);

        // if no hint given, auto-classify column
        String encoding = optional.orElseGet(() -> Classifier.classify(column).getEncoding());

        return Classifier.encode(column, encoding);
    }

    private Map<String, Object> encodeColumn(String categoryName, Column cifColumn) {
        if (cifColumn instanceof FloatColumn) {
            FloatColumn floatCol = (FloatColumn) cifColumn;
            double[] array = floatCol.getBinaryData() != null ? floatCol.getBinaryData() : floatCol.values().toArray();
            ByteArray byteArray = encode(categoryName, cifColumn.getColumnName(), EncodedDataFactory.float64Array(array));
            return encodeColumn(cifColumn, byteArray);
        } else if (cifColumn instanceof IntColumn) {
            IntColumn intCol = (IntColumn) cifColumn;
            int[] array = intCol.getBinaryData() != null ? intCol.getBinaryData() : intCol.values().toArray();
            ByteArray byteArray = encode(categoryName, cifColumn.getColumnName(), EncodedDataFactory.int32Array(array));
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
//                if (!field.canAccess(object)) {
                    field.setAccessible(true);
//                }
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
