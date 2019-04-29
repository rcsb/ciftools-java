package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**

 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityNonpoly extends BaseCategory {
    public PdbxEntityNonpoly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityNonpoly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityNonpoly(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntityId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entity_id", SingleRowStrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCompId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("comp_id", SingleRowStrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * A name for the non-polymer entity
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name", SingleRowStrColumn::new) :
                getBinaryColumn("name"));
    }
}
