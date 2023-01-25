package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DIFFRN_BATCH category provide a
 * mechanism to describe common characteristics of a group of
 * reflections within the DIFFRN_REFLN category.
 * 
 * This grouping can be due to reflections occuring on the
 * same image, within the same lattice, on the same
 * detector panel or a combination of these.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDiffrnBatch extends DelegatingCategory {
    public PdbxDiffrnBatch(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "diffrn_id":
                return getDiffrnId();
            case "cell_id":
                return getCellId();
            case "wavelength_id":
                return getWavelengthId();
            case "space_group_id":
                return getSpaceGroupId();
            case "detector_id":
                return getDetectorId();
            case "orientation_id":
                return getOrientationId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_diffrn_batch.id must uniquely identify the
     * information associated with reflections in the DIFFRN_REFLN
     * category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
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
     * This data item is a pointer to _diffrn_cell.id in
     * the PDBX_DIFFRN_CELL category.
     * @return StrColumn
     */
    public StrColumn getCellId() {
        return delegate.getColumn("cell_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn_radiation_wavelength.id in
     * the DIFFRN_RADIATION_WAVELENGTH category.
     * @return StrColumn
     */
    public StrColumn getWavelengthId() {
        return delegate.getColumn("wavelength_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _space_group.id in
     * the SPACE_GROUP category.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupId() {
        return delegate.getColumn("space_group_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _diffrn_detector.id in the
     * DIFFRN_DETECTOR category.
     * @return StrColumn
     */
    public StrColumn getDetectorId() {
        return delegate.getColumn("detector_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_diffrn_orientation.id in the
     * PDBX_DIFFRN_ORIENTATION category.
     * @return StrColumn
     */
    public StrColumn getOrientationId() {
        return delegate.getColumn("orientation_id", DelegatingStrColumn::new);
    }

}