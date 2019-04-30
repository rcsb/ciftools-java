package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_POLY_NA_TYPE category describe
 * type of nucleic acid polymer entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntityPolyNaType extends BaseCategory {
    public PdbxEntityPolyNaType(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityPolyNaType(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityPolyNaType(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the
     * ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This data item describes the nucleic acid type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
