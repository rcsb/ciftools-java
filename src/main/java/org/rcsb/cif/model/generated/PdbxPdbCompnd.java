package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This is a place holder for the PDB COMPND.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPdbCompnd extends BaseCategory {
    public PdbxPdbCompnd(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPdbCompnd(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPdbCompnd(String name) {
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
     * PDB COMPND record.
     * @return StrColumn
     */
    public StrColumn getText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
