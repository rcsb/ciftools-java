package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_SCAN_FRAME  category describe
 * the relationships of particular frames to scans.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnScanFrame extends DelegatingCategory {
    public DiffrnScanFrame(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "date":
                return getDate();
            case "frame_id":
                return getFrameId();
            case "frame_number":
                return getFrameNumber();
            case "integration_time":
                return getIntegrationTime();
            case "polarizn_Stokes_I":
                return getPolariznStokesI();
            case "scan_id":
                return getScanId();
            case "time_period":
                return getTimePeriod();
            case "time_rstrt_incr":
                return getTimeRstrtIncr();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The date and time of the start of the frame being scanned.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * The value of this data item is the identifier of the
     * frame being examined.
     * 
     * This item is a pointer to _diffrn_data_frame.id  in the
     * DIFFRN_DATA_FRAME  category.
     * @return StrColumn
     */
    public StrColumn getFrameId() {
        return delegate.getColumn("frame_id", DelegatingStrColumn::new);
    }

    /**
     * The value of this data item is the number of the frame
     * within the scan, starting with 1.  It is not necessarily
     * the same as the value of _diffrn_scan_frame.frame_id,
     * but it may be.
     * @return IntColumn
     */
    public IntColumn getFrameNumber() {
        return delegate.getColumn("frame_number", DelegatingIntColumn::new);
    }

    /**
     * The time in seconds to integrate this step of the scan.
     * This should be the precise time of integration of each
     * particular frame.  The value of this data item should
     * be given explicitly for each frame and not inferred
     * from the value of _diffrn_scan.integration_time.
     * @return FloatColumn
     */
    public FloatColumn getIntegrationTime() {
        return delegate.getColumn("integration_time", DelegatingFloatColumn::new);
    }

    /**
     * The quantity Ip+In+Inp, where Ip is the intensity (amplitude
     * squared) of the electric vector in the plane of polarization,
     * In is the intensity (amplitude squared) of the electric vector
     * in the plane of the normal to the plane of polarization,
     * and Inp is the intensity (amplitude squared) of the
     * non-polarized (incoherent) electric vector.
     * 
     * This is an average or other representative sample of the
     * frame.
     * 
     * This is the first of the Stokes polarization parameters,
     * I, Q, U, V [also known as I, M, C, S; see Berry et al. (1977)].
     * 
     * If the absolute intensity is not known, the value 1.0
     * is assumed for I, and all four Stokes parameters are
     * dimensionless.  When the absolute intensity is known,
     * all four Stokes parameters are in units of watts per
     * square metre.
     * 
     * Note that, if the polarized intensity Ip+In is required,
     * (Ip+In)^2^ is the sum of Q^2^+U^2^+V^2^.
     * 
     * Reference:
     * Berry, H. H., Gabrielse, G. &amp; Livingston, A. E. (1977).
     * 'Measurement of the Stokes parameters of light',
     * Appl. Optics, 16:12, 3200--3205.
     * @return FloatColumn
     */
    public FloatColumn getPolariznStokesI() {
        return delegate.getColumn("polarizn_Stokes_I", DelegatingFloatColumn::new);
    }

    /**
     * The value of _diffrn_scan_frame.scan_id  identifies the scan
     * containing this frame.
     * 
     * This item is a pointer to _diffrn_scan.id  in the
     * DIFFRN_SCAN  category.
     * @return StrColumn
     */
    public StrColumn getScanId() {
        return delegate.getColumn("scan_id", DelegatingStrColumn::new);
    }

    /**
     * The time in seconds between the start of this frame and the
     * start of the next frame, if any.  If there is no next frame,
     * a null value should be given.
     * @return FloatColumn
     */
    public FloatColumn getTimePeriod() {
        return delegate.getColumn("time_period", DelegatingFloatColumn::new);
    }

    /**
     * The time in seconds between the end of integration of this step of the scan
     * and the start of integration of the next step.
     * 
     * The sum of the values of _diffrn_scan_frame.integration_time
     * and  _diffrn_scan_frame.time_rstrt_incr  is the
     * time from the start of integration of one frame and the start of
     * integration for the next frame and should equal the value of
     * _diffrn_scan_frame.time_period  for this
     * frame.   The value of _diffrn_scan.time_rstrt_incr  will be
     * representative of the ensemble of values of
     * _diffrn_scan_frame.time_rstrt_incr  (e.g.
     * the mean).
     * 
     * If there is no next frame, a null value should be given.
     * @return FloatColumn
     */
    public FloatColumn getTimeRstrtIncr() {
        return delegate.getColumn("time_rstrt_incr", DelegatingFloatColumn::new);
    }

}