package org.rcsb.cif.binary.data;

/**
 * A subset of data arrays is unsigned. This information is valuable and necessary for de- and encoding.
 */
public interface UnsignedIntArray extends IntArray {
    /**
     * States whether this {@link IntArray} contains signed elements.
     * @return true for {@link Int8Array}, {@link Int16Array}, and {@link Int32Array}
     */
    default boolean isSigned() {
        return false;
    }
}
