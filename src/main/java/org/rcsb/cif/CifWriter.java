package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.internal.CifFile;
import org.rcsb.cif.text.TextCifWriter;

import java.io.IOException;
import java.io.InputStream;

public interface CifWriter {
    InputStream write(CifFile cifFile) throws IOException;

    CifWriter BINARY_INSTANCE = new BinaryCifWriter();
    CifWriter TEXT_INSTANCE = new TextCifWriter();

    // TODO impl filter and formatter

    static InputStream writeBinary(CifFile cifFile) throws IOException {
        return BINARY_INSTANCE.write(cifFile);
    }

    static InputStream writeText(CifFile cifFile) throws IOException {
        return TEXT_INSTANCE.write(cifFile);
    }

    static String formatHeader(String header) {
        return header.replaceAll("[ \n\t]", "").toUpperCase();
    }
}
