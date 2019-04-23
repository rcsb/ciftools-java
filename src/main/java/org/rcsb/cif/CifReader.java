package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifReader;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifReader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Specifies how to read Cif files.
 */
public interface CifReader {
    /**
     * Parses Cif files represented by an InputStream and creates an instance of a CifFile to make all data accessible.
     * @param inputStream the raw data to parse
     * @return the model representation of all non-comment file contents
     * @throws ParsingException thrown when parsing goes offtrack
     * @throws IOException propagated
     */
    CifFile parse(InputStream inputStream) throws ParsingException, IOException;

    CifReader BINARY_INSTANCE = new BinaryCifReader();
    CifReader TEXT_INSTANCE = new TextCifReader();

    static CifFile parseBinary(InputStream inputStream) throws ParsingException, IOException {
        return BINARY_INSTANCE.parse(inputStream);
    }

    static CifFile parseText(InputStream inputStream) throws ParsingException, IOException {
        return TEXT_INSTANCE.parse(inputStream);
    }
}
