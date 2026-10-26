package org.rcsb.cif.model.binary;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.CifIO;
import org.rcsb.cif.TestHelper;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.schema.StandardSchemata;
import org.rcsb.cif.schema.mm.AtomSite;
import org.rcsb.cif.schema.mm.MmCifBlock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryCategoryTest {
    @Test
    void schemaColumnAccessByNameDecodesOnlyThatColumn() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif"));
        BinaryCategory raw = (BinaryCategory) cifFile.getBlocks().get(0).getCategory("atom_site");
        MmCifBlock block = cifFile.as(StandardSchemata.MMCIF).getFirstBlock();

        Column<?> column = block.getAtomSite().getColumn("Cartn_x");

        assertTrue(column instanceof FloatColumn);
        assertEquals(1, raw.decodedColumnCount());
    }

    @Test
    void columnAccessIsCaseInsensitiveAndKeepsTheFileName() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif"));
        Category raw = cifFile.getBlocks().get(0).getCategory("atom_site");
        AtomSite atomSite = cifFile.as(StandardSchemata.MMCIF).getFirstBlock().getAtomSite();

        assertEquals("Cartn_x", raw.getColumn("CARTN_X").getColumnName());
        assertSame(raw.getColumn("Cartn_x"), raw.getColumn("cartn_X"));
        // the schema wraps case variants in its typed column
        assertTrue(atomSite.getColumn("CARTN_X") instanceof FloatColumn);
        assertEquals("Cartn_x", atomSite.getColumn("CARTN_X").getColumnName());
    }

    @Test
    void missingColumnIsEmptyAndNotRegistered() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif"));
        Category raw = cifFile.getBlocks().get(0).getCategory("atom_site");
        AtomSite atomSite = cifFile.as(StandardSchemata.MMCIF).getFirstBlock().getAtomSite();
        int columnCount = raw.getColumnNames().size();

        assertTrue(raw.getColumn("no_such_column") instanceof Column.EmptyColumn);
        assertTrue(atomSite.getColumn("no_such_column") instanceof Column.EmptyColumn);
        assertFalse(raw.getColumns().containsKey("no_such_column"));
        assertEquals(columnCount, raw.getColumns().size());
    }

    @Test
    void getColumnsIsInFileOrderWhateverTheAccessOrder() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif"));
        Category raw = cifFile.getBlocks().get(0).getCategory("atom_site");
        List<String> names = raw.getColumnNames();

        raw.getColumn(names.get(names.size() - 1));
        raw.getColumn(names.get(3));

        assertEquals(names, new ArrayList<>(raw.getColumns().keySet()));
    }

    @Test
    void schemaCategoryAccessByNameIsCaseInsensitiveAndTyped() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif"));
        MmCifBlock block = cifFile.as(StandardSchemata.MMCIF).getFirstBlock();
        int categoryCount = cifFile.getBlocks().get(0).getCategories().size();

        assertTrue(block.getCategory("ATOM_SITE") instanceof AtomSite);
        assertEquals(block.getAtomSite().getRowCount(), block.getCategory("Atom_Site").getRowCount());
        assertTrue(block.getCategory("no_such_category") instanceof Category.EmptyCategory);
        assertEquals(categoryCount, cifFile.getBlocks().get(0).getCategories().size());
    }
}
