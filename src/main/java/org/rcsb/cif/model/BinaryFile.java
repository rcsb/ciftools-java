package org.rcsb.cif.model;

import java.util.List;

public class BinaryFile implements CifFile {
    private final List<Block> blocks;
    private final String version;
    private final String encoder;

    public BinaryFile(List<Block> blocks, String version, String encoder) {
        this.blocks = blocks;
        this.version = version;
        this.encoder = encoder;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    /**
     * Reports the version of this CifFile.
     * @return the version String
     */
    public String getVersion() {
        return version;
    }

    /**
     * Reports the encoder which created this CifFile.
     * @return the encoder String
     */
    public String getEncoder() {
        return encoder;
    }
}
