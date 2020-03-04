package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ColumnBuilder;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.FloatColumnBuilder;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.IntColumnBuilder;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.StrColumnBuilder;
import org.rcsb.cif.model.text.TextCategory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.rcsb.cif.model.CategoryBuilder.createColumnText;

public class CategoryBuilderImpl<P extends BlockBuilder<PP>, PP extends CifFileBuilder> implements CategoryBuilder<P, PP> {
    private final String categoryName;
    private final Map<String, Column<?>> columns;
    protected final P parent;
    private final List<ColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP>> pendingDigests;
    private final List<ColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP>> finishedDigests;

    public CategoryBuilderImpl(String categoryName, P parent) {
        this.categoryName = categoryName;
        this.columns = new LinkedHashMap<>();
        this.parent = parent;
        this.pendingDigests = new ArrayList<>();
        this.finishedDigests = new ArrayList<>();
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public Map<String, Column<?>> getColumns() {
        return columns;
    }

    @SuppressWarnings("unchecked")
    @Override
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

        parent.digest(this);
        return parent;
    }

    @Override
    public Category build() {
        return new TextCategory(categoryName, columns);
    }

    @Override
    public CategoryBuilder<P, PP> addColumn(Column<?> column) {
        columns.put(column.getColumnName(), column);
        return this;
    }

    @Override
    public void digest(IntColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder) {
        columns.put(columnBuilder.getColumnName(),
                createColumnText(columnBuilder.getColumnName(),
                        columnBuilder.getValues(),
                        columnBuilder.getMask(),
                        IntColumn.class));
        finishedDigests.add(columnBuilder);
    }

    @Override
    public void digest(FloatColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder) {
        columns.put(columnBuilder.getColumnName(),
                createColumnText(columnBuilder.getColumnName(),
                        columnBuilder.getValues(),
                        columnBuilder.getMask(),
                        FloatColumn.class));
        finishedDigests.add(columnBuilder);
    }

    @Override
    public void digest(StrColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder) {
        columns.put(columnBuilder.getColumnName(),
                createColumnText(columnBuilder.getColumnName(),
                        columnBuilder.getValues(),
                        columnBuilder.getMask(),
                        StrColumn.class));
        finishedDigests.add(columnBuilder);
    }

    @Override
    public IntColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterIntColumn(String columnName) {
        return new IntColumnBuilderImpl<>(getCategoryName(), columnName, this);
    }

    @Override
    public FloatColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterFloatColumn(String columnName) {
        return new FloatColumnBuilderImpl<>(getCategoryName(), columnName, this);
    }

    @Override
    public StrColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterStrColumn(String columnName) {
        return new StrColumnBuilderImpl<>(getCategoryName(), columnName, this);
    }

    @Override
    public void registerChild(ColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> builder) {
        pendingDigests.add(builder);
    }
}
