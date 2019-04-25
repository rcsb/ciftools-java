package org.rcsb.cif.model;

import org.rcsb.cif.internal.ModelFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * The base of all categories. Provides access to child columns.
 */
public interface Category {
    /**
     * The name of this category.
     * @return String of the name
     */
    String getCategoryName();

    /**
     * The number of rows in this category. 0 for undefined categories. 1 for SingleRowColumns.
     * @return the number of rows
     */
    int getRowCount();

    /**
     * Retrieve a specific column by name.
     * @param name the column name
     * @return the column, empty BaseColumn if no column of that name exists
     */
    Column getColumn(String name);

    /**
     * Names of all present columns.
     * @return a collection of column names
     */
    List<String> getColumnNames();

    /**
     * Traverse all names of present columns.
     * @return a Stream of present column names
     */
    default Stream<String> columnNames() {
        return getColumnNames().stream();
    }

    /**
     * Traverse all present columns.
     * @return a Stream of all present columns
     */
    default Stream<Column> columns() {
        return columnNames().map(this::getColumn);
    }

    /**
     * States whether this category is defined.
     * @return <code>true</code> if this category contains data
     */
    boolean isDefined();

    static CategoryBuilder enterCategory(String categoryName, Map<String, Column> columns, Block.BlockBuilder parent) {
        return new CategoryBuilder(categoryName, columns, parent);
    }

    static CategoryBuilder enterCategory(String categoryName) {
        return new CategoryBuilder(categoryName, new LinkedHashMap<>(), null);
    }

    class CategoryBuilder {
        private final String categoryName;
        private final Map<String, Column> columns;
        private final Block.BlockBuilder parent;

        CategoryBuilder(String categoryName, Map<String, Column> columns, Block.BlockBuilder parent) {
            this.categoryName = categoryName;
            this.columns = columns;
            this.parent = parent;
        }

        public Column.IntColumnBuilder enterIntColumn(String columnName) {
            return Column.enterIntColumn(columnName, this);
        }

        public Column.FloatColumnBuilder enterFloatColumn(String columnName) {
            return Column.enterFloatColumn(columnName, this);
        }

        public Column.StrColumnBuilder enterStrColumn(String columnName) {
            return Column.enterStrColumn(columnName, this);
        }

        CategoryBuilder digest(Column.IntColumnBuilder intColumnBuilder) {
            columns.put(intColumnBuilder.getColumnName(), createColumnText(categoryName, intColumnBuilder.getColumnName(),
                    intColumnBuilder.getValueList(), intColumnBuilder.getMask()));
            return this;
        }

        CategoryBuilder digest(Column.FloatColumnBuilder floatColumnBuilder) {
            columns.put(floatColumnBuilder.getColumnName(), createColumnText(categoryName, floatColumnBuilder.getColumnName(),
                    floatColumnBuilder.getValueList(), floatColumnBuilder.getMask()));
            return this;
        }

        CategoryBuilder digest(Column.StrColumnBuilder strColumnBuilder) {
            columns.put(strColumnBuilder.getColumnName(), createColumnText(categoryName, strColumnBuilder.getColumnName(),
                    strColumnBuilder.getValueList(), strColumnBuilder.getMask()));
            return this;
        }

        static Column createColumnText(String categoryName, String columnName, List<?> values, List<ValueKind> mask) {
            int length = values.size();
            int[] startToken = new int[length];
            int[] endToken = new int[length];
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < length; i++) {
                startToken[i] = builder.length();
                String value = String.valueOf(values.get(i));
                if (mask.get(i) == ValueKind.NOT_PRESENT) {
                    value = ".";
                } else if (mask.get(i) == ValueKind.UNKNOWN) {
                    value = "?";
                }
                builder.append(value);
                endToken[i] = builder.length();
            }

            return ModelFactory.createColumnText(categoryName, columnName, builder.toString(), startToken, endToken);
        }

        public Block.BlockBuilder leaveCategory() {
            if (parent == null) {
                throw new IllegalStateException("cannot leave category with undefined parent block");
            }
            return parent.digest(this);
        }

        String getCategoryName() {
            return categoryName;
        }

        Map<String, Column> getColumns() {
            return columns;
        }

        public Category build() {
            return ModelFactory.createCategoryText(categoryName, columns);
        }

        public CategoryBuilder addColumn(Column column) {
            columns.put(column.getColumnName(), column);
            return this;
        }
    }
}
