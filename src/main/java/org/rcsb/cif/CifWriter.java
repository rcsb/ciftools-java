package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifWriter;

import java.io.InputStream;

/**
 * Class for the writing of CifFile instances. Converts a CifFile to its InputStream representation ready to be e.g.
 * written to a file. It is up to the user to adequately handle the InputStream and close it.
 */
public abstract class CifWriter {
    private static final BinaryCifWriterOptions DEFAULT_BINARY_OPTIONS = BinaryCifWriterOptions.create().build();
    private static final TextCifWriterOptions DEFAULT_TEXT_OPTIONS = TextCifWriterOptions.create().build();

    /**
     * Uses several encoding strategies to create an efficient representation of a CifFile.
     * @param cifFile the file to process
     * @return the binary InputStream representing the file content
     * @see CifWriter#writeBinary(CifFile, BinaryCifWriterOptions)
     */
    public static InputStream writeBinary(CifFile cifFile) {
        return writeBinary(cifFile, DEFAULT_BINARY_OPTIONS);
    }

    /**
     * Uses several encoding strategies to create an efficient representation of a CifFile.
     * @param cifFile the file to process
     * @param options provide options for the {@link BinaryCifWriter} - acquire using {@link BinaryCifWriterOptions#create()}
     * @return the binary InputStream representing the file content
     */
    public static InputStream writeBinary(CifFile cifFile, BinaryCifWriterOptions options) {
        return new BinaryCifWriter(options).write(cifFile);
    }

    /**
     * Convert this CifFile to its mmCIF representation and return the corresponding InputStream.
     * @param cifFile the file to process
     * @return the text InputStream representing the file content
     */
    public static InputStream writeText(CifFile cifFile) {
        return writeText(cifFile, DEFAULT_TEXT_OPTIONS);
    }

    /**
     * Convert this CifFile to its mmCIF representation and return the corresponding InputStream.
     * @param cifFile the file to process
     * @param options provide options for the {@link TextCifWriter} - acquire using {@link TextCifWriterOptions#create()}
     * @return the text InputStream representing the file content
     */
    public static InputStream writeText(CifFile cifFile, TextCifWriterOptions options) {
        return new TextCifWriter(options).write(cifFile);
    }

    /**
     * Convert this CifFile to its mmCIF representation and return its String representation.
     * @param cifFile the file to process
     * @return the String representing the file content
     */
    public static String composeText(CifFile cifFile) {
        return composeText(cifFile, DEFAULT_TEXT_OPTIONS);
    }

    /**
     * Convert this CifFile to its mmCIF representation and return its String representation.
     * @param cifFile the file to process
     * @param options provide options for the {@link TextCifWriter} - acquire using {@link TextCifWriterOptions#create()}
     * @return the String representing the file content
     */
    public static String composeText(CifFile cifFile, TextCifWriterOptions options) {
        return new TextCifWriter(options).compose(cifFile);
    }
}
