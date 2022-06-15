package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.codec.MessagePackCodec;
import org.rcsb.cif.model.CifFile;

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
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("source/200l_rcsb.cif"));
        byte[] bytes = CifIO.writeBinary(cifFile);
        Map<String, String> writtenFootprint = getFootprint(bytes);

        Map<String, String> ebiFootprint = getFootprint(TestHelper.getBytes("source/200l_ebi.bcif"));
        equals(ebiFootprint, writtenFootprint, 1);
        Map<String, String> modelserverFootprint = getFootprint(TestHelper.getBytes("source/200l_modelserver.bcif"));
        // some mismatches are in chem_comp, the ModelServer file doesn't contain CYS - leading to all counts being off by 1
        equals(modelserverFootprint, writtenFootprint, 21);
        Map<String, String> cif2bcifFootprint = getFootprint(TestHelper.getBytes("source/200l_cif2bcif.bcif"));
        equals(cif2bcifFootprint, writtenFootprint, 0);
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
                    categoryName.equals("_pdbx_sifts_xref_db") || categoryName.equals("_software") ||
                    categoryName.equals("_model_server_result") || categoryName.equals("_model_server_stats") ||
                    categoryName.equals("_audit_author")) {
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
                // seems like a bug in ModelServer: last ByteArray step occurs twice
                if (chain.size() > 1 && chain.get(chain.size() - 2).equals("ByteArray") && chain.get(chain.size() - 1).equals("ByteArray")) {
                    chain.remove(chain.size() - 1);
                }
                if (!chain.contains("StringArray")) nonStringArray++;
                String value = category.get("rowCount") + "," + chain.size() + "," + chain;
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
            fail(mismatches + " columns were encoded with wrong type, expected = " + tolerance);
        }
    }
}
