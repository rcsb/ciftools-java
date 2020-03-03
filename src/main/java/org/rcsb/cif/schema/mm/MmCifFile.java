package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.DelegatingCifFile;

public class MmCifFile extends DelegatingCifFile<MmCifBlock> {
    public MmCifFile(CifFile delegate) {
        super(delegate);
    }

    @Override
    protected MmCifBlock getTypedBlock(Block block) {
        return new MmCifBlock(block);
    }
}
