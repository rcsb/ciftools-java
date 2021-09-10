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
    public StrColumn getCSDHistory() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_CSD_history"));
    }

    /**
     * The digital object identifier (DOI) registered to identify
     * a data set publication associated with the structure
     * described in the current datablock. This should be used
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
     * specifications of the International DOI Foundation (see
     * http://www.doi.org).
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
    public StrColumn getJournalASTM() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_journal_ASTM"));
    }

    /**
     * The journal code used in the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getJournalCSD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_journal_CSD"));
    }

    /**
     * Code assigned by the Chemical Abstracts Service.
     * @return StrColumn
     */
    public StrColumn getCodeCAS() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_CAS"));
    }

    /**
     * Code assigned by the Chemical Abstracts Service.
     * @return StrColumn
     */
    public StrColumn getCAS() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_CAS"));
    }

    /**
     * Code assigned by Crystallography Open Database (COD).
     * @return StrColumn
     */
    public StrColumn getCodeCOD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_COD"));
    }

    /**
     * Code assigned by Crystallography Open Database (COD).
     * @return StrColumn
     */
    public StrColumn getCOD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_COD"));
    }

    /**
     * Code assigned by the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getCodeCSD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_CSD"));
    }

    /**
     * Code assigned by the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getCSD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_CSD"));
    }

    /**
     * Deposition numbers assigned by the Cambridge Crystallographic
     * Data Centre (CCDC) to files containing structural information
     * archived by the CCDC.
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcArchive() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_depnum_ccdc_archive"));
    }

    /**
     * Deposition numbers assigned by the Cambridge Crystallographic
     * Data Centre (CCDC) to files containing structural information
     * archived by the CCDC.
     * @return StrColumn
     */
    public StrColumn getDepnumCcdcArchive() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_depnum_ccdc_archive"));
    }

    /**
     * Deposition numbers assigned by the Fachinformationszentrum
     * Karlsruhe (FIZ) to files containing structural information
     * archived by the Cambridge Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcFiz() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_depnum_ccdc_fiz"));
    }

    /**
     * Deposition numbers assigned by the Fachinformationszentrum
     * Karlsruhe (FIZ) to files containing structural information
     * archived by the Cambridge Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getDepnumCcdcFiz() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_depnum_ccdc_fiz"));
    }

    /**
     * Deposition numbers assigned by various journals to files
     * containing structural information archived by the Cambridge
     * Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcJournal() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_depnum_ccdc_journal"));
    }

    /**
     * Deposition numbers assigned by various journals to files
     * containing structural information archived by the Cambridge
     * Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getDepnumCcdcJournal() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_depnum_ccdc_journal"));
    }

    /**
     * Code assigned by the Inorganic Crystal Structure Database.
     * @return StrColumn
     */
    public StrColumn getCodeICSD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_ICSD"));
    }

    /**
     * Code assigned by the Inorganic Crystal Structure Database.
     * @return StrColumn
     */
    public StrColumn getICSD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_ICSD"));
    }

    /**
     * Code assigned in the Metals Data File.
     * @return StrColumn
     */
    public StrColumn getCodeMDF() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_MDF"));
    }

    /**
     * Code assigned in the Metals Data File.
     * @return StrColumn
     */
    public StrColumn getMDF() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_MDF"));
    }

    /**
     * Code assigned by the NBS (NIST) Crystal Data Database.
     * @return StrColumn
     */
    public StrColumn getCodeNBS() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_NBS"));
    }

    /**
     * Code assigned by the NBS (NIST) Crystal Data Database.
     * @return StrColumn
     */
    public StrColumn getNBS() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_NBS"));
    }

    /**
     * Code assigned by the Protein Data Base.
     * @return StrColumn
     */
    public StrColumn getCodePDB() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_PDB"));
    }

    /**
     * Code assigned by the Protein Data Base.
     * @return StrColumn
     */
    public StrColumn getPDB() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_PDB"));
    }

    /**
     * Code assigned in the Powder Diffraction File.
     * @return StrColumn
     */
    public StrColumn getCodePDF() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_PDF"));
    }

    /**
     * Code assigned in the Powder Diffraction File.
     * @return StrColumn
     */
    public StrColumn getPDF() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_PDF"));
    }

}