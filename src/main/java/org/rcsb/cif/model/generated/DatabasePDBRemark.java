package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DATABASE_PDB_REMARK category record details
 * about the data block as archived by the Protein Data Bank (PDB).
 * 
 * Some data appearing in PDB REMARK records can be
 * algorithmically extracted into the appropriate data items
 * in the data block.
 * 
 * These data items are included only for consistency with older
 * PDB format files. They should appear in a data block only if
 * that data block was created by reformatting a PDB format file.
 * 
 * NOTE: These remark records in this category are not uniformly
 * annotated by the PDB and may not be consistent with
 * nomenclature or labeling used in the entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DatabasePDBRemark extends BaseCategory {
    public DatabasePDBRemark(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DatabasePDBRemark(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DatabasePDBRemark(String name) {
        super(name);
    }

    /**
     * A unique identifier for the PDB remark record.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The full text of the PDB remark record.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
