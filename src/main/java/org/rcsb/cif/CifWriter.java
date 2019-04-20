package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifWriter;

import java.io.InputStream;

public interface CifWriter {
    InputStream write(CifFile cifFile);

    CifWriter BINARY_INSTANCE = new BinaryCifWriter();
    CifWriter TEXT_INSTANCE = new TextCifWriter();

    static InputStream writeBinary(CifFile cifFile) {
        return BINARY_INSTANCE.write(cifFile);
    }

    static InputStream writeText(CifFile cifFile) {
        return TEXT_INSTANCE.write(cifFile);
    }

    static String formatHeader(String header) {
        return header.replaceAll("[ \n\t]", "").toUpperCase();
    }
}
