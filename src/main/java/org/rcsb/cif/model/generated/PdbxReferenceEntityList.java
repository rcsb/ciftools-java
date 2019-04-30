package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_LIST category record
 * the list of entities within each reference molecule.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxReferenceEntityList extends BaseCategory {
    public PdbxReferenceEntityList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntityList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntityList(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_list.prd_id is a reference
     * _pdbx_reference_molecule.prd_id in the PDBX_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_list.ref_entity_id is a unique identifier
     * the a constituent entity within this reference molecule.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_entity_id", StrColumn::new) :
                getBinaryColumn("ref_entity_id"));
    }

    /**
     * Defines the polymer characteristic of the entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Additional details about this entity.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The component number of this entity within the molecule.
     * @return IntColumn
     */
    public IntColumn getComponentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("component_id", IntColumn::new) :
                getBinaryColumn("component_id"));
    }
}
