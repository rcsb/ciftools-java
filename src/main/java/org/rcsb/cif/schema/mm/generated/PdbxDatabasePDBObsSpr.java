package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_DATABASE_PDB_OBS_SPR category provides placeholders
 * for information on obsolete/superseded PDB entries
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The date of replacement.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * The new PDB identifier for the replaced entry.
     * @return StrColumn
     */
    public StrColumn getPdbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_id", StrColumn::new) :
                getBinaryColumn("pdb_id"));
    }

    /**
     * The PDB identifier for the replaced (OLD) entry/entries.
     * @return StrColumn
     */
    public StrColumn getReplacePdbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replace_pdb_id", StrColumn::new) :
                getBinaryColumn("replace_pdb_id"));
    }

    /**
     * Details related to the replaced or replacing entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
