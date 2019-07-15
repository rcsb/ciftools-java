package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.binary.codec.MessagePackCodec;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FootprintTest {
    @Test
    public void printFootprint() throws IOException {
        byte[] bytes = CifIO.writeBinary(CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif")));
//        printFootprint(TestHelper.getBytes("source/1acj_ebi.bcif"));
//        printFootprint(TestHelper.getBytes("source/1acj_java.bcif"));
        printFootprint(bytes);
    }

    @SuppressWarnings("unchecked")
    private void printFootprint(byte[] content) {
        MessagePackCodec messagePackCodec = new MessagePackCodec();
        Object[] file = (Object[]) messagePackCodec.decode(content).get("dataBlocks");
        Map<String, Object> firstBlock = (Map<String, Object>) file[0];
        Object[] categories = (Object[]) firstBlock.get("categories");
        for (Object cat : categories) {
            Map<String, Object> category = (Map<String, Object>) cat;
            String categoryName = (String) category.get("name");
            if (categoryName.startsWith("_coordinate")) {
                continue;
            }
            System.out.println(categoryName);

            Object[] columns = (Object[]) category.get("columns");
            for (Object col : columns) {
                Map<String, Object> column = (Map<String, Object>) col;
                String columnName = (String) column.get("name");
                System.out.println(categoryName + "." + columnName);

                Map<String, Object> data = (Map<String, Object>) column.get("data");
                Object[] enc = (Object[]) data.get("encoding");
                System.out.println(enc.length + "," + category.get("rowCount") + "," + Stream.of(enc).map(e -> ((Map<String, Object>) e).get("kind")).collect(Collectors.toList()));
            }
        }
    }
}
