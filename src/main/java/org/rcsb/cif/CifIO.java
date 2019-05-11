package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifReader;
import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifReader;
import org.rcsb.cif.text.TextCifWriter;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Collection of IO operations to retrieve, process, and write CIF files.
 */
public class CifIO {
    private static final int BUFFER_SIZE = 65536;
    private static final CifOptions DEFAULT_OPTIONS = CifOptions.builder().build();

    /**
     * Read a {@link CifFile} from web. Refine the address via {@link CifOptions.CifOptionsBuilder#fetchUrl(String)}. Otherwise
     * binaryCIF will be loaded.
     * @param pdbId the <code>pdbId</code> which should be fetched from the web -  the library will determine whether
     *              the file is gzipped or plain information and whether it is in binary format (after resolving GZIP if
     *              needed) or text the appropriate reader will be chosen automatically
     * @return a {@link CifFile} instance
     * @throws IOException thrown when reading fails
     */
    public static CifFile readById(String pdbId) throws IOException {
        return readById(pdbId, DEFAULT_OPTIONS);
    }

    /**
     * Read a {@link CifFile} from web. Refine the address via {@link CifOptions.CifOptionsBuilder#fetchUrl(String)}. Otherwise
     * binaryCIF will be loaded.
     * @param pdbId the <code>pdbId</code> which should be fetched from the web -  the library will determine whether
     *              the file is gzipped or plain information and whether it is in binary format (after resolving GZIP if
     *              needed) or text the appropriate reader will be chosen automatically
     * @param options {@link CifOptions} for the reading process
     * @return a {@link CifFile} instance
     * @throws IOException thrown when reading fails
     */
    public static CifFile readById(String pdbId, CifOptions options) throws IOException {
        return readFromURL(new URL(String.format(options.getFetchUrl(), pdbId)), options);
    }

    /**
     * Read a {@link CifFile} from a given {@link URL}.
     * @param url the {@link URL} from which to read - the library will determine whether the file is gzipped or plain
     *            information and whether it is in binary format (after resolving GZIP if needed) or text the
     *            appropriate reader will be chosen automatically
     * @return a {@link CifFile} instance
     * @throws IOException thrown when reading fails
     */
    public static CifFile readFromURL(URL url) throws IOException {
        return readFromURL(url, DEFAULT_OPTIONS);
    }

    /**
     * Read a {@link CifFile} from a given {@link URL}.
     * @param url the {@link URL} from which to read - the library will determine whether the file is gzipped or plain
     *            information and whether it is in binary format (after resolving GZIP if needed) or text the
     *            appropriate reader will be chosen automatically
     * @param options {@link CifOptions} for the reading process
     * @return a {@link CifFile} instance
     * @throws IOException thrown when reading fails
     */
    public static CifFile readFromURL(URL url, CifOptions options) throws IOException {
        return readFromInputStream(url.openStream(), options);
    }

    /**
     * Read a {@link CifFile} from a given {@link Path}.
     * @param path the {@link Path} from which to read - the library will determine whether the file is gzipped or plain
     *             information and whether it is in binary format (after resolving GZIP if needed) or text the
     *             appropriate reader will be chosen automatically
     * @return a {@link CifFile} instance
     * @throws IOException thrown when reading fails
     */
    public static CifFile readFromPath(Path path) throws IOException {
        return readFromPath(path, DEFAULT_OPTIONS);
    }

    /**
     * Read a {@link CifFile} from a given {@link Path}.
     * @param path the {@link Path} from which to read - the library will determine whether the file is gzipped or plain
     *             information and whether it is in binary format (after resolving GZIP if needed) or text the
     *             appropriate reader will be chosen automatically
     * @param options {@link CifOptions} for the reading process
     * @return a {@link CifFile} instance
     * @throws IOException thrown when reading fails
     */
    public static CifFile readFromPath(Path path, CifOptions options) throws IOException {
        return readFromInputStream(Files.newInputStream(path), options);
    }

    /**
     * Read a {@link CifFile} from a given {@link InputStream}.
     * @param inputStream the {@link InputStream} to process - the library will determine whether the file is gzipped or
     *                    plain information and whether it is in binary format (after resolving GZIP if needed) or text
     *                    - the appropriate reader will be chosen automatically
     * @return a {@link CifFile} instance
     * @throws IOException thrown when reading fails
     */
    public static CifFile readFromInputStream(InputStream inputStream) throws IOException {
        return readFromInputStream(inputStream, DEFAULT_OPTIONS);
    }

//    private static final byte[] TEXT_MAGIC = new byte[] { 0x64, 0x61, 0x74, 0x61 };
    private static final byte[] BINARY_MAGIC = new byte[] { -0x7D, -0x59, 0x65, 0x6E };

    /**
     * Read a {@link CifFile} from a given {@link InputStream}.
     * @param inputStream the {@link InputStream} to process - the library will determine whether the file is gzipped or
     *                    plain information and whether it is in binary format (after resolving GZIP if needed) or text
     *                    - the appropriate reader will be chosen automatically
     * @param options {@link CifOptions} for the reading process
     * @return a {@link CifFile} instance
     * @throws IOException thrown when reading fails
     */
    public static CifFile readFromInputStream(InputStream inputStream, CifOptions options) throws IOException {
        // performance: explicitly buffer stream, increases performance drastically
        inputStream = new BufferedInputStream(inputStream, BUFFER_SIZE);

        // check if gzipped - mark this position - the mark will become invalid after 2 bytes were read
        inputStream.mark(2);
        boolean gzipped = GZIPInputStream.GZIP_MAGIC == (inputStream.read() & 0xff | ((inputStream.read() << 8) & 0xff00));
        // move back to start of stream
        inputStream.reset();

        // if gzipped, wrap stream to inflater
        if (gzipped) {
            inputStream = new GZIPInputStream(inputStream, BUFFER_SIZE);
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int bytesRead;
        byte[] buffer = new byte[BUFFER_SIZE];
        while ((bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
            byteArrayOutputStream.write(buffer, 0, bytesRead);
        }

        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        inputStream.close();

        // determine binary or text
        byte[] probe = Arrays.copyOf(byteArray, BINARY_MAGIC.length);
        boolean binary = Arrays.equals(BINARY_MAGIC, probe);

        return binary ? new BinaryCifReader(options).read(byteArray) : new TextCifReader(options).read(byteArray);
    }

    /**
     * Write a binary {@link CifFile} to a given {@link Path}.
     * @param cifFile the {@link CifFile} to process
     * @param outputFile the {@link Path} where the content should be written
     * @throws IOException thrown when writing fails
     */
    public static void writeBinary(CifFile cifFile, Path outputFile) throws IOException {
        writeBinary(cifFile, outputFile, DEFAULT_OPTIONS);
    }

    /**
     * Write a binary {@link CifFile} to a given {@link Path}.
     * @param cifFile the {@link CifFile} to process
     * @param outputFile the {@link Path} where the content should be written
     * @param options {@link CifOptions} for the writing process
     * @throws IOException thrown when writing fails
     */
    public static void writeBinary(CifFile cifFile, Path outputFile, CifOptions options) throws IOException {
        Files.write(outputFile, writeBinary(cifFile, options));
    }

    /**
     * Convert a {@link CifFile} to its binary <code>byte[]</code> representation.
     * @param cifFile the {@link CifFile} to process
     * @return a <code>byte[]</code> representing the information to write
     * @throws IOException thrown when writing fails
     */
    public static byte[] writeBinary(CifFile cifFile) throws IOException {
        return writeBinary(cifFile, DEFAULT_OPTIONS);
    }

    /**
     * Convert a {@link CifFile} to its binary <code>byte[]</code> representation.
     * @param cifFile the {@link CifFile} to process
     * @param options {@link CifOptions} for the writing process
     * @return a <code>byte[]</code> representing the information to write
     * @throws IOException thrown when writing fails
     */
    public static byte[] writeBinary(CifFile cifFile, CifOptions options) throws IOException {
        byte[] raw = new BinaryCifWriter(options).write(cifFile);
        return options.isGzip() ? compress(raw) : raw;
    }

    /**
     * Write a text {@link CifFile} to a given {@link Path}.
     * @param cifFile the {@link CifFile} to process
     * @param outputFile the {@link Path} where the content should be written
     * @throws IOException thrown when writing fails
     */
    public static void writeText(CifFile cifFile, Path outputFile) throws IOException {
        writeText(cifFile, outputFile, DEFAULT_OPTIONS);
    }

    /**
     * Write a text {@link CifFile} to a given {@link Path}.
     * @param cifFile the {@link CifFile} to process
     * @param outputFile the {@link Path} where the content should be written
     * @param options {@link CifOptions} for the writing process
     * @throws IOException thrown when writing fails
     */
    public static void writeText(CifFile cifFile, Path outputFile, CifOptions options) throws IOException {
        Files.write(outputFile, writeText(cifFile, options));
    }

    /**
     * Convert a {@link CifFile} to its text <code>byte[]</code> representation.
     * @param cifFile the {@link CifFile} to process
     * @return a <code>byte[]</code> representing the information to write
     * @throws IOException thrown when conversion fails
     */
    public static byte[] writeText(CifFile cifFile) throws IOException {
        return writeText(cifFile, DEFAULT_OPTIONS);
    }

    /**
     * Convert a {@link CifFile} to its text <code>byte[]</code> representation.
     * @param cifFile the {@link CifFile} to process
     * @param options {@link CifOptions} for the writing process
     * @return a <code>byte[]</code> representing the information to write
     * @throws IOException thrown when conversion fails
     */
    public static byte[] writeText(CifFile cifFile, CifOptions options) throws IOException {
        byte[] raw = new TextCifWriter(options).write(cifFile);
        return options.isGzip() ? compress(raw) : raw;
    }

    private static byte[] compress(byte[] bytes) throws IOException {
        byte[] output;
        try (ByteArrayOutputStream byteStream = new ByteArrayOutputStream(bytes.length)) {
            try (GZIPOutputStream zipStream = new GZIPOutputStream(byteStream)) {
                zipStream.write(bytes);
            }
            output = byteStream.toByteArray();
        }
        return output;
    }
}
