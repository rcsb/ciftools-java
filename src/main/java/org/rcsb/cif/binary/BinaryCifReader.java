package org.rcsb.cif.binary;

import org.rcsb.cif.CifReader;
import org.rcsb.cif.ParsingException;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.BinaryCifFile;
import org.rcsb.cif.model.CifCategory;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.generated.CifBlock;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryCifReader implements CifReader {
    @Override
    public CifFile parse(InputStream inputStream) throws ParsingException, IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[1024];
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        byte[] byteArray = buffer.toByteArray();
        buffer.close();

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

        List<CifBlock> dataBlocks = Stream.of((Object[]) (unpacked.get("dataBlocks")))
                .map(entry -> {
                    Map<String, Object> map = (Map<String, Object>) entry;
                    String header = (String) map.get("header");
                    Map<String, CifCategory> categories = new LinkedHashMap<>();

                    for (Object o : (Object[]) map.get("categories")) {
                        Map<String, Object> cat = (Map<String, Object>) o;
                        String name = (String) cat.get("name");
                        categories.put(name.substring(1), createCategory(cat));
                    }

                    return new CifBlock(categories, header);
                })
                .collect(Collectors.toList());

        return new BinaryCifFile(dataBlocks, versionString, encoder);
    }

    private CifCategory createCategory(Map<String, Object> encodedCategory) {
        String name = ((String) encodedCategory.get("name")).substring(1);
        if("pdbx_poly_seq_scheme".equals(name)) {
            // FIXME
            System.out.println();
        }

        Object[] encodedFields = (Object[]) encodedCategory.get("columns");
        int rowCount = (int) encodedCategory.get("rowCount");
        return BaseCifCategory.create(name, rowCount, encodedFields);
    }
}
