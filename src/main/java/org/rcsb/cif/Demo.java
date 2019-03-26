package org.rcsb.cif;

import org.rcsb.cif.api.CIFFile;
import org.rcsb.cif.api.Category;
import org.rcsb.cif.api.Column;
import org.rcsb.cif.api.DataBlock;
import org.rcsb.cif.binary.BinaryCIFParser;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Demo {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream = new URL("https://files.rcsb.org/download/1pga.cif").openStream();
//        CIFFile cifFile = new TextCIFParser().parse(inputStream);

        InputStream inputStream = new URL("https://webchem.ncbr.muni.cz/ModelServer/static/bcif/1pga").openStream();
        CIFFile cifFile = new BinaryCIFParser().parse(inputStream);

        DataBlock data = cifFile.getDataBlocks().get(0);
        Category _atom_site = data.getCategory("_atom_site");

        Column Cartn_x = _atom_site.getColumn("Cartn_x");

        // gets a float value from the 1st row
        float floatValue = Cartn_x.getFloat(0);
        System.out.println(floatValue);

        // the last residue sequence id
        int intValue = _atom_site.getColumn("label_seq_id").getInteger(_atom_site.getRowCount() - 1);
        System.out.println(intValue);

        String stringValue = data.getCategory("_entry").getColumn("id").getString(0);
        System.out.println(stringValue);
    }
}
