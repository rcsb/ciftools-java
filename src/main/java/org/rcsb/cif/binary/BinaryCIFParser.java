package org.rcsb.cif.binary;

import org.rcsb.cif.api.CIFFile;
import org.rcsb.cif.api.CIFParser;
import org.rcsb.cif.binary.msgpack.MessagePackReader;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.regex.Pattern;

public class BinaryCIFParser implements CIFParser {
    private static final int[] MIN_VERSION = new int[] { 0, 3 };

    @Override
    public CIFFile parse(InputStream inputStream) throws IOException {
        try (DataInputStream dataInputStream = new DataInputStream(inputStream)) {
            Map<String, Object> unpacked = new MessagePackReader(dataInputStream, false).readMap();

            String version = (String) unpacked.get("version");
            // TODO version parsed incorrectly

            String encoder = (String) unpacked.get("encoder");

            System.out.println(version);

            return new BinaryCIFFile(unpacked);
        }
    }
}
