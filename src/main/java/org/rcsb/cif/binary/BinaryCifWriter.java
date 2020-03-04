package org.rcsb.cif.binary;

import org.rcsb.cif.CifOptions;
import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.codec.MessagePackCodec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.Float64Array;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.StringArray;
import org.rcsb.cif.binary.data.Uint8Array;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
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

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BinaryCifWriter {
    private final CifOptions options;

    public BinaryCifWriter(CifOptions options) {
        this.options = options;
    }

    public byte[] write(CifFile cifFile) {
        Map<String, Object> file = encodeFile(cifFile);
        return MessagePackCodec.encode(file);
    }

    private Map<String, Object> encodeFile(CifFile cifFile) {
        // naming: uses cifEntity for original model and entity for the map representation ready for MessagePack
        Map<String, Object> file = new LinkedHashMap<>();
        file.put("encoder", options.getEncoder());
        file.put("version", BinaryCifCodec.VERSION);
        Object[] blocks = new Object[cifFile.getBlocks().size()];
        int blockCount = 0;
        file.put("dataBlocks", blocks);

        for (Block cifBlock : cifFile.getBlocks()) {
            Map<String, Object> block = new LinkedHashMap<>();
            String blockHeader = cifBlock.getBlockHeader();
            String header = blockHeader != null ? blockHeader.replaceAll("[ \n\t]", "").toUpperCase() : "UNKNOWN";
            block.put("header", header);

            // filter category names
            List<Category> filteredCategories = cifBlock.categories()
                    .filter(category -> options.filterCategory(category.getCategoryName()))
                    .collect(Collectors.toList());
            Object[] categories = new Object[filteredCategories.size()];
            int categoryCount = 0;

            block.put("categories", categories);
            blocks[blockCount++] = block;

            for (Category category : filteredCategories) {
                String categoryName = category.getCategoryName();
                int rowCount = category.getRowCount();
                if (rowCount == 0) {
                    continue;
                }

                Map<String, Object> categoryMap = new LinkedHashMap<>();
                categoryMap.put("name", "_" + category.getCategoryName());

                Object[] columns = category.columns()
                        .filter(column -> options.filterColumn(categoryName, column.getColumnName()))
                        .map(column -> encodeColumn(categoryName, column))
                        .toArray();
                categoryMap.put("columns", columns);

                categoryMap.put("rowCount", rowCount);
                categories[categoryCount++] = categoryMap;
            }
        }

        return file;
    }

    private ByteArray encodeFloatArray(String categoryName, String columnName, Float64Array column) {
        Optional<EncodingStrategyHint> optional = options.getEncodingStrategyHint(categoryName, columnName);

        // if no hint given, auto-classify column
        EncodingStrategyHint hint = optional.orElseGet(() -> Classifier.classify(column));
        // if no encoding given, auto-classify encoding
        String encoding = hint.getEncoding() != null ? hint.getEncoding() : Classifier.classify(column).getEncoding();
        // if multiplier/precision not given, auto-classify only precision
        EncodingStrategyHint precisionClassification = Classifier.classifyPrecision(column);
        if ("byte".equals(precisionClassification.getEncoding())) {
            return column.encode();
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

    private ByteArray encodeIntArray(String categoryName, String columnName, Int32Array column) {
        Optional<String> optional = options.getEncodingStrategyHint(categoryName, columnName).map(EncodingStrategyHint::getEncoding);

        // if no hint given, auto-classify column
        String encoding = optional.orElseGet(() -> Classifier.classify(column).getEncoding());

        return Classifier.encode(column, encoding);
    }

    private Map<String, Object> encodeColumn(String categoryName, Column<?> cifColumn) {
        if (cifColumn instanceof FloatColumn) {
            FloatColumn floatCol = (FloatColumn) cifColumn;
            double[] array = floatCol.getArray();
            ByteArray byteArray = encodeFloatArray(categoryName, cifColumn.getColumnName(), new Float64Array(array));
            return encodeColumnUsingByteArray(cifColumn, byteArray);
        } else if (cifColumn instanceof IntColumn) {
            IntColumn intCol = (IntColumn) cifColumn;
            int[] array = intCol.getArray();
            ByteArray byteArray = encodeIntArray(categoryName, cifColumn.getColumnName(), new Int32Array(array));
            return encodeColumnUsingByteArray(cifColumn, byteArray);
        } else if (cifColumn instanceof StrColumn) {
            StrColumn strCol = (StrColumn) cifColumn;
            String[] array = strCol.getArray();
            ByteArray byteArray = new StringArray(array).encode(new StringArrayEncoding());
            return encodeColumnUsingByteArray(cifColumn, byteArray);
        } else {
            // column is typed but unknown
            String[] array = cifColumn.stringData().toArray(String[]::new);
            ByteArray byteArray = new StringArray(array).encode(new StringArrayEncoding());
            return encodeColumnUsingByteArray(cifColumn, byteArray);
        }
    }

    private Map<String, Object> encodeColumnUsingByteArray(Column<?> cifField, ByteArray byteArray) {
        String name = cifField.getColumnName();

        // handle ValueKind and if needed create mask
        int[] maskArray = new int[cifField.getRowCount()];
        Uint8Array mask = new Uint8Array(maskArray);
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
        encodedMap.put("encoding", byteArray.getEncoding()
                .stream()
                .map(Encoding::getMapRepresentation)
                .toArray(Map[]::new));
        encodedMap.put("data", byteArray.getData());

        // encode mask
        Map<String, Object> maskData = new LinkedHashMap<>();
        if (!allPresent) {
            ByteArray maskRLE = mask.encode(new RunLengthEncoding()).encode();

            if (maskRLE.getData().length < mask.getData().length) {
                RunLengthEncoding rle = (RunLengthEncoding) maskRLE.getEncoding().getFirst();
                maskData.put("encoding", new Object[] { rle.getMapRepresentation(), ByteArrayEncoding.INT32.getMapRepresentation() });
                maskData.put("data", maskRLE.getData());
            } else {
                ByteArray encodedMask = mask.encode();
                maskData.put("encoding", new Object[] { ByteArrayEncoding.UINT8.getMapRepresentation() });
                maskData.put("data", encodedMask.getData());
            }
        }

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", name);
        map.put("data", encodedMap);
        map.put("mask", maskData);
        return map;
    }
}
