package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN category record details about the
 * diffraction data and their measurement.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAmbientEnvironment() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ambient_environment", SingleRowStrColumn::new) :
                getBinaryColumn("ambient_environment"));
    }

    /**
     * The mean temperature in kelvins at which the intensities were
     * measured.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmbientTemp() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ambient_temp", SingleRowFloatColumn::new) :
                getBinaryColumn("ambient_temp"));
    }

    /**
     * A description of special aspects of temperature control during
     * data collection.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAmbientTempDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ambient_temp_details", SingleRowStrColumn::new) :
                getBinaryColumn("ambient_temp_details"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _diffrn.ambient_temp.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmbientTempEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ambient_temp_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("ambient_temp_esd"));
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCrystalId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("crystal_id", SingleRowStrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * The physical device used to support the crystal during data
     * collection.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCrystalSupport() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("crystal_support", SingleRowStrColumn::new) :
                getBinaryColumn("crystal_support"));
    }

    /**
     * Remarks about how the crystal was treated prior to intensity
     * measurement. Particularly relevant when intensities were
     * measured at low temperature.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCrystalTreatment() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("crystal_treatment", SingleRowStrColumn::new) :
                getBinaryColumn("crystal_treatment"));
    }

    /**
     * Special details of the diffraction measurement process. Should
     * include information about source instability, crystal motion,
     * degradation and so on.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item uniquely identifies a set of diffraction
     * data.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The mean hydrostatic pressure in kilopascals at which the
     * intensities were measured.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmbientPressure() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ambient_pressure", SingleRowFloatColumn::new) :
                getBinaryColumn("ambient_pressure"));
    }

    /**
     * The estimated standard deviation of _diffrn.ambient_pressure.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmbientPressureEsd() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ambient_pressure_esd", SingleRowFloatColumn::new) :
                getBinaryColumn("ambient_pressure_esd"));
    }

    /**
     * The mean hydrostatic pressure in kilopascals above which
     * the intensities were measured. _diffrn.ambient_pressure_gt and
     * _diffrn.ambient_pressure_lt allow a pressure range to be given.
     * 
     * _diffrn.ambient_pressure should always be used in
     * preference to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmbientPressureGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ambient_pressure_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("ambient_pressure_gt"));
    }

    /**
     * The mean hydrostatic pressure in kilopascals below which
     * the intensities were measured. _diffrn.ambient_pressure_gt and
     * _diffrn.ambient_pressure_lt allow a pressure range to be given.
     * 
     * _diffrn.ambient_pressure should always be used in
     * preference to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmbientPressureLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ambient_pressure_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("ambient_pressure_lt"));
    }

    /**
     * The mean temperature in kelvins above which the intensities were
     * measured.  _diffrn.ambient_temp_gt and _diffrn.ambient_temp_lt
     * allow a range of temperatures to be given.
     * 
     * _diffrn.ambient_temp should always be used in preference
     * to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmbientTempGt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ambient_temp_gt", SingleRowFloatColumn::new) :
                getBinaryColumn("ambient_temp_gt"));
    }

    /**
     * The mean temperature in kelvins below which the intensities were
     * measured. _diffrn.ambient_temp_gt and _diffrn.ambient_temp_lt
     * allow a range of temperatures to be given.
     * 
     * _diffrn.ambient_temp should always be used in preference
     * to these two items whenever possible.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAmbientTempLt() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ambient_temp_lt", SingleRowFloatColumn::new) :
                getBinaryColumn("ambient_temp_lt"));
    }

    /**
     * Y/N if using serial crystallography experiment in which multiple crystals contribute to each diffraction frame in the experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSerialCrystalExperiment() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_serial_crystal_experiment", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_serial_crystal_experiment"));
    }
}
