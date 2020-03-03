package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.StrColumnBuilder;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

import static org.rcsb.cif.model.CategoryBuilder.createColumnText;

public class StrColumnBuilderImpl<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder>
        extends ColumnBuilderImpl<P, PP, PPP> implements StrColumnBuilder<P, PP, PPP> {
    private final List<String> values;

    public StrColumnBuilderImpl(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    @Override
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
        return createColumnText(getColumnName(), values, mask, StrColumn.class);
    }

    @Override
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
    public P leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        parent.digest(this);
        return parent;
    }
}
