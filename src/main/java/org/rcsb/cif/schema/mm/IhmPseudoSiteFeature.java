package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_PSEUDO_SITE_FEATURE category records the details
 * of pseudo site features listed in IHM_FEATURE_LIST.
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
            case "pseudo_site_id":
                return getPseudoSiteId();
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
     * The pseudo site identifier corresponding to this feature.
     * This data item is a pointer to _ihm_pseudo_site.id
     * in the IHM_PSEUDO_SITE category.
     * @return IntColumn
     */
    public IntColumn getPseudoSiteId() {
        return delegate.getColumn("pseudo_site_id", DelegatingIntColumn::new);
    }

}