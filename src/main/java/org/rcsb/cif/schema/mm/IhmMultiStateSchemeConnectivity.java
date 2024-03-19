package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MULTI_STATE_SCHEME_CONNECTIVITY category record the
 * details of the ordered connectivities among states in a multi-state scheme.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmMultiStateSchemeConnectivity extends DelegatingCategory {
    public IhmMultiStateSchemeConnectivity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "scheme_id":
                return getSchemeId();
            case "begin_state_id":
                return getBeginStateId();
            case "end_state_id":
                return getEndStateId();
            case "dataset_group_id":
                return getDatasetGroupId();
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
     * An identifier for the multi-state scheme.
     * This data item is a pointer to _ihm_multi_state_scheme.id in the
     * IHM_MULTI_STATE_SCHEME data category.
     * @return IntColumn
     */
    public IntColumn getSchemeId() {
        return delegate.getColumn("scheme_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the starting state in the multi-state scheme.
     * This data item is a pointer to _ihm_multi_state_modeling.state_id
     * in the IHM_MULTI_STATE_MODELING data category.
     * @return IntColumn
     */
    public IntColumn getBeginStateId() {
        return delegate.getColumn("begin_state_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the ending state in the multi-state scheme.
     * This data item is a pointer to _ihm_multi_state_modeling.state_id
     * in the IHM_MULTI_STATE_MODELING data category.
     * @return IntColumn
     */
    public IntColumn getEndStateId() {
        return delegate.getColumn("end_state_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the dataset group from which the multi state scheme is obtained.
     * This data item is a pointer to _ihm_dataset_group.id in the
     * IHM_DATASET_GROUP data category.
     * @return IntColumn
     */
    public IntColumn getDatasetGroupId() {
        return delegate.getColumn("dataset_group_id", DelegatingIntColumn::new);
    }

    /**
     * Details about the multi-state scheme connectivity.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}