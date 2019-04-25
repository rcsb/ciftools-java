package org.rcsb.cif;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.atomsite.AtomSite;
import org.rcsb.cif.model.atomsite.CartnX;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Demo {
    public static void main(String[] args) throws IOException {
        parseFile();
        System.out.println();
        buildModel();
    }

    private static void parseFile() throws IOException {
        String pdbId = "1acj";
        boolean parseBinary = true;

        // CIF and BinaryCIF are stored in the same data structure
        // to access the data, it does not matter where and in which format the data came from
        CifFile cifFile;
        if (parseBinary) {
            // parse binary CIF from ModelServer
            InputStream inputStream = new URL("https://webchem.ncbr.muni.cz/ModelServer/static/bcif/"
                    + pdbId).openStream();
            cifFile = CifReader.parseBinary(inputStream);
        } else {
            // parse CIF from PDB
            InputStream inputStream = new URL("https://files.rcsb.org/download/" + pdbId
                    + ".cif").openStream();
            cifFile = CifReader.parseText(inputStream);
        }

        // get first block of CIF
        Block data = cifFile.getFirstBlock();

        // get category with name '_atom_site' from first block - access is type-safe, all classes are
        // inferred from the CIF schema
        AtomSite atomSite = data.getAtomSite();
        CartnX cartnX = atomSite.getCartnX();

        // by definition, some categories can only contain a single row of data
        String entryId = data.getEntry().getId().get();
        System.out.println(entryId);

        // calculate the average x-coordinate - #values() returns as DoubleStream as defined in the
        // schema for column 'cartn_x'
        OptionalDouble averageCartnX = cartnX.values().average();
        averageCartnX.ifPresent(System.out::println);

        // print the last residue sequence id - this time #values() returns an IntStream
        OptionalInt lastLabelSeqId = atomSite.getLabelSeqId().values().max();
        lastLabelSeqId.ifPresent(System.out::println);

        // print record type - or #values() may be text
        Optional<String> groupPdb = data.getAtomSite().getGroupPDB().values().findFirst();
        groupPdb.ifPresent(System.out::println);
    }

    private static void buildModel() throws IOException {
        CifFile cifFile = CifFile.enterFile()
                // create a block
                .enterBlock("1EXP")
                // create a category with name 'entry'
                .enterCategory("entry")
                // set value of column 'id'
                .enterStrColumn("id")
                // to '1EXP'
                .stringValues("1EXP")
                // leave current column and category
                .leaveColumn()
                .leaveCategory()

                // create atom site category
                .enterCategory("atom_site")
                // and specify some x-coordinates
                .enterFloatColumn("Cartn_x")
                .floatValues(1.0, -2.4, 4.5)
                // values can be unknown or not specified
                .markNextUnknown()
                .floatValues(-3.14, 5.0)

                // leaving the builder will release the CifFile instance
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();

        println(CifWriter.writeText(cifFile));

        System.out.println(cifFile.getFirstBlock().getEntry().getId().get());
        cifFile.getFirstBlock()
                .getAtomSite()
                .getCartnX()
                .values()
                .forEach(System.out::println);
    }

    private static void println(InputStream inputStream) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[2048];
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.close();
        System.out.println(new String(buffer.toByteArray()));
    }
}
