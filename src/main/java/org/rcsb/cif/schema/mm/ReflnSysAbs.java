package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFLN_SYS_ABS category record details about
 * the reflection data that should be systematically absent,
 * given the designated space group.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ReflnSysAbs extends DelegatingCategory {
    public ReflnSysAbs(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "I":
                return getI();
            case "I_over_sigmaI":
                return getIOverSigmaI();
            case "index_h":
                return getIndexH();
            case "index_k":
                return getIndexK();
            case "index_l":
                return getIndexL();
            case "sigmaI":
                return getSigmaI();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The measured value of the intensity in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getI() {
        return delegate.getColumn("I", DelegatingFloatColumn::new);
    }

    /**
     * The ratio of _refln_sys_abs.I to _refln_sys_abs.sigmaI.  Used
     * to evaluate whether a reflection that should be systematically
     * absent according to the designated space group is in fact
     * absent.
     * @return FloatColumn
     */
    public FloatColumn getIOverSigmaI() {
        return delegate.getColumn("I_over_sigmaI", DelegatingFloatColumn::new);
    }

    /**
     * Miller index h of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to
     * the cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to the
     * cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l of the reflection. The values of the Miller
     * indices in the REFLN_SYS_ABS category must correspond to the
     * cell defined by cell lengths and cell angles in the CELL
     * category.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _refln_sys_abs.I in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getSigmaI() {
        return delegate.getColumn("sigmaI", DelegatingFloatColumn::new);
    }

}