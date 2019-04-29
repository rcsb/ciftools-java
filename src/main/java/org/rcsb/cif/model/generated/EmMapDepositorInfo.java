package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_MAP_DEPOSITOR INFO category record map parameters
 * that are provided by the depositor
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmMapDepositorInfo extends BaseCategory {
    public EmMapDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmMapDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmMapDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This data item optionally associates a map with a data item in the EM_EXPERIMENT category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExperimentId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("experiment_id", SingleRowStrColumn::new) :
                getBinaryColumn("experiment_id"));
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
     * Primary map or additional map classification.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMapType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("map_type", SingleRowStrColumn::new) :
                getBinaryColumn("map_type"));
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
