package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.data.EncodedData;

/**
 * Represents a single encoding or decoding step for a column.
 */
public interface Encoding<H extends EncodedData<?>, L extends EncodedData<?>> {
    /**
     * The name of this encoding. Used for serialization and to retrieve the necessary {@link BinaryCifCodec} implementations.
     * @return a String representing the name of this encoding
     */
    String getKind();

    /**
     * Let this Encoding work its magic and decode some data.
     * @param data the container to decode
     * @return the decoded information
     */
    H decode(L data);

    L encode(H data);
}