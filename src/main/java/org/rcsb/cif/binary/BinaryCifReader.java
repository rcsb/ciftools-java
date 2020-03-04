package org.rcsb.cif.binary;

import org.rcsb.cif.CifOptions;
import org.rcsb.cif.ParsingException;
import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.codec.MessagePackCodec;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.LinkedCaseInsensitiveMap;
import org.rcsb.cif.model.binary.BinaryBlock;
import org.rcsb.cif.model.binary.BinaryCategory;
import org.rcsb.cif.model.binary.BinaryFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BinaryCifReader {
    public BinaryCifReader(CifOptions options) {
    }

    @SuppressWarnings("unchecked")
    public CifFile read(InputStream inputStream) throws ParsingException {
        Map<String, Object> unpacked;
        try (inputStream) {
            unpacked = MessagePackCodec.decode(inputStream);
        } catch (ClassCastException e) {
            throw new ParsingException("File seems to not be in binary CIF format. Encountered unexpected cast.", e);
        } catch (Exception e) {
            throw new ParsingException("Parsing failed.", e);
        }

        String versionString = (String) unpacked.get("version");
        if (!versionString.startsWith(BinaryCifCodec.MIN_VERSION)) {
            throw new ParsingException("Unsupported format version. Current " + versionString +
                    ", required " + BinaryCifCodec.MIN_VERSION + ".");
        }

        String encoder = (String) unpacked.get("encoder");
        Object[] rawBlocks = (Object[]) unpacked.get("dataBlocks");
        List<Block> dataBlocks = new ArrayList<>(rawBlocks.length);

        for (Object rawBlock : rawBlocks) {
            Map<String, Object> map = (Map<String, Object>) rawBlock;
            String header = (String) map.get("header");
            Map<String, Category> categories = new LinkedCaseInsensitiveMap<>();

            try {
                for (Object o : (Object[]) map.get("categories")) {
                    Map<String, Object> cat = (Map<String, Object>) o;
                    String name = (String) cat.get("name");
                    categories.put(name.substring(1), createBinaryCategory(cat));
                }

                dataBlocks.add(new BinaryBlock(categories, header));
            } catch (NullPointerException e) {
                // don't really need this but the parser may be tricked by malformed files into exploring data and dying with NPE
                dataBlocks.add(new BinaryBlock(Collections.emptyMap(), header));
            }
        }

        return new BinaryFile(dataBlocks, versionString, encoder);
    }

    private Category createBinaryCategory(Map<String, Object> encodedCategory) {
        // if rowCount ever throws NPEs again: the problem is a wrongly parsed map length in MessagePackCodec
        String name = ((String) encodedCategory.get("name")).substring(1);
        Object rawColumns = encodedCategory.get("columns");
        int rowCount = (int) encodedCategory.get("rowCount");

        Object[] encodedFields = (Object[]) rawColumns;
        return new BinaryCategory(name, rowCount, encodedFields);
    }
}
