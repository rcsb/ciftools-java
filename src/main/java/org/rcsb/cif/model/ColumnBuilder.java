package org.rcsb.cif.model;

import java.util.List;

public interface ColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> {
    String getCategoryName();

    String getColumnName();

    List<ValueKind> getMask();

    ColumnBuilder<P, PP, PPP> markNextNotPresent();

    ColumnBuilder<P, PP, PPP> markNextUnknown();

    Column build();

    P leaveColumn();
}
