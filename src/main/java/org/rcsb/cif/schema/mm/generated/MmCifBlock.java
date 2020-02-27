package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.AbstractBlock;
import org.rcsb.cif.model.Block;

public class MmCifBlock extends AbstractBlock {
    public MmCifBlock(Block block) {
        super(block);
    }

    public AtomSite getAtomSite() {
        return delegate.getCategory("atom_site", AtomSite::new);
    }
}
