package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Description of a few specialist optics apparatus
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getChrAberrationCorrector() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chr_aberration_corrector", StrColumn::new) :
                getBinaryColumn("chr_aberration_corrector"));
    }

    /**
     * The energy filter range lower value in electron volts (eV) set by spectrometer.
     * @return StrColumn
     */
    public StrColumn getEnergyfilterLower() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("energyfilter_lower", StrColumn::new) :
                getBinaryColumn("energyfilter_lower"));
    }

    /**
     * The energy filter range slit width in electron volts (eV).
     * @return FloatColumn
     */
    public FloatColumn getEnergyfilterSlitWidth() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("energyfilter_slit_width", FloatColumn::new) :
                getBinaryColumn("energyfilter_slit_width"));
    }

    /**
     * The type of energy filter spectrometer
     * @return StrColumn
     */
    public StrColumn getEnergyfilterName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("energyfilter_name", StrColumn::new) :
                getBinaryColumn("energyfilter_name"));
    }

    /**
     * The energy filter range upper value in electron volts (eV) set by spectrometer.
     * @return StrColumn
     */
    public StrColumn getEnergyfilterUpper() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("energyfilter_upper", StrColumn::new) :
                getBinaryColumn("energyfilter_upper"));
    }

    /**
     * Primary key
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM IMAGING category
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("imaging_id", StrColumn::new) :
                getBinaryColumn("imaging_id"));
    }

    /**
     * Phase plate information
     * @return StrColumn
     */
    public StrColumn getPhasePlate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("phase_plate", StrColumn::new) :
                getBinaryColumn("phase_plate"));
    }

    /**
     * Spherical aberration corrector information
     * @return StrColumn
     */
    public StrColumn getSphAberrationCorrector() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sph_aberration_corrector", StrColumn::new) :
                getBinaryColumn("sph_aberration_corrector"));
    }
}
