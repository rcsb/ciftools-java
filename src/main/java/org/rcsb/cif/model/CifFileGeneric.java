package org.rcsb.cif.model;

import java.util.List;
import java.util.stream.Stream;

public interface CifFileGeneric {

	List<BlockGeneric> getBlocks();

    /**
     * Convenience method to access the first block.
     * @return the first block of this file
     */
    default BlockGeneric getFirstBlock() {
        return getBlocks().get(0);
    }

    /**
     * Convenience method to access all blocks as Stream.
     * @return a Stream of all blocks
     */
    default Stream<BlockGeneric> blocks() {
        return getBlocks().stream();
    }

}
