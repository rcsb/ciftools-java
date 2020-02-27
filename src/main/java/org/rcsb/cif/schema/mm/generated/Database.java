package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DATABASE category have been superseded by
 * data items in the DATABASE_2 category. They are included
 * here only for compliance with older CIFs.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The ASTM CODEN designator for a journal as given in the Chemical
     * Source List maintained by the Chemical Abstracts Service.
     * @return StrColumn
     */
    public StrColumn getJournalASTM() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_ASTM", StrColumn::new) :
                getBinaryColumn("journal_ASTM"));
    }

    /**
     * The journal code used in the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getJournalCSD() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_CSD", StrColumn::new) :
                getBinaryColumn("journal_CSD"));
    }

    /**
     * A history of changes made by the Cambridge Crystallographic Data
     * Centre and incorporated into the Cambridge Structural Database
     * (CSD).
     * @return StrColumn
     */
    public StrColumn getCSDHistory() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("CSD_history", StrColumn::new) :
                getBinaryColumn("CSD_history"));
    }

    /**
     * The code assigned by Chemical Abstracts.
     * @return StrColumn
     */
    public StrColumn getCodeCAS() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_CAS", StrColumn::new) :
                getBinaryColumn("code_CAS"));
    }

    /**
     * The code assigned by the Cambridge Structural Database.
     * @return StrColumn
     */
    public StrColumn getCodeCSD() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_CSD", StrColumn::new) :
                getBinaryColumn("code_CSD"));
    }

    /**
     * The code assigned by the Inorganic Crystal Structure
     * Database.
     * @return StrColumn
     */
    public StrColumn getCodeICSD() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_ICSD", StrColumn::new) :
                getBinaryColumn("code_ICSD"));
    }

    /**
     * The code assigned by the Metals Data File.
     * @return StrColumn
     */
    public StrColumn getCodeMDF() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_MDF", StrColumn::new) :
                getBinaryColumn("code_MDF"));
    }

    /**
     * The code assigned by the NBS (NIST) Crystal Data Database.
     * @return StrColumn
     */
    public StrColumn getCodeNBS() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_NBS", StrColumn::new) :
                getBinaryColumn("code_NBS"));
    }

    /**
     * The code assigned by the Protein Data Bank.
     * @return StrColumn
     */
    public StrColumn getCodePDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_PDB", StrColumn::new) :
                getBinaryColumn("code_PDB"));
    }

    /**
     * The code assigned by the Powder Diffraction File (JCPDS/ICDD).
     * @return StrColumn
     */
    public StrColumn getCodePDF() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_PDF", StrColumn::new) :
                getBinaryColumn("code_PDF"));
    }

    /**
     * Deposition numbers assigned by the Fachinformationszentrum
     * Karlsruhe (FIZ) to files containing structural information
     * archived by the Cambridge Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcFiz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_depnum_ccdc_fiz", StrColumn::new) :
                getBinaryColumn("code_depnum_ccdc_fiz"));
    }

    /**
     * Deposition numbers assigned by various journals to files
     * containing structural information archived by the Cambridge
     * Crystallographic Data Centre (CCDC).
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcJournal() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_depnum_ccdc_journal", StrColumn::new) :
                getBinaryColumn("code_depnum_ccdc_journal"));
    }

    /**
     * Deposition numbers assigned by the Cambridge Crystallographic
     * Data Centre (CCDC) to files containing structural information
     * archived by the CCDC.
     * @return StrColumn
     */
    public StrColumn getCodeDepnumCcdcArchive() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code_depnum_ccdc_archive", StrColumn::new) :
                getBinaryColumn("code_depnum_ccdc_archive"));
    }

    /**
     * 
     * The code assigned by the NDB.
     * @return StrColumn
     */
    public StrColumn getPdbxCodeNDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_code_NDB", StrColumn::new) :
                getBinaryColumn("pdbx_code_NDB"));
    }

    /**
     * 
     * The code assigned by the PDB.
     * @return StrColumn
     */
    public StrColumn getPdbxCodePDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_code_PDB", StrColumn::new) :
                getBinaryColumn("pdbx_code_PDB"));
    }

    /**
     * 
     * The codes of related PDB entries.
     * @return StrColumn
     */
    public StrColumn getPdbxRelatedCodesPDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_related_codes_PDB", StrColumn::new) :
                getBinaryColumn("pdbx_related_codes_PDB"));
    }
}
