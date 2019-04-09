package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.encoding.Encoding;

import java.util.LinkedList;

public interface EncodedData<D> {
    D getData();

    int length();

    LinkedList<Encoding> getEncoding();

    default EncodedData decode() {
        return Codec.decode(this);
    }

    void setEncoding(LinkedList<Encoding> encoding);

    boolean hasNextDecodingStep();


}
