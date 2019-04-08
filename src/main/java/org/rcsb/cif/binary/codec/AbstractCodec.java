package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.DataArray;

public abstract class AbstractCodec {
    abstract <D extends DataArray> EncodedData<D> encode();

    abstract <D extends DataArray> D decode(EncodedData<D> encodedData);
}
