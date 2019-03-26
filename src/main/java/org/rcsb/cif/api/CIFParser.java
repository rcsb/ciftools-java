package org.rcsb.cif.api;

import java.io.IOException;
import java.io.InputStream;

public interface CIFParser {
    CIFFile parse(InputStream inputStream) throws IOException;
}
