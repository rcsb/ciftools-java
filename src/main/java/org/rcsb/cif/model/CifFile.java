package org.rcsb.cif.model;

import java.util.List;

public interface CifFile {
    List<Block> getBlocks();

    default Block getFirstBlock() {
        return getBlocks().get(0);
    }
}
