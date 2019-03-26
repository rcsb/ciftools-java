package org.rcsb.cif.binary;

import org.rcsb.cif.api.CIFFile;
import org.rcsb.cif.api.CIFParser;
import org.rcsb.cif.binary.msgpack.MessagePackReader;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class BinaryCIFParser implements CIFParser {
    @Override
    public CIFFile parse(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        Map<String, Object> unpacked = new MessagePackReader(dataInputStream, true).readMap();
        return new BinaryCIFFile(unpacked);
    }
}
