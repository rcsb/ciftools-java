package org.rcsb.cif.schema;

import org.rcsb.cif.model.BinaryFile;
import org.rcsb.cif.model.Block;

import java.util.List;

public class SchemingBinaryFile<B extends Block> implements BinaryFile<B>, Scheming {
    private final List<B> blocks;
    private final String version;
    private final String encoder;

    public SchemingBinaryFile(List<B> blocks, String version, String encoder) {
        this.blocks = blocks;
        this.version = version;
        this.encoder = encoder;
    }

    @Override
    public List<B> getBlocks() {
        return blocks;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String getEncoder() {
        return encoder;
    }
}
