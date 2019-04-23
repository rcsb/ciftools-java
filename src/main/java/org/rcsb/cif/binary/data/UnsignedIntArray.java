package org.rcsb.cif.binary.data;

/**
 * A subset of data arrays is unsigned. This information is valuable and necessary for de- and encoding.
 */
public interface UnsignedIntArray extends IntArray {
    /**
     * States whether this IntArray contains signed elements.
     * @return true for Int8Array, Int16Array, and Int32Array
     */
    default boolean isSigned() {
        return false;
    }
}
