package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Description of a few specialist optics apparatus
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmImagingOptics extends DelegatingCategory {
    public EmImagingOptics(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "chr_aberration_corrector":
                return getChrAberrationCorrector();
            case "energyfilter_lower":
                return getEnergyfilterLower();
            case "energyfilter_slit_width":
                return getEnergyfilterSlitWidth();
            case "energyfilter_name":
                return getEnergyfilterName();
            case "energyfilter_upper":
                return getEnergyfilterUpper();
            case "id":
                return getId();
            case "imaging_id":
                return getImagingId();
            case "phase_plate":
                return getPhasePlate();
            case "sph_aberration_corrector":
                return getSphAberrationCorrector();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Chromatic aberration corrector information
     * @return StrColumn
     */
    public StrColumn getChrAberrationCorrector() {
        return delegate.getColumn("chr_aberration_corrector", DelegatingStrColumn::new);
    }

    /**
     * The energy filter range lower value in electron volts (eV) set by spectrometer.
     * @return StrColumn
     */
    public StrColumn getEnergyfilterLower() {
        return delegate.getColumn("energyfilter_lower", DelegatingStrColumn::new);
    }

    /**
     * The energy filter range slit width in electron volts (eV).
     * @return FloatColumn
     */
    public FloatColumn getEnergyfilterSlitWidth() {
        return delegate.getColumn("energyfilter_slit_width", DelegatingFloatColumn::new);
    }

    /**
     * The type of energy filter spectrometer
     * @return StrColumn
     */
    public StrColumn getEnergyfilterName() {
        return delegate.getColumn("energyfilter_name", DelegatingStrColumn::new);
    }

    /**
     * The energy filter range upper value in electron volts (eV) set by spectrometer.
     * @return StrColumn
     */
    public StrColumn getEnergyfilterUpper() {
        return delegate.getColumn("energyfilter_upper", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Foreign key to the EM IMAGING category
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return delegate.getColumn("imaging_id", DelegatingStrColumn::new);
    }

    /**
     * Phase plate information
     * @return StrColumn
     */
    public StrColumn getPhasePlate() {
        return delegate.getColumn("phase_plate", DelegatingStrColumn::new);
    }

    /**
     * Spherical aberration corrector information
     * @return StrColumn
     */
    public StrColumn getSphAberrationCorrector() {
        return delegate.getColumn("sph_aberration_corrector", DelegatingStrColumn::new);
    }

    /**
     * Details on the use of the phase plate
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}