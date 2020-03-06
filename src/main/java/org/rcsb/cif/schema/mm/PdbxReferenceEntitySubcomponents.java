package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_ENTITY_SUBCOMPONENTS category records
 * subcomponent sequence from which this entity could be built.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceEntitySubcomponents extends DelegatingCategory {
    public PdbxReferenceEntitySubcomponents(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "prd_id":
                return getPrdId();
            case "seq":
                return getSeq();
            case "chem_comp_id":
                return getChemCompId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_entity_subcomponents.prd_id is a reference
     * _pdbx_reference_molecule.prd_id in the  PDBX_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The subcomponent sequence for the entity.
     * @return StrColumn
     */
    public StrColumn getSeq() {
        return delegate.getColumn("seq", DelegatingStrColumn::new);
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return StrColumn
     */
    public StrColumn getChemCompId() {
        return delegate.getColumn("chem_comp_id", DelegatingStrColumn::new);
    }

}