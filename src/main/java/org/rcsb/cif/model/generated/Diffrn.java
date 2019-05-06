package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN category record details about the
 * diffraction data and their measurement.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Diffrn extends BaseCategory {
    public Diffrn(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Diffrn(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Diffrn(String name) {
        super(name);
    }

    /**
     * The gas or liquid surrounding the sample, if not air.
     * @return StrColumn
     */
    public StrColumn getAmbientEnvironment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ambient_environment", StrColumn::new) :
                getBinaryColumn("ambient_environment"));
    }

    /**
     * The mean temperature in kelvins at which the intensities were
     * measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTemp() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ambient_temp", FloatColumn::new) :
                getBinaryColumn("ambient_temp"));
    }

    /**
     * A description of special aspects of temperature control during
     * data collection.
     * @return StrColumn
     */
    public StrColumn getAmbientTempDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ambient_temp_details", StrColumn::new) :
                getBinaryColumn("ambient_temp_details"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _diffrn.ambient_temp.
     * @return FloatColumn
     */
    public FloatColumn getAmbientTempEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ambient_temp_esd", FloatColumn::new) :
                getBinaryColumn("ambient_temp_esd"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return StrColumn
     */
    public StrColumn getCrystalSupport() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_support", StrColumn::new) :
                getBinaryColumn("crystal_support"));
    }

    /**
     * Remarks about how the crystal was treated prior to intensity
     * measurement. Particularly relevant when intensities were
     * measured at low temperature.
     * @return StrColumn
     */
    public StrColumn getCrystalTreatment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_treatment", StrColumn::new) :
                getBinaryColumn("crystal_treatment"));
    }

    /**
     * Special details of the diffraction measurement process. Should
     * include information about source instability, crystal motion,
     * degradation and so on.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item uniquely identifies a set of diffraction
     * data.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The mean hydrostatic pressure in kilopascals at which the
     * intensities were measured.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressure() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ambient_pressure", FloatColumn::new) :
                getBinaryColumn("ambient_pressure"));
    }

    /**
     * The estimated standard deviation of _diffrn.ambient_pressure.
     * @return FloatColumn
     */
    public FloatColumn getAmbientPressureEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ambient_pressure_esd", FloatColumn::new) :
                getBinaryColumn("ambient_pressure_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ambient_pressure_gt", FloatColumn::new) :
                getBinaryColumn("ambient_pressure_gt"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ambient_pressure_lt", FloatColumn::new) :
                getBinaryColumn("ambient_pressure_lt"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ambient_temp_gt", FloatColumn::new) :
                getBinaryColumn("ambient_temp_gt"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ambient_temp_lt", FloatColumn::new) :
                getBinaryColumn("ambient_temp_lt"));
    }

    /**
     * Y/N if using serial crystallography experiment in which multiple crystals contribute to each diffraction frame in the experiment.
     * @return StrColumn
     */
    public StrColumn getPdbxSerialCrystalExperiment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_serial_crystal_experiment", StrColumn::new) :
                getBinaryColumn("pdbx_serial_crystal_experiment"));
    }
}
