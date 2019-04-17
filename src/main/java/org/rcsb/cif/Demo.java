package org.rcsb.cif;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.generated.CifBlock;
import org.rcsb.cif.model.generated.atomsite.AtomSite;
import org.rcsb.cif.model.generated.atomsite.CartnX;

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
        CifBlock data = cifFile.getBlocks().get(0);

        // get category with name '_atom_site' from first block - access is type-safe, all classes are
        // inferred from the CIF schema
        AtomSite _atom_site = data.getAtomSite();
        CartnX cartn_x = _atom_site.getCartnX();

        // calculate the average x-coordinate - #values() returns as DoubleStream as defined in the
        // schema for column 'cartn_x'
        OptionalDouble average_cartn_x = cartn_x.values().average();
        average_cartn_x.ifPresent(System.out::println);

        // print the last residue sequence id - this time #values() returns an IntStream
        OptionalInt last_label_seq_id = _atom_site.getLabelSeqId().values().max();
        last_label_seq_id.ifPresent(System.out::println);

        // print entry id - or #values() may be text
        Optional<String> stringValue = data.getEntry().getId().values().findFirst();
        stringValue.ifPresent(System.out::println);
    }
}
