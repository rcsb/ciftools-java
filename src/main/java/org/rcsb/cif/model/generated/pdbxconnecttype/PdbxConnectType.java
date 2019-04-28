package org.rcsb.cif.model.generated.pdbxconnecttype;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return ResName
     */
    public ResName getResName() {
        return (ResName) (isText ? textFields.computeIfAbsent("res_name",
                ResName::new) : getBinaryColumn("res_name"));
    }

    /**
     * Internal chemical type identifier used by NDB.
     * @return NdbTokenType
     */
    public NdbTokenType getNdbTokenType() {
        return (NdbTokenType) (isText ? textFields.computeIfAbsent("ndbTokenType",
                NdbTokenType::new) : getBinaryColumn("ndbTokenType"));
    }

    /**
     * Indicates a modified chemical component.
     * @return Modified
     */
    public Modified getModified() {
        return (Modified) (isText ? textFields.computeIfAbsent("modified",
                Modified::new) : getBinaryColumn("modified"));
    }
}
