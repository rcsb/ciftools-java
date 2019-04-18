package org.rcsb.cif.model;

import java.util.List;

public class BinaryFile implements CifFile {
    private final List<BlockImpl> blocks;
    private final String version;
    private final String encoder;

    public BinaryFile(List<BlockImpl> blocks, String version, String encoder) {
        this.blocks = blocks;
        this.version = version;
        this.encoder = encoder;
    }

    @Override
    public List<BlockImpl> getBlocks() {
        return blocks;
    }

    public String getVersion() {
        return version;
    }

    public String getEncoder() {
        return encoder;
    }
}
