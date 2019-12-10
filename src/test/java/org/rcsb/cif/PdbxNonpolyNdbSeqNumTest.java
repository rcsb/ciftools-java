package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.StrColumn;

import java.io.IOException;

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
        rcsbNdbSeqNum.values().forEach(System.out::println);

        CifFile ebi = CifIO.readById("1acj",
                new CifOptions.CifOptionsBuilder().fetchUrl("http://www.ebi.ac.uk/pdbe/coordinates/%s/full?encoding=bcif").build());
        StrColumn ebiNdbSeqNum = ebi.getFirstBlock()
                .getPdbxNonpolyScheme()
                .getNdbSeqNum();
        ebiNdbSeqNum.values().forEach(System.out::println);
    }
}
