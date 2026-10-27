package org.rcsb.cif.model.builder;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.CifBuilder;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Built columns keep values as typed arrays; they read like the text columns the builder used to create.
 */
class BuiltColumnTest {
    @Test
    void builtColumnsReadLikeTextColumns() {
        Category category = CifBuilder.enterFile()
                .enterBlock("test")
                .enterCategory("test")
                .enterIntColumn("ints").add(1).markNextNotPresent().addNullable(Arrays.asList(null, 4)).markNextUnknown().leaveColumn()
                .enterFloatColumn("floats").add(1.5).markNextNotPresent().addNullable(Arrays.asList(null, -0.0)).markNextUnknown().leaveColumn()
                .enterStrColumn("strs").add("a").markNextNotPresent().addNullable(Arrays.asList(null, "d")).add("?").leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile()
                .getBlocks().get(0).getCategory("test");

        List<ValueKind> kinds = List.of(ValueKind.PRESENT, ValueKind.NOT_PRESENT, ValueKind.NOT_PRESENT, ValueKind.PRESENT, ValueKind.UNKNOWN);
        for (String name : List.of("ints", "floats", "strs")) {
            assertEquals(kinds, category.getColumn(name).valueKinds().collect(Collectors.toList()), name);
        }

        IntColumn ints = (IntColumn) category.getColumn("ints");
        assertArrayEquals(new int[] { 1, 0, 0, 4, 0 }, ints.getArray());
        assertArrayEquals(new String[] { "1", "", "", "4", "" }, ints.stringData().toArray());

        FloatColumn floats = (FloatColumn) category.getColumn("floats");
        assertArrayEquals(new double[] { 1.5, 0, 0, -0.0, 0 }, floats.getArray());
        assertArrayEquals(new String[] { "1.5", "", "", "-0.0", "" }, floats.stringData().toArray());

        StrColumn strs = (StrColumn) category.getColumn("strs");
        assertArrayEquals(new String[] { "a", "", "", "d", "" }, strs.getArray());
        assertArrayEquals(new String[] { "a", "", "", "d", "" }, strs.stringData().toArray());
    }

    @Test
    void valuesOfABuilderAreAView() {
        CategoryBuilder<?, ?> categoryBuilder = CifBuilder.enterFile().enterBlock("test").enterCategory("test");
        IntColumnBuilderImpl<?, ?, ?> builder = (IntColumnBuilderImpl<?, ?, ?>) categoryBuilder.enterIntColumn("ints");
        List<Integer> values = builder.getValues();

        builder.add(1, 2).markNextNotPresent();

        assertEquals(Arrays.asList(1, 2, null), values);
    }
}
