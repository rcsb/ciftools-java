package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_FEATURE_SEQUENCE_RANGE category
 * records information about properties pertaining to
 * this structure sequence_range.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxFeatureSequenceRange extends DelegatingCategory {
    public PdbxFeatureSequenceRange(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "seq_range_id":
                return getSeqRangeId();
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
     * The value of _pdbx_feature_sequence_range.id uniquely identifies
     * a feature in the PDBX_FEATURE_SEQUENCE_RANGE category
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_feature_sequence_range.seq_range_id
     * references a sequence_range definition in category
     * PDBX_SEQUENCE_RANGE.
     * @return StrColumn
     */
    public StrColumn getSeqRangeId() {
        return delegate.getColumn("seq_range_id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_sequence_range.feature_name identifies a feature
     * by name.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return delegate.getColumn("feature_name", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_sequence_range.feature_type identifies the
     * type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return delegate.getColumn("feature_type", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_feature_sequence_range.feature_name.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return delegate.getColumn("feature", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_sequence_range.feature_identifier is an
     * additional identifier used to identify or
     * accession this feature.
     * @return StrColumn
     */
    public StrColumn getFeatureIdentifier() {
        return delegate.getColumn("feature_identifier", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_sequence_range.feature_assigned_by identifies
     * the individual, organization or program that assigned
     * the feature.
     * @return StrColumn
     */
    public StrColumn getFeatureAssignedBy() {
        return delegate.getColumn("feature_assigned_by", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_sequence_range.feature_citation_id is a
     * reference to a citation in the CITATION category
     * @return StrColumn
     */
    public StrColumn getFeatureCitationId() {
        return delegate.getColumn("feature_citation_id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_sequence_range.feature_software_id is a
     * reference to an application descripted in the
     * SOFTWARE category.
     * @return StrColumn
     */
    public StrColumn getFeatureSoftwareId() {
        return delegate.getColumn("feature_software_id", DelegatingStrColumn::new);
    }

}