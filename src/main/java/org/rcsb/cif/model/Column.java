package org.rcsb.cif.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Represents a column of information in a CifFile, e.g. the coordinates in x-dimension of all atoms.
 */
public interface Column {
    /**
     * The name of this column.
     * @return the String which is used to acquire this column from its parent category
     */
    String getColumnName();

    /**
     * The number of rows in this column. 0 indicates undefined columns.
     * @return the length of this column
     */
    int getRowCount();

    /**
     * Access to entries of this column without any assumptions about the content type. No checks are performed about
     * the validity of the row argument are made. However, values smaller than 0 or larger or equal to the row count
     * will raise exceptions.
     * @param row index of the element to retrieve
     * @return the String representation of the corresponding row
     */
    String getStringData(int row);

    /**
     * Access to all entries of this column as String values.
     * @return a Stream of all String values
     */
    default Stream<String> getStringData() {
        return IntStream.range(0, getRowCount())
                .mapToObj(this::getStringData);
    }

    /**
     * States the ValueKind for a particular row. Elements may either be 'present', 'not_specified' (.) or 'unknown'
     * (?).
     * @param row index of the element for which the ValueKind should be retrieved
     * @return the corresponding ValueKind enum entry
     */
    ValueKind getValueKind(int row);

    /**
     * Stream of all ValueKind annotations.
     * @return a Stream with a number of ValueKinds equal to row count
     */
    Stream<ValueKind> valueKinds();

    /**
     * Queries this column whether it is defined. To avoid NullPointerExceptions left, right, and center, categories and
     * columns not present in a parsed file will be presented by an undefined state.
     * @return true if this column has row count 0 and no data in it
     */
    boolean isDefined();

    static IntColumnBuilder enterIntColumn(String columnName, Category.CategoryBuilder parent) {
        return new IntColumnBuilder(columnName, parent);
    }

    static IntColumnBuilder enterIntColumn(String categoryName, String columnName) {
        return new IntColumnBuilder(columnName, categoryName);
    }

    static FloatColumnBuilder enterFloatColumn(String columnName, Category.CategoryBuilder parent) {
        return new FloatColumnBuilder(columnName, parent);
    }

    static FloatColumnBuilder enterFloatColumn(String categoryName, String columnName) {
        return new FloatColumnBuilder(columnName, categoryName);
    }

    static StrColumnBuilder enterStrColumn(String columnName, Category.CategoryBuilder parent) {
        return new StrColumnBuilder(columnName, parent);
    }

    static StrColumnBuilder enterStrColumn(String categoryName, String columnName) {
        return new StrColumnBuilder(columnName, categoryName);
    }

    abstract class ColumnBuilder {
        final String categoryName;
        final String columnName;
        final Category.CategoryBuilder parent;
        final List<ValueKind> mask;

        public ColumnBuilder(String categoryName, String columnName, Category.CategoryBuilder parent) {
            this.categoryName = categoryName;
            this.columnName = columnName;
            this.parent = parent;
            this.mask = new ArrayList<>();
        }

        abstract ColumnBuilder markNextNotPresent();

        abstract ColumnBuilder markNextUnknown();

        public String getCategoryName() {
            return categoryName;
        }

        String getColumnName() {
            return columnName;
        }

        List<ValueKind> getMask() {
            return mask;
        }
    }

    class IntColumnBuilder extends ColumnBuilder {
        private final List<Integer> valueList;

        IntColumnBuilder(String columnName, Category.CategoryBuilder parent) {
            super(parent.getCategoryName(), columnName, parent);
            this.valueList = new ArrayList<>();
        }

        IntColumnBuilder(String columnName, String categoryName) {
            super(categoryName, columnName, null);
            this.valueList = new ArrayList<>();
        }

        public IntColumnBuilder intValues(int... values) {
            for (int i : values) {
                valueList.add(i);
                mask.add(ValueKind.PRESENT);
            }
            return this;
        }

        @Override
        public IntColumnBuilder markNextNotPresent() {
            valueList.add(0);
            mask.add(ValueKind.NOT_PRESENT);
            return this;
        }

        @Override
        public IntColumnBuilder markNextUnknown() {
            valueList.add(0);
            mask.add(ValueKind.UNKNOWN);
            return this;
        }

        public Category.CategoryBuilder leaveColumn() {
            if (parent == null) {
                throw new IllegalStateException("cannot leave column with undefined parent category");
            }
            return parent.digest(this);
        }

        List<Integer> getValueList() {
            return valueList;
        }

        public Column build() {
            return Category.CategoryBuilder.createColumnText(categoryName, columnName, valueList, mask);
        }
    }

    class FloatColumnBuilder extends ColumnBuilder {
        private final List<Double> valueList;

        FloatColumnBuilder(String columnName, Category.CategoryBuilder parent) {
            super(parent.getCategoryName(), columnName, parent);
            this.valueList = new ArrayList<>();
        }

        FloatColumnBuilder(String columnName, String categoryName) {
            super(categoryName, columnName, null);
            this.valueList = new ArrayList<>();
        }

        public FloatColumnBuilder floatValues(double... values) {
            for (double i : values) {
                valueList.add(i);
                mask.add(ValueKind.PRESENT);
            }
            return this;
        }

        @Override
        public FloatColumnBuilder markNextNotPresent() {
            valueList.add(0.0);
            mask.add(ValueKind.NOT_PRESENT);
            return this;
        }

        @Override
        public FloatColumnBuilder markNextUnknown() {
            valueList.add(0.0);
            mask.add(ValueKind.UNKNOWN);
            return this;
        }

        public Category.CategoryBuilder leaveColumn() {
            if (parent == null) {
                throw new IllegalStateException("cannot leave column with undefined parent category");
            }
            return parent.digest(this);
        }

        List<Double> getValueList() {
            return valueList;
        }

        public Column build() {
            return Category.CategoryBuilder.createColumnText(categoryName, columnName, valueList, mask);
        }
    }

    class StrColumnBuilder extends ColumnBuilder {
        private final List<String> valueList;

        StrColumnBuilder(String columnName, Category.CategoryBuilder parent) {
            super(parent.getCategoryName(), columnName, parent);
            this.valueList = new ArrayList<>();
        }

        StrColumnBuilder(String columnName, String categoryName) {
            super(categoryName, columnName, null);
            this.valueList = new ArrayList<>();
        }

        public StrColumnBuilder stringValues(String... values) {
            for (String s : values) {
                if (".".equals(s)) {
                    markNextNotPresent();
                } else if ("?".equals(s)) {
                    markNextUnknown();
                } else {
                    valueList.add(s);
                    mask.add(ValueKind.PRESENT);
                }
            }
            return this;
        }

        @Override
        public StrColumnBuilder markNextNotPresent() {
            valueList.add(".");
            mask.add(ValueKind.NOT_PRESENT);
            return this;
        }

        @Override
        public StrColumnBuilder markNextUnknown() {
            valueList.add("?");
            mask.add(ValueKind.UNKNOWN);
            return this;
        }

        public Category.CategoryBuilder leaveColumn() {
            if (parent == null) {
                throw new IllegalStateException("cannot leave column with undefined parent category");
            }
            return parent.digest(this);
        }

        List<String> getValueList() {
            return valueList;
        }

        public Column build() {
            return Category.CategoryBuilder.createColumnText(categoryName, columnName, valueList, mask);
        }
    }
}
