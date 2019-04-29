package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_FEATURE_MONOMER category records
 * information about properties pertaining to particular
 * monomers in this structure.
 */
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * _pdbx_feature_monomer.feature_name identifies a feature
     * by name.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_name", StrColumn::new) :
                getBinaryColumn("feature_name"));
    }

    /**
     * _pdbx_feature_monomer.feature_type identifies the
     * type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_type", StrColumn::new) :
                getBinaryColumn("feature_type"));
    }

    /**
     * The value of _pdbx_feature_monomer.feature_name.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature", StrColumn::new) :
                getBinaryColumn("feature"));
    }

    /**
     * _pdbx_feature_monomer.feature_identifier is an
     * additional identifier used to identify or
     * accession this feature.
     * @return StrColumn
     */
    public StrColumn getFeatureIdentifier() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_identifier", StrColumn::new) :
                getBinaryColumn("feature_identifier"));
    }

    /**
     * _pdbx_feature_monomer.feature_assigned_by identifies
     * the individual, organization or program that
     * assigned the feature.
     * @return StrColumn
     */
    public StrColumn getFeatureAssignedBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_assigned_by", StrColumn::new) :
                getBinaryColumn("feature_assigned_by"));
    }

    /**
     * _pdbx_feature_monomer.feature_citation_id is a
     * reference to a citation in the CITATION category.
     * @return StrColumn
     */
    public StrColumn getFeatureCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_citation_id", StrColumn::new) :
                getBinaryColumn("feature_citation_id"));
    }

    /**
     * _pdbx_feature_monomer.feature_software_id is a
     * reference to an application described in the
     * SOFTWARE category.
     * @return StrColumn
     */
    public StrColumn getFeatureSoftwareId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_software_id", StrColumn::new) :
                getBinaryColumn("feature_software_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the identifier for the monomer.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }
}
