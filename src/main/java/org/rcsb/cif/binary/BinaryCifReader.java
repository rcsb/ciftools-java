package org.rcsb.cif.binary;

import org.rcsb.cif.CifReader;
import org.rcsb.cif.ParsingException;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.model.*;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryCifReader implements CifReader {
    @Override
    public CifFile parse(InputStream inputStream) throws ParsingException, IOException {
        // performance 2.1: explicitly buffer stream, increases performance drastically
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[1024];
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        byte[] byteArray = buffer.toByteArray();
        buffer.close();
        inputStream.close();

        return parseBinary(byteArray);
    }

    @SuppressWarnings("unchecked")
    public CifFile parseBinary(byte[] data) throws ParsingException {
        if (data.length == 0) {
            throw new ParsingException("Cannot parse empty file.");
        }

        Map<String, Object> unpacked;
        try {
            unpacked = Codec.MESSAGE_PACK_CODEC.decode(data);
        } catch (ClassCastException e) {
            throw new ParsingException("File seems to be not in binary CIF. Encountered unexpected cast.", e);
        } catch (Exception e) {
            throw new ParsingException("Parsing failed.", e);
        }

        String versionString = (String) unpacked.get("version");
        if (!versionString.startsWith(Codec.MIN_VERSION)) {
            throw new ParsingException("Unsupported format version. Current " + versionString +
                    ", required " + Codec.MIN_VERSION + ".");
        }

        String encoder = (String) unpacked.get("encoder");

        List<Block> dataBlocks = Stream.of((Object[]) (unpacked.get("dataBlocks")))
                .map(entry -> {
                    Map<String, Object> map = (Map<String, Object>) entry;
                    String header = (String) map.get("header");
                    Map<String, Category> categories = new LinkedHashMap<>();

                    for (Object o : (Object[]) map.get("categories")) {
                        Map<String, Object> cat = (Map<String, Object>) o;
                        String name = (String) cat.get("name");
                        categories.put(name.substring(1), createBinaryCategory(cat));
                    }

                    return new BaseBlock(categories, header);
                })
                .collect(Collectors.toList());

        return new BinaryFile(dataBlocks, versionString, encoder);
    }

    private Category createBinaryCategory(Map<String, Object> encodedCategory) {
        // if rowCount ever throws NPEs again: the problem is a wrongly parsed map length in MessagePackCodec
        String name = ((String) encodedCategory.get("name")).substring(1);
        Object rawColumns = encodedCategory.get("columns");
        int rowCount = (int) encodedCategory.get("rowCount");

        if (rawColumns instanceof Object[]) {
            Object[] encodedFields = (Object[]) rawColumns;
            return ModelFactory.createCategoryBinary(name, rowCount, encodedFields);
        } else {
            Map<String, Column> columns = Codec.MESSAGE_PACK_CODEC.decode((byte[]) rawColumns)
                    .entrySet()
                    .stream()
                    .map(entry -> {
                        String value = (String) entry.getValue();
                        return ModelFactory.createColumnText(name, entry.getKey(), value, 0, value.length());
                    })
                    .collect(Collectors.toMap(Column::getColumnName,
                            Function.identity(),
                            (u, v) -> {
                                throw new IllegalStateException("Duplicate key " + u);
                            },
                            LinkedHashMap::new));
            return ModelFactory.createCategoryText(name, columns);
        }
    }
}
