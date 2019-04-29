package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Local data items describing ligand and monomer
 * type information.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxConnectType extends BaseCategory {
    public PdbxConnectType(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxConnectType(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxConnectType(String name) {
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
     * Internal chemical type identifier used by NDB.
     * @return StrColumn
     */
    public StrColumn getNdbTokenType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ndbTokenType", StrColumn::new) :
                getBinaryColumn("ndbTokenType"));
    }

    /**
     * Indicates a modified chemical component.
     * @return StrColumn
     */
    public StrColumn getModified() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("modified", StrColumn::new) :
                getBinaryColumn("modified"));
    }
}
