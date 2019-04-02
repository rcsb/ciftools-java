package org.rcsb.cif.reader.binary.codec;

public abstract class AbstractCodec<P, E, M extends CodecParameters> implements Codec<P, E, M> {
    private final M parameters;

    public AbstractCodec(M parameters) {
        this.parameters = parameters;
    }

    @Override
    public M getParameters() {
        return parameters;
    }
}
