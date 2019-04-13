package org.rcsb.cif.model.generated.pdbxreferenceentitylist;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxReferenceEntityList extends BaseCifCategory {
    public PdbxReferenceEntityList(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntityList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * The value of _pdbx_reference_entity_list.prd_id is a reference
     * _pdbx_reference_molecule.prd_id in the PDBX_REFERENCE_MOLECULE category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? getTextColumn("prd_id") : getBinaryColumn("prd_id", "PrdId"));
    }

    /**
     * The value of _pdbx_reference_entity_list.ref_entity_id is a unique identifier
     * the a constituent entity within this reference molecule.
     * @return RefEntityId
     */
    public RefEntityId getRefEntityId() {
        return (RefEntityId) (isText ? getTextColumn("ref_entity_id") : getBinaryColumn("ref_entity_id", "RefEntityId"));
    }

    /**
     * Defines the polymer characteristic of the entity.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? getTextColumn("type") : getBinaryColumn("type", "Type"));
    }

    /**
     * Additional details about this entity.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? getTextColumn("details") : getBinaryColumn("details", "Details"));
    }

    /**
     * The component number of this entity within the molecule.
     * @return ComponentId
     */
    public ComponentId getComponentId() {
        return (ComponentId) (isText ? getTextColumn("component_id") : getBinaryColumn("component_id", "ComponentId"));
    }
}
