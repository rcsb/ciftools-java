package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_3DEM_RESTRAINT category records the
 * details of the 3DEM maps used as restraints in the
 * IHM modeling.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Ihm3demRestraint extends BaseCategory {
    public Ihm3demRestraint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Ihm3demRestraint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Ihm3demRestraint(String name) {
        super(name);
    }

    /**
     * A unique identifier for the 3DEM restraint description.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * Identifier to the 3DEM map used.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * The model number corresponding to the 3DEM fitting result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * An indicator to whether the whole assembly that is modeled is fit into the 3DEM map
     * or if only a subset of the structural assembly is fit into the map.
     * This data item is a pointer to _ihm_struct_assembly.assembly_id in the
     * IHM_STRUCT_ASSEMBLY category. The IHM_STRUCT_ASSEMBLY category provides the
     * details regarding the different structural assemblies used in the modeling.
     * The default value for this data item is "1" indicating that the entire assembly
     * being modeled is fit into the EM map.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("struct_assembly_id", IntColumn::new) :
                getBinaryColumn("struct_assembly_id"));
    }

    /**
     * Method used to fit the model to the 3DEM map.
     * @return StrColumn
     */
    public StrColumn getFittingMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fitting_method", StrColumn::new) :
                getBinaryColumn("fitting_method"));
    }

    /**
     * In case of Gaussian mixture models, the number of gaussians
     * is a parameter used to covert the 3DEM maps and models into
     * GMMs. This captures the level of granularity used in
     * representing the maps and/or models as 3D Gaussians.
     * @return IntColumn
     */
    public IntColumn getNumberOfGaussians() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_of_gaussians", IntColumn::new) :
                getBinaryColumn("number_of_gaussians"));
    }

    /**
     * A flag that indicates whether or not the 3DEM map is segmented i.e.,
     * whether the whole map is used or only a portion of it is used (by masking
     * or by other means) as restraint in the modeling.
     * @return StrColumn
     */
    public StrColumn getMapSegmentFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("map_segment_flag", StrColumn::new) :
                getBinaryColumn("map_segment_flag"));
    }

    /**
     * The cross correlation coefficient corresponding to the model to map fitting.
     * @return FloatColumn
     */
    public FloatColumn getCrossCorrelationCoefficient() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cross_correlation_coefficient", FloatColumn::new) :
                getBinaryColumn("cross_correlation_coefficient"));
    }

    /**
     * The citation id of the citation for the fitting method used.
     * This data item is a pointer to _citation.id in the CITATION
     * category.
     * @return StrColumn
     */
    public StrColumn getFittingMethodCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fitting_method_citation_id", StrColumn::new) :
                getBinaryColumn("fitting_method_citation_id"));
    }

    /**
     * Additional details regarding the model to map fitting.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
