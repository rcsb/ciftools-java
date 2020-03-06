package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * IHM_FEATURE_LIST is the high level category that provides defintions
 * to select atoms/residues from polymeric and non-polymeric entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmFeatureList extends DelegatingCategory {
    public IhmFeatureList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "feature_id":
                return getFeatureId();
            case "feature_type":
                return getFeatureType();
            case "entity_type":
                return getEntityType();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the feature.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * The type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return delegate.getColumn("feature_type", DelegatingStrColumn::new);
    }

    /**
     * The type of entity.
     * @return StrColumn
     */
    public StrColumn getEntityType() {
        return delegate.getColumn("entity_type", DelegatingStrColumn::new);
    }

    /**
     * Additional details regarding the feature.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}