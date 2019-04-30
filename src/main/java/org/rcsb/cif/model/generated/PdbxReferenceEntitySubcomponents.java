package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_SUBCOMPONENTS category records
 * subcomponent sequence from which this entity could be built.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * The subcomponent sequence for the entity.
     * @return StrColumn
     */
    public StrColumn getSeq() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq", StrColumn::new) :
                getBinaryColumn("seq"));
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return StrColumn
     */
    public StrColumn getChemCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chem_comp_id", StrColumn::new) :
                getBinaryColumn("chem_comp_id"));
    }
}
