package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    private final List<Integer> values;

    public IntColumnBuilder(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    public List<Integer> getValues() {
        return values;
    }

    @Override
    public IntColumnBuilder<P, PP, PPP> markNextNotPresent() {
        values.add(0);
        mask.add(ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public IntColumnBuilder<P, PP, PPP> markNextUnknown() {
        values.add(0);
        mask.add(ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public IntColumn build() {
        return CategoryBuilder.createColumnText(getColumnName(), values, mask, IntColumn.class);
    }

    public IntColumnBuilder<P, PP, PPP> add(int... values) {
        IntStream.of(values).forEach(this.values::add);
        IntStream.range(0, values.length).mapToObj(i -> ValueKind.PRESENT).forEach(mask::add);
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
