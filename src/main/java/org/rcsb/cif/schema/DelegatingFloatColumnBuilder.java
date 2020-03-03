package org.rcsb.cif.schema;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.FloatColumnBuilder;

public class DelegatingFloatColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder>
        extends DelegatingColumnBuilder<P, PP, PPP> implements FloatColumnBuilder<P, PP, PPP> {
    public DelegatingFloatColumnBuilder(FloatColumnBuilder<P, PP, PPP> delegate) {
        super(delegate);
    }
}
