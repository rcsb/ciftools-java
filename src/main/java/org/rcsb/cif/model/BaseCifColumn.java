package org.rcsb.cif.model;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.schema.Schema;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.rcsb.cif.schema.Schema.filter;
import static org.rcsb.cif.schema.Schema.toPackageName;

public class BaseCifColumn implements CifColumn {
    private final String name;
    private final int rowCount;

    protected final boolean isText;
    private final String textData;
    private final int[] startToken;
    private final int[] endToken;

    protected final int[] binaryIntData;
    protected final double[] binaryFloatData;
    protected final String[] binaryStringData;
    private final boolean hasMask;
    private final int[] mask;

    public static CifColumn create(String catName, String fieldName, String data, int startToken, int endToken) {
        return create(catName, fieldName, data, new int[] { startToken }, new int[] { endToken });
    }

    public BaseCifColumn(String data, int startToken, int endToken, String name) {
        this(data, new int[] { startToken }, new int[] { endToken }, name);
    }

    @SuppressWarnings("unchecked")
    public static CifColumn create(String catName, String fieldName, String data, int[] startToken, int[] endToken) {
        if (filter(catName, fieldName)) {
            try {
                Class<? extends BaseCifColumn> column = (Class<? extends BaseCifColumn>) Class.forName(Schema.BASE_PACKAGE
                        + "." + toPackageName(catName) + "." + Schema.toClassName(fieldName));
                if (column.getSuperclass().equals(ListColumn.class) || column.getSuperclass().equals(MatrixColumn.class) || column.getSuperclass().equals(VectorColumn.class)) {
                    System.out.println(catName + " " + fieldName + " " + column.getSuperclass().getSimpleName());
                }
                return column.getConstructor(String.class, int[].class, int[].class, String.class)
                        .newInstance(data, startToken, endToken, fieldName);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            return new BaseCifColumn(data, startToken, endToken, fieldName);
        }
    }

    public BaseCifColumn(String data, int[] startToken, int[] endToken, String name) {
        this.name = name;
        this.rowCount = startToken.length;

        this.isText = true;
        this.textData = data;
        this.startToken = startToken;
        this.endToken = endToken;

        this.binaryIntData = null;
        this.binaryFloatData = null;
        this.binaryStringData = null;
        this.hasMask = false;
        this.mask = null;
    }

    @SuppressWarnings("unchecked")
    public static CifColumn create(String catName, String fieldName, Map<String, Object> encodedColumn) {
        if (filter(catName, fieldName)) {
            try {
                Class<? extends BaseCifColumn> column = (Class<? extends BaseCifColumn>) Class.forName(Schema.BASE_PACKAGE
                        + "." + toPackageName(catName) + "." + Schema.toClassName(fieldName));
                return column.getConstructor(Map.class)
                        .newInstance(encodedColumn);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            return new BaseCifColumn(encodedColumn);
        }
    }

    @SuppressWarnings("unchecked")
    public BaseCifColumn(Map<String, Object> encodedColumn) {
        this.name = (String) encodedColumn.get("name");

        this.isText = false;
        Object data = Codec.decode((Map<String, Object>) encodedColumn.get("data"));
        this.hasMask = encodedColumn.containsKey("mask") && encodedColumn.get("mask") != null && !((Map) encodedColumn.get("mask")).isEmpty();
        this.mask = hasMask ? (int[]) Codec.decode((Map<String, Object>) encodedColumn.get("mask")) : null;

        if (data instanceof int[]) {
            this.binaryIntData = (int[]) data;
            this.binaryFloatData = null;
            this.binaryStringData = null;
            this.rowCount = binaryIntData.length;
        } else if (data instanceof double[]) {
            this.binaryIntData = null;
            this.binaryFloatData = (double[]) data;
            this.binaryStringData = null;
            this.rowCount = binaryFloatData.length;
        } else {
            this.binaryIntData = null;
            this.binaryFloatData = null;
            this.binaryStringData = (String[]) data;
            this.rowCount = binaryStringData.length;
        }

        this.textData = null;
        this.startToken = null;
        this.endToken = null;
    }

    protected String getTextStringData(int row) {
        final String ret = textData.substring(startToken[row], endToken[row]);
        if (".".equals(ret) || "?".equals(ret)) {
            return "";
        }
        return ret;
    }

    protected int getTextIntData(int row) {
        try {
            return Integer.parseInt(textData.substring(startToken[row], endToken[row]));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    protected double getTextFloatData(int row) {
        try {
            return Double.parseDouble(textData.substring(startToken[row], endToken[row]));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    protected String getBinaryStringData(int row) {
        if (binaryStringData != null) {
            return !hasMask || mask[row] == ValueKind.PRESENT.ordinal() ? binaryStringData[row] : "";
        }
        return !hasMask || mask[row] == ValueKind.PRESENT.ordinal() ?
                String.valueOf(binaryIntData != null ? binaryIntData[row] : binaryFloatData[row]) : "";
    }

    protected int getBinaryIntData(int row) {
        if (binaryIntData != null) {
            return binaryIntData[row];
        } else if (binaryFloatData != null) {
            return (int) binaryFloatData[row];
        } else {
            try {
                return Integer.parseInt(binaryStringData[row]);
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    protected double getBinaryFloatData(int row) {
        if (binaryFloatData != null) {
            return binaryFloatData[row];
        } else if (binaryIntData != null) {
            return binaryIntData[row];
        } else {
            try {
                return Double.parseDouble(binaryStringData[row]);
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    public Stream<String> stringValues() {
        return isText ? IntStream.range(0, rowCount)
                .mapToObj(this::getTextStringData) :
                IntStream.range(0, rowCount)
                        .mapToObj(this::getBinaryStringData);
    }

    protected IntStream intValues() {
        return isText ? IntStream.range(0, rowCount)
                .map(this::getTextIntData) :
                IntStream.range(0, rowCount)
                        .map(this::getBinaryIntData);
    }

    protected DoubleStream floatValues() {
        return isText ? IntStream.range(0, rowCount)
                .mapToDouble(this::getTextFloatData) :
                IntStream.range(0, rowCount)
                        .mapToDouble(this::getBinaryFloatData);
    }

    @Override
    public String getString(int row) {
        return isText ? getTextStringData(row) : getBinaryStringData(row);
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
            final int s = startToken[row];
            final int l = endToken[row] - s;
            if (l > 1) {
                return ValueKind.PRESENT;
            }
            if (l == 0) {
                return ValueKind.NOT_PRESENT;
            }
            final int v = textData.charAt(s);
            if (v == '.') {
                return ValueKind.NOT_PRESENT;
            }
            if (v == '?') {
                return ValueKind.UNKNOWN;
            }
            return ValueKind.PRESENT;
        }

        if (!hasMask) {
            return ValueKind.PRESENT;
        }
        return ValueKind.values()[mask[row]];
    }
}
