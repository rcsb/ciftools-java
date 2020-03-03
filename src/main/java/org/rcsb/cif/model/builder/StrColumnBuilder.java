package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

public class StrColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    private final List<String> values;

    public StrColumnBuilder(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public StrColumnBuilder<P, PP, PPP> markNextNotPresent() {
        values.add(".");
        mask.add(ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public StrColumnBuilder<P, PP, PPP> markNextUnknown() {
        values.add("?");
        mask.add(ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public StrColumn build() {
        return CategoryBuilder.createColumnText(getColumnName(), values, mask, StrColumn.class);
    }

    public StrColumnBuilder<P, PP, PPP> add(String... values) {
        for (String s : values) {
            if (".".equals(s)) {
                markNextNotPresent();
            } else if ("?".equals(s)) {
                markNextUnknown();
            } else {
                this.values.add(s);
                mask.add(ValueKind.PRESENT);
            }
        }
        return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public P leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        return (P) parent.digest(this);
    }
}
