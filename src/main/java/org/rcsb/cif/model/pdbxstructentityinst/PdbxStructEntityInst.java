package org.rcsb.cif.model.pdbxstructentityinst;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The value of _pdbx_struct_entity_inst.id must uniquely identify a record in
     * the PDBX_STRUCT_ENTITY_INST list.
     * 
     * The entity instance is a method neutral identifier for the observed
     * molecular entities in the deposited coordinate set.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }
}
