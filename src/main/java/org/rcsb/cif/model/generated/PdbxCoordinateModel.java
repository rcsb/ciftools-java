package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The details of the composition of the coordinate model.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxCoordinateModel extends BaseCategory {
    public PdbxCoordinateModel(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxCoordinateModel(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxCoordinateModel(String name) {
        super(name);
    }

    /**
     * A reference to _struct_asym.id.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * A classification of the composition of the coordinate model.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
