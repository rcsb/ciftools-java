package org.rcsb.cif.binary.data;

/**
 * An array of numbers.
 * @param <D> the type of number array wrapped (int[] or double[])
 */
public interface NumberArray<D> extends EncodedData<D> {
    /**
     * Converts this number array to its binary representation.
     * @return a byte[]
     */
    byte[] toByteArray();

    /**
     * The number of bytes used in this representation to describe a single value (e.g. 1 for {@link Int8Array} and up
     * to 8 for {@link Float64Array}).
     * @return a number between 1 and 8
     */
    int getNumberOfBytes();

    /**
     * Report the type of this number array.
     * <ul>
     *     <li>1 for {@link Int8Array}</li>
     *     <li>2 for {@link Int16Array}</li>
     *     <li>3 for {@link Int32Array}</li>
     *     <li>4 for {@link Uint8Array}</li>
     *     <li>5 for {@link Uint16Array}</li>
     *     <li>6 for {@link Uint32Array}</li>
     *     <li>32 for {@link Float32Array}</li>
     *     <li>33 for {@link Float64Array}</li>
     * </ul>
     * @return 1, 2, 3, 4, 5, 6, 32, 33
     */
    int getType();

    /**
     * Encode this array of numbers directly as binary data (useful for single values that won't benefit from more
     * elaborate encoding chains).
     * @return a {@link ByteArray} with a single encoding step
     */
    ByteArray encode();
}
