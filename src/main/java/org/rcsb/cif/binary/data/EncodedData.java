package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.encoding.Encoding;

import java.util.Deque;

/**
 * Data is always bundled with encoding information to handle de- and encoding.
 * @param <D> the array type this class wraps
 */
public interface EncodedData<D> {
    /**
     * Access to the underlying array of information.
     * @return an int[], double[], byte[], or String[]
     */
    D getData();

    /**
     * The number of elements in the wrapped array.
     * @return results of array.length
     */
    int length();

    /**
     * All encodings registered for this piece of EncodedData. May be empty. May contain only partial data: e.g. adding
     * a ByteArrayEncoding to the list will request encoding by ByteArrayCodec, this method call will subsequently fill
     * all fields of the requested Encoding to allow for decoding.
     * @return all associated Encoding instances
     */
    Deque<Encoding<?, ?>> getEncoding();

    default EncodedData<?> decode() {
        return BinaryCifCodec.decode(this);
    }

    /**
     * Replace this encoding chain with a different one.
     * @param encoding the new encoding chain for this instance
     */
    void setEncoding(Deque<Encoding<?, ?>> encoding);

    /**
     * Convenience method to state whether the List returned by {@link #getEncoding()} is not empty.
     * @return true if encoding steps are registered and need to be resolved to access decoded data
     */
    boolean hasNextDecodingStep();
}
