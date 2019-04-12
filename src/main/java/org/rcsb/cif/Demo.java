package org.rcsb.cif;

import org.rcsb.cif.model.CifColumn;
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
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) throws IOException, ParsingException {
        String pdbId = "1acj";
        boolean parseBinary = false;

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

        // print entry id - or values may be text
        Optional<String> stringValue = data.getEntry().getId().values().findFirst();
        stringValue.ifPresent(System.out::println);

        Pattern.compile("\n").splitAsStream("symmetry cell_setting EnumColumn\n" +
                "entity type EnumColumn\n" +
                "entity src_method EnumColumn\n" +
                "entity pdbx_description ListColumn\n" +
                "entity pdbx_ec ListColumn\n" +
                "entity_poly type EnumColumn\n" +
                "entity_poly nstd_linkage EnumColumn\n" +
                "entity_poly nstd_monomer EnumColumn\n" +
                "entity_poly pdbx_strand_id ListColumn\n" +
                "entity_poly_seq hetero EnumColumn\n" +
                "chem_comp type EnumColumn\n" +
                "chem_comp mon_nstd_flag EnumColumn\n" +
                "chem_comp pdbx_synonyms ListColumn\n" +
                "exptl method EnumColumn\n" +
                "struct_keywords text ListColumn\n" +
                "struct_asym pdbx_blank_PDB_chainid_flag EnumColumn\n" +
                "struct_conf conf_type_id EnumColumn\n" +
                "struct_conn conn_type_id EnumColumn\n" +
                "struct_conn pdbx_value_order EnumColumn\n" +
                "struct_conn_type id EnumColumn\n" +
                "atom_site group_PDB EnumColumn\n" +
                "pdbx_struct_assembly_gen asym_id_list ListColumn\n" +
                "pdbx_struct_oper_list type EnumColumn")
                .map(line -> line.split(" "))
                .forEach(split -> {
                    CifColumn column = data.getCategory(split[0]).getColumn(split[1]);
                    System.out.println(split[0] +"/" + split[1] + " " + split[2]);
//                    column.stringValues().forEach(System.out::println);
                });
    }
}
