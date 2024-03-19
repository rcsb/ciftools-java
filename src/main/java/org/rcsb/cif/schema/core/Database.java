package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items recording database deposition.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Database extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "database";

    public Database(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The history of changes made by the Cambridge Crystallographic Data
     * Centre and incorporated into the Cambridge Structural Database (CSD).
     * @return StrColumn
     */
    public StrColumn getCsdHistory() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_csd_history"));
    }

    /**
     * The digital object identifier (DOI) registered to identify
     * a data set publication associated with the structure
     * described in the current data block. This should be used
     * for a dataset obtained from a curated database such as
     * CSD or PDB.
     * 
     * A DOI is a unique character string identifying any
     * object of intellectual property. It provides a
     * persistent identifier for an object on a digital network
     * and permits the association of related current data in a
     * structured extensible way. A DOI is an implementation
     * of the Internet concepts of Uniform Resource Name and
     * Universal Resource Locator managed according to the
     * specifications of the International DOI Foundation
     * (see https://www.doi.org/).
     * @return StrColumn
     */
    public StrColumn getDatasetDoi() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_dataset_doi"));
    }

    /**
     * ASTM CODEN designator for a journal as given in the Chemical
     * Source List maintained by the Chemical Abstracts Service.
     * @return StrColumn
     */
    public StrColumn getJournalAstm() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_journal_astm"));
    }

    /**
     * The journal code used in the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getJournalCsd() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_journal_csd"));
    }

    /**
     * Code assigned by the Chemical Abstracts Service.
     * @return StrColumn
     */
    public StrColumn getCodeCAS() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_CAS", "database_code_cas"));
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
    public StrColumn getCodeCOD() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_COD", "database_code_cod"));
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
    public StrColumn getCodeCSD() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_CSD", "database_code_csd"));
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
    public StrColumn getCodeDepnumCCDCArchive() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_depnum_CCDC_archive", "database_code_depnum_ccdc_archive"));
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
    public StrColumn getCodeDepnumCCDCFiz() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_depnum_CCDC_fiz", "database_code_depnum_ccdc_fiz"));
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
    public StrColumn getCodeDepnumCCDCJournal() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_depnum_CCDC_journal", "database_code_depnum_ccdc_journal"));
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
    public StrColumn getCodeICSD() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_ICSD", "database_code_icsd"));
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
    public StrColumn getCodeMDF() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_MDF", "database_code_mdf"));
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
    public StrColumn getCodeNBS() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_NBS", "database_code_nbs"));
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
    public StrColumn getCodePDB() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_PDB", "database_code_pdb"));
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
    public StrColumn getCodePDF() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_PDF", "database_code_pdf"));
    }

    /**
     * Code assigned in the Powder Diffraction File.
     * @return StrColumn
     */
    public StrColumn getPdf() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("database_code_PDF", "database_code_pdf"));
    }

}