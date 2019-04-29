package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_DETECTOR category describe the
 * detector used to measure the scattered radiation, including
 * any analyser and post-sample collimation.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The general class of the radiation detector.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetector() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("detector", SingleRowStrColumn::new) :
                getBinaryColumn("detector"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The make, model or name of the detector device used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The resolution of an area detector, in pixels/mm.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAreaResolMean() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("area_resol_mean", SingleRowFloatColumn::new) :
                getBinaryColumn("area_resol_mean"));
    }

    /**
     * The deadtime in microseconds of the detector used to measure
     * the diffraction intensities.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDtime() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("dtime", SingleRowFloatColumn::new) :
                getBinaryColumn("dtime"));
    }

    /**
     * The total number of data frames collected for this
     * data set.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxFramesTotal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_frames_total", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_frames_total"));
    }

    /**
     * The total number of seconds required to measure this
     * data set.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxCollectionTimeTotal() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_collection_time_total", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_collection_time_total"));
    }

    /**
     * The date of data collection.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxCollectionDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_collection_date", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_collection_date"));
    }

    /**
     * The operating frequency of the detector (Hz) used in data collection.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxFrequency() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_frequency", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_frequency"));
    }
}
