package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.ModelFactory;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Builds a category in a {@link org.rcsb.cif.model.Block}.
 */
public class CategoryBuilder {
    private final String categoryName;
    private final Map<String, Column> columns;
    private final BlockBuilder parent;
    private final List<ColumnBuilder<?>> pendingDigests;
    private final List<ColumnBuilder<?>> finishedDigests;

    /**
     * Create a CategoryBuilder instance.
     * @param categoryName the name of this category
     * @param parent the parent builder - can be <code>null</code>, but {@link CategoryBuilder#leaveCategory()} will
     *               throw an exception if invoked
     */
    public CategoryBuilder(String categoryName, BlockBuilder parent) {
        this.categoryName = categoryName;
        this.columns = new LinkedHashMap<>();
        this.parent = parent;
        this.pendingDigests = new ArrayList<>();
        this.finishedDigests = new ArrayList<>();
    }

    /**
     * The name of this category.
     * @return a String
     */
    String getCategoryName() {
        return categoryName;
    }

    /**
     * Associated columns.
     * @return the column map
     */
    Map<String, Column> getColumns() {
        return columns;
    }

    /**
     * Process all stored information and return to the BlockBuilder instance.
     * @return the parent builder
     */
    public BlockBuilder leaveCategory() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave category with undefined parent block");
        }

        // if children are not digested yet (what a sentence), do so
        pendingDigests.stream()
                .filter(child -> !finishedDigests.contains(child))
                .forEach(child -> {
                    if (child instanceof IntColumnBuilder<?>) {
                        digest((IntColumnBuilder<?>) child);
                    } else if (child instanceof FloatColumnBuilder<?>) {
                        digest((FloatColumnBuilder<?>) child);
                    } else {
                        digest((StrColumnBuilder<?>) child);
                    }
                });

        return parent.digest(this);
    }

    /**
     * Process all stored information and release a {@link Category} instance. Use
     * {@link CategoryBuilder#leaveCategory()} if you want to create a {@link CifFile} instance. Otherwise the block is
     * aware of this parent (and vice versa).
     * @return the created Category
     */
    public Category build() {
        return ModelFactory.createCategoryText(categoryName, columns);
    }

    /**
     * Add an arbitrary column and make this builder aware of it.
     * @param column the column to add
     * @return this CategoryBuilder instance
     */
    public CategoryBuilder addColumn(Column column) {
        columns.put(column.getColumnName(), column);
        return this;
    }

    /**
     * Convenience function to create column instances.
     * @param categoryName the category name
     * @param columnName the column name
     * @param values a list of int, double, or String values
     * @param mask a list of equal size, specifying ValueKinds
     * @param hint the class the column to create resembles
     * @return the create Column
     */
    static Column createColumnText(String categoryName,
                                   String columnName,
                                   List<?> values,
                                   List<ValueKind> mask,
                                   Class<? extends Column> hint) {
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

        return ModelFactory.createColumnText(categoryName, columnName, builder.toString(), startToken, endToken, hint);
    }

    /**
     * Package-private function to process the information of children.
     * @param intColumnBuilder the child builder to incorporate
     * @param <P> the type of the parent builder (this class)
     * @return the type-safe builder instance which was used to enter this column
     */
    @SuppressWarnings("unchecked")
    <P extends CategoryBuilder> P digest(IntColumnBuilder<P> intColumnBuilder) {
        columns.put(intColumnBuilder.getColumnName(),
                createColumnText(categoryName,
                        intColumnBuilder.getColumnName(),
                        intColumnBuilder.getValues(),
                        intColumnBuilder.getMask(),
                        IntColumn.class));
        finishedDigests.add(intColumnBuilder);
        return (P) this;
    }

    /**
     * Package-private function to process the information of children.
     * @param floatColumnBuilder the child builder to incorporate
     * @param <P> the type of the parent builder (this class)
     * @return the type-safe builder instance which was used to enter this column
     */
    @SuppressWarnings("unchecked")
    <P extends CategoryBuilder> P digest(FloatColumnBuilder<P> floatColumnBuilder) {
        columns.put(floatColumnBuilder.getColumnName(),
                createColumnText(categoryName,
                        floatColumnBuilder.getColumnName(),
                        floatColumnBuilder.getValues(),
                        floatColumnBuilder.getMask(),
                        FloatColumn.class));
        finishedDigests.add(floatColumnBuilder);
        return (P) this;
    }

    /**
     * Package-private function to process the information of children.
     * @param strColumnBuilder the child builder to incorporate
     * @param <P> the type of the parent builder (this class)
     * @return the type-safe builder instance which was used to enter this column
     */
    @SuppressWarnings("unchecked")
    <P extends CategoryBuilder> P digest(StrColumnBuilder<P> strColumnBuilder) {
        columns.put(strColumnBuilder.getColumnName(),
                createColumnText(categoryName,
                        strColumnBuilder.getColumnName(),
                        strColumnBuilder.getValues(),
                        strColumnBuilder.getMask(),
                        StrColumn.class));
        finishedDigests.add(strColumnBuilder);
        return (P) this;
    }

    /**
     * Enter an arbitrary IntColumn.
     * @param columnName the column name
     * @return an IntColumnBuilder
     */
    public IntColumnBuilder<CategoryBuilder> enterIntColumn(String columnName) {
        return new IntColumnBuilder<>(getCategoryName(), columnName, this);
    }

    /**
     * Enter an arbitrary FloatColumn.
     * @param columnName the column name
     * @return an FloatColumnBuilder
     */
    public FloatColumnBuilder<CategoryBuilder> enterFloatColumn(String columnName) {
        return new FloatColumnBuilder<>(getCategoryName(), columnName, this);
    }

    /**
     * Enter an arbitrary StrColumn.
     * @param columnName the column name
     * @return an StrColumnBuilder
     */
    public StrColumnBuilder<CategoryBuilder> enterStrColumn(String columnName) {
        return new StrColumnBuilder<>(getCategoryName(), columnName, this);
    }

    /**
     * This allows to automatically digest child column builders upon leaving this category.
     * @param childColumnBuilder the child to register
     */
    void registerChild(ColumnBuilder<?> childColumnBuilder) {
        pendingDigests.add(childColumnBuilder);
    }
}
