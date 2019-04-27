package org.rcsb.cif.model.diffrndetector;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnDetector extends BaseCategory {
    public DiffrnDetector(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnDetector(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnDetector(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the radiation detector.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The general class of the radiation detector.
     * @return Detector
     */
    public Detector getDetector() {
        return (Detector) (isText ? textFields.computeIfAbsent("detector",
                Detector::new) : getBinaryColumn("detector"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * The make, model or name of the detector device used.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The resolution of an area detector, in pixels/mm.
     * @return AreaResolMean
     */
    public AreaResolMean getAreaResolMean() {
        return (AreaResolMean) (isText ? textFields.computeIfAbsent("area_resol_mean",
                AreaResolMean::new) : getBinaryColumn("area_resol_mean"));
    }

    /**
     * The deadtime in microseconds of the detector used to measure
     * the diffraction intensities.
     * @return Dtime
     */
    public Dtime getDtime() {
        return (Dtime) (isText ? textFields.computeIfAbsent("dtime",
                Dtime::new) : getBinaryColumn("dtime"));
    }

    /**
     * The total number of data frames collected for this
     * data set.
     * @return PdbxFramesTotal
     */
    public PdbxFramesTotal getPdbxFramesTotal() {
        return (PdbxFramesTotal) (isText ? textFields.computeIfAbsent("pdbx_frames_total",
                PdbxFramesTotal::new) : getBinaryColumn("pdbx_frames_total"));
    }

    /**
     * The total number of seconds required to measure this
     * data set.
     * @return PdbxCollectionTimeTotal
     */
    public PdbxCollectionTimeTotal getPdbxCollectionTimeTotal() {
        return (PdbxCollectionTimeTotal) (isText ? textFields.computeIfAbsent("pdbx_collection_time_total",
                PdbxCollectionTimeTotal::new) : getBinaryColumn("pdbx_collection_time_total"));
    }

    /**
     * The date of data collection.
     * @return PdbxCollectionDate
     */
    public PdbxCollectionDate getPdbxCollectionDate() {
        return (PdbxCollectionDate) (isText ? textFields.computeIfAbsent("pdbx_collection_date",
                PdbxCollectionDate::new) : getBinaryColumn("pdbx_collection_date"));
    }

    /**
     * The operating frequency of the detector (Hz) used in data collection.
     * @return PdbxFrequency
     */
    public PdbxFrequency getPdbxFrequency() {
        return (PdbxFrequency) (isText ? textFields.computeIfAbsent("pdbx_frequency",
                PdbxFrequency::new) : getBinaryColumn("pdbx_frequency"));
    }
}
