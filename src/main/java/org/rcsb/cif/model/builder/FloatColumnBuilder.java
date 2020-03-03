package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FloatColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    private final List<Double> values;

    public FloatColumnBuilder(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    public List<Double> getValues() {
        return values;
    }

    @Override
    public FloatColumnBuilder<P, PP, PPP> markNextNotPresent() {
        values.add(0.0);
        mask.add(ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public FloatColumnBuilder<P, PP, PPP> markNextUnknown() {
        values.add(0.0);
        mask.add(ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public FloatColumn build() {
        return CategoryBuilder.createColumnText(getColumnName(), values, mask, FloatColumn.class);
    }

    public FloatColumnBuilder<P, PP, PPP> add(double... value) {
        DoubleStream.of(value).forEach(values::add);
        IntStream.range(0, value.length).mapToObj(i -> ValueKind.PRESENT).forEach(mask::add);
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
