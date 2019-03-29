package org.rcsb.cif.model;

import java.util.List;

public interface CifField {
    boolean isDefined();
    int getRowCount();

    String getStr(int row);
    int getInt(int row);
    double getDouble(int row);

    ValueKind getValueKind(int row);

    boolean areEqualByValue(int rowA, int rowB);

//    Stream<String> strings();
//    IntStream ints();
//    DoubleStream doubles();

    class Builder {
        public static CifField ofTokens(String data, List<Integer> indices) {
            return new CifField() {
                private final String d = data;
                private final List<Integer> i = indices;
                private final int rowCount = indices.size() / 2;

                @Override
                public boolean isDefined() {
                    return true;
                }

                @Override
                public int getRowCount() {
                    return rowCount;
                }

                @Override
                public String getStr(int row) {
                    final String ret = data.substring(indices.get(2 * row), indices.get(2 * row + 1));
                    if (".".equals(ret) || "?".equals(ret)) {
                        return "";
                    }
                    return ret;
                }

                @Override
                public int getInt(int row) {
                    return Integer.parseInt(data.substring(indices.get(2 * row), indices.get(2 * row + 1)));
                }

                @Override
                public double getDouble(int row) {
                    return Double.parseDouble(data.substring(indices.get(2 * row), indices.get(2 * row + 1)));
                }

                @Override
                public ValueKind getValueKind(int row) {
                    final int s = indices.get(2 * row);
                    final int l = indices.get(2 * row + 1) - s;
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
                    return areValuesEqualProvider(d, i, rowA, rowB);
                }

//                @Override
//                public Stream<String> strings() {
//                    return null;
//                }
//
//                @Override
//                public IntStream ints() {
//                    return null;
//                }
//
//                @Override
//                public DoubleStream doubles() {
//                    return null;
//                }
            };
        }
    }

    static boolean areValuesEqualProvider(String data, List<Integer> indices, int rowA, int rowB) {
        final int aS = indices.get(2 * rowA);
        final int bS = indices.get(2 * rowB);
        final int len = indices.get(2 * rowA + 1) - aS;
        if (len != indices.get(2 * rowB + 1) - bS) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (data.charAt(i + aS) != data.charAt(i + bS)) {
                return false;
            }
        }
        return true;
    }
}