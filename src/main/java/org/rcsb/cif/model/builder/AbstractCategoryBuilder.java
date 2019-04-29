package org.rcsb.cif.model.builder;

import org.rcsb.cif.internal.ModelFactory;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

import java.util.List;
import java.util.Map;

public abstract class AbstractCategoryBuilder implements CategoryBuilder {
    private final String categoryName;
    private final Map<String, Column> columns;
    private final BlockBuilder parent;

    AbstractCategoryBuilder(String categoryName, Map<String, Column> columns, BlockBuilder parent) {
        this.categoryName = categoryName;
        this.columns = columns;
        this.parent = parent;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public Map<String, Column> getColumns() {
        return columns;
    }

    @Override
    public BlockBuilder leaveCategory() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave category with undefined parent block");
        }
        return parent.digest(this);
    }

    @Override
    public Category build() {
        return ModelFactory.createCategoryText(categoryName, columns);
    }

    @Override
    public CategoryBuilder addColumn(Column column) {
        columns.put(column.getColumnName(), column);
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

    @Override
    public CategoryBuilder digest(IntColumnBuilder intColumnBuilder) {
        columns.put(intColumnBuilder.getColumnName(), createColumnText(categoryName, intColumnBuilder.getColumnName(),
                intColumnBuilder.getValues(), intColumnBuilder.getMask()));
        return this;
    }

    @Override
    public CategoryBuilder digest(FloatColumnBuilder floatColumnBuilder) {
        columns.put(floatColumnBuilder.getColumnName(), createColumnText(categoryName, floatColumnBuilder.getColumnName(),
                floatColumnBuilder.getValues(), floatColumnBuilder.getMask()));
        return this;
    }

    @Override
    public CategoryBuilder digest(StrColumnBuilder strColumnBuilder) {
        columns.put(strColumnBuilder.getColumnName(), createColumnText(categoryName, strColumnBuilder.getColumnName(),
                strColumnBuilder.getValues(), strColumnBuilder.getMask()));
        return this;
    }
}
