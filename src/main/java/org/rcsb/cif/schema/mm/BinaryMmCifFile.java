package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.BinaryFile;
import org.rcsb.cif.schema.Scheming;

import java.util.List;
import java.util.stream.Collectors;

public class BinaryMmCifFile implements BinaryFile<MmCifBlock>, Scheming {
    private final List<MmCifBlock> blocks;
    private final String version;
    private final String encoder;

    public BinaryMmCifFile(BinaryFile<?> binaryFile) {
        this.blocks = binaryFile.blocks()
                .map(MmCifBlock::new)
                .collect(Collectors.toList());
        this.version = binaryFile.getVersion();
        this.encoder = binaryFile.getEncoder();
    }

    @Override
    public List<MmCifBlock> getBlocks() {
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
