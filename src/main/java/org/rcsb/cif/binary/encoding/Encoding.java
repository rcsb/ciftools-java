package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.data.EncodedData;

import java.util.Map;

/**
 * Represents a single encoding or decoding step for a column.
 * @param <H> the 'high'-level array of data (think {@link org.rcsb.cif.binary.data.StringArray})
 * @param <L> the 'low'-level array of data (think {@link org.rcsb.cif.binary.data.ByteArray})
 */
public interface Encoding<H extends EncodedData<?>, L extends EncodedData<?>> {
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

    /**
     * Converts this encoding to its map representation that can be serialized as BinaryCif.
     * @return a Map that contains all encoding information
     */
    Map<String, Object> getMapRepresentation();
}