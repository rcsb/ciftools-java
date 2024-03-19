package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_RELAXATION_TIME_MULTI_STATE_SCHEME category map the experimentally
 * measured relaxation times with the multi-state schemes.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmRelaxationTimeMultiStateScheme extends DelegatingCategory {
    public IhmRelaxationTimeMultiStateScheme(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "relaxation_time_id":
                return getRelaxationTimeId();
            case "scheme_id":
                return getSchemeId();
            case "scheme_connectivity_id":
                return getSchemeConnectivityId();
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
     * Identifier for the relaxation_time.
     * This data item is a pointer to _ihm_relaxation_time.id in the
     * IHM_RELAXATION_TIME data category.
     * @return IntColumn
     */
    public IntColumn getRelaxationTimeId() {
        return delegate.getColumn("relaxation_time_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the multi-state scheme.
     * This data item is a pointer to _ihm_multi_state_scheme.id in the
     * IHM_MULTI_STATE_SCHEME data category.
     * @return IntColumn
     */
    public IntColumn getSchemeId() {
        return delegate.getColumn("scheme_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the multi-state scheme connectivity.
     * This data item is a pointer to _ihm_multi_state_scheme_connectivity.id in the
     * IHM_MULTI_STATE_SCHEME_CONNECTIVITY data category.
     * @return IntColumn
     */
    public IntColumn getSchemeConnectivityId() {
        return delegate.getColumn("scheme_connectivity_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details about the relaxation time measurement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}