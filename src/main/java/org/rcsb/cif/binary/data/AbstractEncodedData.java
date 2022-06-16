package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;

import java.util.Deque;

/**
 * Shared functionality between {@link EncodedData} implementations.
 * @param <D> the data array wrapped
 */
abstract class AbstractEncodedData<D> implements EncodedData<D> {
    final Object data;
    private Deque<Encoding<?, ?>> encoding;

    AbstractEncodedData(Object data, Deque<Encoding<?, ?>> encoding) {
        this.data = data;
        this.encoding = encoding;
    }

    @Override
    public Deque<Encoding<?, ?>> getEncoding() {
        return encoding;
    }

    @Override
    public void setEncoding(Deque<Encoding<?, ?>> encoding) {
        this.encoding = encoding;
    }

    @Override
    public boolean hasNextDecodingStep() {
        return !getEncoding().isEmpty();
    }
}
