package org.rcsb.cif;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.schema.StandardSchemas;
import org.rcsb.cif.schema.mm.generated.AtomSite;
import org.rcsb.cif.schema.mm.generated.MmCifBlock;

import java.io.IOException;
import java.net.URL;
import java.util.OptionalDouble;

public class Demo {
    public static void main(String[] args) throws IOException {
        parseFile();
        System.out.println();
        buildModel();
    }

    private static void parseFile() throws IOException {
        String pdbId = "1acj";
        boolean parseBinary = false;

        // CIF and BinaryCIF are stored in the same data structure
        // to access the data, it does not matter where and in which format the data came from
        CifFile cifFile;
        if (parseBinary) {
            // parse binary CIF from PDBe
            cifFile = CifIO.readFromURL(new URL("https://models.rcsb.org/" + pdbId + ".bcif"));
        } else {
            // parse CIF from RCSB PDB
            cifFile = CifIO.readFromURL(new URL("https://files.rcsb.org/download/" + pdbId + ".cif"));
        }

        // get first block of CIF
        MmCifBlock data = cifFile.getFirstBlock(StandardSchemas.MMCIF);

        // get category with name '_atom_site' from first block - access is type-safe, all categories
        // are inferred from the CIF schema
        AtomSite atomSite = data.getAtomSite();
        FloatColumn cartnX = atomSite.getCartnX();
//
//        // obtain entry id
//        String entryId = data.getEntry().getId().get(0);
//        System.out.println(entryId);
//
        // calculate the average x-coordinate - #values() returns as DoubleStream as defined in the
        // schema for column 'Cartn_x'
        OptionalDouble averageCartnX = cartnX.values().average();
        averageCartnX.ifPresent(System.out::println);
//
//        // print the last residue sequence id - this time #values() returns an IntStream
//        OptionalInt lastLabelSeqId = atomSite.getLabelSeqId().values().max();
//        lastLabelSeqId.ifPresent(System.out::println);
//
//        // print record type - or #values() may be text
//        Optional<String> groupPdb = data.getAtomSite().getGroupPDB().values().findFirst();
//        groupPdb.ifPresent(System.out::println);
    }

    private static void buildModel() throws IOException {
//        CifFile cifFile = new CifBuilder()
//                // create a block
//                .enterBlock("1EXP")
//                // create a category with name 'entry'
//                .enterEntry()
//                // set value of column 'id'
//                .enterId()
//                // to '1EXP'
//                .add("1EXP")
//                // leave current column and category
//                .leaveColumn()
//                .leaveCategory()
//
//                // create atom site category
//                .enterAtomSite()
//                // and specify some x-coordinates
//                .enterCartnX()
//                .add(1.0, -2.4, 4.5)
//                // values can be unknown or not specified
//                .markNextUnknown()
//                .add(-3.14, 5.0)
//                .leaveColumn()
//
//                // after leaving, the builder is in AtomSite again and provides column names
//                .enterCartnY()
//                .add(0.0, -1.0, 2.72)
//                .markNextNotPresent()
//                .add(42, 100)
//                .leaveColumn()
//
//                // leaving the builder will release the CifFile instance
//                .leaveCategory()
//                .leaveBlock()
//                .leaveFile();
//
//        System.out.println(new String(CifIO.writeText(cifFile)));

//        System.out.println(cifFile.getFirstBlock().getEntry().getId().get(0));
//        cifFile.getFirstBlock()
//                .getAtomSite()
//                .getCartnX()
//                .values()
//                .forEach(System.out::println);
    }
}
