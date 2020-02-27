package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The experimental conditions used to for each sample.  Each set of conditions
 * is identified by a numerical code.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrExptlSampleConditions extends DelegatingCategory {
    public PdbxNmrExptlSampleConditions(Category delegate) {
        super(delegate);
    }

    /**
     * The condition number as defined above.
     * @return StrColumn
     */
    public StrColumn getConditionsId() {
        return delegate.getColumn("conditions_id", DelegatingStrColumn::new);
    }

    /**
     * The temperature (in Kelvin) at which NMR data were
     * collected.
     * @return StrColumn
     */
    public StrColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingStrColumn::new);
    }

    /**
     * The units of pressure at which NMR data were collected.
     * @return StrColumn
     */
    public StrColumn getPressureUnits() {
        return delegate.getColumn("pressure_units", DelegatingStrColumn::new);
    }

    /**
     * The pressure at which NMR data were collected.
     * @return StrColumn
     */
    public StrColumn getPressure() {
        return delegate.getColumn("pressure", DelegatingStrColumn::new);
    }

    /**
     * The pH at which the NMR data were collected.
     * @return StrColumn
     */
    public StrColumn getPH() {
        return delegate.getColumn("pH", DelegatingStrColumn::new);
    }

    /**
     * The ionic strength at which the NMR data were collected -in lieu of
     * this enter the concentration and identity of the salt in the sample.
     * @return StrColumn
     */
    public StrColumn getIonicStrength() {
        return delegate.getColumn("ionic_strength", DelegatingStrColumn::new);
    }

    /**
     * 
     * General details describing conditions of both the sample and the environment
     * during measurements.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample ionic strength.
     * @return FloatColumn
     */
    public FloatColumn getIonicStrengthErr() {
        return delegate.getColumn("ionic_strength_err", DelegatingFloatColumn::new);
    }

    /**
     * 
     * Units for the value of the sample condition ionic strength..
     * @return StrColumn
     */
    public StrColumn getIonicStrengthUnits() {
        return delegate.getColumn("ionic_strength_units", DelegatingStrColumn::new);
    }

    /**
     * 
     * A descriptive label that uniquely identifies this set of sample conditions.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return delegate.getColumn("label", DelegatingStrColumn::new);
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample pH.
     * @return FloatColumn
     */
    public FloatColumn getPHErr() {
        return delegate.getColumn("pH_err", DelegatingFloatColumn::new);
    }

    /**
     * 
     * Units for the value of the sample condition pH.
     * @return StrColumn
     */
    public StrColumn getPHUnits() {
        return delegate.getColumn("pH_units", DelegatingStrColumn::new);
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample pressure.
     * @return FloatColumn
     */
    public FloatColumn getPressureErr() {
        return delegate.getColumn("pressure_err", DelegatingFloatColumn::new);
    }

    /**
     * 
     * Estimate of the standard error for the value for the sample temperature.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureErr() {
        return delegate.getColumn("temperature_err", DelegatingFloatColumn::new);
    }

    /**
     * 
     * Units for the value of the sample condition temperature.
     * @return StrColumn
     */
    public StrColumn getTemperatureUnits() {
        return delegate.getColumn("temperature_units", DelegatingStrColumn::new);
    }
}
