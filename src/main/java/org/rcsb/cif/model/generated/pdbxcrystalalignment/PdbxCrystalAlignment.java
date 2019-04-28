package org.rcsb.cif.model.generated.pdbxcrystalalignment;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return CrystalId
     */
    public CrystalId getCrystalId() {
        return (CrystalId) (isText ? textFields.computeIfAbsent("crystal_id",
                CrystalId::new) : getBinaryColumn("crystal_id"));
    }

    /**
     * The actual oscillation angle (normally <1.0 degree).
     * @return OscillationRange
     */
    public OscillationRange getOscillationRange() {
        return (OscillationRange) (isText ? textFields.computeIfAbsent("oscillation_range",
                OscillationRange::new) : getBinaryColumn("oscillation_range"));
    }

    /**
     * Starting oscillation angle (in degrees)  .
     * @return OscillationStart
     */
    public OscillationStart getOscillationStart() {
        return (OscillationStart) (isText ? textFields.computeIfAbsent("oscillation_start",
                OscillationStart::new) : getBinaryColumn("oscillation_start"));
    }

    /**
     * Ending oscillation angle (in degrees) (default end = start + range).
     * @return OscillationEnd
     */
    public OscillationEnd getOscillationEnd() {
        return (OscillationEnd) (isText ? textFields.computeIfAbsent("oscillation_end",
                OscillationEnd::new) : getBinaryColumn("oscillation_end"));
    }

    /**
     * Distance (mm) from the edge of data to beam spot (in X direction).
     * @return Xbeam
     */
    public Xbeam getXbeam() {
        return (Xbeam) (isText ? textFields.computeIfAbsent("xbeam",
                Xbeam::new) : getBinaryColumn("xbeam"));
    }

    /**
     * The estimated deviation of xbeam (mm).
     * @return XbeamEsd
     */
    public XbeamEsd getXbeamEsd() {
        return (XbeamEsd) (isText ? textFields.computeIfAbsent("xbeam_esd",
                XbeamEsd::new) : getBinaryColumn("xbeam_esd"));
    }

    /**
     * Distance from (mm) the edge of data to beam spot (in Y direction).
     * @return Ybeam
     */
    public Ybeam getYbeam() {
        return (Ybeam) (isText ? textFields.computeIfAbsent("ybeam",
                Ybeam::new) : getBinaryColumn("ybeam"));
    }

    /**
     * The estimated deviation of ybeam (mm).
     * @return YbeamEsd
     */
    public YbeamEsd getYbeamEsd() {
        return (YbeamEsd) (isText ? textFields.computeIfAbsent("ybeam_esd",
                YbeamEsd::new) : getBinaryColumn("ybeam_esd"));
    }

    /**
     * Crystal mis-orientation angle (in degree) on x axis (spindle).
     * @return CrysxSpindle
     */
    public CrysxSpindle getCrysxSpindle() {
        return (CrysxSpindle) (isText ? textFields.computeIfAbsent("crysx_spindle",
                CrysxSpindle::new) : getBinaryColumn("crysx_spindle"));
    }

    /**
     * The estimated deviation of orientation angle (in degree) on x axis.
     * @return CrysxSpindleEsd
     */
    public CrysxSpindleEsd getCrysxSpindleEsd() {
        return (CrysxSpindleEsd) (isText ? textFields.computeIfAbsent("crysx_spindle_esd",
                CrysxSpindleEsd::new) : getBinaryColumn("crysx_spindle_esd"));
    }

    /**
     * Crystal mis-orientation angle (in degree) on y axis (vertical).
     * @return CrysyVertical
     */
    public CrysyVertical getCrysyVertical() {
        return (CrysyVertical) (isText ? textFields.computeIfAbsent("crysy_vertical",
                CrysyVertical::new) : getBinaryColumn("crysy_vertical"));
    }

    /**
     * The estimated deviation of orientation angle (in degree) on y axis.
     * @return CrysyVerticalEsd
     */
    public CrysyVerticalEsd getCrysyVerticalEsd() {
        return (CrysyVerticalEsd) (isText ? textFields.computeIfAbsent("crysy_vertical_esd",
                CrysyVerticalEsd::new) : getBinaryColumn("crysy_vertical_esd"));
    }

    /**
     * Crystal mis-orientation angle (in degree) on z axis  (in beam).
     * @return CryszBeam
     */
    public CryszBeam getCryszBeam() {
        return (CryszBeam) (isText ? textFields.computeIfAbsent("crysz_beam",
                CryszBeam::new) : getBinaryColumn("crysz_beam"));
    }

    /**
     * The estimated deviation of orientation angle (in degree) on yzaxis.
     * @return CryszBeamEsd
     */
    public CryszBeamEsd getCryszBeamEsd() {
        return (CryszBeamEsd) (isText ? textFields.computeIfAbsent("crysz_beam_esd",
                CryszBeamEsd::new) : getBinaryColumn("crysz_beam_esd"));
    }

    /**
     * Distance (mm) from crystal to detector.
     * @return CrystalToDetectorDistance
     */
    public CrystalToDetectorDistance getCrystalToDetectorDistance() {
        return (CrystalToDetectorDistance) (isText ? textFields.computeIfAbsent("crystal_to_detector_distance",
                CrystalToDetectorDistance::new) : getBinaryColumn("crystal_to_detector_distance"));
    }

    /**
     * The estimated deviation of distance (mm) from crystal to detector.
     * @return CrystalToDetectorDistanceEsd
     */
    public CrystalToDetectorDistanceEsd getCrystalToDetectorDistanceEsd() {
        return (CrystalToDetectorDistanceEsd) (isText ? textFields.computeIfAbsent("crystal_to_detector_distance_esd",
                CrystalToDetectorDistanceEsd::new) : getBinaryColumn("crystal_to_detector_distance_esd"));
    }

    /**
     * Angular spread (in degrees) of incident X-ray along the
     * horizontal (x) direction. Default is 0.
     * @return CrossfireX
     */
    public CrossfireX getCrossfireX() {
        return (CrossfireX) (isText ? textFields.computeIfAbsent("crossfire_x",
                CrossfireX::new) : getBinaryColumn("crossfire_x"));
    }

    /**
     * The estimated deviation of angular spread (in degrees) of
     * incident X-ray along the horizontal (x) direction.
     * @return CrossfireXEsd
     */
    public CrossfireXEsd getCrossfireXEsd() {
        return (CrossfireXEsd) (isText ? textFields.computeIfAbsent("crossfire_x_esd",
                CrossfireXEsd::new) : getBinaryColumn("crossfire_x_esd"));
    }

    /**
     * Angular spread (in degrees) of incident X-ray along the
     * vertical (y) direction. Default is 0.
     * @return CrossfireY
     */
    public CrossfireY getCrossfireY() {
        return (CrossfireY) (isText ? textFields.computeIfAbsent("crossfire_y",
                CrossfireY::new) : getBinaryColumn("crossfire_y"));
    }

    /**
     * The estimated deviation of angular spread (in degrees) of
     * incident X-ray along the vertical (y) direction.
     * @return CrossfireYEsd
     */
    public CrossfireYEsd getCrossfireYEsd() {
        return (CrossfireYEsd) (isText ? textFields.computeIfAbsent("crossfire_y_esd",
                CrossfireYEsd::new) : getBinaryColumn("crossfire_y_esd"));
    }

    /**
     * Correlated xy component of the beam spread. This tends to be
     * zero within error (in degrees^2).
     * @return CrossfireXy
     */
    public CrossfireXy getCrossfireXy() {
        return (CrossfireXy) (isText ? textFields.computeIfAbsent("crossfire_xy",
                CrossfireXy::new) : getBinaryColumn("crossfire_xy"));
    }

    /**
     * The estimated deviation of correlated xy component of the beam
     * spread (in degrees^2).
     * @return CrossfireXyEsd
     */
    public CrossfireXyEsd getCrossfireXyEsd() {
        return (CrossfireXyEsd) (isText ? textFields.computeIfAbsent("crossfire_xy_esd",
                CrossfireXyEsd::new) : getBinaryColumn("crossfire_xy_esd"));
    }
}
