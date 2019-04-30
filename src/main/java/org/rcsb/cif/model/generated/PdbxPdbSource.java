package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This is a place holder for the PDB SOURCE.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxPdbSource extends BaseCategory {
    public PdbxPdbSource(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPdbSource(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPdbSource(String name) {
        super(name);
    }

    /**
     * NDB ID.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * PDB SOURCE record.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
