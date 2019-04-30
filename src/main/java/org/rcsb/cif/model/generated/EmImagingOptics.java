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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getChrAberrationCorrector() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("chr_aberration_corrector", SingleRowStrColumn::new) :
                getBinaryColumn("chr_aberration_corrector"));
    }

    /**
     * The energy filter range lower value in electron volts (eV) set by spectrometer.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEnergyfilterLower() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("energyfilter_lower", SingleRowStrColumn::new) :
                getBinaryColumn("energyfilter_lower"));
    }

    /**
     * The energy filter range slit width in electron volts (eV).
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getEnergyfilterSlitWidth() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("energyfilter_slit_width", SingleRowFloatColumn::new) :
                getBinaryColumn("energyfilter_slit_width"));
    }

    /**
     * The type of energy filter spectrometer
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEnergyfilterName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("energyfilter_name", SingleRowStrColumn::new) :
                getBinaryColumn("energyfilter_name"));
    }

    /**
     * The energy filter range upper value in electron volts (eV) set by spectrometer.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEnergyfilterUpper() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("energyfilter_upper", SingleRowStrColumn::new) :
                getBinaryColumn("energyfilter_upper"));
    }

    /**
     * Primary key
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM IMAGING category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImagingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("imaging_id", SingleRowStrColumn::new) :
                getBinaryColumn("imaging_id"));
    }

    /**
     * Phase plate information
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPhasePlate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("phase_plate", SingleRowStrColumn::new) :
                getBinaryColumn("phase_plate"));
    }

    /**
     * Spherical aberration corrector information
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSphAberrationCorrector() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sph_aberration_corrector", SingleRowStrColumn::new) :
                getBinaryColumn("sph_aberration_corrector"));
    }
}
