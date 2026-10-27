package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.IntColumnBuilder;
import org.rcsb.cif.model.ValueKind;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IntColumnBuilderImpl<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder>
        extends ColumnBuilderImpl<P, PP, PPP> implements IntColumnBuilder<P, PP, PPP> {
    // rows without a value hold 0
    private int[] values;

    public IntColumnBuilderImpl(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new int[16];
    }

    /**
     * A read-only view of the values added so far.
     * @return the values, null for rows without a value
     */
    @Override
    public List<Integer> getValues() {
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
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

    private void append(int value, ValueKind kind) {
        ensureCapacity(rowCount() + 1);
        values[rowCount()] = value;
        appendKind(kind);
    }

    @Override
    public IntColumnBuilder<P, PP, PPP> markNextNotPresent() {
        append(0, ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public IntColumnBuilder<P, PP, PPP> markNextUnknown() {
        append(0, ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public IntColumn build() {
        return new BuiltIntColumn(getColumnName(), Arrays.copyOf(values, rowCount()), maskOrdinals());
    }

    @Override
    public IntColumnBuilder<P, PP, PPP> add(int... values) {
        ensureCapacity(rowCount() + values.length);
        System.arraycopy(values, 0, this.values, rowCount(), values.length);
        appendPresent(values.length);
        return this;
    }

    @Override
    public IntColumnBuilder<P, PP, PPP> addMasked(int[] values, ValueKind[] mask) {
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
    public IntColumnBuilder<P, PP, PPP> addNullable(Iterable<Integer> values) {
        Objects.requireNonNull(values, "values");
        for (Integer v : values) {
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
