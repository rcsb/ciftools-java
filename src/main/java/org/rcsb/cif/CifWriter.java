package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifWriter;

import java.io.InputStream;

/**
 * Specifies how to write Cif files.
 */
public interface CifWriter {
    /**
     * Converts a CifFile to its InputStream representation ready to be e.g. written to a file. It is up to the user to
     * adequately handle the InputStream and close it.
     * @param cifFile the data structure to write
     * @return an InputStream either encompassing binary or text data, depending on writer implementation
     */
    InputStream write(CifFile cifFile);

    CifWriter BINARY_INSTANCE = new BinaryCifWriter();
    CifWriter TEXT_INSTANCE = new TextCifWriter();

    static InputStream writeBinary(CifFile cifFile) {
        return BINARY_INSTANCE.write(cifFile);
    }

    static InputStream writeText(CifFile cifFile) {
        return TEXT_INSTANCE.write(cifFile);
    }

    /**
     * Internal helper function to format headers.
     * @param header the raw header string
     * @return upper-case representation without any whitespaces
     */
    static String formatHeader(String header) {
        return header.replaceAll("[ \n\t]", "").toUpperCase();
    }
}
