package org.rcsb.cif.model;

import org.rcsb.cif.model.generated.CifBlock;

import java.util.List;

public class BinaryCifFile implements CifFile {
    private final List<CifBlock> blocks;
    private final String version;
    private final String encoder;

    public BinaryCifFile(List<CifBlock> blocks, String version, String encoder) {
        this.blocks = blocks;
        this.version = version;
        this.encoder = encoder;
    }

    @Override
    public List<CifBlock> getBlocks() {
        return blocks;
    }

    public String getVersion() {
        return version;
    }

    public String getEncoder() {
        return encoder;
    }
}
