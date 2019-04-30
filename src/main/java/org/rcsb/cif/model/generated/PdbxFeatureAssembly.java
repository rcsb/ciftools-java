package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_FEATURE_ASSEMBLY category records
 * information about properties pertaining to this
 * structural assembly.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxFeatureAssembly extends BaseCategory {
    public PdbxFeatureAssembly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxFeatureAssembly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxFeatureAssembly(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_feature_assembly.id uniquely identifies a
     * feature in the PDBX_FEATURE_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _pdbx_feature_assembly.assembly_id references an
     * assembly definition in category STRUCT_BIOL
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("assembly_id", StrColumn::new) :
                getBinaryColumn("assembly_id"));
    }

    /**
     * _pdbx_feature_assembly.feature_name identifies a feature
     * by name.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_name", StrColumn::new) :
                getBinaryColumn("feature_name"));
    }

    /**
     * _pdbx_feature_assembly.feature_type identifies the
     * type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_type", StrColumn::new) :
                getBinaryColumn("feature_type"));
    }

    /**
     * The value of _pdbx_feature_assembly.feature_name.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature", StrColumn::new) :
                getBinaryColumn("feature"));
    }

    /**
     * _pdbx_feature_assembly_range.feature_identifier is an
     * additional identifier used to identify or
     * accession this feature.
     * @return StrColumn
     */
    public StrColumn getFeatureIdentifier() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_identifier", StrColumn::new) :
                getBinaryColumn("feature_identifier"));
    }

    /**
     * _pdbx_feature_assembly.feature_assigned_by identifies
     * the individual, organization or program that assigned
     * the feature.
     * @return StrColumn
     */
    public StrColumn getFeatureAssignedBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_assigned_by", StrColumn::new) :
                getBinaryColumn("feature_assigned_by"));
    }

    /**
     * _pdbx_feature_assembly.feature_citation_id is a
     * reference to a citation in the CITATION category
     * @return StrColumn
     */
    public StrColumn getFeatureCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_citation_id", StrColumn::new) :
                getBinaryColumn("feature_citation_id"));
    }

    /**
     * _pdbx_feature_assembly.feature_software_id is a
     * reference to an application described in the
     * SOFTWARE category.
     * @return StrColumn
     */
    public StrColumn getFeatureSoftwareId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_software_id", StrColumn::new) :
                getBinaryColumn("feature_software_id"));
    }
}
