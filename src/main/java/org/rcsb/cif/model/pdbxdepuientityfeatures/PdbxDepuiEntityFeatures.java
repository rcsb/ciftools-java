package org.rcsb.cif.model.pdbxdepuientityfeatures;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDepuiEntityFeatures extends BaseCategory {
    public PdbxDepuiEntityFeatures(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepuiEntityFeatures(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepuiEntityFeatures(String name) {
        super(name);
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return DepDatasetId
     */
    public DepDatasetId getDepDatasetId() {
        return (DepDatasetId) (isText ? textFields.computeIfAbsent("dep_dataset_id",
                DepDatasetId::new) : getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A reference to the _entity.id in the ENTITY category
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate the molecule class for the entity.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
