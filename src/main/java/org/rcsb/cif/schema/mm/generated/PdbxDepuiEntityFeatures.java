package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPUI_ENTITY_FEATURES category record status
 * details related to the features of individual entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_dataset_id", StrColumn::new) :
                getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A reference to the _entity.id in the ENTITY category
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate the molecule class for the entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
