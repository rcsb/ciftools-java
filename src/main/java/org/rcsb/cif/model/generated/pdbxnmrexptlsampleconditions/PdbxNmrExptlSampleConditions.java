package org.rcsb.cif.model.generated.pdbxnmrexptlsampleconditions;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrExptlSampleConditions extends BaseCategory {
    public PdbxNmrExptlSampleConditions(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrExptlSampleConditions(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrExptlSampleConditions(String name) {
        super(name);
    }

    /**
     * The condition number as defined above.
     * @return ConditionsId
     */
    public ConditionsId getConditionsId() {
        return (ConditionsId) (isText ? textFields.computeIfAbsent("conditions_id",
                ConditionsId::new) : getBinaryColumn("conditions_id"));
    }

    /**
     * The temperature (in Kelvin) at which NMR data were
     * collected.
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }

    /**
     * The units of pressure at which NMR data were collected.
     * @return PressureUnits
     */
    public PressureUnits getPressureUnits() {
        return (PressureUnits) (isText ? textFields.computeIfAbsent("pressure_units",
                PressureUnits::new) : getBinaryColumn("pressure_units"));
    }

    /**
     * The pressure at which NMR data were collected.
     * @return Pressure
     */
    public Pressure getPressure() {
        return (Pressure) (isText ? textFields.computeIfAbsent("pressure",
                Pressure::new) : getBinaryColumn("pressure"));
    }

    /**
     * The pH at which the NMR data were collected.
     * @return PH
     */
    public PH getPH() {
        return (PH) (isText ? textFields.computeIfAbsent("pH",
                PH::new) : getBinaryColumn("pH"));
    }

    /**
     * The ionic strength at which the NMR data were collected -in lieu of
     * this enter the concentration and identity of the salt in the sample.
     * @return IonicStrength
     */
    public IonicStrength getIonicStrength() {
        return (IonicStrength) (isText ? textFields.computeIfAbsent("ionic_strength",
                IonicStrength::new) : getBinaryColumn("ionic_strength"));
    }

    /**
     * 
     * General details describing conditions of both the sample and the environment
     * during measurements.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample ionic strength.
     * @return IonicStrengthErr
     */
    public IonicStrengthErr getIonicStrengthErr() {
        return (IonicStrengthErr) (isText ? textFields.computeIfAbsent("ionic_strength_err",
                IonicStrengthErr::new) : getBinaryColumn("ionic_strength_err"));
    }

    /**
     * 
     * Units for the value of the sample condition ionic strength..
     * @return IonicStrengthUnits
     */
    public IonicStrengthUnits getIonicStrengthUnits() {
        return (IonicStrengthUnits) (isText ? textFields.computeIfAbsent("ionic_strength_units",
                IonicStrengthUnits::new) : getBinaryColumn("ionic_strength_units"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies this set of sample conditions.
     * @return Label
     */
    public Label getLabel() {
        return (Label) (isText ? textFields.computeIfAbsent("label",
                Label::new) : getBinaryColumn("label"));
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample pH.
     * @return PHErr
     */
    public PHErr getPHErr() {
        return (PHErr) (isText ? textFields.computeIfAbsent("pH_err",
                PHErr::new) : getBinaryColumn("pH_err"));
    }

    /**
     * 
     * Units for the value of the sample condition pH.
     * @return PHUnits
     */
    public PHUnits getPHUnits() {
        return (PHUnits) (isText ? textFields.computeIfAbsent("pH_units",
                PHUnits::new) : getBinaryColumn("pH_units"));
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample pressure.
     * @return PressureErr
     */
    public PressureErr getPressureErr() {
        return (PressureErr) (isText ? textFields.computeIfAbsent("pressure_err",
                PressureErr::new) : getBinaryColumn("pressure_err"));
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample temperature.
     * @return TemperatureErr
     */
    public TemperatureErr getTemperatureErr() {
        return (TemperatureErr) (isText ? textFields.computeIfAbsent("temperature_err",
                TemperatureErr::new) : getBinaryColumn("temperature_err"));
    }

    /**
     * 
     * Units for the value of the sample condition temperature.
     * @return TemperatureUnits
     */
    public TemperatureUnits getTemperatureUnits() {
        return (TemperatureUnits) (isText ? textFields.computeIfAbsent("temperature_units",
                TemperatureUnits::new) : getBinaryColumn("temperature_units"));
    }
}
