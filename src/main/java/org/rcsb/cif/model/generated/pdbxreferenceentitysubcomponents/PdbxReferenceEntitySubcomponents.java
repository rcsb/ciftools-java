package org.rcsb.cif.model.generated.pdbxreferenceentitysubcomponents;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceEntitySubcomponents extends BaseCategory {
    public PdbxReferenceEntitySubcomponents(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntitySubcomponents(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntitySubcomponents(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_subcomponents.prd_id is a reference
     * _pdbx_reference_molecule.prd_id in the  PDBX_REFERENCE_MOLECULE category.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The subcomponent sequence for the entity.
     * @return Seq
     */
    public Seq getSeq() {
        return (Seq) (isText ? textFields.computeIfAbsent("seq",
                Seq::new) : getBinaryColumn("seq"));
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return ChemCompId
     */
    public ChemCompId getChemCompId() {
        return (ChemCompId) (isText ? textFields.computeIfAbsent("chem_comp_id",
                ChemCompId::new) : getBinaryColumn("chem_comp_id"));
    }
}
