package org.rcsb.cif.model;

import java.util.List;

public interface CifFile {
    List<BlockImpl> getBlocks();

    default BlockImpl getFirstBlock() {
        return getBlocks().get(0);
    }
}
