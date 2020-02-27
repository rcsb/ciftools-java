package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.schema.DelegatingBlock;
import org.rcsb.cif.model.Block;

public class MmCifBlock extends DelegatingBlock {
    public MmCifBlock(Block block) {
        super(block);
    }

    public AtomSite getAtomSite() {
        return delegate.getCategory("atom_site", AtomSite::new);
    }
}
