package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DATABASE_PDB_REV category record details
 * about the history of the data block as archived by the Protein
 * Data Bank (PDB).
 * 
 * These data items are assigned by the PDB database managers and
 * should only appear in a data block if they originate from that
 * source.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class DatabasePDBRev extends BaseCategory {
    public DatabasePDBRev(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DatabasePDBRev(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DatabasePDBRev(String name) {
        super(name);
    }

    /**
     * The name of the person responsible for submitting this revision
     * to the PDB.
     * 
     * The family name(s) followed by a comma precedes the first
     * name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getAuthorName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("author_name", StrColumn::new) :
                getBinaryColumn("author_name"));
    }

    /**
     * Date the PDB revision took place. Taken from the REVDAT record.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * Date the entry first entered the PDB database in the form
     * yyyy-mm-dd. Taken from the PDB HEADER record.
     * @return StrColumn
     */
    public StrColumn getDateOriginal() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date_original", StrColumn::new) :
                getBinaryColumn("date_original"));
    }

    /**
     * A code taken from the REVDAT record classifying common types of entry
     * revisions.
     * @return StrColumn
     */
    public StrColumn getModType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mod_type", StrColumn::new) :
                getBinaryColumn("mod_type"));
    }

    /**
     * The value of _database_PDB_rev.num must uniquely and
     * sequentially identify a record in the DATABASE_PDB_REV list.
     * 
     * Note that this item must be a number and that modification
     * numbers are assigned in increasing numerical order.
     * @return IntColumn
     */
    public IntColumn getNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num", IntColumn::new) :
                getBinaryColumn("num"));
    }

    /**
     * The PDB code for a subsequent PDB entry that replaced the
     * PDB file corresponding to this data block.
     * @return StrColumn
     */
    public StrColumn getReplacedBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replaced_by", StrColumn::new) :
                getBinaryColumn("replaced_by"));
    }

    /**
     * The PDB code for a previous PDB entry that was replaced by
     * the PDB file corresponding to this data block.
     * @return StrColumn
     */
    public StrColumn getReplaces() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replaces", StrColumn::new) :
                getBinaryColumn("replaces"));
    }

    /**
     * The status of this revision.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status", StrColumn::new) :
                getBinaryColumn("status"));
    }

    /**
     * 
     * The first PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return StrColumn
     */
    public StrColumn getPdbxRecordRevised1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_record_revised_1", StrColumn::new) :
                getBinaryColumn("pdbx_record_revised_1"));
    }

    /**
     * 
     * The second PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return StrColumn
     */
    public StrColumn getPdbxRecordRevised2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_record_revised_2", StrColumn::new) :
                getBinaryColumn("pdbx_record_revised_2"));
    }

    /**
     * 
     * The third PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return StrColumn
     */
    public StrColumn getPdbxRecordRevised3() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_record_revised_3", StrColumn::new) :
                getBinaryColumn("pdbx_record_revised_3"));
    }

    /**
     * 
     * The fourth PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return StrColumn
     */
    public StrColumn getPdbxRecordRevised4() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_record_revised_4", StrColumn::new) :
                getBinaryColumn("pdbx_record_revised_4"));
    }
}
