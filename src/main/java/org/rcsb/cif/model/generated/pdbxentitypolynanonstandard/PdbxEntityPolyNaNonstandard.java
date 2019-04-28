package org.rcsb.cif.model.generated.pdbxentitypolynanonstandard;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This data item describes the nonstandard feature of
     * the nucleic acid polymer entity.
     * @return Feature
     */
    public Feature getFeature() {
        return (Feature) (isText ? textFields.computeIfAbsent("feature",
                Feature::new) : getBinaryColumn("feature"));
    }
}
