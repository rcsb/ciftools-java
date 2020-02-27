package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Local data items describing ligand and monomer
 * modifications.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxConnectModification extends BaseCategory {
    public PdbxConnectModification(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxConnectModification(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxConnectModification(String name) {
        super(name);
    }

    /**
     * Unique (typically 3-letter code) identifier for chemical group.
     * @return StrColumn
     */
    public StrColumn getResName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("res_name", StrColumn::new) :
                getBinaryColumn("res_name"));
    }

    /**
     * Type of modification
     * @return StrColumn
     */
    public StrColumn getModification() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("modification", StrColumn::new) :
                getBinaryColumn("modification"));
    }
}
