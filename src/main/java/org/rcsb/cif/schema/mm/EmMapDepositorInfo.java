package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_MAP_DEPOSITOR INFO category record map parameters
 * that are provided by the depositor
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmMapDepositorInfo extends DelegatingCategory {
    public EmMapDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "experiment_id":
                return getExperimentId();
            case "id":
                return getId();
            case "map_type":
                return getMapType();
            case "upload_file_name":
                return getUploadFileName();
            case "upload_format":
                return getUploadFormat();
            case "contour_level":
                return getContourLevel();
            case "annotation_details":
                return getAnnotationDetails();
            case "pixel_spacing_x":
                return getPixelSpacingX();
            case "pixel_spacing_y":
                return getPixelSpacingY();
            case "pixel_spacing_z":
                return getPixelSpacingZ();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This data item optionally associates a map with a data item in the EM_EXPERIMENT category.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return delegate.getColumn("experiment_id", DelegatingStrColumn::new);
    }

    /**
     * Unique identifier for each map listed.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Primary map or additional map classification.
     * @return StrColumn
     */
    public StrColumn getMapType() {
        return delegate.getColumn("map_type", DelegatingStrColumn::new);
    }

    /**
     * The name of a file containing the map.
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return delegate.getColumn("upload_file_name", DelegatingStrColumn::new);
    }

    /**
     * map format
     * @return StrColumn
     */
    public StrColumn getUploadFormat() {
        return delegate.getColumn("upload_format", DelegatingStrColumn::new);
    }

    /**
     * recommended contour level for viewing the map
     * @return FloatColumn
     */
    public FloatColumn getContourLevel() {
        return delegate.getColumn("contour_level", DelegatingFloatColumn::new);
    }

    /**
     * map annotation details
     * @return StrColumn
     */
    public StrColumn getAnnotationDetails() {
        return delegate.getColumn("annotation_details", DelegatingStrColumn::new);
    }

    /**
     * The length in angstroms of one voxel along the X axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingX() {
        return delegate.getColumn("pixel_spacing_x", DelegatingFloatColumn::new);
    }

    /**
     * The length in angstroms of one voxel along the Y axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingY() {
        return delegate.getColumn("pixel_spacing_y", DelegatingFloatColumn::new);
    }

    /**
     * The length in angstroms of one voxel along the Z axis.
     * @return FloatColumn
     */
    public FloatColumn getPixelSpacingZ() {
        return delegate.getColumn("pixel_spacing_z", DelegatingFloatColumn::new);
    }

}