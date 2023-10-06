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

    private ByteArray encodeFloatArray(Float64Array column, EncodingStrategyHint optional) {
        // if no hint given, classify column
        EncodingStrategyHint hint = optional != null ? optional : Classifier.classify(column);
        if (hint.getEncoding() == null) {
            hint.setEncoding(Classifier.classify(column).getEncoding());
        }
        if ("byte".equals(hint.getEncoding())) {
            return column.encode();
        }
        if (hint.getPrecision() == null) {
            hint.setPrecision(Classifier.classify(column).getPrecision());
        }

        int multiplier = getMultiplier(hint.getPrecision());

        Int32Array fixedPoint = column.encode(new FixedPointEncoding(multiplier));
        return Classifier.encode(fixedPoint, hint.getEncoding());
    }

    private static int getMultiplier(int mantissaDigits) {
        int m = 1;
        for (int i = 0; i < mantissaDigits; i++) {
            m *= 10;
        }
        return m;
    }

    private ByteArray encodeIntArray(Int32Array column, EncodingStrategyHint optional) {
        // if no hint given, classify column
        String encoding = optional != null && optional.getEncoding() != null ? optional.getEncoding() : Classifier.classify(column).getEncoding();
        return Classifier.encode(column, encoding);
    }

    private Map<String, Object> encodeColumn(String categoryName, Column<?> cifColumn) {
        // TODO encoding provider support and/or make auto-classify configurable
        EncodingStrategyHint optional = options.getEncodingStrategyHint(categoryName, cifColumn.getColumnName()).orElse(null);
        ColumnType type = ColumnType.of(cifColumn);
        switch (type) {
            case Str:
                return encodeStr(cifColumn);
            case Float:
                return encodeFloat(cifColumn, optional);
            case Int:
                return encodeInt(cifColumn, optional);
            default:
                throw new UnsupportedOperationException(type + " not handled");
        }
    }

    private Map<String, Object> encodeStr(Column<?> cifColumn) {
        String[] array = cifColumn instanceof StrColumn ?
                ((StrColumn) cifColumn).getArray() :
                cifColumn.stringData().toArray(String[]::new);
        ByteArray byteArray = new StringArray(array).encode(new StringArrayEncoding());
        return encodeColumnUsingByteArray(cifColumn, byteArray);
    }

    private Map<String, Object> encodeFloat(Column<?> cifColumn, EncodingStrategyHint optional) {
        double[] array = cifColumn instanceof FloatColumn ?
                ((FloatColumn) cifColumn).getArray() :
                cifColumn.stringData().mapToDouble(FloatColumn::parseFloat).toArray();
        ByteArray byteArray = encodeFloatArray(new Float64Array(array), optional);
        return encodeColumnUsingByteArray(cifColumn, byteArray);
    }

    private Map<String, Object> encodeInt(Column<?> cifColumn, EncodingStrategyHint optional) {
        int[] array = cifColumn instanceof IntColumn ?
                ((IntColumn) cifColumn).getArray() :
                cifColumn.stringData().mapToInt(IntColumn::parseInt).toArray();
        ByteArray byteArray = encodeIntArray(new Int32Array(array), optional);
        return encodeColumnUsingByteArray(cifColumn, byteArray);
    }

    enum ColumnType {
        Int,
        Float,
        Str;

        static ColumnType of(Column<?> column) {
            int floatCount = 0;
            boolean hasStringOrScientific = false;
            int undefinedCount = 0;
            for (int i = 0; i < column.getRowCount(); i++) {
                ValueKind valueKind = column.getValueKind(i);
                if (valueKind != ValueKind.PRESENT) {
                    undefinedCount++;
                    continue;
                }
                NumberType type = NumberType.of(column.getStringData(i));
                if (type == NumberType.Int) {
                    continue;
                } else if (type == NumberType.Float) {
                    floatCount++;
                } else {
                    hasStringOrScientific = true;
                    break;
                }
            }
            if (hasStringOrScientific || undefinedCount == column.getRowCount()) {
                return Str;
            }
            if (floatCount > 0) {
                return Float;
            }
            return Int;
        }
    }

    enum NumberType {
        Int,
        Float,
        Scientific,
        NaN;

        static NumberType of(String v) {
            int start = 0;
            int end = v.length();

            if (v.charAt(start) == '-') {
                start++;
            }

            if (v.charAt(start) == '.' && end - start == 1) {
                return NaN;
            }

            while (start < end) {
                int c = v.charAt(start);
                if (c >= '0' && c < ':') {
                    start++;
                } else if (c == '.') {
                    start++;
                    boolean hasDigit = false;
                    while (start < end) {
                        c = v.charAt(start);
                        if (c >= '0' && c < ':') {
                            hasDigit = true;
                            start++;
                        } else if (c == 'e' || c == 'E') {
                            return getNumberTypeScientific(v, start + 1, end);
                        } else {
                            return NaN;
                        }
                    }
                    return hasDigit ? Float : Int;
                } else if (c == 'e' || c == 'E') {
                    if (start == 0 || start == 1 && v.charAt(0) == '-') {
                        return NaN;
                    }
                    return getNumberTypeScientific(v, start + 1, end);
                } else {
                    break;
                }
            }

            // long sequences of numbers might exceed what can actually be stored as int
            if (end >= 10) {
                try {
                    // 'expensive' check to see whether some String fits into 32 bit
                    Integer.parseInt(v);
                } catch (NumberFormatException e) {
                    return NaN;
                }
            }

            return start == end ? Int : NaN;
        }

        // check for "scientific integers?"
        static NumberType getNumberTypeScientific(String v, int start, int end) {
            if (start >= v.length()) return NaN; // might happen to end with e/E
            // handle + in '1e+1' separately.
            if (v.charAt(start) == '+') start++;
            return isInt(v, start, end) ? NumberType.Scientific : NumberType.NaN;
        }

        static boolean isInt(String v, int start, int end) {
            if (v.charAt(start) == '-') { start++; }
            for (; start < end; start++) {
                int c = v.charAt(start) - '0';
                if (c > 9 || c < 0) return false;
            }
            return true;
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
        Map<String, Object> maskData = null;
        if (!allPresent) {
            maskData = new LinkedHashMap<>();
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
