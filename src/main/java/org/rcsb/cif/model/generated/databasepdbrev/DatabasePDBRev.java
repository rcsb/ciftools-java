package org.rcsb.cif.model.generated.databasepdbrev;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AuthorName
     */
    public AuthorName getAuthorName() {
        return (AuthorName) (isText ? textFields.computeIfAbsent("author_name",
                AuthorName::new) : getBinaryColumn("author_name"));
    }

    /**
     * Date the PDB revision took place. Taken from the REVDAT record.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * Date the entry first entered the PDB database in the form
     * yyyy-mm-dd. Taken from the PDB HEADER record.
     * @return DateOriginal
     */
    public DateOriginal getDateOriginal() {
        return (DateOriginal) (isText ? textFields.computeIfAbsent("date_original",
                DateOriginal::new) : getBinaryColumn("date_original"));
    }

    /**
     * A code taken from the REVDAT record classifying common types of entry
     * revisions.
     * @return ModType
     */
    public ModType getModType() {
        return (ModType) (isText ? textFields.computeIfAbsent("mod_type",
                ModType::new) : getBinaryColumn("mod_type"));
    }

    /**
     * The value of _database_PDB_rev.num must uniquely and
     * sequentially identify a record in the DATABASE_PDB_REV list.
     * 
     * Note that this item must be a number and that modification
     * numbers are assigned in increasing numerical order.
     * @return Num
     */
    public Num getNum() {
        return (Num) (isText ? textFields.computeIfAbsent("num",
                Num::new) : getBinaryColumn("num"));
    }

    /**
     * The PDB code for a subsequent PDB entry that replaced the
     * PDB file corresponding to this data block.
     * @return ReplacedBy
     */
    public ReplacedBy getReplacedBy() {
        return (ReplacedBy) (isText ? textFields.computeIfAbsent("replaced_by",
                ReplacedBy::new) : getBinaryColumn("replaced_by"));
    }

    /**
     * The PDB code for a previous PDB entry that was replaced by
     * the PDB file corresponding to this data block.
     * @return Replaces
     */
    public Replaces getReplaces() {
        return (Replaces) (isText ? textFields.computeIfAbsent("replaces",
                Replaces::new) : getBinaryColumn("replaces"));
    }

    /**
     * The status of this revision.
     * @return Status
     */
    public Status getStatus() {
        return (Status) (isText ? textFields.computeIfAbsent("status",
                Status::new) : getBinaryColumn("status"));
    }

    /**
     * 
     * The first PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return PdbxRecordRevised1
     */
    public PdbxRecordRevised1 getPdbxRecordRevised1() {
        return (PdbxRecordRevised1) (isText ? textFields.computeIfAbsent("pdbx_record_revised_1",
                PdbxRecordRevised1::new) : getBinaryColumn("pdbx_record_revised_1"));
    }

    /**
     * 
     * The second PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return PdbxRecordRevised2
     */
    public PdbxRecordRevised2 getPdbxRecordRevised2() {
        return (PdbxRecordRevised2) (isText ? textFields.computeIfAbsent("pdbx_record_revised_2",
                PdbxRecordRevised2::new) : getBinaryColumn("pdbx_record_revised_2"));
    }

    /**
     * 
     * The third PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return PdbxRecordRevised3
     */
    public PdbxRecordRevised3 getPdbxRecordRevised3() {
        return (PdbxRecordRevised3) (isText ? textFields.computeIfAbsent("pdbx_record_revised_3",
                PdbxRecordRevised3::new) : getBinaryColumn("pdbx_record_revised_3"));
    }

    /**
     * 
     * The fourth PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return PdbxRecordRevised4
     */
    public PdbxRecordRevised4 getPdbxRecordRevised4() {
        return (PdbxRecordRevised4) (isText ? textFields.computeIfAbsent("pdbx_record_revised_4",
                PdbxRecordRevised4::new) : getBinaryColumn("pdbx_record_revised_4"));
    }
}
