package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.codec.MessagePackCodec;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.fail;


public class FootprintTest {
    @Test
    public void printFootprint() throws IOException {
        byte[] bytes = CifIO.writeBinary(CifIO.readFromInputStream(TestHelper.getInputStream("source/200l_rcsb.cif")));
        Map<String, String> writtenFootprint = getFootprint(bytes);

        Map<String, String> ebiFootprint = getFootprint(TestHelper.getBytes("source/200l_ebi.bcif"));
        Map<String, String> molstarFootprint = getFootprint(TestHelper.getBytes("source/200l_molstar.bcif"));

        equals(ebiFootprint, writtenFootprint);
        equals(molstarFootprint, writtenFootprint);
    }

    @SuppressWarnings("unchecked")
    private Map<String, String> getFootprint(byte[] content) throws IOException {
        Map<String, String> footprint = new LinkedHashMap<>();
        Object[] file = (Object[]) MessagePackCodec.decode(new ByteArrayInputStream(content)).get("dataBlocks");
        Map<String, Object> firstBlock = (Map<String, Object>) file[0];
        Object[] categories = (Object[]) firstBlock.get("categories");
        for (Object cat : categories) {
            Map<String, Object> category = (Map<String, Object>) cat;
            String categoryName = (String) category.get("name");
            // coordinate server categories are not present
            if (categoryName.startsWith("_coordinate") || categoryName.equals("_chem_comp_bond")) {
                continue;
            }

            Object[] columns = (Object[]) category.get("columns");
            for (Object col : columns) {
                Map<String, Object> column = (Map<String, Object>) col;
                String columnName = (String) column.get("name");
                String key = categoryName + "." + columnName;
                // some column are not present
                if (key.equals("_struct_sheet_range.symmetry") || key.equals("_symmetry.space_group_name_Hall") ||
                        key.equals("_atom_site.pdbe_label_seq_id")) {
                    continue;
                }

                Map<String, Object> data = (Map<String, Object>) column.get("data");
                Object[] enc = (Object[]) data.get("encoding");

                String value = category.get("rowCount") + "," + enc.length + "," + Stream.of(enc).map(e -> ((Map<String, Object>) e).get("kind")).collect(Collectors.toList());
                footprint.put(key, value);
            }
        }
        return footprint;
    }

    private void equals(Map<String, String> expected, Map<String, String> actual) {
        for (String key : expected.keySet()) {
            if (!actual.containsKey(key)) {
                fail("key " + key + " not present");
            }

            if (!expected.get(key).equals(actual.get(key))) {
                System.out.println("mismatch in column " + key + "\n" + expected.get(key) + " vs " + actual.get(key));
            }
        }
    }
}
