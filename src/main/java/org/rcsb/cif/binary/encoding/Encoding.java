package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.data.EncodedData;

/**
 * Represents a single encoding or decoding step for a column.
 */
public interface Encoding<E extends EncodedData> {
    /**
     * The name of this encoding. Used for serialization and to retrieve the necessary Codec implementations.
     * @return a String representing the name of this encoding
     */
    String getKind();

    /**
     * Let this Encoding work its magic and decode some data.
     * @param current the container to decode
     * @return the decoded information
     */
    EncodedData decode(E current);
}