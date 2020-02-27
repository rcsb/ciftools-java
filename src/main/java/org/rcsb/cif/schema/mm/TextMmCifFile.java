package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.TextFile;
import org.rcsb.cif.schema.Scheming;

import java.util.List;
import java.util.stream.Collectors;

public class TextMmCifFile implements TextFile<MmCifBlock>, Scheming {
    private final List<MmCifBlock> blocks;

    public TextMmCifFile(TextFile<?> textFile) {
        this.blocks = textFile.blocks()
                .map(MmCifBlock::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<MmCifBlock> getBlocks() {
        return blocks;
    }
}
