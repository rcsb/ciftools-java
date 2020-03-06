package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_3DEM_RESTRAINT category records the
 * details of the 3DEM maps used as restraints in the
 * IHM modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Ihm3demRestraint extends DelegatingCategory {
    public Ihm3demRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "dataset_list_id":
                return getDatasetListId();
            case "model_id":
                return getModelId();
            case "struct_assembly_id":
                return getStructAssemblyId();
            case "fitting_method":
                return getFittingMethod();
            case "number_of_gaussians":
                return getNumberOfGaussians();
            case "map_segment_flag":
                return getMapSegmentFlag();
            case "cross_correlation_coefficient":
                return getCrossCorrelationCoefficient();
            case "fitting_method_citation_id":
                return getFittingMethodCitationId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the 3DEM restraint description.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the 3DEM map used.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * The model number corresponding to the 3DEM fitting result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * An indicator to whether the whole assembly that is modeled is fit into the 3DEM map
     * or if only a subset of the structural assembly is fit into the map.
     * This data item is a pointer to _ihm_struct_assembly.id in the
     * IHM_STRUCT_ASSEMBLY category. The IHM_STRUCT_ASSEMBLY category provides the
     * details regarding the different structural assemblies used in the modeling.
     * The default value for this data item is "1" indicating that the entire assembly
     * being modeled is fit into the EM map.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return delegate.getColumn("struct_assembly_id", DelegatingIntColumn::new);
    }

    /**
     * Method used to fit the model to the 3DEM map.
     * @return StrColumn
     */
    public StrColumn getFittingMethod() {
        return delegate.getColumn("fitting_method", DelegatingStrColumn::new);
    }

    /**
     * In case of Gaussian mixture models, the number of gaussians
     * is a parameter used to covert the 3DEM maps and models into
     * GMMs. This captures the level of granularity used in
     * representing the maps and/or models as 3D Gaussians.
     * @return IntColumn
     */
    public IntColumn getNumberOfGaussians() {
        return delegate.getColumn("number_of_gaussians", DelegatingIntColumn::new);
    }

    /**
     * A flag that indicates whether or not the 3DEM map is segmented i.e.,
     * whether the whole map is used or only a portion of it is used (by masking
     * or by other means) as restraint in the modeling.
     * @return StrColumn
     */
    public StrColumn getMapSegmentFlag() {
        return delegate.getColumn("map_segment_flag", DelegatingStrColumn::new);
    }

    /**
     * The cross correlation coefficient corresponding to the model to map fitting.
     * @return FloatColumn
     */
    public FloatColumn getCrossCorrelationCoefficient() {
        return delegate.getColumn("cross_correlation_coefficient", DelegatingFloatColumn::new);
    }

    /**
     * The citation id of the citation for the fitting method used.
     * This data item is a pointer to _citation.id in the CITATION
     * category.
     * @return StrColumn
     */
    public StrColumn getFittingMethodCitationId() {
        return delegate.getColumn("fitting_method_citation_id", DelegatingStrColumn::new);
    }

    /**
     * Additional details regarding the model to map fitting.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}