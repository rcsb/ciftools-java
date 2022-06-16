package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifReader;
import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifReader;
import org.rcsb.cif.text.TextCifWriter;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipException;

/**
 * Collection of IO operations to retrieve, process, and write CIF files. All read and write operations are thread-safe.
 * The data model (i.e. {@link CifFile}, {@link org.rcsb.cif.model.Block}, {@link org.rcsb.cif.model.Category}, and
 * {@link org.rcsb.cif.model.Column}) is immutable to the user but maintains some internal state to improve performance.
 * Therefore, multi-threaded access to data of one {@link CifFile} is not safe and should be avoided.
 */
public class CifIO {
    private static final int BUFFER_SIZE = 65536;
    private static final CifOptions DEFAULT_OPTIONS = CifOptions.builder().build();

    private CifIO() {
        // nothing here
    }

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
        try {
            return readFromURL(new URL(String.format(options.getFetchUrl(), pdbId.toLowerCase())), options);
        } catch (ParsingException e) {
            throw new ParsingException("parsing failed - potentially wrong URL", e);
        }
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
        if (!(inputStream instanceof BufferedInputStream) && !(inputStream instanceof ByteArrayInputStream)) {
            inputStream = new BufferedInputStream(inputStream, BUFFER_SIZE);
        }

        CifOptions.CifOptionsBuilder.FileFormat fileFormat = options.getFileFormat();
        if (fileFormat == null) {
            return readFromInputStreamByGuessingFileFormat(inputStream, options);
        } else {
            return readFromInputStreamWithSpecifiedFileFormat(inputStream, options, fileFormat);
        }
    }

    private static CifFile readFromInputStreamWithSpecifiedFileFormat(InputStream inputStream, CifOptions options, CifOptions.CifOptionsBuilder.FileFormat fileFormat) throws IOException {
        try {
            // handle compression if present
            if (fileFormat == CifOptions.CifOptionsBuilder.FileFormat.BCIF_GZIPPED || fileFormat == CifOptions.CifOptionsBuilder.FileFormat.CIF_GZIPPED) {
                inputStream = new GZIPInputStream(inputStream, BUFFER_SIZE);
            }
        } catch (ZipException e) {
            inputStream.close();
            throw new ParsingException("Not in GZIP format", e);
        }

        if (fileFormat == CifOptions.CifOptionsBuilder.FileFormat.BCIF_GZIPPED || fileFormat == CifOptions.CifOptionsBuilder.FileFormat.BCIF_PLAIN) {
            return new BinaryCifReader(options).read(inputStream);
        } else {
            return new TextCifReader(options).read(inputStream);
        }
    }

    private static final int GZIP_MAGIC = 31;
    private static final int BINARY_MAGIC = 131;

    private static CifFile readFromInputStreamByGuessingFileFormat(InputStream inputStream, CifOptions options) throws IOException {
        // check if gzipped - mark this position - the mark will become invalid after 1 byte was read
        int magicNumber = readMagicNumber(inputStream);
        boolean gzipped = GZIP_MAGIC == magicNumber;

        // if gzipped, wrap stream in inflater
        if (gzipped) {
            return readFromInputStream(new GZIPInputStream(inputStream, BUFFER_SIZE), options);
        }

        // determine binary or text
        if (magicNumber == BINARY_MAGIC) {
            return new BinaryCifReader(options).read(inputStream);
        } else {
            return new TextCifReader(options).read(inputStream);
        }
    }

    private static int readMagicNumber(InputStream inputStream) throws IOException {
        inputStream.mark(1);
        int magicNumber = inputStream.read() & 0xFF;
        // move back to start of stream
        inputStream.reset();
        return magicNumber;
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

    /**
     * Use standard GZIP to compress data.
     * @param bytes the array of bytes to compress
     * @return a byte array containing the compressed data
     * @throws IOException failing
     */
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
