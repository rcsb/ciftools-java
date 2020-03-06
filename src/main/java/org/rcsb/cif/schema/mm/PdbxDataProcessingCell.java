package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Crystallographic cell specifications used in data processing.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDataProcessingCell extends DelegatingCategory {
    public PdbxDataProcessingCell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "a":
                return getA();
            case "a_tolerance":
                return getATolerance();
            case "b":
                return getB();
            case "b_tolerance":
                return getBTolerance();
            case "c":
                return getC();
            case "c_tolerance":
                return getCTolerance();
            case "alpha":
                return getAlpha();
            case "alpha_tolerance":
                return getAlphaTolerance();
            case "beta":
                return getBeta();
            case "beta_tolerance":
                return getBetaTolerance();
            case "gamma":
                return getGamma();
            case "gamma_tolerance":
                return getGammaTolerance();
            case "volume":
                return getVolume();
            case "mosaicity":
                return getMosaicity();
            case "resolution_range":
                return getResolutionRange();
            case "space_group":
                return getSpaceGroup();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_data_processing_cell.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Unit cell length A
     * @return FloatColumn
     */
    public FloatColumn getA() {
        return delegate.getColumn("a", DelegatingFloatColumn::new);
    }

    /**
     * Tolerance in unit cell length A
     * @return FloatColumn
     */
    public FloatColumn getATolerance() {
        return delegate.getColumn("a_tolerance", DelegatingFloatColumn::new);
    }

    /**
     * Unit cell length B
     * @return FloatColumn
     */
    public FloatColumn getB() {
        return delegate.getColumn("b", DelegatingFloatColumn::new);
    }

    /**
     * Tolerance in unit cell length B
     * @return FloatColumn
     */
    public FloatColumn getBTolerance() {
        return delegate.getColumn("b_tolerance", DelegatingFloatColumn::new);
    }

    /**
     * Unit cell length C
     * @return FloatColumn
     */
    public FloatColumn getC() {
        return delegate.getColumn("c", DelegatingFloatColumn::new);
    }

    /**
     * Tolerance in unit cell length C
     * @return FloatColumn
     */
    public FloatColumn getCTolerance() {
        return delegate.getColumn("c_tolerance", DelegatingFloatColumn::new);
    }

    /**
     * Unit cell angle alpha.
     * @return FloatColumn
     */
    public FloatColumn getAlpha() {
        return delegate.getColumn("alpha", DelegatingFloatColumn::new);
    }

    /**
     * Tolerance in unit cell angle alpha.
     * @return FloatColumn
     */
    public FloatColumn getAlphaTolerance() {
        return delegate.getColumn("alpha_tolerance", DelegatingFloatColumn::new);
    }

    /**
     * Unit cell angle beta.
     * @return FloatColumn
     */
    public FloatColumn getBeta() {
        return delegate.getColumn("beta", DelegatingFloatColumn::new);
    }

    /**
     * Tolerance in unit cell angle beta.
     * @return FloatColumn
     */
    public FloatColumn getBetaTolerance() {
        return delegate.getColumn("beta_tolerance", DelegatingFloatColumn::new);
    }

    /**
     * Unit cell angle gamma.
     * @return FloatColumn
     */
    public FloatColumn getGamma() {
        return delegate.getColumn("gamma", DelegatingFloatColumn::new);
    }

    /**
     * Tolerance in unit cell angle gamma.
     * @return FloatColumn
     */
    public FloatColumn getGammaTolerance() {
        return delegate.getColumn("gamma_tolerance", DelegatingFloatColumn::new);
    }

    /**
     * Unit cell volume.
     * @return FloatColumn
     */
    public FloatColumn getVolume() {
        return delegate.getColumn("volume", DelegatingFloatColumn::new);
    }

    /**
     * Unit cell mosaicity.
     * @return FloatColumn
     */
    public FloatColumn getMosaicity() {
        return delegate.getColumn("mosaicity", DelegatingFloatColumn::new);
    }

    /**
     * Resolution range.
     * @return StrColumn
     */
    public StrColumn getResolutionRange() {
        return delegate.getColumn("resolution_range", DelegatingStrColumn::new);
    }

    /**
     * Space group name.
     * @return StrColumn
     */
    public StrColumn getSpaceGroup() {
        return delegate.getColumn("space_group", DelegatingStrColumn::new);
    }

}