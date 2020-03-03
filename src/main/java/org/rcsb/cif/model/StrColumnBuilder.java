package org.rcsb.cif.model;

import java.util.List;

public interface StrColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    List<String> getValues();

    StrColumn build();

    IntColumnBuilder<P, PP, PPP> markNextNotPresent();

    IntColumnBuilder<P, PP, PPP> markNextUnknown();

    StrColumnBuilder<P, PP, PPP> add(String... values);
}
