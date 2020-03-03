package org.rcsb.cif.model;

import java.util.List;

public interface FloatColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    List<Double> getValues();

    FloatColumn build();

    FloatColumnBuilder<P, PP, PPP> add(double... values);
}
