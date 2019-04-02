package org.rcsb.cif.reader.binary.codec;

import java.util.Objects;
import java.util.function.Function;

public interface Codec<P, E, M extends CodecParameters> {
    E encode(P input);

    P decode(E input);

    M getParameters();

    default <V> Function<P, V> andThenEncode(Codec<? super E, ? extends V, ? extends CodecParameters> after) {
        Objects.requireNonNull(after);
        return (P t) -> after.encode(encode(t));
    }
}
