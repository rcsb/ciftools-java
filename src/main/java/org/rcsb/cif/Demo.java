package org.rcsb.cif;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.BlockImpl;
import org.rcsb.cif.model.atomsite.AtomSite;
import org.rcsb.cif.model.atomsite.CartnX;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Demo {
    public static void main(String[] args) throws IOException, ParsingException {
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
        BlockImpl data = cifFile.getFirstBlock();

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
}
