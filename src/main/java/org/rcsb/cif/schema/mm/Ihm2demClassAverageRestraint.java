package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_2DEM_CLASS_AVERAGE_RESTRAINT category records the
 * details of the 2DEM class averages used in the IHM modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Ihm2demClassAverageRestraint extends DelegatingCategory {
    public Ihm2demClassAverageRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "dataset_list_id":
                return getDatasetListId();
            case "number_raw_micrographs":
                return getNumberRawMicrographs();
            case "pixel_size_width":
                return getPixelSizeWidth();
            case "pixel_size_height":
                return getPixelSizeHeight();
            case "image_resolution":
                return getImageResolution();
            case "image_segment_flag":
                return getImageSegmentFlag();
            case "number_of_projections":
                return getNumberOfProjections();
            case "struct_assembly_id":
                return getStructAssemblyId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the 2dem class average.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the 2dem class average dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * The number of raw micrographs used to obtain the class average.
     * @return IntColumn
     */
    public IntColumn getNumberRawMicrographs() {
        return delegate.getColumn("number_raw_micrographs", DelegatingIntColumn::new);
    }

    /**
     * Pixel size width of the 2dem class average image.
     * While fitting the model to the image, _ihm_2dem_class_average_restraint.pixel_size_width
     * is used along with _ihm_2dem_class_average_restraint.pixel_size_height to scale the image.
     * @return FloatColumn
     */
    public FloatColumn getPixelSizeWidth() {
        return delegate.getColumn("pixel_size_width", DelegatingFloatColumn::new);
    }

    /**
     * Pixel size height of the 2dem class average image.
     * While fitting the model to the image, _ihm_2dem_class_average_restraint.pixel_size_height
     * is used along with _ihm_2dem_class_average_restraint.pixel_size_width to scale the image.
     * @return FloatColumn
     */
    public FloatColumn getPixelSizeHeight() {
        return delegate.getColumn("pixel_size_height", DelegatingFloatColumn::new);
    }

    /**
     * Resolution of the 2dem class average.
     * @return FloatColumn
     */
    public FloatColumn getImageResolution() {
        return delegate.getColumn("image_resolution", DelegatingFloatColumn::new);
    }

    /**
     * A flag that indicates whether or not the 2DEM class average image is segmented i.e.,
     * whether the whole image is used or only a portion of it is used (by masking
     * or by other means) as restraint in the modeling.
     * @return StrColumn
     */
    public StrColumn getImageSegmentFlag() {
        return delegate.getColumn("image_segment_flag", DelegatingStrColumn::new);
    }

    /**
     * Number of 2D projections of the model used in the fitting.
     * @return IntColumn
     */
    public IntColumn getNumberOfProjections() {
        return delegate.getColumn("number_of_projections", DelegatingIntColumn::new);
    }

    /**
     * An indicator to whether the whole assembly that is modeled is fit into the image
     * or if only a subset of the structural assembly is fit into the image.
     * This data item is a pointer to _ihm_struct_assembly.id in the
     * IHM_STRUCT_ASSEMBLY category. The IHM_STRUCT_ASSEMBLY category provides the
     * details regarding the different structural assemblies used in the modeling.
     * The default value for this data item is "1" indicating that the entire assembly
     * being modeled is fit into the EM data.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return delegate.getColumn("struct_assembly_id", DelegatingIntColumn::new);
    }

    /**
     * Details of how the 2DEM restraint is applied in the modeling algorithm.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}