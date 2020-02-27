package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.SchemaSupportingBlock;
import org.rcsb.cif.model.Block;

public class MmCifBlock extends SchemaSupportingBlock {
    public MmCifBlock(Block block) {
        super(block);
    }

    public AtomSite getAtomSite() {
        return delegate.getCategory("atom_site", AtomSite::new);
    }
}
