package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_MEASUREMENT category record details
 * about the device used to orient and/or position the crystal
 * during data measurement and the manner in which the diffraction
 * data were measured.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnMeasurement extends BaseCategory {
    public DiffrnMeasurement(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnMeasurement(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnMeasurement(String name) {
        super(name);
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
     * A description of special aspects of the intensity measurement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The general class of  goniometer or device used to support and
     * orient the specimen.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDevice() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("device", SingleRowStrColumn::new) :
                getBinaryColumn("device"));
    }

    /**
     * A description of special aspects of the device used to measure
     * the diffraction intensities.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDeviceDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("device_details", SingleRowStrColumn::new) :
                getBinaryColumn("device_details"));
    }

    /**
     * The make, model or name of the measurement device
     * (goniometer) used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDeviceType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("device_type", SingleRowStrColumn::new) :
                getBinaryColumn("device_type"));
    }

    /**
     * Method used to measure intensities.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenSupport() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_support", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_support"));
    }

    /**
     * The date of data measurement
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_date", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_date"));
    }
}
