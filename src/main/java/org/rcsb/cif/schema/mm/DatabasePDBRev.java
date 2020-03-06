package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DATABASE_PDB_REV category record details
 * about the history of the data block as archived by the Protein
 * Data Bank (PDB).
 * 
 * These data items are assigned by the PDB database managers and
 * should only appear in a data block if they originate from that
 * source.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DatabasePDBRev extends DelegatingCategory {
    public DatabasePDBRev(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "author_name":
                return getAuthorName();
            case "date":
                return getDate();
            case "date_original":
                return getDateOriginal();
            case "mod_type":
                return getModType();
            case "num":
                return getNum();
            case "replaced_by":
                return getReplacedBy();
            case "replaces":
                return getReplaces();
            case "status":
                return getStatus();
            case "pdbx_record_revised_1":
                return getPdbxRecordRevised1();
            case "pdbx_record_revised_2":
                return getPdbxRecordRevised2();
            case "pdbx_record_revised_3":
                return getPdbxRecordRevised3();
            case "pdbx_record_revised_4":
                return getPdbxRecordRevised4();
            default:
                return new DelegatingColumn(column);
        }
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
        return delegate.getColumn("author_name", DelegatingStrColumn::new);
    }

    /**
     * Date the PDB revision took place. Taken from the REVDAT record.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * Date the entry first entered the PDB database in the form
     * yyyy-mm-dd. Taken from the PDB HEADER record.
     * @return StrColumn
     */
    public StrColumn getDateOriginal() {
        return delegate.getColumn("date_original", DelegatingStrColumn::new);
    }

    /**
     * A code taken from the REVDAT record classifying common types of entry
     * revisions.
     * @return StrColumn
     */
    public StrColumn getModType() {
        return delegate.getColumn("mod_type", DelegatingStrColumn::new);
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
        return delegate.getColumn("num", DelegatingIntColumn::new);
    }

    /**
     * The PDB code for a subsequent PDB entry that replaced the
     * PDB file corresponding to this data block.
     * @return StrColumn
     */
    public StrColumn getReplacedBy() {
        return delegate.getColumn("replaced_by", DelegatingStrColumn::new);
    }

    /**
     * The PDB code for a previous PDB entry that was replaced by
     * the PDB file corresponding to this data block.
     * @return StrColumn
     */
    public StrColumn getReplaces() {
        return delegate.getColumn("replaces", DelegatingStrColumn::new);
    }

    /**
     * The status of this revision.
     * @return StrColumn
     */
    public StrColumn getStatus() {
        return delegate.getColumn("status", DelegatingStrColumn::new);
    }

    /**
     * The first PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return StrColumn
     */
    public StrColumn getPdbxRecordRevised1() {
        return delegate.getColumn("pdbx_record_revised_1", DelegatingStrColumn::new);
    }

    /**
     * The second PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return StrColumn
     */
    public StrColumn getPdbxRecordRevised2() {
        return delegate.getColumn("pdbx_record_revised_2", DelegatingStrColumn::new);
    }

    /**
     * The third PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return StrColumn
     */
    public StrColumn getPdbxRecordRevised3() {
        return delegate.getColumn("pdbx_record_revised_3", DelegatingStrColumn::new);
    }

    /**
     * The fourth PDB record name that was revised.
     * 
     * OBSOLETE LOCAL ITEM -- Replaced by _database_PDB_rev_record.type
     * @return StrColumn
     */
    public StrColumn getPdbxRecordRevised4() {
        return delegate.getColumn("pdbx_record_revised_4", DelegatingStrColumn::new);
    }

}