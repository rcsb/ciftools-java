package org.rcsb.cif.model.database;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Database extends BaseCategory {
    public Database(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Database(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Database(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The ASTM CODEN designator for a journal as given in the Chemical
     * Source List maintained by the Chemical Abstracts Service.
     * @return JournalASTM
     */
    public JournalASTM getJournalASTM() {
        return (JournalASTM) (isText ? textFields.computeIfAbsent("journal_ASTM",
                JournalASTM::new) : getBinaryColumn("journal_ASTM"));
    }

    /**
     * The journal code used in the Cambridge Structural Database.
     * @return JournalCSD
     */
    public JournalCSD getJournalCSD() {
        return (JournalCSD) (isText ? textFields.computeIfAbsent("journal_CSD",
                JournalCSD::new) : getBinaryColumn("journal_CSD"));
    }

    /**
     * A history of changes made by the Cambridge Crystallographic Data
     * Centre and incorporated into the Cambridge Structural Database
     * (CSD).
     * @return CSDHistory
     */
    public CSDHistory getCSDHistory() {
        return (CSDHistory) (isText ? textFields.computeIfAbsent("CSD_history",
                CSDHistory::new) : getBinaryColumn("CSD_history"));
    }

    /**
     * The code assigned by Chemical Abstracts.
     * @return CodeCAS
     */
    public CodeCAS getCodeCAS() {
        return (CodeCAS) (isText ? textFields.computeIfAbsent("code_CAS",
                CodeCAS::new) : getBinaryColumn("code_CAS"));
    }

    /**
     * The code assigned by the Cambridge Structural Database.
     * @return CodeCSD
     */
    public CodeCSD getCodeCSD() {
        return (CodeCSD) (isText ? textFields.computeIfAbsent("code_CSD",
                CodeCSD::new) : getBinaryColumn("code_CSD"));
    }

    /**
     * The code assigned by the Inorganic Crystal Structure
     * Database.
     * @return CodeICSD
     */
    public CodeICSD getCodeICSD() {
        return (CodeICSD) (isText ? textFields.computeIfAbsent("code_ICSD",
                CodeICSD::new) : getBinaryColumn("code_ICSD"));
    }

    /**
     * The code assigned by the Metals Data File.
     * @return CodeMDF
     */
    public CodeMDF getCodeMDF() {
        return (CodeMDF) (isText ? textFields.computeIfAbsent("code_MDF",
                CodeMDF::new) : getBinaryColumn("code_MDF"));
    }

    /**
     * The code assigned by the NBS (NIST) Crystal Data Database.
     * @return CodeNBS
     */
    public CodeNBS getCodeNBS() {
        return (CodeNBS) (isText ? textFields.computeIfAbsent("code_NBS",
                CodeNBS::new) : getBinaryColumn("code_NBS"));
    }

    /**
     * The code assigned by the Protein Data Bank.
     * @return CodePDB
     */
    public CodePDB getCodePDB() {
        return (CodePDB) (isText ? textFields.computeIfAbsent("code_PDB",
                CodePDB::new) : getBinaryColumn("code_PDB"));
    }

    /**
     * The code assigned by the Powder Diffraction File (JCPDS/ICDD).
     * @return CodePDF
     */
    public CodePDF getCodePDF() {
        return (CodePDF) (isText ? textFields.computeIfAbsent("code_PDF",
                CodePDF::new) : getBinaryColumn("code_PDF"));
    }

    /**
     * Deposition numbers assigned by the Fachinformationszentrum
     * Karlsruhe (FIZ) to files containing structural information
     * archived by the Cambridge Crystallographic Data Centre (CCDC).
     * @return CodeDepnumCcdcFiz
     */
    public CodeDepnumCcdcFiz getCodeDepnumCcdcFiz() {
        return (CodeDepnumCcdcFiz) (isText ? textFields.computeIfAbsent("code_depnum_ccdc_fiz",
                CodeDepnumCcdcFiz::new) : getBinaryColumn("code_depnum_ccdc_fiz"));
    }

    /**
     * Deposition numbers assigned by various journals to files
     * containing structural information archived by the Cambridge
     * Crystallographic Data Centre (CCDC).
     * @return CodeDepnumCcdcJournal
     */
    public CodeDepnumCcdcJournal getCodeDepnumCcdcJournal() {
        return (CodeDepnumCcdcJournal) (isText ? textFields.computeIfAbsent("code_depnum_ccdc_journal",
                CodeDepnumCcdcJournal::new) : getBinaryColumn("code_depnum_ccdc_journal"));
    }

    /**
     * Deposition numbers assigned by the Cambridge Crystallographic
     * Data Centre (CCDC) to files containing structural information
     * archived by the CCDC.
     * @return CodeDepnumCcdcArchive
     */
    public CodeDepnumCcdcArchive getCodeDepnumCcdcArchive() {
        return (CodeDepnumCcdcArchive) (isText ? textFields.computeIfAbsent("code_depnum_ccdc_archive",
                CodeDepnumCcdcArchive::new) : getBinaryColumn("code_depnum_ccdc_archive"));
    }

    /**
     * 
     * The code assigned by the NDB.
     * @return PdbxCodeNDB
     */
    public PdbxCodeNDB getPdbxCodeNDB() {
        return (PdbxCodeNDB) (isText ? textFields.computeIfAbsent("pdbx_code_NDB",
                PdbxCodeNDB::new) : getBinaryColumn("pdbx_code_NDB"));
    }

    /**
     * 
     * The code assigned by the PDB.
     * @return PdbxCodePDB
     */
    public PdbxCodePDB getPdbxCodePDB() {
        return (PdbxCodePDB) (isText ? textFields.computeIfAbsent("pdbx_code_PDB",
                PdbxCodePDB::new) : getBinaryColumn("pdbx_code_PDB"));
    }

    /**
     * 
     * The codes of related PDB entries.
     * @return PdbxRelatedCodesPDB
     */
    public PdbxRelatedCodesPDB getPdbxRelatedCodesPDB() {
        return (PdbxRelatedCodesPDB) (isText ? textFields.computeIfAbsent("pdbx_related_codes_PDB",
                PdbxRelatedCodesPDB::new) : getBinaryColumn("pdbx_related_codes_PDB"));
    }
}
