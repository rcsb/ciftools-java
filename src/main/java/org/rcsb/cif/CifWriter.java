package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifWriter;

import java.io.IOException;
import java.io.InputStream;

/**
 * Class for the writing of CifFile instances. Converts a CifFile to its InputStream representation ready to be e.g.
 * written to a file. It is up to the user to adequately handle the InputStream and close it.
 */
public class CifWriter {
    private static final BinaryCifWriterOptions DEFAULT_OPTIONS = BinaryCifWriterOptions.create().build();

    /**
     * @see CifWriter#writeBinary(CifFile, BinaryCifWriterOptions)
     */
    public static InputStream writeBinary(CifFile cifFile) throws IOException {
        return writeBinary(cifFile, DEFAULT_OPTIONS);
    }

    /**
     * Uses several encoding strategies to create an efficient representation of a CifFile.
     * @param cifFile the file to process
     * @param options provide options for the {@link BinaryCifWriter} - acquire using {@link BinaryCifWriterOptions#create()}
     * @return the binary InputStream representing the file content
     */
    public static InputStream writeBinary(CifFile cifFile, BinaryCifWriterOptions options) throws IOException {
        return new BinaryCifWriter(options).write(cifFile);
    }

    /**
     *
     * @param cifFile the file to process
     * @return the text InputStream representing the file content
     */
    public static InputStream writeText(CifFile cifFile) {
        return new TextCifWriter().write(cifFile);
    }

    /**
     * Convert this CifFile to its mmCIF representation.
     * @param cifFile the file to process
     * @return the String representing the file content
     */
    public static String composeText(CifFile cifFile) {
        return new TextCifWriter().compose(cifFile);
    }
}
