package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_FEATURE_MONOMER category records
 * information about properties pertaining to particular
 * monomers in this structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxFeatureMonomer extends DelegatingCategory {
    public PdbxFeatureMonomer(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_feature_monomer.id uniquely identifies
     * a feature in the PDBX_FEATURE_MONOMER category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_monomer.feature_name identifies a feature
     * by name.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return delegate.getColumn("feature_name", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_monomer.feature_type identifies the
     * type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return delegate.getColumn("feature_type", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_feature_monomer.feature_name.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return delegate.getColumn("feature", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_monomer.feature_identifier is an
     * additional identifier used to identify or
     * accession this feature.
     * @return StrColumn
     */
    public StrColumn getFeatureIdentifier() {
        return delegate.getColumn("feature_identifier", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_monomer.feature_assigned_by identifies
     * the individual, organization or program that
     * assigned the feature.
     * @return StrColumn
     */
    public StrColumn getFeatureAssignedBy() {
        return delegate.getColumn("feature_assigned_by", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_monomer.feature_citation_id is a
     * reference to a citation in the CITATION category.
     * @return StrColumn
     */
    public StrColumn getFeatureCitationId() {
        return delegate.getColumn("feature_citation_id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_feature_monomer.feature_software_id is a
     * reference to an application described in the
     * SOFTWARE category.
     * @return StrColumn
     */
    public StrColumn getFeatureSoftwareId() {
        return delegate.getColumn("feature_software_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }
}
