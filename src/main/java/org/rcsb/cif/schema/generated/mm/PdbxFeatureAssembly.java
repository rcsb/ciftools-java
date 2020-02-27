package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_FEATURE_ASSEMBLY category records
 * information about properties pertaining to this
 * structural assembly.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxFeatureAssembly extends DelegatingCategory {
    public PdbxFeatureAssembly(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_feature_assembly.id uniquely identifies a
     * feature in the PDBX_FEATURE_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_feature_assembly.assembly_id references an
     * assembly definition in category STRUCT_BIOL
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_assembly.feature_name identifies a feature
     * by name.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return delegate.getColumn("feature_name", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_assembly.feature_type identifies the
     * type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return delegate.getColumn("feature_type", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_feature_assembly.feature_name.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return delegate.getColumn("feature", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_assembly_range.feature_identifier is an
     * additional identifier used to identify or
     * accession this feature.
     * @return StrColumn
     */
    public StrColumn getFeatureIdentifier() {
        return delegate.getColumn("feature_identifier", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_assembly.feature_assigned_by identifies
     * the individual, organization or program that assigned
     * the feature.
     * @return StrColumn
     */
    public StrColumn getFeatureAssignedBy() {
        return delegate.getColumn("feature_assigned_by", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_assembly.feature_citation_id is a
     * reference to a citation in the CITATION category
     * @return StrColumn
     */
    public StrColumn getFeatureCitationId() {
        return delegate.getColumn("feature_citation_id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_assembly.feature_software_id is a
     * reference to an application described in the
     * SOFTWARE category.
     * @return StrColumn
     */
    public StrColumn getFeatureSoftwareId() {
        return delegate.getColumn("feature_software_id", DelegatingStrColumn::new);
    }
}
