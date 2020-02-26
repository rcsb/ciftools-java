package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * The abstraction of binary data.
 */
public class ByteArray extends AbstractEncodedData<byte[]> {
    public ByteArray(byte[] data) {
        this(data, new ArrayDeque<>());
    }

    public ByteArray(byte[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    @Override
    public byte[] getData() {
        return (byte[]) data;
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }

    public <T extends NumberArray<?>> T decode(ByteArrayEncoding<T> encoding) {
        return encoding.decode(this);
    }

    public StringArray decode(StringArrayEncoding encoding) {
        return encoding.decode(this);
    }
}
