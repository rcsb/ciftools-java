package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_POLY_NA_NONSTANDARD category
 * describe the nonstandard features of the nucleic acid polymer entities.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityPolyNaNonstandard extends BaseCategory {
    public PdbxEntityPolyNaNonstandard(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityPolyNaNonstandard(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityPolyNaNonstandard(String name) {
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
     * This data item describes the nonstandard feature of
     * the nucleic acid polymer entity.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature", StrColumn::new) :
                getBinaryColumn("feature"));
    }
}
