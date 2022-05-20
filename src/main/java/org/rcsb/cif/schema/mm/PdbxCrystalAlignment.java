package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data in the PDBX_CRYSTAL_ALIGNMENT are produced by log files from
 * programs during indexing
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxCrystalAlignment extends DelegatingCategory {
    public PdbxCrystalAlignment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "crystal_id":
                return getCrystalId();
            case "oscillation_range":
                return getOscillationRange();
            case "oscillation_start":
                return getOscillationStart();
            case "oscillation_end":
                return getOscillationEnd();
            case "xbeam":
                return getXbeam();
            case "xbeam_esd":
                return getXbeamEsd();
            case "ybeam":
                return getYbeam();
            case "ybeam_esd":
                return getYbeamEsd();
            case "crysx_spindle":
                return getCrysxSpindle();
            case "crysx_spindle_esd":
                return getCrysxSpindleEsd();
            case "crysy_vertical":
                return getCrysyVertical();
            case "crysy_vertical_esd":
                return getCrysyVerticalEsd();
            case "crysz_beam":
                return getCryszBeam();
            case "crysz_beam_esd":
                return getCryszBeamEsd();
            case "crystal_to_detector_distance":
                return getCrystalToDetectorDistance();
            case "crystal_to_detector_distance_esd":
                return getCrystalToDetectorDistanceEsd();
            case "crossfire_x":
                return getCrossfireX();
            case "crossfire_x_esd":
                return getCrossfireXEsd();
            case "crossfire_y":
                return getCrossfireY();
            case "crossfire_y_esd":
                return getCrossfireYEsd();
            case "crossfire_xy":
                return getCrossfireXy();
            case "crossfire_xy_esd":
                return getCrossfireXyEsd();
            case "overall_beam_divergence":
                return getOverallBeamDivergence();
            case "overall_beam_divergence_esd":
                return getOverallBeamDivergenceEsd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The identifer of the crystal.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * The actual oscillation angle (normally &lt;1.0 degree).
     * @return FloatColumn
     */
    public FloatColumn getOscillationRange() {
        return delegate.getColumn("oscillation_range", DelegatingFloatColumn::new);
    }

    /**
     * Starting oscillation angle (in degrees)  .
     * @return FloatColumn
     */
    public FloatColumn getOscillationStart() {
        return delegate.getColumn("oscillation_start", DelegatingFloatColumn::new);
    }

    /**
     * Ending oscillation angle (in degrees) (default end = start + range).
     * @return FloatColumn
     */
    public FloatColumn getOscillationEnd() {
        return delegate.getColumn("oscillation_end", DelegatingFloatColumn::new);
    }

    /**
     * Distance (mm) from the edge of data to beam spot (in X direction).
     * @return FloatColumn
     */
    public FloatColumn getXbeam() {
        return delegate.getColumn("xbeam", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of xbeam (mm).
     * @return FloatColumn
     */
    public FloatColumn getXbeamEsd() {
        return delegate.getColumn("xbeam_esd", DelegatingFloatColumn::new);
    }

    /**
     * Distance from (mm) the edge of data to beam spot (in Y direction).
     * @return FloatColumn
     */
    public FloatColumn getYbeam() {
        return delegate.getColumn("ybeam", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of ybeam (mm).
     * @return FloatColumn
     */
    public FloatColumn getYbeamEsd() {
        return delegate.getColumn("ybeam_esd", DelegatingFloatColumn::new);
    }

    /**
     * Crystal mis-orientation angle (in degree) on x axis (spindle).
     * @return FloatColumn
     */
    public FloatColumn getCrysxSpindle() {
        return delegate.getColumn("crysx_spindle", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of orientation angle (in degree) on x axis.
     * @return FloatColumn
     */
    public FloatColumn getCrysxSpindleEsd() {
        return delegate.getColumn("crysx_spindle_esd", DelegatingFloatColumn::new);
    }

    /**
     * Crystal mis-orientation angle (in degree) on y axis (vertical).
     * @return FloatColumn
     */
    public FloatColumn getCrysyVertical() {
        return delegate.getColumn("crysy_vertical", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of orientation angle (in degree) on y axis.
     * @return FloatColumn
     */
    public FloatColumn getCrysyVerticalEsd() {
        return delegate.getColumn("crysy_vertical_esd", DelegatingFloatColumn::new);
    }

    /**
     * Crystal mis-orientation angle (in degree) on z axis  (in beam).
     * @return FloatColumn
     */
    public FloatColumn getCryszBeam() {
        return delegate.getColumn("crysz_beam", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of orientation angle (in degree) on yzaxis.
     * @return FloatColumn
     */
    public FloatColumn getCryszBeamEsd() {
        return delegate.getColumn("crysz_beam_esd", DelegatingFloatColumn::new);
    }

    /**
     * Distance (mm) from crystal to detector.
     * @return FloatColumn
     */
    public FloatColumn getCrystalToDetectorDistance() {
        return delegate.getColumn("crystal_to_detector_distance", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of distance (mm) from crystal to detector.
     * @return FloatColumn
     */
    public FloatColumn getCrystalToDetectorDistanceEsd() {
        return delegate.getColumn("crystal_to_detector_distance_esd", DelegatingFloatColumn::new);
    }

    /**
     * Angular spread (in degrees) of incident X-ray along the
     * horizontal (x) direction. Default is 0.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireX() {
        return delegate.getColumn("crossfire_x", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of angular spread (in degrees) of
     * incident X-ray along the horizontal (x) direction.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireXEsd() {
        return delegate.getColumn("crossfire_x_esd", DelegatingFloatColumn::new);
    }

    /**
     * Angular spread (in degrees) of incident X-ray along the
     * vertical (y) direction. Default is 0.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireY() {
        return delegate.getColumn("crossfire_y", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of angular spread (in degrees) of
     * incident X-ray along the vertical (y) direction.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireYEsd() {
        return delegate.getColumn("crossfire_y_esd", DelegatingFloatColumn::new);
    }

    /**
     * Correlated xy component of the beam spread. This tends to be
     * zero within error (in degrees^2).
     * @return FloatColumn
     */
    public FloatColumn getCrossfireXy() {
        return delegate.getColumn("crossfire_xy", DelegatingFloatColumn::new);
    }

    /**
     * The estimated deviation of correlated xy component of the beam
     * spread (in degrees^2).
     * @return FloatColumn
     */
    public FloatColumn getCrossfireXyEsd() {
        return delegate.getColumn("crossfire_xy_esd", DelegatingFloatColumn::new);
    }

    /**
     * Isotropic distribution of photon angles from the source impacting on the
     * crystal in degrees. Note this is typically a derived quantity, inferred
     * from measuring the radial profile of the measured reflections, and it may
     * be convolved with effects from the bandpass.
     * @return FloatColumn
     */
    public FloatColumn getOverallBeamDivergence() {
        return delegate.getColumn("overall_beam_divergence", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the beam divergence estimate.
     * @return FloatColumn
     */
    public FloatColumn getOverallBeamDivergenceEsd() {
        return delegate.getColumn("overall_beam_divergence_esd", DelegatingFloatColumn::new);
    }

}