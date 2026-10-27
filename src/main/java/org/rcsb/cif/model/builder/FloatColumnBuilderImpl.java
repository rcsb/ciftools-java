package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.FloatColumnBuilder;
import org.rcsb.cif.model.ValueKind;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FloatColumnBuilderImpl<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder>
        extends ColumnBuilderImpl<P, PP, PPP> implements FloatColumnBuilder<P, PP, PPP> {
    // rows without a value hold 0
    private double[] values;

    public FloatColumnBuilderImpl(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new double[16];
    }

    /**
     * A read-only view of the values added so far.
     * @return the values, null for rows without a value
     */
    @Override
    public List<Double> getValues() {
        return new AbstractList<Double>() {
            @Override
            public Double get(int index) {
                Objects.checkIndex(index, rowCount());
                return valueKind(index) == ValueKind.PRESENT ? values[index] : null;
            }

            @Override
            public int size() {
                return rowCount();
            }
        };
    }

    private void ensureCapacity(int rows) {
        if (rows > values.length) {
            values = Arrays.copyOf(values, newCapacity(values.length, rows));
        }
    }

    private void append(double value, ValueKind kind) {
        ensureCapacity(rowCount() + 1);
        values[rowCount()] = value;
        appendKind(kind);
    }

    @Override
    public FloatColumnBuilder<P, PP, PPP> markNextNotPresent() {
        append(0, ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public FloatColumnBuilder<P, PP, PPP> markNextUnknown() {
        append(0, ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public FloatColumn build() {
        return new BuiltFloatColumn(getColumnName(), Arrays.copyOf(values, rowCount()), maskOrdinals());
    }

    @Override
    public FloatColumnBuilder<P, PP, PPP> add(double... values) {
        ensureCapacity(rowCount() + values.length);
        System.arraycopy(values, 0, this.values, rowCount(), values.length);
        appendPresent(values.length);
        return this;
    }

    @Override
    public FloatColumnBuilder<P, PP, PPP> addMasked(double[] values, ValueKind[] mask) {
        Objects.requireNonNull(values, "values");
        Objects.requireNonNull(mask, "mask");
        if (values.length != mask.length) {
            throw new IllegalArgumentException("values.length (" + values.length + ") must equal mask.length (" + mask.length + ")");
        }

        ensureCapacity(rowCount() + values.length);
        for (int i = 0; i < values.length; i++) {
            ValueKind kind = Objects.requireNonNull(mask[i], "mask[" + i + "]");
            append(kind == ValueKind.PRESENT ? values[i] : 0, kind);
        }
        return this;
    }

    @Override
    public FloatColumnBuilder<P, PP, PPP> addNullable(Iterable<Double> values) {
        Objects.requireNonNull(values, "values");
        for (Double v : values) {
            if (v == null) {
                markNextNotPresent();
            } else {
                append(v, ValueKind.PRESENT);
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
