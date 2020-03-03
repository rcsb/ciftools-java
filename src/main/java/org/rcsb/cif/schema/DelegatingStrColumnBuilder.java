package org.rcsb.cif.schema;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.StrColumnBuilder;

public class DelegatingStrColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder>
        extends DelegatingColumnBuilder<P, PP, PPP> implements StrColumnBuilder<P, PP, PPP> {
    public DelegatingStrColumnBuilder(StrColumnBuilder<P, PP, PPP> delegate) {
        super(delegate);
    }
}
