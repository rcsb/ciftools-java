package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * MA_FEATURE_LIST is the high level category that provides definitions
 * to select atoms, polymeric residues, and entity instances (asym_ids)
 * from all types of entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaFeatureList extends DelegatingCategory {
    public MaFeatureList(Category delegate) {
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