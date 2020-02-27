package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.binary.BinaryColumn;
import org.rcsb.cif.model.binary.BinaryFloatColumn;
import org.rcsb.cif.model.binary.BinaryIntColumn;
import org.rcsb.cif.model.binary.BinaryStrColumn;

import java.util.stream.DoubleStream;

public class DelegatingFloatColumn extends DelegatingColumn implements FloatColumn {
    public DelegatingFloatColumn(Column delegate) {
        super(delegate);
    }

    @Override
    public double get(int row) {
        if (delegate instanceof BinaryColumn) {
            if (delegate instanceof BinaryFloatColumn) {
                return ((BinaryFloatColumn) delegate).getBinaryDataUnsafe()[row];
            } else if (delegate instanceof BinaryIntColumn) {
                return ((BinaryIntColumn) delegate).getBinaryDataUnsafe()[row];
            } else {
                return FloatColumn.parseFloat(((BinaryStrColumn) delegate).getBinaryDataUnsafe()[row]);
            }
        } else {
            return FloatColumn.parseFloat(delegate.getStringData(row));
        }
    }

    @Override
    public DoubleStream values() {
        if (delegate instanceof BinaryColumn) {
            if (delegate instanceof BinaryFloatColumn) {
                return ((BinaryFloatColumn) delegate).values();
            } else if (delegate instanceof BinaryIntColumn) {
                return ((BinaryIntColumn) delegate).values()
                        .mapToDouble(i -> i);
            } else {
                return ((BinaryStrColumn) delegate).values()
                        .mapToDouble(FloatColumn::parseFloat);
            }
        } else {
            // for text: nothing much to gain
            return FloatColumn.super.values();
        }
    }
}
