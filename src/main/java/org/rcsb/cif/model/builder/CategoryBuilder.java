package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.text.TextCategory;
import org.rcsb.cif.model.text.TextColumn;
import org.rcsb.cif.schema.DelegatingFloatColumn;
import org.rcsb.cif.schema.DelegatingIntColumn;
import org.rcsb.cif.schema.DelegatingStrColumn;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CategoryBuilder<P extends BlockBuilder<PP>, PP extends CifFileBuilder> {
    private final String categoryName;
    private final Map<String, Column> columns;
    private final P parent;
    private final List<ColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP>> pendingDigests;
    private final List<ColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP>> finishedDigests;

    public CategoryBuilder(String categoryName, P parent) {
        this.categoryName = categoryName;
        this.columns = new LinkedHashMap<>();
        this.parent = parent;
        this.pendingDigests = new ArrayList<>();
        this.finishedDigests = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Map<String, Column> getColumns() {
        return columns;
    }

    @SuppressWarnings("unchecked")
    public P leaveCategory() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave category with undefined parent block");
        }

        // if children are not digested yet (what a sentence), do so
        pendingDigests.stream()
                .filter(child -> !finishedDigests.contains(child))
                .forEach(child -> {
                    if (child instanceof IntColumnBuilder) {
                        digest((IntColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP>) child);
                    } else if (child instanceof FloatColumnBuilder) {
                        digest((FloatColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP>) child);
                    } else {
                        digest((StrColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP>) child);
                    }
                });

        return parent.digest(this);
    }

    public Category build() {
        return new TextCategory(categoryName, columns);
    }

    public CategoryBuilder<P, PP> addColumn(Column column) {
        columns.put(column.getColumnName(), column);
        return this;
    }

    @SuppressWarnings("unchecked")
    static <C extends Column> C createColumnText(String columnName, List<?> values, List<ValueKind> mask, Class<C> hint) {
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

    public CategoryBuilder<P, PP> digest(IntColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder) {
        columns.put(columnBuilder.getColumnName(),
                createColumnText(columnBuilder.getColumnName(),
                        columnBuilder.getValues(),
                        columnBuilder.getMask(),
                        IntColumn.class));
        finishedDigests.add(columnBuilder);
        return this;
    }

    public CategoryBuilder<P, PP> digest(FloatColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder) {
        columns.put(columnBuilder.getColumnName(),
                createColumnText(columnBuilder.getColumnName(),
                        columnBuilder.getValues(),
                        columnBuilder.getMask(),
                        FloatColumn.class));
        finishedDigests.add(columnBuilder);
        return this;
    }

    public CategoryBuilder<P, PP> digest(StrColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder) {
        columns.put(columnBuilder.getColumnName(),
                createColumnText(columnBuilder.getColumnName(),
                        columnBuilder.getValues(),
                        columnBuilder.getMask(),
                        StrColumn.class));
        finishedDigests.add(columnBuilder);
        return this;
    }

    public IntColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterIntColumn(String columnName) {
        return new IntColumnBuilder<>(getCategoryName(), columnName, this);
    }

    public FloatColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterFloatColumn(String columnName) {
        return new FloatColumnBuilder<>(getCategoryName(), columnName, this);
    }

    public StrColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterStrColumn(String columnName) {
        return new StrColumnBuilder<>(getCategoryName(), columnName, this);
    }

    public void registerChild(ColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder) {
        pendingDigests.add(columnBuilder);
    }
}
