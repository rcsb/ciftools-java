package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.ByteArrayEncoding;

/**
 * An array of numbers.
 */
public interface NumberArray<D> extends EncodedData<D> {
    byte[] toByteArray();

    int getNumberOfBytes();

    int getType();

    default ByteArray encode(ByteArrayEncoding encoding) {
        return encoding.encode(this);
    }
}
