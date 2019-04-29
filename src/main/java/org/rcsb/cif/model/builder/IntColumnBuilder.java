package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntColumnBuilder<P extends CategoryBuilder> extends AbstractColumnBuilder {
    private final List<Integer> values;

    public IntColumnBuilder(String categoryName, String columnName, CategoryBuilder parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    public List<Integer> getValues() {
        return values;
    }


    @Override
    public IntColumnBuilder markNextNotPresent() {
        values.add(0);
        mask.add(ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public IntColumnBuilder markNextUnknown() {
        values.add(0);
        mask.add(ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public Column build() {
        return AbstractCategoryBuilder.createColumnText(getCategoryName(), getColumnName(), values, mask);
    }

    @Override
    @SuppressWarnings("unchecked")
    public P leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        return (P) parent.digest(this);
    }

    public IntColumnBuilder add(int... value) {
        IntStream.of(value).forEach(values::add);
        IntStream.range(0, value.length).mapToObj(i -> ValueKind.PRESENT).forEach(mask::add);
        return this;
    }
}
