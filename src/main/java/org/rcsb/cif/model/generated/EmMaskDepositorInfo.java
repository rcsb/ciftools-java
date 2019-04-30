package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_MASK_DEPOSITOR_INFO category record mask parameters
 * that are provided by the depositor
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmMaskDepositorInfo extends BaseCategory {
    public EmMaskDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmMaskDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmMaskDepositorInfo(String name) {
        super(name);
    }

    /**
     * Unique identifier for each map listed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The name of a file containing the map.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getUploadFileName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", SingleRowStrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }

    /**
     * map format
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getUploadFormat() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("upload_format", SingleRowStrColumn::new) :
                getBinaryColumn("upload_format"));
    }

    /**
     * recommended contour level for viewing the map
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getContourLevel() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("contour_level", SingleRowFloatColumn::new) :
                getBinaryColumn("contour_level"));
    }

    /**
     * map annotation details
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAnnotationDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("annotation_details", SingleRowStrColumn::new) :
                getBinaryColumn("annotation_details"));
    }

    /**
     * The length in Angstroms of one voxel along the X axis.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPixelSpacingX() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_x", SingleRowFloatColumn::new) :
                getBinaryColumn("pixel_spacing_x"));
    }

    /**
     * The length in Angstroms of one voxel along the Y axis.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPixelSpacingY() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_y", SingleRowFloatColumn::new) :
                getBinaryColumn("pixel_spacing_y"));
    }

    /**
     * The length in Angstroms of one voxel along the Z axis.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPixelSpacingZ() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_z", SingleRowFloatColumn::new) :
                getBinaryColumn("pixel_spacing_z"));
    }
}
