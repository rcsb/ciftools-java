package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.binary.BinaryColumn;
import org.rcsb.cif.model.binary.BinaryFloatColumn;
import org.rcsb.cif.model.binary.BinaryIntColumn;
import org.rcsb.cif.model.binary.BinaryStrColumn;

import java.util.stream.IntStream;

public class DelegatingIntColumn extends DelegatingColumn implements IntColumn {
    public DelegatingIntColumn(Column delegate) {
        super(delegate);
    }

    @Override
    public int get(int row) {
        if (delegate instanceof BinaryColumn) {
            if (delegate instanceof BinaryIntColumn) {
                return ((BinaryIntColumn) delegate).getBinaryDataUnsafe()[row];
            } else if (delegate instanceof BinaryFloatColumn) {
                return (int) ((BinaryFloatColumn) delegate).getBinaryDataUnsafe()[row];
            } else {
                return IntColumn.parseInt(((BinaryStrColumn) delegate).getBinaryDataUnsafe()[row]);
            }
        } else {
            return IntColumn.parseInt(delegate.getStringData(row));
        }
    }

    @Override
    public IntStream values() {
        if (delegate instanceof BinaryColumn) {
            if (delegate instanceof BinaryIntColumn) {
                return ((BinaryIntColumn) delegate).values();
            } else if (delegate instanceof BinaryFloatColumn) {
                return ((BinaryFloatColumn) delegate).values()
                        .mapToInt(i -> (int) i);
            } else {
                return ((BinaryStrColumn) delegate).values()
                        .mapToInt(IntColumn::parseInt);
            }
        } else {
            // for text: nothing much to gain
            return IntColumn.super.values();
        }
    }
}
