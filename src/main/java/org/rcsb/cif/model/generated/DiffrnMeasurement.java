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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * A description of special aspects of the intensity measurement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The general class of  goniometer or device used to support and
     * orient the specimen.
     * @return StrColumn
     */
    public StrColumn getDevice() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("device", StrColumn::new) :
                getBinaryColumn("device"));
    }

    /**
     * A description of special aspects of the device used to measure
     * the diffraction intensities.
     * @return StrColumn
     */
    public StrColumn getDeviceDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("device_details", StrColumn::new) :
                getBinaryColumn("device_details"));
    }

    /**
     * The make, model or name of the measurement device
     * (goniometer) used.
     * @return StrColumn
     */
    public StrColumn getDeviceType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("device_type", StrColumn::new) :
                getBinaryColumn("device_type"));
    }

    /**
     * Method used to measure intensities.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return StrColumn
     */
    public StrColumn getSpecimenSupport() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_support", StrColumn::new) :
                getBinaryColumn("specimen_support"));
    }

    /**
     * The date of data measurement
     * @return StrColumn
     */
    public StrColumn getPdbxDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_date", StrColumn::new) :
                getBinaryColumn("pdbx_date"));
    }
}
