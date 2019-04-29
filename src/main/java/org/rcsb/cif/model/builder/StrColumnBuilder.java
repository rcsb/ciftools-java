package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

public class StrColumnBuilder<P extends CategoryBuilder> extends ColumnBuilder<P> {
    private final List<String> values;

    public StrColumnBuilder(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    public List<String> getValues() {
        return values;
    }


    @Override
    public StrColumnBuilder<P> markNextNotPresent() {
        values.add(".");
        mask.add(ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public StrColumnBuilder<P> markNextUnknown() {
        values.add("?");
        mask.add(ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public Column build() {
        return CategoryBuilder.createColumnText(getCategoryName(), getColumnName(), values, mask);
    }

    @Override
    public P leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        return (P) parent.digest(this);
    }

    public StrColumnBuilder<P> add(String... value) {
        for (String s : value) {
            if (".".equals(s)) {
                markNextNotPresent();
            } else if ("?".equals(s)) {
                markNextUnknown();
            } else {
                values.add(s);
                mask.add(ValueKind.PRESENT);
            }
        }
        return this;
    }
}
