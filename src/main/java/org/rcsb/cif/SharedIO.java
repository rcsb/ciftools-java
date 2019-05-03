package org.rcsb.cif;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SharedIO {
    private static final int DEFAULT_BUFFER_SIZE = 65536;

    public static byte[] inputStreamToBytes(InputStream inputStream) throws IOException {
        // performance: explicitly buffer stream, increases performance drastically
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream, DEFAULT_BUFFER_SIZE);
        }

        // TODO 2nd layer of buffering needed?
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[DEFAULT_BUFFER_SIZE];
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        byte[] byteArray = buffer.toByteArray();
        buffer.close();
        inputStream.close();
        return byteArray;
    }
}
