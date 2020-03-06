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
    public StrColumn getCAS() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_CAS"));
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
    public StrColumn getCSD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_CSD"));
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
    public StrColumn getDepnumCcdcFiz() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_depnum_ccdc_fiz"));
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
    public StrColumn getICSD() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_ICSD"));
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
    public StrColumn getNBS() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_NBS"));
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
    public StrColumn getPDF() {
        return new DelegatingStrColumn(parentBlock.getColumn("database_code_PDF"));
    }

}