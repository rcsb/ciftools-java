package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifReader;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifReader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Class for the reading of CifFile instances.
 */
public class CifReader {
    /**
     * Parses Cif files represented by an InputStream and creates an instance of a CifFile to make all data accessible.
     * @param inputStream the raw data to parse
     * @return the model representation of all file contents
     * @throws ParsingException thrown for malformed files
     * @throws IOException thrown when reading fails
     */
    public static CifFile parseBinary(InputStream inputStream) throws ParsingException, IOException {
        return new BinaryCifReader().parse(inputStream);
    }

    /**
     * Parses Cif files represented by an InputStream and creates an instance of a CifFile to make all data accessible.
     * @param inputStream the raw data to parse
     * @return the model representation of all non-comment file contents
     * @throws ParsingException thrown for malformed files
     * @throws IOException thrown when reading fails
     */
    public static CifFile parseText(InputStream inputStream) throws ParsingException, IOException {
        return new TextCifReader().parse(inputStream);
    }
}
