package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_FEATURE_DOMAIN category records
 * information about properties pertaining to this structure
 * domain.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxFeatureDomain extends DelegatingCategory {
    public PdbxFeatureDomain(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "domain_id":
                return getDomainId();
            case "feature_name":
                return getFeatureName();
            case "feature_type":
                return getFeatureType();
            case "feature":
                return getFeature();
            case "feature_identifier":
                return getFeatureIdentifier();
            case "feature_assigned_by":
                return getFeatureAssignedBy();
            case "feature_citation_id":
                return getFeatureCitationId();
            case "feature_software_id":
                return getFeatureSoftwareId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_feature_domain.id uniquely identifies
     * a feature in the PDBX_FEATURE_DOMAIN category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_feature_domain.id references a domain
     * definition in category PDBX_DOMAIN.
     * @return StrColumn
     */
    public StrColumn getDomainId() {
        return delegate.getColumn("domain_id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_domain.feature_name identifies a feature
     * by name.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return delegate.getColumn("feature_name", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_domain.feature_type identifies the
     * type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return delegate.getColumn("feature_type", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_feature_domain.feature_name.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return delegate.getColumn("feature", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_domain.feature_identifier is an
     * additional identifier used to identify or
     * accession this feature.
     * @return StrColumn
     */
    public StrColumn getFeatureIdentifier() {
        return delegate.getColumn("feature_identifier", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_domain.feature_assigned_by identifies
     * the individual, organization or program that
     * assigned the feature.
     * @return StrColumn
     */
    public StrColumn getFeatureAssignedBy() {
        return delegate.getColumn("feature_assigned_by", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_domain.feature_citation_id is a
     * reference to a citation in the CITATION category.
     * @return StrColumn
     */
    public StrColumn getFeatureCitationId() {
        return delegate.getColumn("feature_citation_id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_domain.feature_software_id is a
     * reference to an application described in the
     * SOFTWARE category.
     * @return StrColumn
     */
    public StrColumn getFeatureSoftwareId() {
        return delegate.getColumn("feature_software_id", DelegatingStrColumn::new);
    }

}