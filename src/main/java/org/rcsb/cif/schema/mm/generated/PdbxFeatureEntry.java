package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_FEATURE_ENTRY category records
 * information about properties pertaining to this
 * structure entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxFeatureEntry extends BaseCategory {
    public PdbxFeatureEntry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxFeatureEntry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxFeatureEntry(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_feature_entry.id uniquely identifies a
     * feature in the PDBX_FEATURE_ENTRY category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * _pdbx_feature_entry.feature_name identifies a feature
     * by name.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_name", StrColumn::new) :
                getBinaryColumn("feature_name"));
    }

    /**
     * _pdbx_feature_entry.feature_type identifies the
     * type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_type", StrColumn::new) :
                getBinaryColumn("feature_type"));
    }

    /**
     * The value of _pdbx_feature_entry.feature_name.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature", StrColumn::new) :
                getBinaryColumn("feature"));
    }

    /**
     * _pdbx_feature_entry.feature_identifier is an
     * additional identifier used to identify or
     * accession this feature.
     * @return StrColumn
     */
    public StrColumn getFeatureIdentifier() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_identifier", StrColumn::new) :
                getBinaryColumn("feature_identifier"));
    }

    /**
     * _pdbx_feature_entry.feature_assigned_by identifies
     * the individual, organization or program that
     * assigned the feature.
     * @return StrColumn
     */
    public StrColumn getFeatureAssignedBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_assigned_by", StrColumn::new) :
                getBinaryColumn("feature_assigned_by"));
    }

    /**
     * _pdbx_feature_entry.feature_citation_id is a
     * reference to a citation in the CITATION category
     * @return StrColumn
     */
    public StrColumn getFeatureCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_citation_id", StrColumn::new) :
                getBinaryColumn("feature_citation_id"));
    }

    /**
     * _pdbx_feature_entry.feature_software_id is a
     * reference to an application described in the
     * SOFTWARE category.
     * @return StrColumn
     */
    public StrColumn getFeatureSoftwareId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_software_id", StrColumn::new) :
                getBinaryColumn("feature_software_id"));
    }
}
