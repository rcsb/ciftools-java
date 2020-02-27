package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The name of a file containing the map.
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", StrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }

    /**
     * map format
     * @return StrColumn
     */
    public StrColumn getUploadFormat() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("upload_format", StrColumn::new) :
                getBinaryColumn("upload_format"));
    }

    /**
     * recommended contour level for viewing the map
     * @return FloatColumn
     */
    public FloatColumn getContourLevel() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("contour_level", FloatColumn::new) :
                getBinaryColumn("contour_level"));
    }

    /**
     * map annotation details
     * @return StrColumn
     */
    public StrColumn getAnnotationDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("annotation_details", StrColumn::new) :
                getBinaryColumn("annotation_details"));
    }

    /**
     * The length in Angstroms of one voxel along the X axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_x", FloatColumn::new) :
                getBinaryColumn("pixel_spacing_x"));
    }

    /**
     * The length in Angstroms of one voxel along the Y axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_y", FloatColumn::new) :
                getBinaryColumn("pixel_spacing_y"));
    }

    /**
     * The length in Angstroms of one voxel along the Z axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pixel_spacing_z", FloatColumn::new) :
                getBinaryColumn("pixel_spacing_z"));
    }
}
