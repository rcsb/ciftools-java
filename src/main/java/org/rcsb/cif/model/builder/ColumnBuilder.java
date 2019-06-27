package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

/**
 * Shared functionality of column building instances.
 * @param <P> type of the parent builder, so that upon leaving the concrete instance can be provided (rather than a
 *           generic category builder)
 */
public abstract class ColumnBuilder<P extends CategoryBuilder> {
    private final String categoryName;
    private final String columnName;
    final List<ValueKind> mask;
    final P parent;

    /**
     * Create a new ColumnBuilder instance.
     * @param categoryName the parent category name
     * @param columnName this column name
     * @param parent the parent instance - can be <code>null</code>, but {@link ColumnBuilder#leaveColumn()} will throw
     *               an exception if invoked
     */
    ColumnBuilder(String categoryName, String columnName, P parent) {
        this.categoryName = categoryName;
        this.columnName = columnName;
        this.mask = new ArrayList<>();
        this.parent = parent;
        this.parent.registerChild(this);
    }

    /**
     * The name of the parent category.
     * @return a String
     */
    String getCategoryName() {
        return categoryName;
    }

    /**
     * The name of this column.
     * @return a String
     */
    String getColumnName() {
        return columnName;
    }

    /**
     * The mask of this column.
     * @return a list of ValueKind values
     */
    List<ValueKind> getMask() {
        return mask;
    }

    /**
     * Values in CifFile instances can be present, not present (.), or unknown (?). Stores an empty value in the value
     * list and marks this row as not present.
     * @return this builder instance
     */
    public abstract ColumnBuilder<P> markNextNotPresent();

    /**
     * Values in CifFile instances can be present, not present (.), or unknown (?). Stores an empty value in the value
     * list and marks this row as unknown.
     * @return this builder instance
     */
    public abstract ColumnBuilder<P> markNextUnknown();

    /**
     * Build this instance, ignoring parent information.
     * @return the Column
     */
    public abstract Column build();

    /**
     * Leave this column and return to the parent builder.
     * @return the parent builder
     */
    public abstract P leaveColumn();
}
