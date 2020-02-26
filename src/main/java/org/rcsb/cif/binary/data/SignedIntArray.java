package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.DeltaEncoding;

/**
 * An array of signed integer numbers.
 */
public interface SignedIntArray<T extends SignedIntArray<?>> extends IntArray {
    default boolean isSigned() {
        return true;
    }

    T encode(DeltaEncoding<T> encoding);

    T decode(DeltaEncoding<T> encoding);
}
