package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.StrColumn;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

/**
 * BinaryCIF might slightly violate the schema and lead to a ClassCastException if not handled.
 */
public class PdbxNonpolyNdbSeqNumTest {
    @Test
    public void test() throws IOException {
        CifFile rcsb = CifIO.readById("1acj");
        StrColumn rcsbNdbSeqNum = rcsb.getFirstBlock()
                .getPdbxNonpolyScheme()
                .getNdbSeqNum();
        assertEquals(83, rcsbNdbSeqNum.getRowCount());

        CifFile ebi = CifIO.readById("1acj",
                new CifOptions.CifOptionsBuilder().fetchUrl("https://www.ebi.ac.uk/pdbe/coordinates/%s/full?encoding=bcif").build());
        StrColumn ebiNdbSeqNum = ebi.getFirstBlock()
                .getPdbxNonpolyScheme()
                .getNdbSeqNum();
        assertEquals(83, ebiNdbSeqNum.getRowCount());
    }
}
