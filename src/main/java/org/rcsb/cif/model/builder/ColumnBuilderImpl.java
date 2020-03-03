package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.ColumnBuilder;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

public abstract class ColumnBuilderImpl<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> implements ColumnBuilder<P, PP, PPP> {
    private final String categoryName;
    private final String columnName;
    final List<ValueKind> mask;
    final P parent;

    ColumnBuilderImpl(String categoryName, String columnName, P parent) {
        this.categoryName = categoryName;
        this.columnName = columnName;
        this.mask = new ArrayList<>();
        this.parent = parent;
        if (parent != null) {
            // make parent aware of its child, so that when parent category is closed, all child information can be collected
            this.parent.registerChild(this);
        }
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public List<ValueKind> getMask() {
        return mask;
    }
}
