package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifWriter;

import java.io.InputStream;

public interface CifWriter {
    InputStream write(CifFile cifFile);

    BinaryCifWriter BINARY_INSTANCE = new BinaryCifWriter();
    TextCifWriter TEXT_INSTANCE = new TextCifWriter();

    // TODO filter and formatter are missing in this impl

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
