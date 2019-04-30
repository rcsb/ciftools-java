package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Data items in the PDBX_DATABASE_REMARK category record keep additional
 * information about the entry.  They are mostly used to create
 * 'non-standard' PDB REMARK annotations (6-99).
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDatabaseRemark extends BaseCategory {
    public PdbxDatabaseRemark(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabaseRemark(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabaseRemark(String name) {
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
