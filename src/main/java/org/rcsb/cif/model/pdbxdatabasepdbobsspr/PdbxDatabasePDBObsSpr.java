package org.rcsb.cif.model.pdbxdatabasepdbobsspr;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDatabasePDBObsSpr extends BaseCategory {
    public PdbxDatabasePDBObsSpr(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabasePDBObsSpr(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabasePDBObsSpr(String name) {
        super(name);
    }

    /**
     * Identifier for the type of obsolete entry to be added to this entry.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The date of replacement.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * The new PDB identifier for the replaced entry.
     * @return PdbId
     */
    public PdbId getPdbId() {
        return (PdbId) (isText ? textFields.computeIfAbsent("pdb_id",
                PdbId::new) : getBinaryColumn("pdb_id"));
    }

    /**
     * The PDB identifier for the replaced (OLD) entry/entries.
     * @return ReplacePdbId
     */
    public ReplacePdbId getReplacePdbId() {
        return (ReplacePdbId) (isText ? textFields.computeIfAbsent("replace_pdb_id",
                ReplacePdbId::new) : getBinaryColumn("replace_pdb_id"));
    }

    /**
     * Details related to the replaced or replacing entry.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
