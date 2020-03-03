package org.rcsb.cif.schema;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.ColumnBuilder;

public class DelegatingColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> implements ColumnBuilder<P, PP, PPP> {
    protected final ColumnBuilder<P, PP, PPP> delegate;

    public DelegatingColumnBuilder(ColumnBuilder<P, PP, PPP> delegate) {
        this.delegate = delegate;
    }
}
