package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_INTERFACE_RESIDUE_FEATURE category captures the
 * details of residues that are identified to be at the binding interface
 * from experiments. This information is used by modeling software such as
 * HADDOCK to create a set of ambiguous distance restraints at the binding
 * interface between the molecular entities involved.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmInterfaceResidueFeature extends DelegatingCategory {
    public IhmInterfaceResidueFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "feature_id":
                return getFeatureId();
            case "binding_partner_entity_id":
                return getBindingPartnerEntityId();
            case "binding_partner_asym_id":
                return getBindingPartnerAsymId();
            case "dataset_list_id":
                return getDatasetListId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the interface residue feature that defines the interface residue.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * The entity identifier of the binding partner at the interface.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getBindingPartnerEntityId() {
        return delegate.getColumn("binding_partner_entity_id", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the binding partner at the interface, if applicable.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getBindingPartnerAsymId() {
        return delegate.getColumn("binding_partner_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Identifier to the input data from which the interface residue is determined.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details regarding the interface residue.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}