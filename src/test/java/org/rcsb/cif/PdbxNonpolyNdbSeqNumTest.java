package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

/**
 * BinaryCIF might slightly violate the schema and lead to a ClassCastException if not handled.
 */
public class PdbxNonpolyNdbSeqNumTest {
    @Test
    public void test() throws IOException {
        CifFile rcsb = CifIO.readById("1acj");
        Column rcsbNdbSeqNum = rcsb.getBlocks().get(0)
                .getCategory("pdbx_nonpoly_scheme")
                .getColumn("ndb_seq_num");
        assertEquals(83, rcsbNdbSeqNum.getRowCount());

        CifFile ebi = CifIO.readById("1acj",
                new CifOptions.CifOptionsBuilder().fetchUrl("https://www.ebi.ac.uk/pdbe/coordinates/%s/full?encoding=bcif").build());
        Column ebiNdbSeqNum = ebi.getBlocks().get(0)
                .getCategory("pdbx_nonpoly_scheme")
                .getColumn("ndb_seq_num");
        assertEquals(83, ebiNdbSeqNum.getRowCount());
    }
}
