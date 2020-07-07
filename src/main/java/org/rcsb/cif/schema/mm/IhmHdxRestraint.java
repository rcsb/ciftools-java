package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_HDX_RESTRAINT category captures the
 * details of restraints derived from Hydrogen-Deuterium
 * Exchange experiments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmHdxRestraint extends DelegatingCategory {
    public IhmHdxRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "feature_id":
                return getFeatureId();
            case "protection_factor":
                return getProtectionFactor();
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
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the peptide / residue feature.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * The value of the protection factor determined from HDX experiments.
     * These are reported as log(protection factor). Protection factors
     * are scaling factors and are unitless.
     * @return FloatColumn
     */
    public FloatColumn getProtectionFactor() {
        return delegate.getColumn("protection_factor", DelegatingFloatColumn::new);
    }

    /**
     * Identifier to the HDX input data from which the restraints are derived.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details regarding the HDX restraint.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}