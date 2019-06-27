package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Builds a int column, data type cannot change, all subsequent values must be ints.
 * @param <P> the type of the parent builder
 */
public class IntColumnBuilder<P extends CategoryBuilder> extends ColumnBuilder<P> {
    private final List<Integer> values;

    public IntColumnBuilder(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    List<Integer> getValues() {
        return values;
    }

    @Override
    public IntColumnBuilder<P> markNextNotPresent() {
        values.add(0);
        mask.add(ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public IntColumnBuilder<P> markNextUnknown() {
        values.add(0);
        mask.add(ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public IntColumn build() {
        return (IntColumn) CategoryBuilder.createColumnText(getCategoryName(), getColumnName(), values, mask, IntColumn.class);
    }

    @Override
    public P leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        return parent.digest(this);
    }

    /**
     * Add an arbitrary number of int values to this column.
     * @param value 0...n int values
     * @return this builder instance
     */
    public IntColumnBuilder<P> add(int... value) {
        IntStream.of(value).forEach(values::add);
        IntStream.range(0, value.length).mapToObj(i -> ValueKind.PRESENT).forEach(mask::add);
        return this;
    }
}
