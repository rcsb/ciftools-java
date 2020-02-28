package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_PSEUDO_SITE_FEATURE category records the details
 * of pseudo positions for the features listed in IHM_FEATURE_LIST.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmPseudoSiteFeature extends DelegatingCategory {
    public IhmPseudoSiteFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "feature_id":
                return getFeatureId();
            case "Cartn_x":
                return getCartnX();
            case "Cartn_y":
                return getCartnY();
            case "Cartn_z":
                return getCartnZ();
            case "radius":
                return getRadius();
            case "description":
                return getDescription();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The feature identifier corresponding to this pseudo site.
     * This data item is a pointer to _ihm_feature_list.feature_id
     * in the IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * The Cartesian X component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return delegate.getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The Cartesian Y component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return delegate.getColumn("Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The Cartesian Z component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return delegate.getColumn("Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The radius associated with the feature at this position, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getRadius() {
        return delegate.getColumn("radius", DelegatingFloatColumn::new);
    }

    /**
     * Textual description of the pseudo site representing the specific feature.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }
}
