package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_SCAN  category describe the parameters of one
 * or more scans, relating axis positions to frames.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnScan extends DelegatingCategory {
    public DiffrnScan(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "date_end":
                return getDateEnd();
            case "date_end_estimated":
                return getDateEndEstimated();
            case "date_start":
                return getDateStart();
            case "integration_time":
                return getIntegrationTime();
            case "frame_id_start":
                return getFrameIdStart();
            case "frame_id_end":
                return getFrameIdEnd();
            case "frames":
                return getFrames();
            case "time_period":
                return getTimePeriod();
            case "time_rstrt_incr":
                return getTimeRstrtIncr();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _diffrn_scan.id  uniquely identifies each
     * scan.  The identifier is used to tie together all the
     * information about the scan.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The date and time of the end of the scan.  Note that this
     * may be an estimate generated during the scan, before the
     * precise time of the end of the scan is known, in which
     * case _diffrn_scan.date_end_estimated  should be used instead.
     * @return StrColumn
     */
    public StrColumn getDateEnd() {
        return delegate.getColumn("date_end", DelegatingStrColumn::new);
    }

    /**
     * The estimated date and time of the end of the scan.  Note
     * that this may be generated at the start or during the scan,
     * before the precise time of the end of the scan is known.
     * @return StrColumn
     */
    public StrColumn getDateEndEstimated() {
        return delegate.getColumn("date_end_estimated", DelegatingStrColumn::new);
    }

    /**
     * The date and time of the start of the scan.
     * @return StrColumn
     */
    public StrColumn getDateStart() {
        return delegate.getColumn("date_start", DelegatingStrColumn::new);
    }

    /**
     * Approximate average time in seconds to integrate each
     * step of the scan.  The precise time for integration
     * of each particular step must be provided in
     * _diffrn_scan_frame.integration_time, even
     * if all steps have the same integration time.
     * @return FloatColumn
     */
    public FloatColumn getIntegrationTime() {
        return delegate.getColumn("integration_time", DelegatingFloatColumn::new);
    }

    /**
     * The value of this data item is the identifier of the
     * first frame in the scan.
     * 
     * This item is a pointer to _diffrn_data_frame.id  in the
     * DIFFRN_DATA_FRAME  category.
     * @return StrColumn
     */
    public StrColumn getFrameIdStart() {
        return delegate.getColumn("frame_id_start", DelegatingStrColumn::new);
    }

    /**
     * The value of this data item is the identifier of the
     * last frame in the scan.
     * 
     * This item is a pointer to _diffrn_data_frame.id  in the
     * DIFFRN_DATA_FRAME  category.
     * @return StrColumn
     */
    public StrColumn getFrameIdEnd() {
        return delegate.getColumn("frame_id_end", DelegatingStrColumn::new);
    }

    /**
     * The value of this data item is the number of frames in
     * the scan.
     * @return IntColumn
     */
    public IntColumn getFrames() {
        return delegate.getColumn("frames", DelegatingIntColumn::new);
    }

    /**
     * Approximate average time in seconds between the start
     * of each step of the scan.  The precise start-to-start
     * time increment of each particular step may be provided in
     * _diffrn_scan_frame.time_period.
     * @return FloatColumn
     */
    public FloatColumn getTimePeriod() {
        return delegate.getColumn("time_period", DelegatingFloatColumn::new);
    }

    /**
     * Approximate average time in seconds between the end
     * of integration of each step of the scan and the start
     * of integration of the next step.
     * 
     * In general, this will agree with
     * _diffrn_scan_frame.time_rstrt_incr .  The
     * sum of the values of _diffrn_scan_frame.integration_time
     * and  _diffrn_scan_frame.time_rstrt_incr  is the
     * time from the start of integration of one frame and the start of
     * integration for the next frame and should equal the value of
     * _diffrn_scan_frame.time_period  for this
     * frame.   If the individual frame values vary, then the value of
     * _diffrn_scan.time_rstrt_incr  will be
     * representative of the ensemble of values of
     * _diffrn_scan_frame.time_rstrt_incr  (e.g.
     * the mean).
     * @return FloatColumn
     */
    public FloatColumn getTimeRstrtIncr() {
        return delegate.getColumn("time_rstrt_incr", DelegatingFloatColumn::new);
    }

}