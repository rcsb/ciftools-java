package org.rcsb.cif.model.generated.emimagingoptics;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmImagingOptics extends BaseCategory {
    public EmImagingOptics(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmImagingOptics(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmImagingOptics(String name) {
        super(name);
    }

    /**
     * Chromatic aberration corrector information
     * @return ChrAberrationCorrector
     */
    public ChrAberrationCorrector getChrAberrationCorrector() {
        return (ChrAberrationCorrector) (isText ? textFields.computeIfAbsent("chr_aberration_corrector",
                ChrAberrationCorrector::new) : getBinaryColumn("chr_aberration_corrector"));
    }

    /**
     * The energy filter range lower value in electron volts (eV) set by spectrometer.
     * @return EnergyfilterLower
     */
    public EnergyfilterLower getEnergyfilterLower() {
        return (EnergyfilterLower) (isText ? textFields.computeIfAbsent("energyfilter_lower",
                EnergyfilterLower::new) : getBinaryColumn("energyfilter_lower"));
    }

    /**
     * The energy filter range slit width in electron volts (eV).
     * @return EnergyfilterSlitWidth
     */
    public EnergyfilterSlitWidth getEnergyfilterSlitWidth() {
        return (EnergyfilterSlitWidth) (isText ? textFields.computeIfAbsent("energyfilter_slit_width",
                EnergyfilterSlitWidth::new) : getBinaryColumn("energyfilter_slit_width"));
    }

    /**
     * The type of energy filter spectrometer
     * @return EnergyfilterName
     */
    public EnergyfilterName getEnergyfilterName() {
        return (EnergyfilterName) (isText ? textFields.computeIfAbsent("energyfilter_name",
                EnergyfilterName::new) : getBinaryColumn("energyfilter_name"));
    }

    /**
     * The energy filter range upper value in electron volts (eV) set by spectrometer.
     * @return EnergyfilterUpper
     */
    public EnergyfilterUpper getEnergyfilterUpper() {
        return (EnergyfilterUpper) (isText ? textFields.computeIfAbsent("energyfilter_upper",
                EnergyfilterUpper::new) : getBinaryColumn("energyfilter_upper"));
    }

    /**
     * Primary key
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM IMAGING category
     * @return ImagingId
     */
    public ImagingId getImagingId() {
        return (ImagingId) (isText ? textFields.computeIfAbsent("imaging_id",
                ImagingId::new) : getBinaryColumn("imaging_id"));
    }

    /**
     * Phase plate information
     * @return PhasePlate
     */
    public PhasePlate getPhasePlate() {
        return (PhasePlate) (isText ? textFields.computeIfAbsent("phase_plate",
                PhasePlate::new) : getBinaryColumn("phase_plate"));
    }

    /**
     * Spherical aberration corrector information
     * @return SphAberrationCorrector
     */
    public SphAberrationCorrector getSphAberrationCorrector() {
        return (SphAberrationCorrector) (isText ? textFields.computeIfAbsent("sph_aberration_corrector",
                SphAberrationCorrector::new) : getBinaryColumn("sph_aberration_corrector"));
    }
}
