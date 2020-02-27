package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_2DEM_CLASS_AVERAGE_RESTRAINT category records the
 * details of the 2DEM class averages used in the IHM modeling.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Ihm2demClassAverageRestraint extends BaseCategory {
    public Ihm2demClassAverageRestraint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Ihm2demClassAverageRestraint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Ihm2demClassAverageRestraint(String name) {
        super(name);
    }

    /**
     * A unique identifier for the 2dem class average.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Identifier to the 2dem class average dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * The number of raw micrographs used to obtain the class average.
     * @return IntColumn
     */
    public IntColumn getNumberRawMicrographs() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_raw_micrographs", IntColumn::new) :
                getBinaryColumn("number_raw_micrographs"));
    }

    /**
     * Pixel size width of the 2dem class average image.
     * While fitting the model to the image, _ihm_2dem_class_average_restraint.pixel_size_width
     * is used along with _ihm_2dem_class_average_restraint.pixel_size_height to scale the image.
     * @return FloatColumn
     */
    public FloatColumn getPixelSizeWidth() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pixel_size_width", FloatColumn::new) :
                getBinaryColumn("pixel_size_width"));
    }

    /**
     * Pixel size height of the 2dem class average image.
     * While fitting the model to the image, _ihm_2dem_class_average_restraint.pixel_size_height
     * is used along with _ihm_2dem_class_average_restraint.pixel_size_width to scale the image.
     * @return FloatColumn
     */
    public FloatColumn getPixelSizeHeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pixel_size_height", FloatColumn::new) :
                getBinaryColumn("pixel_size_height"));
    }

    /**
     * Resolution of the 2dem class average.
     * @return FloatColumn
     */
    public FloatColumn getImageResolution() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("image_resolution", FloatColumn::new) :
                getBinaryColumn("image_resolution"));
    }

    /**
     * A flag that indicates whether or not the 2DEM class average image is segmented i.e.,
     * whether the whole image is used or only a portion of it is used (by masking
     * or by other means) as restraint in the modeling.
     * @return StrColumn
     */
    public StrColumn getImageSegmentFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_segment_flag", StrColumn::new) :
                getBinaryColumn("image_segment_flag"));
    }

    /**
     * Number of 2D projections of the model used in the fitting.
     * @return IntColumn
     */
    public IntColumn getNumberOfProjections() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_of_projections", IntColumn::new) :
                getBinaryColumn("number_of_projections"));
    }

    /**
     * An indicator to whether the whole assembly that is modeled is fit into the image
     * or if only a subset of the structural assembly is fit into the image.
     * This data item is a pointer to _ihm_struct_assembly.assembly_id in the
     * IHM_STRUCT_ASSEMBLY category. The IHM_STRUCT_ASSEMBLY category provides the
     * details regarding the different structural assemblies used in the modeling.
     * The default value for this data item is "1" indicating that the entire assembly
     * being modeled is fit into the EM data.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("struct_assembly_id", IntColumn::new) :
                getBinaryColumn("struct_assembly_id"));
    }

    /**
     * Details of how the 2DEM restraint is applied in the modeling algorithm.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
