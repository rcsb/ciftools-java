package org.rcsb.cif.model;

import java.util.List;

public class BaseBinaryFile<B extends Block> implements BinaryFile<B> {
    private final List<B> blocks;
    private final String version;
    private final String encoder;

    public BaseBinaryFile(List<B> blocks, String version, String encoder) {
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
