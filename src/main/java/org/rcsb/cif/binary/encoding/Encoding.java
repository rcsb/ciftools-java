package org.rcsb.cif.binary.encoding;

/**
 * Represents a single encoding or decoding step for a column.
 */
public abstract class Encoding {
    /**
     * The name of this encoding. Used for serialization and to retrieve the necessary Codec implementations.
     * @return a String representing the name of this encoding
     */
    public abstract String getKind();
}