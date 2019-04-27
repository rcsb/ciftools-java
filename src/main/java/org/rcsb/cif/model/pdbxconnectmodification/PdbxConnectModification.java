package org.rcsb.cif.model.pdbxconnectmodification;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return ResName
     */
    public ResName getResName() {
        return (ResName) (isText ? textFields.computeIfAbsent("res_name",
                ResName::new) : getBinaryColumn("res_name"));
    }

    /**
     * Type of modification
     * @return Modification
     */
    public Modification getModification() {
        return (Modification) (isText ? textFields.computeIfAbsent("modification",
                Modification::new) : getBinaryColumn("modification"));
    }
}
