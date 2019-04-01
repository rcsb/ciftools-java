package org.rcsb.cif.parser;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.rcsb.cif.model.CifBlock;
import org.rcsb.cif.model.CifCategory;
import org.rcsb.cif.model.CifField;
import org.rcsb.cif.model.CifFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class CifParserTest {
    private static String pdbId;

    @BeforeClass
    public static void setup() {
        pdbId = "1pga";
    }

    @Test
    public void parseBinary() throws IOException, ParsingException {
        // TODO acquire resource locally
        InputStream inputStream = new URL("https://webchem.ncbr.muni.cz/ModelServer/static/bcif/" + pdbId).openStream();
        checkParsedEntity(CifParser.parseBinary(inputStream));
    }

    @Test
    public void parseText() throws IOException, ParsingException {
        // TODO acquire resource locally
        InputStream inputStream = new URL("https://files.rcsb.org/download/" + pdbId + ".cif").openStream();
        checkParsedEntity(CifParser.parseText(inputStream));

    }

    private void checkParsedEntity(CifFile cifFile) throws ParsingException {
        // TODO actually find meaningful test cases of files with special needs
        // TODO refactor into generic test function
        CifBlock data = cifFile.getBlocks().get(0);
        CifCategory _atom_site = data.getCategory("atom_site");
        CifField cartn_x = _atom_site.getField("Cartn_x");

        // gets a float value from the 1st row
        double floatValue = cartn_x.getDouble(0);
        Assert.assertEquals("coordinate parsing corrupted", 26.778, floatValue, 0.001);

        // the last residue sequence id
        CifField label_seq_id = _atom_site.getField("label_seq_id");
        label_seq_id.ints().max().ifPresent(i -> Assert.assertEquals("sequence id parsing corrupted", 56, i));

        String stringValue = data.getCategory("entry").getField("id").getString(0);
        Assert.assertEquals("id parsing corrupted", "1PGA", stringValue);
    }
}