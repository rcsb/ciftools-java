package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_DETECTOR category describe the
 * detector used to measure the scattered radiation, including
 * any analyser and post-sample collimation.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnDetector extends DelegatingCategory {
    public DiffrnDetector(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "detector":
                return getDetector();
            case "diffrn_id":
                return getDiffrnId();
            case "type":
                return getType();
            case "area_resol_mean":
                return getAreaResolMean();
            case "dtime":
                return getDtime();
            case "pdbx_frames_total":
                return getPdbxFramesTotal();
            case "pdbx_collection_time_total":
                return getPdbxCollectionTimeTotal();
            case "pdbx_collection_date":
                return getPdbxCollectionDate();
            case "pdbx_frequency":
                return getPdbxFrequency();
            case "id":
                return getId();
            case "number_of_axes":
                return getNumberOfAxes();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The general class of the radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetector() {
        return delegate.getColumn("detector", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The make, model or name of the detector device used.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The resolution of an area detector, in pixels/mm.
     * @return FloatColumn
     */
    public FloatColumn getAreaResolMean() {
        return delegate.getColumn("area_resol_mean", DelegatingFloatColumn::new);
    }

    /**
     * The deadtime in microseconds of the detector used to measure
     * the diffraction intensities.
     * @return FloatColumn
     */
    public FloatColumn getDtime() {
        return delegate.getColumn("dtime", DelegatingFloatColumn::new);
    }

    /**
     * The total number of data frames collected for this
     * data set.
     * @return IntColumn
     */
    public IntColumn getPdbxFramesTotal() {
        return delegate.getColumn("pdbx_frames_total", DelegatingIntColumn::new);
    }

    /**
     * The total number of seconds required to measure this
     * data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCollectionTimeTotal() {
        return delegate.getColumn("pdbx_collection_time_total", DelegatingFloatColumn::new);
    }

    /**
     * The date of data collection.
     * @return StrColumn
     */
    public StrColumn getPdbxCollectionDate() {
        return delegate.getColumn("pdbx_collection_date", DelegatingStrColumn::new);
    }

    /**
     * The operating frequency of the detector (Hz) used in data collection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFrequency() {
        return delegate.getColumn("pdbx_frequency", DelegatingFloatColumn::new);
    }

    /**
     * The value of _diffrn_detector.id  must uniquely identify
     * each detector used to collect each diffraction data set.
     * 
     * If the value of _diffrn_detector.id  is not given, it is
     * implicitly equal to the value of
     * _diffrn_detector.diffrn_id.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value of _diffrn_detector.number_of_axes  gives the
     * number of axes of the positioner for the detector identified
     * by _diffrn_detector.id.
     * 
     * The word 'positioner' is a general term used in
     * instrumentation design for devices that are used to change
     * the positions of portions of apparatus by linear
     * translation, rotation or combinations of such motions.
     * 
     * Axes which are used to provide a coordinate system for the
     * face of an area detector should not be counted for this
     * data item.
     * 
     * The description of each axis should be provided by entries
     * in DIFFRN_DETECTOR_AXIS.
     * @return IntColumn
     */
    public IntColumn getNumberOfAxes() {
        return delegate.getColumn("number_of_axes", DelegatingIntColumn::new);
    }

}