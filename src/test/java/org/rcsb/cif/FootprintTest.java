package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.codec.MessagePackCodec;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.fail;

class FootprintTest {
    @Test
    void printFootprint() throws IOException {
        byte[] bytes = CifIO.writeBinary(CifIO.readFromInputStream(TestHelper.getInputStream("source/200l_rcsb.cif")));
        Map<String, String> writtenFootprint = getFootprint(bytes);

        Map<String, String> ebiFootprint = getFootprint(TestHelper.getBytes("source/200l_ebi.bcif"));
        Map<String, String> molstarFootprint = getFootprint(TestHelper.getBytes("source/200l_molstar.bcif"));

        int tolerance = 25;
        equals(ebiFootprint, writtenFootprint, tolerance);
        equals(molstarFootprint, writtenFootprint, tolerance);
    }

    @SuppressWarnings("unchecked")
    private Map<String, String> getFootprint(byte[] content) throws IOException {
        int nonStringArray = 0;
        Map<String, String> footprint = new LinkedHashMap<>();
        Object[] file = (Object[]) MessagePackCodec.decode(new ByteArrayInputStream(content)).get("dataBlocks");
        Map<String, Object> firstBlock = (Map<String, Object>) file[0];
        Object[] categories = (Object[]) firstBlock.get("categories");
        for (Object cat : categories) {
            Map<String, Object> category = (Map<String, Object>) cat;
            String categoryName = (String) category.get("name");
            // coordinate server categories are not present
            if (categoryName.startsWith("_coordinate") || categoryName.equals("_chem_comp_bond") ||
                    categoryName.equals("_pdbx_sifts_unp_segments") || categoryName.equals("_pdbx_sifts_xref_db_segments") ||
                    categoryName.equals("_pdbx_sifts_xref_db") || categoryName.equals("_software")) {
                continue;
            }

            Object[] columns = (Object[]) category.get("columns");
            for (Object col : columns) {
                Map<String, Object> column = (Map<String, Object>) col;
                String columnName = (String) column.get("name");
                String key = categoryName + "." + columnName;
                // some column are not present
                if (key.equals("_struct_sheet_range.symmetry") || key.equals("_symmetry.space_group_name_Hall") ||
                        key.equals("_atom_site.pdbe_label_seq_id") || key.equals("_atom_site.pdbx_label_index") ||
                        key.equals("_atom_site.pdbx_sifts_xref_db_name") || key.equals("_atom_site.pdbx_sifts_xref_db_acc") ||
                        key.equals("_atom_site.pdbx_sifts_xref_db_num") || key.equals("_atom_site.pdbx_sifts_xref_db_res") ||
                        key.equals("_struct_conf.beg_label_entity_id") || key.equals("_struct_conf.end_label_entity_id") ||
                        key.equals("_struct_sheet_range.beg_label_entity_id") || key.equals("_struct_sheet_range.end_label_entity_id")) {
                    continue;
                }

                Map<String, Object> data = (Map<String, Object>) column.get("data");
                Object[] enc = (Object[]) data.get("encoding");

                List<String> chain = Stream.of(enc).map(e -> ((Map<String, Object>) e).get("kind")).map(String.class::cast).collect(Collectors.toList());
                if (!chain.contains("StringArray")) nonStringArray++;
                String value = category.get("rowCount") + "," + enc.length + "," + chain;
                footprint.put(key, value);
            }
        }

        if (nonStringArray == 0) fail("exclusive usage of StringArray encoding - more efficient encoding should get picked where possible");
        return footprint;
    }

    private void equals(Map<String, String> expected, Map<String, String> actual, int tolerance) {
        int mismatches = 0;
        for (String key : expected.keySet()) {
            if (!actual.containsKey(key)) {
                fail("key " + key + " not present");
            }

            if (!expected.get(key).equals(actual.get(key))) {
                System.out.println("mismatch in column " + key + "\n" + expected.get(key) + " vs " + actual.get(key));
                mismatches++;
            }
        }


        if (mismatches > tolerance) {
            fail("too many columns were encoded with wrong type");
        }
    }
}
