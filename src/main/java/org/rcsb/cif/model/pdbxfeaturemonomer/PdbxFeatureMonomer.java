package org.rcsb.cif.model.pdbxfeaturemonomer;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxFeatureMonomer extends BaseCategory {
    public PdbxFeatureMonomer(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxFeatureMonomer(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxFeatureMonomer(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_feature_monomer.id uniquely identifies
     * a feature in the PDBX_FEATURE_MONOMER category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * _pdbx_feature_monomer.feature_name identifies a feature
     * by name.
     * @return FeatureName
     */
    public FeatureName getFeatureName() {
        return (FeatureName) (isText ? textFields.computeIfAbsent("feature_name",
                FeatureName::new) : getBinaryColumn("feature_name"));
    }

    /**
     * _pdbx_feature_monomer.feature_type identifies the
     * type of feature.
     * @return FeatureType
     */
    public FeatureType getFeatureType() {
        return (FeatureType) (isText ? textFields.computeIfAbsent("feature_type",
                FeatureType::new) : getBinaryColumn("feature_type"));
    }

    /**
     * The value of _pdbx_feature_monomer.feature_name.
     * @return Feature
     */
    public Feature getFeature() {
        return (Feature) (isText ? textFields.computeIfAbsent("feature",
                Feature::new) : getBinaryColumn("feature"));
    }

    /**
     * _pdbx_feature_monomer.feature_identifier is an
     * additional identifier used to identify or
     * accession this feature.
     * @return FeatureIdentifier
     */
    public FeatureIdentifier getFeatureIdentifier() {
        return (FeatureIdentifier) (isText ? textFields.computeIfAbsent("feature_identifier",
                FeatureIdentifier::new) : getBinaryColumn("feature_identifier"));
    }

    /**
     * _pdbx_feature_monomer.feature_assigned_by identifies
     * the individual, organization or program that
     * assigned the feature.
     * @return FeatureAssignedBy
     */
    public FeatureAssignedBy getFeatureAssignedBy() {
        return (FeatureAssignedBy) (isText ? textFields.computeIfAbsent("feature_assigned_by",
                FeatureAssignedBy::new) : getBinaryColumn("feature_assigned_by"));
    }

    /**
     * _pdbx_feature_monomer.feature_citation_id is a
     * reference to a citation in the CITATION category.
     * @return FeatureCitationId
     */
    public FeatureCitationId getFeatureCitationId() {
        return (FeatureCitationId) (isText ? textFields.computeIfAbsent("feature_citation_id",
                FeatureCitationId::new) : getBinaryColumn("feature_citation_id"));
    }

    /**
     * _pdbx_feature_monomer.feature_software_id is a
     * reference to an application described in the
     * SOFTWARE category.
     * @return FeatureSoftwareId
     */
    public FeatureSoftwareId getFeatureSoftwareId() {
        return (FeatureSoftwareId) (isText ? textFields.computeIfAbsent("feature_software_id",
                FeatureSoftwareId::new) : getBinaryColumn("feature_software_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }
}
