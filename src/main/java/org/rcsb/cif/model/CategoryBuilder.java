package org.rcsb.cif.model;

import org.rcsb.cif.model.text.TextColumn;
import org.rcsb.cif.schema.DelegatingFloatColumn;
import org.rcsb.cif.schema.DelegatingIntColumn;
import org.rcsb.cif.schema.DelegatingStrColumn;

import java.util.List;
import java.util.Map;

/**
 * The specification of a builder for generic {@link Category} instances.
 * @param <P> the parent builder type (BlockBuilder)
 * @param <PP> the parent's parent builder type (CifFileBuilder)
 */
public interface CategoryBuilder<P extends BlockBuilder<PP>, PP extends CifFileBuilder> {
    /**
     * The name of this category.
     * @return a String
     */
    String getCategoryName();

    /**
     * The column map of this builder (and Category about to be created).
     * @return a map with column names as keys and Column instances as values
     */
    Map<String, Column<?>> getColumns();

    /**
     * Leave this category and move back to the parent builder at Block level.
     * @return the parent builder
     */
    P leaveCategory();

    /**
     * Build this category as a detached instance.
     * @return the Category described by this builder
     */
    Category build();

    /**
     * Add a column to this builder.
     * @param column some column with data
     * @return this builder instance
     */
    CategoryBuilder<P, PP> addColumn(Column<?> column);

    /**
     * A hook to make this instance aware of the data in all child nodes.
     * @param columnBuilder the child builder to digest
     */
    void digest(IntColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder);

    /**
     * A hook to make this instance aware of the data in all child nodes.
     * @param columnBuilder the child builder to digest
     */
    void digest(FloatColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder);

    /**
     * A hook to make this instance aware of the data in all child nodes.
     * @param columnBuilder the child builder to digest
     */
    void digest(StrColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder);

    /**
     * Descend 1 level and enter a new IntColumn.
     * @param columnName the name for this column
     * @return a parent-aware builder instance at column level
     */
    IntColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterIntColumn(String columnName);

    /**
     * Descend 1 level and enter a new FloatColumn.
     * @param columnName the name for this column
     * @return a parent-aware builder instance at column level
     */
    FloatColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterFloatColumn(String columnName);

    /**
     * Descend 1 level and enter a new StrColumn.
     * @param columnName the name for this column
     * @return a parent-aware builder instance at column level
     */
    StrColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterStrColumn(String columnName);

    /**
     * Make this builder aware of a child builder at column level. This allows for a somewhat more convenient way to
     * add columns to a category in a more concise fashion.
     * @param columnBuilder instance to register
     */
    void registerChild(ColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder);

    /**
     * Convenience function to create Column instances from raw data. Everything is handled as text (but downstream
     * encoding as BinaryCIF can be requested).
     * @param columnName the column name
     * @param values a collection of all values to write
     * @param mask a collection of all ValueKind information
     * @param hint specifies the type (IntColumn, FloatColumn, StrColumn)
     * @param <C> type parameter
     * @return a subclass of Column
     */
    @SuppressWarnings("unchecked")
    static <C extends Column<?>> C createColumnText(String columnName, List<?> values, List<ValueKind> mask, Class<C> hint) {
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

        String data = builder.toString();
        int rowCount = startToken.length;
        TextColumn column = new TextColumn(columnName, rowCount, data, startToken, endToken);
        if (hint.equals(IntColumn.class)) {
            return (C) new DelegatingIntColumn(column);
        } else if (hint.equals(FloatColumn.class)) {
            return (C) new DelegatingFloatColumn(column);
        } else {
            return (C) new DelegatingStrColumn(column);
        }
    }
}
