package org.rcsb.cif.model.emmaskdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The name of a file containing the map.
     * @return UploadFileName
     */
    public UploadFileName getUploadFileName() {
        return (UploadFileName) (isText ? textFields.computeIfAbsent("upload_file_name",
                UploadFileName::new) : getBinaryColumn("upload_file_name"));
    }

    /**
     * map format
     * @return UploadFormat
     */
    public UploadFormat getUploadFormat() {
        return (UploadFormat) (isText ? textFields.computeIfAbsent("upload_format",
                UploadFormat::new) : getBinaryColumn("upload_format"));
    }

    /**
     * recommended contour level for viewing the map
     * @return ContourLevel
     */
    public ContourLevel getContourLevel() {
        return (ContourLevel) (isText ? textFields.computeIfAbsent("contour_level",
                ContourLevel::new) : getBinaryColumn("contour_level"));
    }

    /**
     * map annotation details
     * @return AnnotationDetails
     */
    public AnnotationDetails getAnnotationDetails() {
        return (AnnotationDetails) (isText ? textFields.computeIfAbsent("annotation_details",
                AnnotationDetails::new) : getBinaryColumn("annotation_details"));
    }

    /**
     * The length in Angstroms of one voxel along the X axis.
     * @return PixelSpacingX
     */
    public PixelSpacingX getPixelSpacingX() {
        return (PixelSpacingX) (isText ? textFields.computeIfAbsent("pixel_spacing_x",
                PixelSpacingX::new) : getBinaryColumn("pixel_spacing_x"));
    }

    /**
     * The length in Angstroms of one voxel along the Y axis.
     * @return PixelSpacingY
     */
    public PixelSpacingY getPixelSpacingY() {
        return (PixelSpacingY) (isText ? textFields.computeIfAbsent("pixel_spacing_y",
                PixelSpacingY::new) : getBinaryColumn("pixel_spacing_y"));
    }

    /**
     * The length in Angstroms of one voxel along the Z axis.
     * @return PixelSpacingZ
     */
    public PixelSpacingZ getPixelSpacingZ() {
        return (PixelSpacingZ) (isText ? textFields.computeIfAbsent("pixel_spacing_z",
                PixelSpacingZ::new) : getBinaryColumn("pixel_spacing_z"));
    }
}
