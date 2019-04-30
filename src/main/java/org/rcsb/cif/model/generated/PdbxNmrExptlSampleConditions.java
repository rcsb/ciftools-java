package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * The experimental conditions used to for each sample.  Each set of conditions
 * is identified by a numerical code.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getConditionsId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conditions_id", StrColumn::new) :
                getBinaryColumn("conditions_id"));
    }

    /**
     * The temperature (in Kelvin) at which NMR data were
     * collected.
     * @return StrColumn
     */
    public StrColumn getTemperature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("temperature", StrColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * The units of pressure at which NMR data were collected.
     * @return StrColumn
     */
    public StrColumn getPressureUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pressure_units", StrColumn::new) :
                getBinaryColumn("pressure_units"));
    }

    /**
     * The pressure at which NMR data were collected.
     * @return StrColumn
     */
    public StrColumn getPressure() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pressure", StrColumn::new) :
                getBinaryColumn("pressure"));
    }

    /**
     * The pH at which the NMR data were collected.
     * @return StrColumn
     */
    public StrColumn getPH() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pH", StrColumn::new) :
                getBinaryColumn("pH"));
    }

    /**
     * The ionic strength at which the NMR data were collected -in lieu of
     * this enter the concentration and identity of the salt in the sample.
     * @return StrColumn
     */
    public StrColumn getIonicStrength() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ionic_strength", StrColumn::new) :
                getBinaryColumn("ionic_strength"));
    }

    /**
     * 
     * General details describing conditions of both the sample and the environment
     * during measurements.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample ionic strength.
     * @return FloatColumn
     */
    public FloatColumn getIonicStrengthErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ionic_strength_err", FloatColumn::new) :
                getBinaryColumn("ionic_strength_err"));
    }

    /**
     * 
     * Units for the value of the sample condition ionic strength..
     * @return StrColumn
     */
    public StrColumn getIonicStrengthUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ionic_strength_units", StrColumn::new) :
                getBinaryColumn("ionic_strength_units"));
    }

    /**
     * 
     * A descriptive label that uniquely identifies this set of sample conditions.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label", StrColumn::new) :
                getBinaryColumn("label"));
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample pH.
     * @return FloatColumn
     */
    public FloatColumn getPHErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pH_err", FloatColumn::new) :
                getBinaryColumn("pH_err"));
    }

    /**
     * 
     * Units for the value of the sample condition pH.
     * @return StrColumn
     */
    public StrColumn getPHUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pH_units", StrColumn::new) :
                getBinaryColumn("pH_units"));
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample pressure.
     * @return FloatColumn
     */
    public FloatColumn getPressureErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pressure_err", FloatColumn::new) :
                getBinaryColumn("pressure_err"));
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample temperature.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureErr() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature_err", FloatColumn::new) :
                getBinaryColumn("temperature_err"));
    }

    /**
     * 
     * Units for the value of the sample condition temperature.
     * @return StrColumn
     */
    public StrColumn getTemperatureUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("temperature_units", StrColumn::new) :
                getBinaryColumn("temperature_units"));
    }
}
