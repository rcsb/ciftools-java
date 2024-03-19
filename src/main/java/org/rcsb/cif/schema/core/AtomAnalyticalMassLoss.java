package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe information
 * pertaining to mass loss during specimen preparation for
 * the purposes of determining elemental composition
 * information for use in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomAnalyticalMassLoss extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_analytical_mass_loss";

    public AtomAnalyticalMassLoss(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Arbitrary label uniquely identifying the source of an elemental
     * composition value. This value is used by _atom_analytical.meas_id
     * to link individual composition values to their corresponding
     * technique of determination.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_mass_loss_id"));
    }

    /**
     * Arbitrary label identifying the source of an elemental composition.
     * This code must match the _atom_analytical_source.id of the associated
     * technique in the analytical source list.
     * @return StrColumn
     */
    public StrColumn getMeasId() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_mass_loss_meas_id"));
    }

    /**
     * Mass lost by the specimen during specimen preparation expressed
     * as a percentage. The temperature at which the mass loss was recorded
     * is given by _atom_analytical_mass_loss.temperature. A mass gain
     * is represented by a negative value.
     * 
     * This data name would be used to record mass loss on drying, or mass
     * loss on ignition, during, for example, fusion bead preparation for
     * XRF analysis.
     * @return FloatColumn
     */
    public FloatColumn getPercent() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_analytical_mass_loss_percent"));
    }

    /**
     * Standard uncertainty of _atom_analytical_mass_loss.percent.
     * @return FloatColumn
     */
    public FloatColumn getPercentSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_analytical_mass_loss_percent_su"));
    }

    /**
     * Text describing the conditions under which the data were collected
     * that are not able to be captured using other data names
     * within the ATOM_ANALYTICAL_MASS_LOSS category.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_analytical_mass_loss_special_details"));
    }

    /**
     * The temperature, in kelvin, at which the mass loss was recorded
     * as given by _atom_analytical_mass_loss.percent.
     * 
     * This would be used to record the temperature of drying or ignition,
     * during, for example, fusion bead preparation for XRF analysis.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_analytical_mass_loss_temperature"));
    }

    /**
     * Standard uncertainty of _atom_analytical_mass_loss.temperature.
     * @return FloatColumn
     */
    public FloatColumn getTemperatureSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_analytical_mass_loss_temperature_su"));
    }

}