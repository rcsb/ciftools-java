package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;

/**
 * Builds a String column, data type cannot change, all subsequent values must be Strings.
 * @param <P> the type of the parent builder
 */
public class StrColumnBuilder<P extends CategoryBuilder> extends ColumnBuilder<P> {
    private final List<String> values;

    public StrColumnBuilder(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    List<String> getValues() {
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
    public StrColumn build() {
        return CategoryBuilder.createColumnText(getColumnName(), values, mask, StrColumn.class);
    }

    @Override
    public P leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        return parent.digest(this);
    }

    /**
     * Add an arbitrary number of String values to this column.
     * @param value 0...n String values
     * @return this builder instance
     */
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
