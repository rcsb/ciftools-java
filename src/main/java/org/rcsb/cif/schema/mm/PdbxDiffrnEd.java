package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DIFFRN_ED record details specific to electron diffraction method.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDiffrnEd extends DelegatingCategory {
    public PdbxDiffrnEd(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "diffrn_id":
                return getDiffrnId();
            case "electron_source":
                return getElectronSource();
            case "beam_diameter_sample_plane":
                return getBeamDiameterSamplePlane();
            case "camera_length":
                return getCameraLength();
            case "recording_mode":
                return getRecordingMode();
            case "fluence_rate":
                return getFluenceRate();
            case "fluence_accumulated":
                return getFluenceAccumulated();
            case "c2_aperture_diameter":
                return getC2ApertureDiameter();
            case "sa_aperture_diameter":
                return getSaApertureDiameter();
            case "energyfilter_name":
                return getEnergyfilterName();
            case "energyfilter_upper":
                return getEnergyfilterUpper();
            case "energyfilter_lower":
                return getEnergyfilterLower();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This ordinal identifier for the category
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to the _diffrn.id
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The source of electrons, i.e. the electron gun
     * @return StrColumn
     */
    public StrColumn getElectronSource() {
        return delegate.getColumn("electron_source", DelegatingStrColumn::new);
    }

    /**
     * The electron beam diameter at the sample plane
     * @return FloatColumn
     */
    public FloatColumn getBeamDiameterSamplePlane() {
        return delegate.getColumn("beam_diameter_sample_plane", DelegatingFloatColumn::new);
    }

    /**
     * The product of the objective focal length and the
     * combined magnification of the intermediate and projector
     * lenses when the microscope is operated in the
     * diffraction mode.
     * @return FloatColumn
     */
    public FloatColumn getCameraLength() {
        return delegate.getColumn("camera_length", DelegatingFloatColumn::new);
    }

    /**
     * The mode of the detector for electron diffraction recording, e.g.
     * Electron Counting (Event) mode, Linear (Integrating) mode
     * @return StrColumn
     */
    public StrColumn getRecordingMode() {
        return delegate.getColumn("recording_mode", DelegatingStrColumn::new);
    }

    /**
     * Fluence rate, or flux density at the sample plane
     * @return FloatColumn
     */
    public FloatColumn getFluenceRate() {
        return delegate.getColumn("fluence_rate", DelegatingFloatColumn::new);
    }

    /**
     * Total fluence at the sample plane
     * @return FloatColumn
     */
    public FloatColumn getFluenceAccumulated() {
        return delegate.getColumn("fluence_accumulated", DelegatingFloatColumn::new);
    }

    /**
     * C2 aperture diameter
     * @return FloatColumn
     */
    public FloatColumn getC2ApertureDiameter() {
        return delegate.getColumn("c2_aperture_diameter", DelegatingFloatColumn::new);
    }

    /**
     * Select Area aperture diameter
     * @return FloatColumn
     */
    public FloatColumn getSaApertureDiameter() {
        return delegate.getColumn("sa_aperture_diameter", DelegatingFloatColumn::new);
    }

    /**
     * The name of the energy filter
     * @return StrColumn
     */
    public StrColumn getEnergyfilterName() {
        return delegate.getColumn("energyfilter_name", DelegatingStrColumn::new);
    }

    /**
     * The energy filter range upper value in electron volts (eV)
     * set by the specrometer
     * @return FloatColumn
     */
    public FloatColumn getEnergyfilterUpper() {
        return delegate.getColumn("energyfilter_upper", DelegatingFloatColumn::new);
    }

    /**
     * The energy filter range lower value in electron volts (eV)
     * set by the specrometer
     * @return FloatColumn
     */
    public FloatColumn getEnergyfilterLower() {
        return delegate.getColumn("energyfilter_lower", DelegatingFloatColumn::new);
    }

    /**
     * Details of the electron diffration process
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}