package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DIFFRN_CELL category record details about
 * a particular set of unit cell parameters.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDiffrnCell extends DelegatingCategory {
    public PdbxDiffrnCell(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "angle_alpha":
                return getAngleAlpha();
            case "angle_alpha_esd":
                return getAngleAlphaEsd();
            case "angle_beta":
                return getAngleBeta();
            case "angle_beta_esd":
                return getAngleBetaEsd();
            case "angle_gamma":
                return getAngleGamma();
            case "angle_gamma_esd":
                return getAngleGammaEsd();
            case "length_a":
                return getLengthA();
            case "length_a_esd":
                return getLengthAEsd();
            case "length_b":
                return getLengthB();
            case "length_b_esd":
                return getLengthBEsd();
            case "length_c":
                return getLengthC();
            case "length_c_esd":
                return getLengthCEsd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_diffrn_cell.id must uniquely identify the
     * information associated with cell in the PDBX_DIFFRN_CELL
     * category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Unit-cell angle alpha in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlpha() {
        return delegate.getColumn("angle_alpha", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_diffrn_cell.angle_alpha.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlphaEsd() {
        return delegate.getColumn("angle_alpha_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell angle beta in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleBeta() {
        return delegate.getColumn("angle_beta", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_diffrn_cell.angle_beta.
     * @return FloatColumn
     */
    public FloatColumn getAngleBetaEsd() {
        return delegate.getColumn("angle_beta_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell angle gamma in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleGamma() {
        return delegate.getColumn("angle_gamma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_diffrn_cell.angle_gamma.
     * @return FloatColumn
     */
    public FloatColumn getAngleGammaEsd() {
        return delegate.getColumn("angle_gamma_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length a in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthA() {
        return delegate.getColumn("length_a", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_diffrn_cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getLengthAEsd() {
        return delegate.getColumn("length_a_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length b in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthB() {
        return delegate.getColumn("length_b", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_diffrn_cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getLengthBEsd() {
        return delegate.getColumn("length_b_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length c in angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return delegate.getColumn("length_c", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _pdbx_diffrn_cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getLengthCEsd() {
        return delegate.getColumn("length_c_esd", DelegatingFloatColumn::new);
    }

}