package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items recording database deposition. These data items
 * are assigned by database managers and should only appear in a CIF if they
 * originate from that source.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DatabaseCode extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "database_code";

    public DatabaseCode(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Code assigned by the Chemical Abstracts Service.
     * @return StrColumn
     */
    public StrColumn getCas() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_CAS", "database_code_cas"));
    }

    /**
     * Code assigned by the Crystallography Open Database (COD).
     * @return StrColumn
     */
    public StrColumn getCod() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_COD", "database_code_cod"));
    }

    /**
     * Code assigned by the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getCsd() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_CSD", "database_code_csd"));
    }

    /**
     * Deposition numbers assigned by the Cambridge Crystallographic
     * Data Centre (CCDC) to files containing structural information
     * archived by the CCDC.
     * @return StrColumn
     */
    public StrColumn getDepnumCcdcArchive() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_depnum_CCDC_archive", "database_code_depnum_ccdc_archive"));
    }

    /**
     * Deposition numbers assigned by the Fachinformationszentrum
     * Karlsruhe (FIZ) to files containing structural information
     * archived by the Cambridge Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getDepnumCcdcFiz() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_depnum_CCDC_fiz", "database_code_depnum_ccdc_fiz"));
    }

    /**
     * Deposition numbers assigned by various journals to files
     * containing structural information archived by the Cambridge
     * Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getDepnumCcdcJournal() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_depnum_CCDC_journal", "database_code_depnum_ccdc_journal"));
    }

    /**
     * Code assigned by the Inorganic Crystal Structure Database.
     * @return StrColumn
     */
    public StrColumn getIcsd() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_ICSD", "database_code_icsd"));
    }

    /**
     * Code assigned in the Metals Data File.
     * @return StrColumn
     */
    public StrColumn getMdf() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_MDF", "database_code_mdf"));
    }

    /**
     * Code assigned by the NBS (NIST) Crystal Data Database.
     * @return StrColumn
     */
    public StrColumn getNbs() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_NBS", "database_code_nbs"));
    }

    /**
     * Code assigned by the Protein Data Bank.
     * @return StrColumn
     */
    public StrColumn getPdb() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_PDB", "database_code_pdb"));
    }

    /**
     * Code assigned in the Powder Diffraction File.
     * @return StrColumn
     */
    public StrColumn getPdf() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_PDF", "database_code_pdf"));
    }

}