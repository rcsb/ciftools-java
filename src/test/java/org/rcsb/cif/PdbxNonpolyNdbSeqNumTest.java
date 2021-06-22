package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.schema.StandardSchemata;
import org.rcsb.cif.schema.mm.MmCifFile;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * BinaryCIF might slightly violate the schema and lead to a ClassCastException if not handled.
 */
public class PdbxNonpolyNdbSeqNumTest {
    @Test
    public void testGeneric() throws IOException {
        CifFile rcsb = CifIO.readById("1acj");
        Column<?> rcsbNdbSeqNum = rcsb.getBlocks().get(0)
                .getCategory("pdbx_nonpoly_scheme")
                .getColumn("ndb_seq_num");
        assertEquals(83, rcsbNdbSeqNum.getRowCount());

        CifFile ebi = CifIO.readById("1acj",
                new CifOptions.CifOptionsBuilder().fetchUrl("https://www.ebi.ac.uk/pdbe/coordinates/%s/full?encoding=bcif").build());
        Column<?> ebiNdbSeqNum = ebi.getBlocks().get(0)
                .getCategory("pdbx_nonpoly_scheme")
                .getColumn("ndb_seq_num");
        assertEquals(83, ebiNdbSeqNum.getRowCount());
    }

    @Test
    public void testWithSchema() throws IOException {
        MmCifFile rcsb = CifIO.readById("1acj").as(StandardSchemata.MMCIF);
        StrColumn rcsbNdbSeqNum = rcsb.getFirstBlock()
                .getPdbxNonpolyScheme()
                .getNdbSeqNum();
        assertEquals(83, rcsbNdbSeqNum.getRowCount());

        MmCifFile ebi = CifIO.readById("1acj",
                new CifOptions.CifOptionsBuilder().fetchUrl("https://www.ebi.ac.uk/pdbe/coordinates/%s/full?encoding=bcif").build())
                .as(StandardSchemata.MMCIF);
        StrColumn ebiNdbSeqNum = ebi.getFirstBlock()
                .getPdbxNonpolyScheme()
                .getNdbSeqNum();
        assertEquals(83, ebiNdbSeqNum.getRowCount());
    }
}
