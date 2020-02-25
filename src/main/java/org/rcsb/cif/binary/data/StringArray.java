package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of String values.
 */
public class StringArray extends AbstractEncodedData<String[]> {
    public StringArray(Object data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    public StringArray(String[] data) {
        this(data, new ArrayDeque<>());
    }

    StringArray(String[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    @Override
    public String[] getData() {
        return (String[]) data;
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }

    public ByteArray encode(StringArrayEncoding encoding) {
        return encoding.encode(this);
    }
}
