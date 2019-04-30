package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_SOURCE category record details of
 * the source of radiation used in the diffraction experiment.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class DiffrnSource extends BaseCategory {
    public DiffrnSource(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnSource(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnSource(String name) {
        super(name);
    }

    /**
     * The current in milliamperes at which the radiation source
     * was operated.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getCurrent() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("current", SingleRowFloatColumn::new) :
                getBinaryColumn("current"));
    }

    /**
     * A description of special aspects of the radiation source used.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The power in kilowatts at which the radiation source
     * was operated.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPower() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("power", SingleRowFloatColumn::new) :
                getBinaryColumn("power"));
    }

    /**
     * The dimensions of the source as viewed from the sample.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSize() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("size", SingleRowStrColumn::new) :
                getBinaryColumn("size"));
    }

    /**
     * The general class of the radiation source.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSource() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("source", SingleRowStrColumn::new) :
                getBinaryColumn("source"));
    }

    /**
     * The chemical element symbol for the X-ray target
     * (usually the anode) used to generate X-rays.
     * This can also be used for spallation sources.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTarget() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("target", SingleRowStrColumn::new) :
                getBinaryColumn("target"));
    }

    /**
     * The make, model or name of the source of radiation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The voltage in kilovolts at which the radiation source was
     * operated.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVoltage() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("voltage", SingleRowFloatColumn::new) :
                getBinaryColumn("voltage"));
    }

    /**
     * The complement of the angle in degrees between the normal
     * to the surface of the X-ray tube target and the primary
     * X-ray beam for beams generated by traditional X-ray tubes.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getTake_offAngle() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("take-off_angle", SingleRowFloatColumn::new) :
                getBinaryColumn("take-off_angle"));
    }

    /**
     * Comma separated list of wavelengths or wavelength range.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxWavelengthList() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_wavelength_list", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_wavelength_list"));
    }

    /**
     * Wavelength of radiation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxWavelength() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_wavelength", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_wavelength"));
    }

    /**
     * Synchrotron beamline.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSynchrotronBeamline() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_synchrotron_beamline", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_synchrotron_beamline"));
    }

    /**
     * Synchrotron site.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSynchrotronSite() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_synchrotron_site", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_synchrotron_site"));
    }

    /**
     * Yes/No if synchrotron source was used or not.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSynchrotronYN() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_synchrotron_y_n", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_synchrotron_y_n"));
    }

    /**
     * Beamline for synchrotron source.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSourceSpecificBeamline() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_source_specific_beamline", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_source_specific_beamline"));
    }
}
