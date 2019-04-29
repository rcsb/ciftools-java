package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifReader;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifReader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Class for the reading of CifFile instances. Be aware that no guess work pertaining the nature of the InputStream is
 * done: zipped resources must be wrapped externally by calling new GZIPInputStream(inputStream) and passing this to the
 * corresponding reader functions.
 */
public abstract class CifReader {
    /**
     * Parses Cif files represented by an InputStream and creates an instance of a CifFile to make all data accessible.
     * @param inputStream the raw data to parse
     * @return the model representation of all file contents
     * @throws ParsingException thrown for malformed files
     * @throws IOException thrown when reading fails
     */
    public static CifFile readBinary(InputStream inputStream) throws ParsingException, IOException {
        return new BinaryCifReader().read(inputStream);
    }

    /**
     * Parses Cif files represented by an InputStream and creates an instance of a CifFile to make all data accessible.
     * @param inputStream the raw data to parse
     * @return the model representation of all non-comment file contents
     * @throws ParsingException thrown for malformed files
     * @throws IOException thrown when reading fails
     */
    public static CifFile readText(InputStream inputStream) throws ParsingException, IOException {
        return new TextCifReader().read(inputStream);
    }
}
