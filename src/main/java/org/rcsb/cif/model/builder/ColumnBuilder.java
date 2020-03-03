package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

public abstract class ColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> {
    private final String categoryName;
    private final String columnName;
    final List<ValueKind> mask;
    final P parent;

    ColumnBuilder(String categoryName, String columnName, P parent) {
        this.categoryName = categoryName;
        this.columnName = columnName;
        this.mask = new ArrayList<>();
        this.parent = parent;
        if (parent != null) {
            // make parent aware of its child, so that when parent category is closed, all child information can be collected
            this.parent.registerChild(this);
        }
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getColumnName() {
        return columnName;
    }

    public List<ValueKind> getMask() {
        return mask;
    }

    public abstract ColumnBuilder<P, PP, PPP> markNextNotPresent();

    public abstract ColumnBuilder<P, PP, PPP> markNextUnknown();

    public abstract Column build();

    public abstract P leaveColumn();
}
