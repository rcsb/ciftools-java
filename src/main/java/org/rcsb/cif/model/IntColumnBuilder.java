package org.rcsb.cif.model;

import java.util.List;

public interface IntColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    List<Integer> getValues();

    IntColumn build();

    IntColumnBuilder<P, PP, PPP> add(int... values);
}
