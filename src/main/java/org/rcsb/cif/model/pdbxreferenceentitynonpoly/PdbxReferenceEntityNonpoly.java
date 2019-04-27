package org.rcsb.cif.model.pdbxreferenceentitynonpoly;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceEntityNonpoly extends BaseCategory {
    public PdbxReferenceEntityNonpoly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntityNonpoly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntityNonpoly(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_nonpoly.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the PDBX_REFERENCE_ENTITY_LIST category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_nonpoly.ref_entity_id is a reference
     * to _pdbx_reference_entity_list.ref_entity_id in PDBX_REFERENCE_ENTITY_LIST category.
     * @return RefEntityId
     */
    public RefEntityId getRefEntityId() {
        return (RefEntityId) (isText ? textFields.computeIfAbsent("ref_entity_id",
                RefEntityId::new) : getBinaryColumn("ref_entity_id"));
    }

    /**
     * Additional details about this entity.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * A name of the non-polymer entity.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * For non-polymer entities, the identifier corresponding
     * to the chemical definition for the molecule.
     * @return ChemCompId
     */
    public ChemCompId getChemCompId() {
        return (ChemCompId) (isText ? textFields.computeIfAbsent("chem_comp_id",
                ChemCompId::new) : getBinaryColumn("chem_comp_id"));
    }
}
