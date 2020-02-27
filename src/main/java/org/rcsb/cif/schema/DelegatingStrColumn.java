package org.rcsb.cif.schema;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.binary.BinaryColumn;
import org.rcsb.cif.model.binary.BinaryFloatColumn;
import org.rcsb.cif.model.binary.BinaryIntColumn;
import org.rcsb.cif.model.binary.BinaryStrColumn;

import java.util.stream.Stream;

public class DelegatingStrColumn extends DelegatingColumn implements StrColumn {
    public DelegatingStrColumn(Column delegate) {
        super(delegate);
    }

    @Override
    public String get(int row) {
        if (delegate instanceof BinaryColumn) {
            if (delegate instanceof BinaryStrColumn) {
                return ((BinaryStrColumn) delegate).getBinaryDataUnsafe()[row];
            } else if (delegate instanceof BinaryIntColumn) {
                return Integer.toString(((BinaryIntColumn) delegate).getBinaryDataUnsafe()[row]);
            } else {
                return Double.toString(((BinaryFloatColumn) delegate).getBinaryDataUnsafe()[row]);
            }
        } else {
            return delegate.getStringData(row);
        }
    }

    @Override
    public Stream<String> values() {
        if (delegate instanceof BinaryColumn) {
            if (delegate instanceof BinaryStrColumn) {
                return ((BinaryStrColumn) delegate).values();
            } else if (delegate instanceof BinaryFloatColumn) {
                return ((BinaryFloatColumn) delegate).values()
                        .mapToObj(Double::toString);
            } else {
                return ((BinaryIntColumn) delegate).values()
                        .mapToObj(Integer::toString);
            }
        } else {
            // for text: nothing much to gain
            return StrColumn.super.values();
        }
    }
}
