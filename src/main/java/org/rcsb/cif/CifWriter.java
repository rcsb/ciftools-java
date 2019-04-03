package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifWriter;

import java.io.IOException;
import java.io.OutputStream;

public interface CifWriter {
    OutputStream write(CifFile cifFile) throws IOException;

    CifWriter BINARY_INSTANCE = new BinaryCifWriter();
    CifWriter TEXT_INSTANCE = new TextCifWriter();

    static OutputStream writeBinary(CifFile cifFile) throws IOException {
        return BINARY_INSTANCE.write(cifFile);
    }

    static OutputStream writeText(CifFile cifFile) throws IOException {
        return TEXT_INSTANCE.write(cifFile);
    }
}
