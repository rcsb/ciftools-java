package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data in the PDBX_CRYSTAL_ALIGNMENT are produced by log files from
 * programs during indexing
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxCrystalAlignment extends BaseCategory {
    public PdbxCrystalAlignment(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxCrystalAlignment(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxCrystalAlignment(String name) {
        super(name);
    }

    /**
     * The identifer of the crystal.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * The actual oscillation angle (normally &lt;1.0 degree).
     * @return FloatColumn
     */
    public FloatColumn getOscillationRange() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("oscillation_range", FloatColumn::new) :
                getBinaryColumn("oscillation_range"));
    }

    /**
     * Starting oscillation angle (in degrees)  .
     * @return FloatColumn
     */
    public FloatColumn getOscillationStart() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("oscillation_start", FloatColumn::new) :
                getBinaryColumn("oscillation_start"));
    }

    /**
     * Ending oscillation angle (in degrees) (default end = start + range).
     * @return FloatColumn
     */
    public FloatColumn getOscillationEnd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("oscillation_end", FloatColumn::new) :
                getBinaryColumn("oscillation_end"));
    }

    /**
     * Distance (mm) from the edge of data to beam spot (in X direction).
     * @return FloatColumn
     */
    public FloatColumn getXbeam() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("xbeam", FloatColumn::new) :
                getBinaryColumn("xbeam"));
    }

    /**
     * The estimated deviation of xbeam (mm).
     * @return FloatColumn
     */
    public FloatColumn getXbeamEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("xbeam_esd", FloatColumn::new) :
                getBinaryColumn("xbeam_esd"));
    }

    /**
     * Distance from (mm) the edge of data to beam spot (in Y direction).
     * @return FloatColumn
     */
    public FloatColumn getYbeam() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ybeam", FloatColumn::new) :
                getBinaryColumn("ybeam"));
    }

    /**
     * The estimated deviation of ybeam (mm).
     * @return FloatColumn
     */
    public FloatColumn getYbeamEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ybeam_esd", FloatColumn::new) :
                getBinaryColumn("ybeam_esd"));
    }

    /**
     * Crystal mis-orientation angle (in degree) on x axis (spindle).
     * @return FloatColumn
     */
    public FloatColumn getCrysxSpindle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crysx_spindle", FloatColumn::new) :
                getBinaryColumn("crysx_spindle"));
    }

    /**
     * The estimated deviation of orientation angle (in degree) on x axis.
     * @return FloatColumn
     */
    public FloatColumn getCrysxSpindleEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crysx_spindle_esd", FloatColumn::new) :
                getBinaryColumn("crysx_spindle_esd"));
    }

    /**
     * Crystal mis-orientation angle (in degree) on y axis (vertical).
     * @return FloatColumn
     */
    public FloatColumn getCrysyVertical() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crysy_vertical", FloatColumn::new) :
                getBinaryColumn("crysy_vertical"));
    }

    /**
     * The estimated deviation of orientation angle (in degree) on y axis.
     * @return FloatColumn
     */
    public FloatColumn getCrysyVerticalEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crysy_vertical_esd", FloatColumn::new) :
                getBinaryColumn("crysy_vertical_esd"));
    }

    /**
     * Crystal mis-orientation angle (in degree) on z axis  (in beam).
     * @return FloatColumn
     */
    public FloatColumn getCryszBeam() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crysz_beam", FloatColumn::new) :
                getBinaryColumn("crysz_beam"));
    }

    /**
     * The estimated deviation of orientation angle (in degree) on yzaxis.
     * @return FloatColumn
     */
    public FloatColumn getCryszBeamEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crysz_beam_esd", FloatColumn::new) :
                getBinaryColumn("crysz_beam_esd"));
    }

    /**
     * Distance (mm) from crystal to detector.
     * @return FloatColumn
     */
    public FloatColumn getCrystalToDetectorDistance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crystal_to_detector_distance", FloatColumn::new) :
                getBinaryColumn("crystal_to_detector_distance"));
    }

    /**
     * The estimated deviation of distance (mm) from crystal to detector.
     * @return FloatColumn
     */
    public FloatColumn getCrystalToDetectorDistanceEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crystal_to_detector_distance_esd", FloatColumn::new) :
                getBinaryColumn("crystal_to_detector_distance_esd"));
    }

    /**
     * Angular spread (in degrees) of incident X-ray along the
     * horizontal (x) direction. Default is 0.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_x", FloatColumn::new) :
                getBinaryColumn("crossfire_x"));
    }

    /**
     * The estimated deviation of angular spread (in degrees) of
     * incident X-ray along the horizontal (x) direction.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireXEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_x_esd", FloatColumn::new) :
                getBinaryColumn("crossfire_x_esd"));
    }

    /**
     * Angular spread (in degrees) of incident X-ray along the
     * vertical (y) direction. Default is 0.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_y", FloatColumn::new) :
                getBinaryColumn("crossfire_y"));
    }

    /**
     * The estimated deviation of angular spread (in degrees) of
     * incident X-ray along the vertical (y) direction.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireYEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_y_esd", FloatColumn::new) :
                getBinaryColumn("crossfire_y_esd"));
    }

    /**
     * Correlated xy component of the beam spread. This tends to be
     * zero within error (in degrees^2).
     * @return FloatColumn
     */
    public FloatColumn getCrossfireXy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_xy", FloatColumn::new) :
                getBinaryColumn("crossfire_xy"));
    }

    /**
     * The estimated deviation of correlated xy component of the beam
     * spread (in degrees^2).
     * @return FloatColumn
     */
    public FloatColumn getCrossfireXyEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("crossfire_xy_esd", FloatColumn::new) :
                getBinaryColumn("crossfire_xy_esd"));
    }
}
