package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.Arrays;

public class StringArray extends AbstractEncodedData<String[]> {
    public StringArray(Object data, Encoding[] encoding) {
        super(data, encoding);
    }

    StringArray(String[] data) {
        this(data, Encoding.EMPTY_ENCODING_ARRAY);
    }

    StringArray(String[] data, Encoding[] encoding) {
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
        return Codec.STRING_ARRAY_CODEC.encode(this, encoding);
    }
}
