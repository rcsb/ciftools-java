package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;

import java.util.LinkedList;

public abstract class AbstractEncodedData<D> implements EncodedData<D> {
    protected final Object data;
    private LinkedList<Encoding> encoding;

    AbstractEncodedData(Object data, LinkedList<Encoding> encoding) {
        this.data = data;
        this.encoding = encoding;
    }

    @Override
    public LinkedList<Encoding> getEncoding() {
        return encoding;
    }

    @Override
    public void setEncoding(LinkedList<Encoding> encoding) {
        this.encoding = encoding;
    }

    @Override
    public boolean hasNextDecodingStep() {
        return getEncoding().size() > 0;
    }
}
