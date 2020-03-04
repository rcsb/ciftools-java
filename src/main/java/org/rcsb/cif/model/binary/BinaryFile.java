package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;

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
     * Reports the encoder version that was used to create this file.
     * @return a String
     */
    public String getVersion() {
        return version;
    }


    /**
     * Reports the encoder name that was used to create this file.
     * @return a String
     */
    public String getEncoder() {
        return encoder;
    }
}
