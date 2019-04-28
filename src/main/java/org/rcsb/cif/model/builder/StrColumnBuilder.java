package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

public class StrColumnBuilder extends AbstractColumnBuilder {
    private final List<String> values;

    public StrColumnBuilder(String categoryName, String columnName, CategoryBuilder parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    public List<String> getValues() {
        return values;
    }


    @Override
    public StrColumnBuilder markNextNotPresent() {
        values.add(".");
        mask.add(ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public StrColumnBuilder markNextUnknown() {
        values.add("?");
        mask.add(ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public Column build() {
        return AbstractCategoryBuilder.createColumnText(getCategoryName(), getColumnName(), values, mask);
    }

    @Override
    public CategoryBuilder leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        return parent.digest(this);
    }

    public StrColumnBuilder add(String... value) {
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
