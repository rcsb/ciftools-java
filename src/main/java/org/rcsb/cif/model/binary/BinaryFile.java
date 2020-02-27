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

    public String getVersion() {
        return version;
    }

    public String getEncoder() {
        return encoder;
    }
}
