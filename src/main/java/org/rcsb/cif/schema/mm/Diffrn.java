package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN category record details about the
 * diffraction data and their measurement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Diffrn extends DelegatingCategory {
    public Diffrn(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ambient_environment":
                return getAmbientEnvironment();
            case "ambient_temp":
                return getAmbientTemp();
            case "ambient_temp_details":
                return getAmbientTempDetails();
            case "ambient_temp_esd":
                return getAmbientTempEsd();
            case "crystal_id":
                return getCrystalId();
            case "crystal_support":
                return getCrystalSupport();
            case "crystal_treatment":
                return getCrystalTreatment();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "ambient_pressure":
                return getAmbientPressure();
            case "ambient_pressure_esd":
                return getAmbientPressureEsd();
            case "ambient_pressure_gt":
                return getAmbientPressureGt();
            case "ambient_pressure_lt":
                return getAmbientPressureLt();
            case "ambient_temp_gt":
                return getAmbientTempGt();
            case "ambient_temp_lt":
                return getAmbientTempLt();
            case "pdbx_serial_crystal_experiment":
                return getPdbxSerialCrystalExperiment();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The gas or liquid surrounding the sample, if not air.
     * @return StrColumn
     */
    public StrColumn getAmbientEnvironment() {
        return delegate.getColumn("ambient_environment", DelegatingStrColumn::new);
    }

    /**
     * The mean temperature in kelvins at which the intensities were
     * measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemp() {
        return delegate.getColumn("ambient_temp", DelegatingFloatColumn::new);
    }

    /**
     * A description of special aspects of temperature control during
     * data collection.
     * @return StrColumn
     */
    public StrColumn getAmbientTempDetails() {
        return delegate.getColumn("ambient_temp_details", DelegatingStrColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _diffrn.ambient_temp.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTempEsd() {
        return delegate.getColumn("ambient_temp_esd", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return StrColumn
     */
    public StrColumn getCrystalSupport() {
        return delegate.getColumn("crystal_support", DelegatingStrColumn::new);
    }

    /**
     * Remarks about how the crystal was treated prior to intensity
     * measurement. Particularly relevant when intensities were
     * measured at low temperature.
     * @return StrColumn
     */
    public StrColumn getCrystalTreatment() {
        return delegate.getColumn("crystal_treatment", DelegatingStrColumn::new);
    }

    /**
     * Special details of the diffraction measurement process. Should
     * include information about source instability, crystal motion,
     * degradation and so on.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item uniquely identifies a set of diffraction
     * data.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The mean hydrostatic pressure in kilopascals at which the
     * intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressure() {
        return delegate.getColumn("ambient_pressure", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _diffrn.ambient_pressure.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureEsd() {
        return delegate.getColumn("ambient_pressure_esd", DelegatingFloatColumn::new);
    }

    /**
     * The mean hydrostatic pressure in kilopascals above which
     * the intensities were measured. _diffrn.ambient_pressure_gt and
     * _diffrn.ambient_pressure_lt allow a pressure range to be given.
     * 
     * _diffrn.ambient_pressure should always be used in
     * preference to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureGt() {
        return delegate.getColumn("ambient_pressure_gt", DelegatingFloatColumn::new);
    }

    /**
     * The mean hydrostatic pressure in kilopascals below which
     * the intensities were measured. _diffrn.ambient_pressure_gt and
     * _diffrn.ambient_pressure_lt allow a pressure range to be given.
     * 
     * _diffrn.ambient_pressure should always be used in
     * preference to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureLt() {
        return delegate.getColumn("ambient_pressure_lt", DelegatingFloatColumn::new);
    }

    /**
     * The mean temperature in kelvins above which the intensities were
     * measured.  _diffrn.ambient_temp_gt and _diffrn.ambient_temp_lt
     * allow a range of temperatures to be given.
     * 
     * _diffrn.ambient_temp should always be used in preference
     * to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTempGt() {
        return delegate.getColumn("ambient_temp_gt", DelegatingFloatColumn::new);
    }

    /**
     * The mean temperature in kelvins below which the intensities were
     * measured. _diffrn.ambient_temp_gt and _diffrn.ambient_temp_lt
     * allow a range of temperatures to be given.
     * 
     * _diffrn.ambient_temp should always be used in preference
     * to these two items whenever possible.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTempLt() {
        return delegate.getColumn("ambient_temp_lt", DelegatingFloatColumn::new);
    }

    /**
     * Y/N if using serial crystallography experiment in which multiple crystals contribute to each diffraction frame in the experiment.
     * @return StrColumn
     */
    public StrColumn getPdbxSerialCrystalExperiment() {
        return delegate.getColumn("pdbx_serial_crystal_experiment", DelegatingStrColumn::new);
    }

}