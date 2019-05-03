package org.rcsb.cif;

import java.io.*;

public class SharedIO {
    private static final int DEFAULT_BUFFER_SIZE = 65536;
    // TODO change once ready
    private static final String DEFAULT_BCIF_FETCH_URL = "https://webchem.ncbr.muni.cz/ModelServer/static/bcif/%s";
    private static final String DEFAULT_CIF_FETCH_URL = "https://files.rcsb.org/download/%s.cif.gz";

    public static byte[] inputStreamToBytes(InputStream inputStream) throws IOException {
        // performance: explicitly buffer stream, increases performance drastically
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream, DEFAULT_BUFFER_SIZE);
        }

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int bytesRead;
        byte[] data = new byte[DEFAULT_BUFFER_SIZE];
        while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, bytesRead);
        }

        buffer.flush();
        byte[] byteArray = buffer.toByteArray();
        buffer.close();
        inputStream.close();
        return byteArray;
    }
}
