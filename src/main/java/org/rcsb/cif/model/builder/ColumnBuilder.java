package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

import java.util.List;

public interface ColumnBuilder<P extends CategoryBuilder> {
    ColumnBuilder markNextNotPresent();

    ColumnBuilder markNextUnknown();

    String getCategoryName();

    String getColumnName();

    List<ValueKind> getMask();

    Column build();

    P leaveColumn();
}
