package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_DETECTOR category describe the
 * detector used to measure the scattered radiation, including
 * any analyser and post-sample collimation.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The general class of the radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetector() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("detector", StrColumn::new) :
                getBinaryColumn("detector"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The make, model or name of the detector device used.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The resolution of an area detector, in pixels/mm.
     * @return FloatColumn
     */
    public FloatColumn getAreaResolMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("area_resol_mean", FloatColumn::new) :
                getBinaryColumn("area_resol_mean"));
    }

    /**
     * The deadtime in microseconds of the detector used to measure
     * the diffraction intensities.
     * @return FloatColumn
     */
    public FloatColumn getDtime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dtime", FloatColumn::new) :
                getBinaryColumn("dtime"));
    }

    /**
     * The total number of data frames collected for this
     * data set.
     * @return IntColumn
     */
    public IntColumn getPdbxFramesTotal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_frames_total", IntColumn::new) :
                getBinaryColumn("pdbx_frames_total"));
    }

    /**
     * The total number of seconds required to measure this
     * data set.
     * @return FloatColumn
     */
    public FloatColumn getPdbxCollectionTimeTotal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_collection_time_total", FloatColumn::new) :
                getBinaryColumn("pdbx_collection_time_total"));
    }

    /**
     * The date of data collection.
     * @return StrColumn
     */
    public StrColumn getPdbxCollectionDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_collection_date", StrColumn::new) :
                getBinaryColumn("pdbx_collection_date"));
    }

    /**
     * The operating frequency of the detector (Hz) used in data collection.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFrequency() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_frequency", FloatColumn::new) :
                getBinaryColumn("pdbx_frequency"));
    }
}
