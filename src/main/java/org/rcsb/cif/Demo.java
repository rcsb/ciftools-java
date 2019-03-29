package org.rcsb.cif;

import org.rcsb.cif.model.CifBlock;
import org.rcsb.cif.model.CifCategory;
import org.rcsb.cif.model.CifField;
import org.rcsb.cif.model.CifFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) throws IOException, ParsingException {
        InputStream inputStream = new URL("https://files.rcsb.org/download/1pga.cif").openStream();
        CifFile cifFile = CifParser.parseText(new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.joining(System.lineSeparator())));

//        InputStream inputStream = new URL("https://webchem.ncbr.muni.cz/ModelServer/static/bcif/1pga").openStream();
//        CIFFile cifFile = new BinaryCIFParser().parse(inputStream);

        CifBlock data = cifFile.getBlocks().get(0);
        CifCategory _atom_site = data.getCategories().get("atom_site");

        CifField Cartn_x = _atom_site.getFields().get("Cartn_x");

        // gets a float value from the 1st row
        double floatValue = Cartn_x.getDouble(0);
        System.out.println(floatValue);

        // the last residue sequence id
        int intValue = _atom_site.getFields().get("label_seq_id").getInt(_atom_site.getFields().size() - 1);
        System.out.println(intValue);

        String stringValue = data.getCategories().get("entry").getFields().get("id").getStr(0);
        System.out.println(stringValue);
    }
}
