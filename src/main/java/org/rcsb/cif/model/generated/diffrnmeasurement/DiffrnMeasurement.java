package org.rcsb.cif.model.generated.diffrnmeasurement;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * A description of special aspects of the intensity measurement.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The general class of  goniometer or device used to support and
     * orient the specimen.
     * @return Device
     */
    public Device getDevice() {
        return (Device) (isText ? textFields.computeIfAbsent("device",
                Device::new) : getBinaryColumn("device"));
    }

    /**
     * A description of special aspects of the device used to measure
     * the diffraction intensities.
     * @return DeviceDetails
     */
    public DeviceDetails getDeviceDetails() {
        return (DeviceDetails) (isText ? textFields.computeIfAbsent("device_details",
                DeviceDetails::new) : getBinaryColumn("device_details"));
    }

    /**
     * The make, model or name of the measurement device
     * (goniometer) used.
     * @return DeviceType
     */
    public DeviceType getDeviceType() {
        return (DeviceType) (isText ? textFields.computeIfAbsent("device_type",
                DeviceType::new) : getBinaryColumn("device_type"));
    }

    /**
     * Method used to measure intensities.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return SpecimenSupport
     */
    public SpecimenSupport getSpecimenSupport() {
        return (SpecimenSupport) (isText ? textFields.computeIfAbsent("specimen_support",
                SpecimenSupport::new) : getBinaryColumn("specimen_support"));
    }

    /**
     * The date of data measurement
     * @return PdbxDate
     */
    public PdbxDate getPdbxDate() {
        return (PdbxDate) (isText ? textFields.computeIfAbsent("pdbx_date",
                PdbxDate::new) : getBinaryColumn("pdbx_date"));
    }
}
