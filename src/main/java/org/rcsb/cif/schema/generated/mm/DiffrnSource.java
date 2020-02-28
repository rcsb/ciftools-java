package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_SOURCE category record details of
 * the source of radiation used in the diffraction experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnSource extends DelegatingCategory {
    public DiffrnSource(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "current":
                return getCurrent();
            case "details":
                return getDetails();
            case "diffrn_id":
                return getDiffrnId();
            case "power":
                return getPower();
            case "size":
                return getSize();
            case "source":
                return getSource();
            case "target":
                return getTarget();
            case "type":
                return getType();
            case "voltage":
                return getVoltage();
            case "take-off_angle":
                return getTake_offAngle();
            case "pdbx_wavelength_list":
                return getPdbxWavelengthList();
            case "pdbx_wavelength":
                return getPdbxWavelength();
            case "pdbx_synchrotron_beamline":
                return getPdbxSynchrotronBeamline();
            case "pdbx_synchrotron_site":
                return getPdbxSynchrotronSite();
            case "pdbx_synchrotron_y_n":
                return getPdbxSynchrotronYN();
            case "pdbx_source_specific_beamline":
                return getPdbxSourceSpecificBeamline();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The current in milliamperes at which the radiation source
     * was operated.
     * @return FloatColumn
     */
    public FloatColumn getCurrent() {
        return delegate.getColumn("current", DelegatingFloatColumn::new);
    }

    /**
     * A description of special aspects of the radiation source used.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The power in kilowatts at which the radiation source
     * was operated.
     * @return FloatColumn
     */
    public FloatColumn getPower() {
        return delegate.getColumn("power", DelegatingFloatColumn::new);
    }

    /**
     * The dimensions of the source as viewed from the sample.
     * @return StrColumn
     */
    public StrColumn getSize() {
        return delegate.getColumn("size", DelegatingStrColumn::new);
    }

    /**
     * The general class of the radiation source.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return delegate.getColumn("source", DelegatingStrColumn::new);
    }

    /**
     * The chemical element symbol for the X-ray target
     * (usually the anode) used to generate X-rays.
     * This can also be used for spallation sources.
     * @return StrColumn
     */
    public StrColumn getTarget() {
        return delegate.getColumn("target", DelegatingStrColumn::new);
    }

    /**
     * The make, model or name of the source of radiation.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The voltage in kilovolts at which the radiation source was
     * operated.
     * @return FloatColumn
     */
    public FloatColumn getVoltage() {
        return delegate.getColumn("voltage", DelegatingFloatColumn::new);
    }

    /**
     * The complement of the angle in degrees between the normal
     * to the surface of the X-ray tube target and the primary
     * X-ray beam for beams generated by traditional X-ray tubes.
     * @return FloatColumn
     */
    public FloatColumn getTake_offAngle() {
        return delegate.getColumn("take-off_angle", DelegatingFloatColumn::new);
    }

    /**
     * Comma separated list of wavelengths or wavelength range.
     * @return StrColumn
     */
    public StrColumn getPdbxWavelengthList() {
        return delegate.getColumn("pdbx_wavelength_list", DelegatingStrColumn::new);
    }

    /**
     * Wavelength of radiation.
     * @return StrColumn
     */
    public StrColumn getPdbxWavelength() {
        return delegate.getColumn("pdbx_wavelength", DelegatingStrColumn::new);
    }

    /**
     * Synchrotron beamline.
     * @return StrColumn
     */
    public StrColumn getPdbxSynchrotronBeamline() {
        return delegate.getColumn("pdbx_synchrotron_beamline", DelegatingStrColumn::new);
    }

    /**
     * Synchrotron site.
     * @return StrColumn
     */
    public StrColumn getPdbxSynchrotronSite() {
        return delegate.getColumn("pdbx_synchrotron_site", DelegatingStrColumn::new);
    }

    /**
     * Yes/No if synchrotron source was used or not.
     * @return StrColumn
     */
    public StrColumn getPdbxSynchrotronYN() {
        return delegate.getColumn("pdbx_synchrotron_y_n", DelegatingStrColumn::new);
    }

    /**
     * Beamline for synchrotron source.
     * @return StrColumn
     */
    public StrColumn getPdbxSourceSpecificBeamline() {
        return delegate.getColumn("pdbx_source_specific_beamline", DelegatingStrColumn::new);
    }
}
