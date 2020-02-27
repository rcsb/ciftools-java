package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Additional features associated with the reference entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceMoleculeFeatures extends DelegatingCategory {
    public PdbxReferenceMoleculeFeatures(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_reference_molecule_features.family_prd_id is a reference to
     * _pdbx_reference_molecule_list.family_prd_id in category PDBX_REFERENCE_MOLECULE_FAMILY_LIST.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return delegate.getColumn("family_prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_molecule_features.prd_id is a reference
     * _pdbx_reference_molecule.prd_id in the  PDBX_REFERENCE_MOLECULE category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_molecule_features.ordinal distinguishes
     * each feature for this entity.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_reference_molecule_features.source_ordinal provides
     * the priority order of features from a particular source or database.
     * @return IntColumn
     */
    public IntColumn getSourceOrdinal() {
        return delegate.getColumn("source_ordinal", DelegatingIntColumn::new);
    }

    /**
     * The entity feature type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The entity feature value.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * The information source for the component feature.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return delegate.getColumn("source", DelegatingStrColumn::new);
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
