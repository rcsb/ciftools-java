package org.rcsb.cif;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.binary.BinaryCifReader;
import org.rcsb.cif.text.TextCifReader;

import java.io.IOException;
import java.io.InputStream;

public interface CifReader {
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
