package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.DelegatingCifFile;

public class MmCifFile extends DelegatingCifFile<MmCifBlock> {
    public MmCifFile(CifFile delegate) {
        super(delegate);
    }

    @Override
    public MmCifBlock getTypedBlock() {
        return new MmCifBlock(delegate.getBlocks().get(0));
    }
}
