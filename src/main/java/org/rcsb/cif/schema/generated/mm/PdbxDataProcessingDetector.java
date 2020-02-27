package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Details of the detector used at data collection site.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDataProcessingDetector extends DelegatingCategory {
    public PdbxDataProcessingDetector(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_data_processing_detector.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The name and type of detector.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The wavelength of data collection.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return delegate.getColumn("wavelength", DelegatingFloatColumn::new);
    }

    /**
     * The polarization measured in data collection.
     * @return FloatColumn
     */
    public FloatColumn getPolarization() {
        return delegate.getColumn("polarization", DelegatingFloatColumn::new);
    }

    /**
     * The sample position in the beam in the X direction.
     * @return FloatColumn
     */
    public FloatColumn getBeamPositionX() {
        return delegate.getColumn("beam_position_x", DelegatingFloatColumn::new);
    }

    /**
     * The sample position in the beam in the Y direction.
     * @return FloatColumn
     */
    public FloatColumn getBeamPositionY() {
        return delegate.getColumn("beam_position_y", DelegatingFloatColumn::new);
    }

    /**
     * The cassette rotation about the X axis.
     * @return FloatColumn
     */
    public FloatColumn getCassetteRotX() {
        return delegate.getColumn("cassette_rot_x", DelegatingFloatColumn::new);
    }

    /**
     * The cassette rotation about the Y axis.
     * @return FloatColumn
     */
    public FloatColumn getCassetteRotY() {
        return delegate.getColumn("cassette_rot_y", DelegatingFloatColumn::new);
    }

    /**
     * The cassette rotation about the Z axis.
     * @return FloatColumn
     */
    public FloatColumn getCassetteRotZ() {
        return delegate.getColumn("cassette_rot_z", DelegatingFloatColumn::new);
    }

    /**
     * The value applied to the Y direction.
     * @return FloatColumn
     */
    public FloatColumn getScaleY() {
        return delegate.getColumn("scale_y", DelegatingFloatColumn::new);
    }

    /**
     * The skew value.
     * @return FloatColumn
     */
    public FloatColumn getSkew() {
        return delegate.getColumn("skew", DelegatingFloatColumn::new);
    }

    /**
     * The detector crossfire value in the X direction.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireX() {
        return delegate.getColumn("crossfire_x", DelegatingFloatColumn::new);
    }

    /**
     * The detector crossfire value in the Y direction.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireY() {
        return delegate.getColumn("crossfire_y", DelegatingFloatColumn::new);
    }

    /**
     * The detector coupled crossfire value for XY.
     * @return FloatColumn
     */
    public FloatColumn getCrossfireXy() {
        return delegate.getColumn("crossfire_xy", DelegatingFloatColumn::new);
    }

    /**
     * Data collection date.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * Name of experimentor.
     * @return StrColumn
     */
    public StrColumn getExperimentor() {
        return delegate.getColumn("experimentor", DelegatingStrColumn::new);
    }

    /**
     * Identifier for crystal on which data was collected.
     * @return StrColumn
     */
    public StrColumn getCrystalDataId() {
        return delegate.getColumn("crystal_data_id", DelegatingStrColumn::new);
    }

    /**
     * File system path to processing data files.
     * @return StrColumn
     */
    public StrColumn getProcessingPath() {
        return delegate.getColumn("processing_path", DelegatingStrColumn::new);
    }

    /**
     * File system names for the data processing files.
     * @return StrColumn
     */
    public StrColumn getProcessingFiles() {
        return delegate.getColumn("processing_files", DelegatingStrColumn::new);
    }
}
