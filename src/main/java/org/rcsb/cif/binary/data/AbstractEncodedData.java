package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;

public abstract class AbstractEncodedData<D> implements EncodedData<D> {
    final Object data;
    private Encoding[] encoding;

    AbstractEncodedData(Object data, Encoding[] encoding) {
        this.data = data;
        this.encoding = encoding;
    }

    @Override
    public Encoding[] getEncoding() {
        return encoding;
    }

    @Override
    public void setEncoding(Encoding[] encoding) {
        this.encoding = encoding;
    }

    @Override
    public boolean hasNextDecodingStep() {
        return getEncoding().length > 0;
    }
}
