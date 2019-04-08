package org.rcsb.cif.model;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TextCifField implements CifField {
    private final int rowCount;
    private final String data;
    private final int[] start;
    private final int[] end;
    private final String name;
    private DataType dataType;

    public TextCifField(String data, int startToken, int endToken, String name) {
        this(data, new int[] { startToken }, new int[] { endToken }, name);
    }

    public TextCifField(String data, int[] start, int[] end, String name) {
        this.rowCount = start.length;
        this.data = data;
        this.start = start;
        this.end = end;
        this.name = name;

//        System.out.println(name + ", values: [" + this.strings().collect(Collectors.joining(", ")) + "]");
    }

    @Override
    public boolean isDefined() {
        return true;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public String getString(int row) {
        final String ret = data.substring(start[row], end[row]);
        if (".".equals(ret) || "?".equals(ret)) {
            return "";
        }
        return ret;
    }

    @Override
    public int getInt(int row) {
        return Integer.parseInt(data.substring(start[row], end[row]));
    }

    @Override
    public double getFloat(int row) {
        return Double.parseDouble(data.substring(start[row], end[row]));
    }

    @Override
    public ValueKind getValueKind(int row) {
        final int s = start[row];
        final int l = end[row] - s;
        if (l > 1) {
            return ValueKind.PRESENT;
        }
        if (l == 0) {
            return ValueKind.NOT_PRESENT;
        }
        final int v = data.charAt(s);
        if (v == '.') {
            return ValueKind.NOT_PRESENT;
        }
        if (v == '?') {
            return ValueKind.UNKNOWN;
        }
        return ValueKind.PRESENT;
    }

    @Override
    public boolean areEqualByValue(int rowA, int rowB) {
        return areValuesEqualProvider(data, start, end, rowA, rowB);
    }

    @Override
    public Stream<String> strings() {
        return IntStream.range(0, start.length)
                .mapToObj(i -> data.substring(start[i], end[i]));
    }

    @Override
    public IntStream ints() {
        return strings()
                // TODO correct behavior?
                .filter(s -> !"?".equals(s) && !".".equals(s))
                .mapToInt(Integer::parseInt);
    }

    @Override
    public DoubleStream floats() {
        return strings()
                // TODO correct behavior?
                .filter(s -> !"?".equals(s) && !".".equals(s))
                .mapToDouble(Double::parseDouble);
    }

    private static boolean areValuesEqualProvider(String data, int[] start, int[] end, int rowA, int rowB) {
        final int aS = start[rowA];
        final int bS = start[rowB];
        final int len = end[rowA] - aS;
        if (len != end[rowB] - bS) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (data.charAt(i + aS) != data.charAt(i + bS)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public DataType getDataType() {
        // try to be lazy and determine type only when requested
        if (dataType == null) {
            dataType = determineDataType();
        }
        return dataType;
    }

    private DataType determineDataType() {
        // might be ambiguous, so the most restrictive type (i.e. int) is returned
        if (strings().allMatch(this::isInt)) {
            return DataType.Int;
        } else if (strings().allMatch(this::isDouble)) {
            return DataType.Float;
        } else {
            return DataType.Str;
        }
    }

    private boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return !str.contains(".");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Stream<ValueKind> valueKinds() {
        return IntStream.range(0, rowCount)
                .mapToObj(this::getValueKind);
    }
}
