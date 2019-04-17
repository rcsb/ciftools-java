package org.rcsb.cif.model;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.encoding.*;
import org.rcsb.cif.model.generated.atomsite.*;
import org.rcsb.cif.schema.Schema;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.rcsb.cif.schema.Schema.filter;
import static org.rcsb.cif.schema.Schema.toPackageName;

public abstract class BaseCifColumn implements CifColumn {
    private final String name;
    protected final int rowCount;

    protected final boolean isText;
    protected final String[] textData;

    protected final boolean hasMask;
    protected final int[] mask;

    public BaseCifColumn(String name, int rowCount, String[] data) {
        this.name = name;
        this.rowCount = rowCount;

        this.isText = true;
        this.textData = data;

        this.hasMask = false;
        this.mask = null;
    }

    public static CifColumn create(String catName, String fieldName, String data, int startToken, int endToken) {
        return create(catName, fieldName, data, new int[] { startToken }, new int[] { endToken });
    }

    @SuppressWarnings("unchecked")
    public static CifColumn create(String catName, String fieldName, String data, int[] startToken, int[] endToken) {
        int rowCount = startToken.length;
        String[] textData = IntStream.range(0, rowCount)
                .mapToObj(i -> data.substring(startToken[i], endToken[i]))
                .toArray(String[]::new);
        if (filter(catName, fieldName)) {
            try {
                Class<? extends BaseCifColumn> column = (Class<? extends BaseCifColumn>) Class.forName(Schema.BASE_PACKAGE
                        + "." + toPackageName(catName) + "." + Schema.toClassName(fieldName));
                return column.getConstructor(String.class, int.class, String[].class)
                        .newInstance(fieldName, rowCount, textData);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            // cannot rely on schema, cross fingers that there is enough information to infer data type correctly
            if (isIntData(textData)) {
                return new IntColumn(fieldName, rowCount, textData);
            } else if (isFloatData(textData)) {
                return new FloatColumn(fieldName, rowCount, textData);
            } else {
                return new StrColumn(fieldName, rowCount, textData);
            }
        }
    }

    private static boolean isIntData(String[] textData) {
        return isNumberData(textData, BaseCifColumn::parsableAsInt);
    }

    private static boolean isNumberData(String[] textData, Predicate<String> predicate) {
        int undefinedCount = (int) Stream.of(textData)
                .filter(datum -> datum.isEmpty() || ".".equals(datum) || "?".equals(datum))
                .count();
        if (undefinedCount == textData.length) {
            return false;
        }

        return Stream.of(textData)
                .filter(datum -> !datum.isEmpty() && !".".equals(datum) && !"?".equals(datum))
                .allMatch(predicate);
    }

    private static boolean parsableAsInt(String datum) {
        try {
            Integer.parseInt(datum);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isFloatData(String[] textData) {
        return isNumberData(textData, BaseCifColumn::parsableAsFloat);
    }

    private static boolean parsableAsFloat(String datum) {
        try {
            Double.parseDouble(datum);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    protected String getTextData(int row) {
        return honorValueKind(textData[row]);
    }

    protected String honorValueKind(String value) {
        return (".".equals(value) || "?".equals(value)) ? "" : value;
    }

    @Override
    public String getStringData(int row) {
        return isText ? getTextData(row) : getBinaryStringData(row);
    }

    protected abstract String getBinaryStringData(int row);

    public BaseCifColumn(String name, int rowCount, int[] mask) {
        this.name = name;
        this.rowCount = rowCount;

        this.isText = false;
        this.textData = null;

        this.hasMask = mask != null && mask.length > 0;
        this.mask = mask;
    }

    @SuppressWarnings("unchecked")
    public static CifColumn create(String catName, String fieldName, Map<String, Object> encodedColumn) {
        Object binaryData = Codec.decode((Map<String, Object>) encodedColumn.get("data"));
        boolean isIntArray = binaryData instanceof int[];
        boolean isDoubleArray = binaryData instanceof double[];
        int rowCount = isIntArray ? ((int[]) binaryData).length : isDoubleArray ? ((double[]) binaryData).length : ((String[]) binaryData).length;
        boolean hasMask = encodedColumn.containsKey("mask") && encodedColumn.get("mask") != null && !((Map) encodedColumn.get("mask")).isEmpty();
        int[] mask = hasMask ? (int[]) Codec.decode((Map<String, Object>) encodedColumn.get("mask")) : null;


        if (filter(catName, fieldName)) {
            try {
                    Class<? extends BaseCifColumn> column = (Class<? extends BaseCifColumn>) Class.forName(Schema.BASE_PACKAGE
                            + "." + toPackageName(catName) + "." + Schema.toClassName(fieldName));
                    return column.getConstructor(String.class, int.class, Object.class, int[].class)
                            .newInstance(fieldName, rowCount, binaryData, mask);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            if (isIntArray) {
                return new IntColumn(fieldName, rowCount, binaryData, mask);
            } else if (isDoubleArray) {
                return new FloatColumn(fieldName, rowCount, binaryData, mask);
            } else {
                return new StrColumn(fieldName, rowCount, binaryData, mask);
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public ValueKind getValueKind(int row) {
        if (isText) {
            String value = textData[row];
            if (value.isEmpty() || ".".equals(value)) {
                return ValueKind.NOT_PRESENT;
            } else if ("?".equals(value)) {
                return ValueKind.UNKNOWN;
            } else {
                return ValueKind.PRESENT;
            }
        }

        if (!hasMask) {
            return ValueKind.PRESENT;
        }
        return ValueKind.values()[mask[row]];
    }

    private static final DecimalFormat FLOAT_2 = new DecimalFormat("0.00");
    private static final DecimalFormat FLOAT_3 = new DecimalFormat("0.000");

    private Optional<ByteArray> deltaRLE(CifColumn column) {
        IntColumn intColumn = (IntColumn) column;
        return Optional.of(EncodedDataFactory.int32Array(intColumn.values().toArray())
                .encode(new DeltaEncoding())
                .encode(new RunLengthEncoding())
                .encode(new IntegerPackingEncoding())
                .encode(new ByteArrayEncoding()));
    }

    private Optional<ByteArray> fixedPoint2(CifColumn column) {
        FloatColumn floatColumn = (FloatColumn) column;
        return Optional.of(EncodedDataFactory.float64Array(floatColumn.values().toArray())
                .encode(new FixedPointEncoding(100))
                .encode(new DeltaEncoding())
                .encode(new IntegerPackingEncoding())
                .encode(new ByteArrayEncoding()));
    }

    private Optional<ByteArray> fixedPoint3(CifColumn column) {
        FloatColumn floatColumn = (FloatColumn) column;
        return Optional.of(EncodedDataFactory.float64Array(floatColumn.values().toArray())
                .encode(new FixedPointEncoding(1000))
                .encode(new DeltaEncoding())
                .encode(new IntegerPackingEncoding())
                .encode(new ByteArrayEncoding()));
    }

    @Override
    public Optional<ByteArray> forceEncode() {
        // in a perfect OO-world, these would live with there respective impls
        if (this instanceof CartnX || this instanceof CartnY || this instanceof CartnZ) {
            return fixedPoint3(this);
        } else if (this instanceof Occupancy) {
            return fixedPoint2(this);
        } else if (this instanceof PdbxFormalCharge) {
            return deltaRLE(this);
        } else if (this instanceof AuthSeqId) {
            return deltaRLE(this);
        } else if (this instanceof PdbxPDBModelNum) {
            return deltaRLE(this);
        }

        return Optional.empty();
    }

    @Override
    public Optional<DecimalFormat> defaultFormat() {
        if (this instanceof CartnX || this instanceof CartnY || this instanceof CartnZ) {
            return Optional.of(FLOAT_3);
        } else if (this instanceof Occupancy) {
            return Optional.of(FLOAT_2);
        }

        return Optional.empty();
    }
}
