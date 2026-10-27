package org.rcsb.cif.binary;

import org.rcsb.cif.CifOptions;
import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.codec.MessagePackCodec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.Float64Array;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.StringArray;
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
import org.rcsb.cif.model.binary.BinaryColumn;
import org.rcsb.cif.model.binary.BinaryFloatColumn;
import org.rcsb.cif.model.binary.BinaryIntColumn;
import org.rcsb.cif.schema.DelegatingColumn;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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
                    .filter(Category::isDefined) // at least 1 row present
                    .filter(category -> options.filterCategory(category.getCategoryName()))
                    .collect(Collectors.toList());
            Object[] categories = new Object[filteredCategories.size()];
            int categoryCount = 0;

            block.put("categories", categories);
            blocks[blockCount++] = block;

            for (Category category : filteredCategories) {
                String categoryName = category.getCategoryName();
                int rowCount = category.getRowCount();

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
        // hints are shared by all files written with the same options: read them, never update them
        String encoding = optional != null ? optional.getEncoding() : null;
        Integer precision = optional != null ? optional.getPrecision() : null;
        if ("byte".equals(encoding)) {
            return column.encode();
        }

        boolean classified = precision == null;
        if (classified) {
            // the precision that keeps every value: none means the values are stored as they are
            EncodingStrategyHint hint = Classifier.classifyPrecision(column);
            if ("byte".equals(hint.getEncoding())) {
                return column.encode();
            }
            precision = hint.getPrecision();
        }

        int multiplier = getMultiplier(precision);
        if (!fitsFixedPoint(column.getData(), multiplier)) {
            return column.encode();
        }

        Int32Array fixedPoint = column.encode(new FixedPointEncoding(multiplier));
        if (encoding == null) {
            // pick the encoding for the rounded values
            encoding = classified ? Classifier.classifyFixedPoint(fixedPoint) : Classifier.classify(fixedPoint).getEncoding();
        }
        ByteArray encoded = Classifier.encode(fixedPoint, encoding);

        // for a few values, the encoding parameters can outweigh the 8 bytes per value of the plain doubles (which
        // keep the values as they are). Above SMALL_COLUMN values, fixed point (at most 4 bytes per value) is smaller.
        if (classified && column.getData().length <= SMALL_COLUMN) {
            ByteArray plain = column.encode();
            if (encodedSize(plain) <= encodedSize(encoded)) {
                return plain;
            }
        }
        return encoded;
    }

    private static final int SMALL_COLUMN = 64;

    private static int encodedSize(ByteArray byteArray) {
        Map<String, Object> encoding = new LinkedHashMap<>();
        encoding.put("encoding", byteArray.getEncoding()
                .stream()
                .map(Encoding::getMapRepresentation)
                .toArray(Map[]::new));
        return byteArray.getData().length + MessagePackCodec.encode(encoding).length;
    }

    /** Whether every value times the multiplier rounds to an int (else fixed point would overflow). */
    private static boolean fitsFixedPoint(double[] values, int multiplier) {
        for (double v : values) {
            double scaled = v * multiplier;
            if (!(scaled >= Integer.MIN_VALUE && scaled <= Integer.MAX_VALUE)) {
                return false;
            }
        }
        return true;
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
                stringData(cifColumn);
        ByteArray byteArray = new StringArray(array).encode(new StringArrayEncoding());
        return encodeColumnUsingByteArray(cifColumn, byteArray);
    }

    /**
     * The string data of a number column written as strings (e.g. all values missing). Binary number columns repeat
     * the string of a row for rows with the same value and value kind, so it is created once per run of them.
     */
    private static String[] stringData(Column<?> column) {
        Column<?> base = unwrap(column);
        if (!(base instanceof BinaryIntColumn) && !(base instanceof BinaryFloatColumn)) {
            return column.stringData().toArray(String[]::new);
        }

        int[] ints = base instanceof BinaryIntColumn ? ((BinaryIntColumn) base).getArray() : null;
        double[] doubles = ints == null ? ((BinaryFloatColumn) base).getArray() : null;
        String[] array = new String[column.getRowCount()];
        String last = null;
        ValueKind lastKind = null;
        for (int row = 0; row < array.length; row++) {
            ValueKind kind = column.getValueKind(row);
            boolean sameValue = row > 0 && (ints != null ? ints[row] == ints[row - 1] :
                    Double.doubleToRawLongBits(doubles[row]) == Double.doubleToRawLongBits(doubles[row - 1]));
            if (last == null || kind != lastKind || !sameValue) {
                last = column.getStringData(row);
                lastKind = kind;
            }
            array[row] = last;
        }
        return array;
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
            // the string data of binary number columns is Integer/Double#toString: classify the numbers directly
            Column<?> base = unwrap(column);
            if (base instanceof BinaryIntColumn) {
                return ofInts((BinaryIntColumn) base);
            }
            if (base instanceof BinaryFloatColumn) {
                return ofFloats((BinaryFloatColumn) base);
            }

            int floatCount = 0;
            boolean hasString = false;
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
                } else if (type == NumberType.Float || type == NumberType.Scientific) {
                    floatCount++;
                } else {
                    hasString = true;
                    break;
                }
            }
            if (hasString || undefinedCount == column.getRowCount()) {
                return Str;
            }
            if (floatCount > 0) {
                return Float;
            }
            return Int;
        }
    }

    private static ColumnType ofInts(BinaryIntColumn column) {
        // Integer#toString is always an Int
        for (int i = 0; i < column.getRowCount(); i++) {
            if (column.getValueKind(i) == ValueKind.PRESENT) {
                return ColumnType.Int;
            }
        }
        return ColumnType.Str;
    }

    private static ColumnType ofFloats(BinaryFloatColumn column) {
        double[] data = column.getArray();
        int floatCount = 0;
        for (int i = 0; i < column.getRowCount(); i++) {
            if (column.getValueKind(i) != ValueKind.PRESENT) {
                continue;
            }
            // any finite value is a number; NaN and Infinity are not numbers in CIF
            if (!Double.isFinite(data[i])) {
                return ColumnType.Str;
            }
            floatCount++;
        }
        return floatCount > 0 ? ColumnType.Float : ColumnType.Str;
    }

    static Column<?> unwrap(Column<?> column) {
        while (column instanceof DelegatingColumn) {
            column = ((DelegatingColumn<?>) column).getDelegate();
        }
        return column;
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

        // a mask only if some value is not present (a binary column without mask has all values present)
        byte[] mask = null;
        Column<?> base = unwrap(cifField);
        if (!(base instanceof BinaryColumn) || ((BinaryColumn<?>) base).getMask() != null) {
            int rowCount = cifField.getRowCount();
            for (int row = 0; row < rowCount; row++) {
                ValueKind kind = cifField.getValueKind(row);
                if (kind != ValueKind.PRESENT) {
                    if (mask == null) {
                        mask = new byte[rowCount];
                    }
                    mask[row] = (byte) kind.ordinal();
                }
            }
        }

        // default encoding
        Map<String, Object> encodedMap = new LinkedHashMap<>();
        encodedMap.put("encoding", byteArray.getEncoding()
                .stream()
                .map(Encoding::getMapRepresentation)
                .toArray(Map[]::new));
        encodedMap.put("data", byteArray.getData());

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", name);
        map.put("data", encodedMap);
        map.put("mask", mask != null ? encodeMask(mask) : null);
        return map;
    }

    /** The value kinds as runs (pairs of Int32 value and length) if that is smaller than a byte per row. */
    private static Map<String, Object> encodeMask(byte[] mask) {
        int runs = 1;
        for (int i = 1; i < mask.length; i++) {
            if (mask[i] != mask[i - 1]) {
                runs++;
            }
        }

        Map<String, Object> maskData = new LinkedHashMap<>();
        if (runs * 8L < mask.length) {
            ByteBuffer buffer = ByteBuffer.allocate(runs * 8).order(ByteOrder.LITTLE_ENDIAN);
            int run = 1;
            for (int i = 1; i < mask.length; i++) {
                if (mask[i] != mask[i - 1]) {
                    buffer.putInt(mask[i - 1]).putInt(run);
                    run = 1;
                } else {
                    run++;
                }
            }
            buffer.putInt(mask[mask.length - 1]).putInt(run);
            maskData.put("encoding", new Object[] { new RunLengthEncoding(3, mask.length).getMapRepresentation(), ByteArrayEncoding.INT32.getMapRepresentation() });
            maskData.put("data", buffer.array());
        } else {
            maskData.put("encoding", new Object[] { ByteArrayEncoding.UINT8.getMapRepresentation() });
            maskData.put("data", mask);
        }
        return maskData;
    }
}
