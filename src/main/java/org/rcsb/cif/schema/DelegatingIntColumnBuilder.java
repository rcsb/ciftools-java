package org.rcsb.cif.schema;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.IntColumnBuilder;

public class DelegatingIntColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder>
        extends DelegatingColumnBuilder<P, PP, PPP> implements IntColumnBuilder<P, PP, PPP> {
    public DelegatingIntColumnBuilder(IntColumnBuilder<P, PP, PPP> delegate) {
        super(delegate);
    }
}
