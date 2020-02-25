package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.data.EncodedData;

/**
 * Represents a single encoding or decoding step for a column.
 * @param <H> the 'high'-level array of data (think {@link org.rcsb.cif.binary.data.StringArray})
 * @param <L> the 'low'-level array of data (think {@link org.rcsb.cif.binary.data.ByteArray})
 */
public interface Encoding<H extends EncodedData<?>, L extends EncodedData<?>> {
    /**
     * The name of this encoding. Used for serialization and to retrieve the necessary {@link BinaryCifCodec} implementations.
     * @return a String representing the name of this encoding
     */
    String getKind();

    /**
     * Move one step up the encoding deque. One step closer to the original representation of the data.
     * @param data the container to decode
     * @return the decoded information
     */
    H decode(L data);

    /**
     * Move one step down the encoding deque. One step closer to a {@link org.rcsb.cif.binary.data.ByteArray}
     * representation.
     * @param data the container to encode
     * @return the decoded information
     */
    L encode(H data);
}