package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.Arrays;

public class DelegatingColumn<T> implements Column<T> {
    protected final Column<?> delegate;
    protected final Class<T> type;
    protected T array;

    @SuppressWarnings("unchecked")
    public DelegatingColumn(Column<?> delegate) {
        this(delegate, (Class<T>) String[].class);
    }

    public DelegatingColumn(Column<?> delegate, Class<T> type) {
        this.delegate = delegate;
        this.type = type;
    }

    @Override
    public String getColumnName() {
        return delegate.getColumnName();
    }

    @Override
    public int getRowCount() {
        return delegate.getRowCount();
    }

    @Override
    public String getStringData(int row) {
        return delegate.getStringData(row);
    }

    @Override
    public ValueKind getValueKind(int row) {
        return delegate.getValueKind(row);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getArray() {
        if (array == null) {
            Object raw = delegate.getArray();
            // 1st condition: type matches expectation, 2nd check: empty column?
            array = (type.isInstance(raw)) ? (T) raw : (raw != null) ? forceType(raw) : null;
        }
        return array;
    }

    @SuppressWarnings("unchecked")
    private T forceType(Object array) {
        if (type.equals(double[].class)) {
            return (T) forceFloatType(array);
        } else if (type.equals(int[].class)) {
            return (T) forceIntType(array);
        } else {
            return (T) forceStrType(array);
        }
    }

    private double[] forceFloatType(Object array) {
        if (array instanceof int[]) {
            int[] typed = (int[]) array;
            return Arrays.stream(typed)
                    .mapToDouble(i -> i)
                    .toArray();
        } else {
            String[] typed = (String[]) array;
            return Arrays.stream(typed)
                    .mapToDouble(FloatColumn::parseFloat)
                    .toArray();
        }
    }

    private int[] forceIntType(Object array) {
        if (array instanceof double[]) {
            double[] typed = (double[]) array;
            return Arrays.stream(typed)
                    .mapToInt(d -> (int) d)
                    .toArray();
        } else {
            String[] typed = (String[]) array;
            return Arrays.stream(typed)
                    .mapToInt(IntColumn::parseInt)
                    .toArray();
        }
    }

    private String[] forceStrType(Object array) {
        if (array instanceof int[]) {
            int[] typed = (int[]) array;
            return Arrays.stream(typed)
                    .mapToObj(Integer::toString)
                    .toArray(String[]::new);
        } else {
            double[] typed = (double[]) array;
            return Arrays.stream(typed)
                    .mapToObj(Double::toString)
                    .toArray(String[]::new);
        }
    }
}
