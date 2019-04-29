package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_ENTITY_INST category record details about the
 * structural elements in the deposited entry.  The entity instance is a method
 * neutral identifier for the observed molecular entities in the deposited coordinate
 * set.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructEntityInst extends BaseCategory {
    public PdbxStructEntityInst(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructEntityInst(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructEntityInst(String name) {
        super(name);
    }

    /**
     * A description of special aspects of this portion of the contents
     * of the deposited unit.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The value of _pdbx_struct_entity_inst.id must uniquely identify a record in
     * the PDBX_STRUCT_ENTITY_INST list.
     * 
     * The entity instance is a method neutral identifier for the observed
     * molecular entities in the deposited coordinate set.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }
}
