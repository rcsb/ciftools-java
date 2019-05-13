package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Builds a float column, data type cannot change, all subsequent values must be floats.
 * @param <P> the type of the parent builder
 */
public class FloatColumnBuilder<P extends CategoryBuilder> extends ColumnBuilder<P> {
    private final List<Double> values;

    public FloatColumnBuilder(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    List<Double> getValues() {
        return values;
    }

    @Override
    public FloatColumnBuilder<P> markNextNotPresent() {
        values.add(0.0);
        mask.add(ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public FloatColumnBuilder<P> markNextUnknown() {
        values.add(0.0);
        mask.add(ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public FloatColumn build() {
        return (FloatColumn) CategoryBuilder.createColumnText(getCategoryName(), getColumnName(), values, mask);
    }

    @Override
    public P leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        return parent.digest(this);
    }

    /**
     * Add an arbitrary number of float values to this column.
     * @param value 0...n float values
     * @return this builder instance
     */
    public FloatColumnBuilder<P> add(double... value) {
        DoubleStream.of(value).forEach(values::add);
        IntStream.range(0, value.length).mapToObj(i -> ValueKind.PRESENT).forEach(mask::add);
        return this;
    }
}
