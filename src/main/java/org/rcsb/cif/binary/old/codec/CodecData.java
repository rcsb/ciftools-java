package org.rcsb.cif.binary.old.codec;

public class CodecData<T, M extends CodecParameters> {
    private final T data;
    private final M parameters;

    public CodecData(T data, M parameters) {
        this.data = data;
        this.parameters = parameters;
    }

    public T getData() {
        return data;
    }

    public M getParameters() {
        return parameters;
    }
}
