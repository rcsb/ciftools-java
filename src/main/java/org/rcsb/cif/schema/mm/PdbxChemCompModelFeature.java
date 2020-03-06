package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Additional features associated with the chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompModelFeature extends DelegatingCategory {
    public PdbxChemCompModelFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "model_id":
                return getModelId();
            case "feature_name":
                return getFeatureName();
            case "feature_value":
                return getFeatureValue();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The component model identifier for this feature.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingStrColumn::new);
    }

    /**
     * The component model feature type.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return delegate.getColumn("feature_name", DelegatingStrColumn::new);
    }

    /**
     * The component feature value.
     * @return StrColumn
     */
    public StrColumn getFeatureValue() {
        return delegate.getColumn("feature_value", DelegatingStrColumn::new);
    }

}