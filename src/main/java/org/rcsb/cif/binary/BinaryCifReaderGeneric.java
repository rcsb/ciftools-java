package org.rcsb.cif.binary;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.rcsb.cif.CifOptions;
import org.rcsb.cif.ParsingException;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.model.BaseBlockGeneric;
import org.rcsb.cif.model.BinaryFileGeneric;
import org.rcsb.cif.model.BlockGeneric;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFileGeneric;
import org.rcsb.cif.model.ProxyCategory;

public class BinaryCifReaderGeneric {

    protected CifOptions options;

	public BinaryCifReaderGeneric(CifOptions options) {
    	this.options = options;
    }

    private Category createProxyCategory(Map<String, Object> encodedCategory) {
        // if rowCount ever throws NPEs again: the problem is a wrongly parsed map length in MessagePackCodec
        String name = ((String) encodedCategory.get("name")).substring(1);
        Object rawColumns = encodedCategory.get("columns");
        int rowCount = (int) encodedCategory.get("rowCount");

        // it is a conventional category with multiple rows
        Object[] encodedFields = (Object[]) rawColumns;
        
        return new ProxyCategory(name, rowCount, encodedFields, true);
    }

    @SuppressWarnings("unchecked")
    public CifFileGeneric read(InputStream inputStream) throws ParsingException, IOException {
        Map<String, Object> unpacked;
        try {
            unpacked = Codec.MESSAGE_PACK_CODEC.decode(inputStream);
        } catch (ClassCastException e) {
            throw new ParsingException("File seems to not be in binary CIF format. Encountered unexpected cast.", e);
        } catch (Exception e) {
            throw new ParsingException("Parsing failed.", e);
        } finally {
            inputStream.close();
        }

        String versionString = (String) unpacked.get("version");
        if (!versionString.startsWith(Codec.MIN_VERSION)) {
            throw new ParsingException("Unsupported format version. Current " + versionString +
                    ", required " + Codec.MIN_VERSION + ".");
        }

        String encoder = (String) unpacked.get("encoder");

        List<BlockGeneric> dataBlocks = Stream.of((Object[]) (unpacked.get("dataBlocks")))
                .map(entry -> {
                    Map<String, Object> map = (Map<String, Object>) entry;
                    String header = (String) map.get("header");
                    Map<String, Category> categories = new LinkedHashMap<>();

                    try {
                        for (Object o : (Object[]) map.get("categories")) {
                            Map<String, Object> cat = (Map<String, Object>) o;
                            String name = (String) cat.get("name");
                            categories.put(name.substring(1), createProxyCategory(cat));
                        }

                        return new BaseBlockGeneric(categories, header);
                    } catch (NullPointerException e) {
                        // don't really need this but the parser may be tricked by malformed files into exploring data and dying with NPE
                        return new BaseBlockGeneric(Collections.emptyMap(), header);
                    }
                })
                .collect(Collectors.toList());

        return new BinaryFileGeneric(dataBlocks, versionString, encoder);
    }


}
