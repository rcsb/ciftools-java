package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.DelegatingCifFile;

public class CifCoreFile extends DelegatingCifFile<CifCoreBlock> {
    public CifCoreFile(CifFile delegate) {
        super(delegate);
    }

    @Override
    protected CifCoreBlock getTypedBlock(Block block) {
        return new CifCoreBlock(block);
    }
}