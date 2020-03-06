package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DATABASE category have been superseded by
 * data items in the DATABASE_2 category. They are included
 * here only for compliance with older CIFs.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Database extends DelegatingCategory {
    public Database(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "journal_ASTM":
                return getJournalASTM();
            case "journal_CSD":
                return getJournalCSD();
            case "CSD_history":
                return getCSDHistory();
            case "code_CAS":
                return getCodeCAS();
            case "code_CSD":
                return getCodeCSD();
            case "code_ICSD":
                return getCodeICSD();
            case "code_MDF":
                return getCodeMDF();
            case "code_NBS":
                return getCodeNBS();
            case "code_PDB":
                return getCodePDB();
            case "code_PDF":
                return getCodePDF();
            case "code_depnum_ccdc_fiz":
                return getCodeDepnumCcdcFiz();
            case "code_depnum_ccdc_journal":
                return getCodeDepnumCcdcJournal();
            case "code_depnum_ccdc_archive":
                return getCodeDepnumCcdcArchive();
            case "pdbx_code_NDB":
                return getPdbxCodeNDB();
            case "pdbx_code_PDB":
                return getPdbxCodePDB();
            case "pdbx_related_codes_PDB":
                return getPdbxRelatedCodesPDB();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The ASTM CODEN designator for a journal as given in the Chemical
     * Source List maintained by the Chemical Abstracts Service.
     * @return StrColumn
     */
    public StrColumn getJournalASTM() {
        return delegate.getColumn("journal_ASTM", DelegatingStrColumn::new);
    }

    /**
     * The journal code used in the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getJournalCSD() {
        return delegate.getColumn("journal_CSD", DelegatingStrColumn::new);
    }

    /**
     * A history of changes made by the Cambridge Crystallographic Data
     * Centre and incorporated into the Cambridge Structural Database
     * (CSD).
     * @return StrColumn
     */
    public StrColumn getCSDHistory() {
        return delegate.getColumn("CSD_history", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by Chemical Abstracts.
     * @return StrColumn
     */
    public StrColumn getCodeCAS() {
        return delegate.getColumn("code_CAS", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getCodeCSD() {
        return delegate.getColumn("code_CSD", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the Inorganic Crystal Structure
     * Database.
     * @return StrColumn
     */
    public StrColumn getCodeICSD() {
        return delegate.getColumn("code_ICSD", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the Metals Data File.
     * @return StrColumn
     */
    public StrColumn getCodeMDF() {
        return delegate.getColumn("code_MDF", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the NBS (NIST) Crystal Data Database.
     * @return StrColumn
     */
    public StrColumn getCodeNBS() {
        return delegate.getColumn("code_NBS", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the Protein Data Bank.
     * @return StrColumn
     */
    public StrColumn getCodePDB() {
        return delegate.getColumn("code_PDB", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the Powder Diffraction File (JCPDS/ICDD).
     * @return StrColumn
     */
    public StrColumn getCodePDF() {
        return delegate.getColumn("code_PDF", DelegatingStrColumn::new);
    }

    /**
     * Deposition numbers assigned by the Fachinformationszentrum
     * Karlsruhe (FIZ) to files containing structural information
     * archived by the Cambridge Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcFiz() {
        return delegate.getColumn("code_depnum_ccdc_fiz", DelegatingStrColumn::new);
    }

    /**
     * Deposition numbers assigned by various journals to files
     * containing structural information archived by the Cambridge
     * Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcJournal() {
        return delegate.getColumn("code_depnum_ccdc_journal", DelegatingStrColumn::new);
    }

    /**
     * Deposition numbers assigned by the Cambridge Crystallographic
     * Data Centre (CCDC) to files containing structural information
     * archived by the CCDC.
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcArchive() {
        return delegate.getColumn("code_depnum_ccdc_archive", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the NDB.
     * @return StrColumn
     */
    public StrColumn getPdbxCodeNDB() {
        return delegate.getColumn("pdbx_code_NDB", DelegatingStrColumn::new);
    }

    /**
     * The code assigned by the PDB.
     * @return StrColumn
     */
    public StrColumn getPdbxCodePDB() {
        return delegate.getColumn("pdbx_code_PDB", DelegatingStrColumn::new);
    }

    /**
     * The codes of related PDB entries.
     * @return StrColumn
     */
    public StrColumn getPdbxRelatedCodesPDB() {
        return delegate.getColumn("pdbx_related_codes_PDB", DelegatingStrColumn::new);
    }

}